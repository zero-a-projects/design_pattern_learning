package top.ddoc._02_behaviour._03_interpreter;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 10:06 下午
 */
public class OrExpression extends AbstractExpression
{
	private AbstractExpression expression1;
	private AbstractExpression expression2;

	public OrExpression(final AbstractExpression expression1, final AbstractExpression expression2)
	{
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override public boolean interpret(final String str)
	{
		return expression1.interpret(str) || expression2.interpret(str);
	}
}
