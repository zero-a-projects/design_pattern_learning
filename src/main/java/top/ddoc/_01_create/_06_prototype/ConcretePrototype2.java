package top.ddoc._01_create._06_prototype;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 9:09 下午$
 */
public class ConcretePrototype2 extends Prototype
{
	@Override public Prototype clone()
	{
		final ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
		// 复制对象属性操作
		return concretePrototype2;
	}
}
