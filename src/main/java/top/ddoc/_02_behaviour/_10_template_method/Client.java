package top.ddoc._02_behaviour._10_template_method;

/**
 * 模版方法
 * <br> 定义算法框架，并将一些步骤的实现延迟到子类。
 * <br> 通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构。
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:24 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		AbstractClass concreteClass = new ConcreteClass1();
		concreteClass.templateMethod();
		
		concreteClass = new ConcreteClass2();
		concreteClass.templateMethod();
	}
}
