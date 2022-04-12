package top.ddoc._02_behaviour._01_chain_of_responsibility;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 9:21 下午
 */
public class Request
{
	private String name;
	private RequestType requestType;

	public Request(final String name, final RequestType requestType)
	{
		this.name = name;
		this.requestType = requestType;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public RequestType getRequestType()
	{
		return requestType;
	}

	public void setRequestType(final RequestType requestType)
	{
		this.requestType = requestType;
	}
}
