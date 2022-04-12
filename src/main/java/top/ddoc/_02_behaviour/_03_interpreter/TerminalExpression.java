package top.ddoc._02_behaviour._03_interpreter;

import java.util.StringTokenizer;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 10:02 下午
 */
public class TerminalExpression extends AbstractExpression
{
	private String literal = null;

	public TerminalExpression(final String literal)
	{
		this.literal = literal;
	}

	@Override public boolean interpret(final String str)
	{
		final StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens())
		{
			final String test = st.nextToken();
			if (test.equals(literal))
			{ return true; }
		}
		return false;
	}
}
