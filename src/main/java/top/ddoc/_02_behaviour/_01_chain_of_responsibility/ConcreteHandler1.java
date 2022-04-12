package top.ddoc._02_behaviour._01_chain_of_responsibility;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 9:20 下午
 */
public class ConcreteHandler1 extends Handler
{
	public ConcreteHandler1(final Handler successor)
	{
		super(successor);
	}

	@Override public void handleRequest(final Request request)
	{
		if (RequestType.TYPE1.equals(request.getRequestType()))
		{ System.out.println(request.getName() + " is handler by concreteHandler1!"); }

		if (super.successor != null)
		{ super.successor.handleRequest(request); }
	}

}
