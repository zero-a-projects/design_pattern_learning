package top.ddoc._02_behaviour._01_chain_of_responsibility;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 9:20 下午
 */
public class ConcreteHandler2 extends Handler
{
	public ConcreteHandler2(final Handler successor)
	{
		super(successor);
	}

	@Override public void handleRequest(final Request request)
	{
		if (RequestType.TYPE2.equals(request.getRequestType()))
		{ System.out.println(request.getName() + " is handler by concreteHandler2!"); }

		if (super.successor != null)
		{ super.successor.handleRequest(request); }
	}

}
