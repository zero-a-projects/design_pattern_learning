package top.ddoc._02_behaviour._03_interpreter;

/**
 * 解释器（Interpreter）
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 10:18 下午
 */
public class Client
{
	public static void main(String[] args) {
		AbstractExpression define = buildInterpreterTree();
		String context1 = "D A";
		String context2 = "A B";
		System.out.println(define.interpret(context1));
		System.out.println(define.interpret(context2));
	}
	
	private static AbstractExpression buildInterpreterTree() {
		// Literal
		final AbstractExpression terminal1 = new TerminalExpression("A");
		final AbstractExpression terminal2 = new TerminalExpression("B");
		final AbstractExpression terminal3 = new TerminalExpression("C");
		final AbstractExpression terminal4 = new TerminalExpression("D");

		// B C
		AbstractExpression alternation1 = new OrExpression(terminal2, terminal3);
		// A Or (B C)
		AbstractExpression alternation2 = new OrExpression(terminal1, alternation1);
		// D And (A Or (B C))
		return new AndExpression(terminal4, alternation2);
	}
	
}
