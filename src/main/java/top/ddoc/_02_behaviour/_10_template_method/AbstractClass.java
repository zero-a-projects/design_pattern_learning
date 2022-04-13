package top.ddoc._02_behaviour._10_template_method;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:21 下午
 */
public abstract class AbstractClass
{
	public void templateMethod()
	{
		// 做一些公共逻辑
		primitiveOperationA();
		// 做一些公共逻辑
		primitiveOperationB();
	}
	
	public abstract void primitiveOperationA();
	
	public abstract void primitiveOperationB();
}
