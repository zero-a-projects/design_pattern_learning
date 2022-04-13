package top.ddoc._02_behaviour._06_memento;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 1:25 下午
 */
public class CalculatorImp implements Calculator
{
	private int firstNumber;
	private int secondNumber;
	
	@Override public PreviousCalculationToCareTaker backupLastCalculation()
	{
		return new PreviousCalculationImp(firstNumber, secondNumber);
	}

	@Override public void restorePreviousCalculation(final PreviousCalculationToCareTaker memento)
	{
		this.firstNumber = ((PreviousCalculationToOriginator) memento).getFirstNumber();
		this.secondNumber = ((PreviousCalculationToOriginator) memento).getSecondNumber();
	}

	@Override public int getCalculationResult()
	{
		return firstNumber + secondNumber;
	}

	@Override public void setFirstNumber(final int firstNumber)
	{
		this.firstNumber = firstNumber;
	}

	@Override public void setSecondNumber(final int secondNumber)
	{
		this.secondNumber = secondNumber;
	}
}
