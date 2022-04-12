package top.ddoc._02_behaviour._01_chain_of_responsibility;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 9:15 下午$
 */
public abstract class Handler
{
	protected Handler successor;

	public Handler(final Handler successor)
	{
		this.successor = successor;
	}

	public abstract void handleRequest(Request request);
}
