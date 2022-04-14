package top.ddoc._03_structural._06_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:22 下午
 */
public class FlyweightFactory
{
	private Map<String, Flyweight> flyweightMap = new HashMap<String, Flyweight>();
	
	Flyweight getFlyweight(String intrinsicState)
	{
		if (!flyweightMap.containsKey(intrinsicState))
		{ flyweightMap.put(intrinsicState, new ConcreteFlyweight(intrinsicState)); }
		return flyweightMap.get(intrinsicState);
	}
}
