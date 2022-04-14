package top.ddoc._03_structural._07_proxy._01_static;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:34 下午
 */
public class RealSubject implements Subject
{
	@Override public void doOperation()
	{
		System.out.println("RealSubject::doOperation");
	}
}
