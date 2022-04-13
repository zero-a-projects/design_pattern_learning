package top.ddoc._02_behaviour._06_memento;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 1:25 下午
 */
public class PreviousCalculationImp implements PreviousCalculationToCareTaker,
		PreviousCalculationToOriginator {

	private int firstNumber;
	private int secondNumber;

	public PreviousCalculationImp(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	@Override
	public int getFirstNumber() {
		return firstNumber;
	}

	@Override
	public int getSecondNumber() {
		return secondNumber;
	}
}
