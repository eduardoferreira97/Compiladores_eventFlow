package br.com.poli.eventflow;
// Generated from /home/eduardoferreira/IdeaProjects/EventFlowProject/EventFlow.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EventFlowParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EventFlowVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(EventFlowParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#definicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicao(EventFlowParser.DefinicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#config_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_def(EventFlowParser.Config_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#event_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_def(EventFlowParser.Event_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#platform_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatform_def(EventFlowParser.Platform_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#platform_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatform_stmt(EventFlowParser.Platform_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#pipeline_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeline_def(EventFlowParser.Pipeline_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#stage_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStage_def(EventFlowParser.Stage_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(EventFlowParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#run_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun_stmt(EventFlowParser.Run_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(EventFlowParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(EventFlowParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#prop_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp_list(EventFlowParser.Prop_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#prop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp_stmt(EventFlowParser.Prop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(EventFlowParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(EventFlowParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(EventFlowParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link EventFlowParser#env_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnv_var(EventFlowParser.Env_varContext ctx);
}