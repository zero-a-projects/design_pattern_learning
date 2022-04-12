package top.ddoc._02_behaviour._01_chain_of_responsibility;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 9:27 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		final Handler handler1 = new ConcreteHandler1(null);
		final Handler handler2 = new ConcreteHandler2(handler1);

		final Request request1 = new Request("request1", RequestType.TYPE1);
		handler2.handleRequest(request1);

		final Request request2 = new Request("request2", RequestType.TYPE2);
		handler2.handleRequest(request2);

	}
}
