# EventFlow: Linguagem de Automação de Configuração e Pipelines

## 1. Equipe

* Eduardo Ferreira
* *(Adicione o nome dos outros integrantes do grupo aqui)*

---

## 2. Motivação e Descrição da Linguagem

### Motivação

No desenvolvimento de software moderno, é comum precisarmos de gerar ficheiros de configuração específicos para diferentes plataformas (ex: Android, iOS, Web), gerir variáveis e executar sequências de comandos para build e deploy. Este processo, embora essencial, é muitas vezes manual, repetitivo e sujeito a erros.

A **EventFlow** foi criada para resolver este problema. É uma Linguagem de Domínio Específico (DSL) declarativa e intuitiva, projetada para automatizar a geração de configurações e a execução de pequenas tarefas de build de forma sistemática e reproduzível.

### Descrição da Linguagem

`EventFlow` é uma linguagem híbrida que funciona tanto como um **gerador de código** quanto como um **interpretador de scripts**. Ela permite ao utilizador:

* **Definir Variáveis de Configuração:** Através do bloco `config`, é possível declarar variáveis globais para o projeto. A linguagem suporta tipos de dados customizados com validação semântica, como `semver` para versionamento e `color` para cores hexadecimais.
* **Gerar Ficheiros a partir de Templates:** O bloco `PLATFORM` permite definir ações específicas para uma plataforma. A principal funcionalidade é o comando `generate file from_template`, que lê um ficheiro de template, substitui os placeholders (ex: `{{variavel}}`) pelos valores definidos no bloco `config`, e gera um novo ficheiro.
* **Executar Pipelines de Comandos:** O bloco `PIPELINE` permite definir um fluxo de trabalho simples, dividido em `stage`s. Cada `stage` pode conter uma sequência de comandos `run` que são executados no terminal, permitindo a automação de tarefas como compilação, testes e limpeza.

A estrutura do compilador da `EventFlow` segue as práticas vistas em aula, com fases bem definidas:
1.  **Análise Léxica e Sintática:** Realizada pelo ANTLR para gerar uma Parse Tree.
2.  **Análise Semântica:** Um `Visitor` percorre a árvore para validar tipos, checar a declaração de variáveis e popular uma Tabela de Símbolos.
3.  **Geração/Interpretação:** Um segundo `Visitor` percorre a árvore e, utilizando a Tabela de Símbolos, executa as ações definidas (gera ficheiros e/ou executa comandos).

---

## 3. Guia de Execução

O projeto utiliza o Maven para gestão de dependências e execução. Para compilar e executar a linguagem `EventFlow`, siga os passos abaixo.

### Pré-requisitos

* Java Development Kit (JDK) versão 11 ou superior.
* Apache Maven.

### Passos para Execução

1.  **Clone o Repositório:**
    ```bash
    git clone <URL_DO_SEU_REPOSITORIO_GIT>
    cd EventFlowProject
    ```

2.  **Crie os Ficheiros de Exemplo:**
    Antes de executar, crie a estrutura de templates e o script de exemplo.

    * Crie a pasta de templates:
        ```bash
        mkdir -p templates
        ```
    * Crie o ficheiro de template `templates/config.xml.template` com o seguinte conteúdo:
        ```xml
        <settings>
            <version>{{app_version}}</version>
            <themeColor>{{primary_color}}</themeColor>
            <build_user>${env.USER}</build_user>
        </settings>
        ```
    * Crie o script `exemplo.ef` na raiz do projeto com o seguinte conteúdo:
        ```ef
        config {
            app_name: "Meu App Fantástico";
            app_version: semver("2.1.0-beta");
            primary_color: color("#3498db");
        }

        PLATFORM "android" {
            generate file from_template("templates/config.xml.template") to "output/android_config.xml"
        }

        PIPELINE {
            stage "Build & Test" {
                run "echo '--- Iniciando Build para {{app_name}} ---'";
                run "echo 'Versão do App: {{app_version}}'";
                run "echo 'Testes passaram!'";
            }
        }
        ```

3.  **Compile o Projeto com Maven:**
    Este comando irá descarregar as dependências (ANTLR) e compilar todo o código-fonte.
    ```bash
    mvn clean install
    ```

4.  **Execute o Compilador/Interpretador:**
    Use o plugin `exec-maven-plugin` para executar o programa, passando o nome do script (`exemplo.ef`) como argumento.
    ```bash
    mvn exec:java -Dexec.mainClass="br.com.poli.eventflow.Main" -Dexec.args="exemplo.ef"
    ```

### Resultado Esperado

Após a execução, a consola irá mostrar a saída do pipeline, e uma nova pasta `output` será criada na raiz do projeto, contendo o ficheiro `android_config.xml` com o conteúdo gerado:
```xml
<settings>
    <version>2.1.0-beta</version>
    <themeColor>#3498db</themeColor>
    <build_user>${env.USER}</build_user>
</settings>
```

---

## 4. Exemplos de Programas

### Exemplo 1: Geração Simples de Ficheiro

Este programa foca-se apenas na funcionalidade de geração de ficheiros.

**`exemplo_simple.ef`**
```ef
config {
    service_name: "API de Pagamentos";
    port: "8080";
}

PLATFORM "docker" {
    generate file from_template("templates/docker-compose.yml.template") to "docker-compose.yml"
}
```

**`templates/docker-compose.yml.template`**
```yaml
version: '3'
services:
  {{service_name}}:
    image: 'minha-api:latest'
    ports:
      - "{{port}}:8080"
```

### Exemplo 2: Pipeline de Comandos

Este programa foca-se na automação de tarefas, utilizando variáveis do bloco `config`.

**`exemplo_pipeline.ef`**
```ef
config {
    version: "v1.3.3";
    image_name: "minha-webapp";
}

PIPELINE {
    stage "Publicação" {
        run "echo 'Efetuando o build da imagem Docker...'";
        run "docker build -t {{image_name}}:{{version}} .";
        run "docker push {{image_name}}:{{version}}";
        run "echo 'Publicação da versão {{version}} concluída!'";
    }
}
```
