package top.ddoc._02_behaviour._06_memento;

/**
 * 备忘录模式
 * <br> 在不违反封装的情况下获得对象的内部状态，从而在需要时可以将对象恢复到最初状态
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 1:27 下午
 */
public class Client
{
	public static void main(String[] args) {
		// program starts
		Calculator calculator = new CalculatorImp();

		// assume user enters two numbers
		calculator.setFirstNumber(10);
		calculator.setSecondNumber(100);

		// find result
		System.out.println(calculator.getCalculationResult());

		// Store result of this calculation in case of error
		PreviousCalculationToCareTaker memento = calculator.backupLastCalculation();

		// user enters a number
		calculator.setFirstNumber(17);

		// user enters a wrong second number and calculates result
		calculator.setSecondNumber(-290);

		// calculate result
		System.out.println(calculator.getCalculationResult());

		// user hits CTRL + Z to undo last operation and see last result
		calculator.restorePreviousCalculation(memento);

		// result restored
		System.out.println(calculator.getCalculationResult());
	}
}
