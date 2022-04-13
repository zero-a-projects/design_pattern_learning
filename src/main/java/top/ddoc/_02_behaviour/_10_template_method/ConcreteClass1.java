package top.ddoc._02_behaviour._10_template_method;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:21 下午
 */
public class ConcreteClass1 extends AbstractClass
{
	@Override public void primitiveOperationA()
	{
		System.out.println("ConcreteClass1::primitiveOperationA");
	}

	@Override public void primitiveOperationB()
	{
		System.out.println("ConcreteClass1::primitiveOperationB");
	}
}
