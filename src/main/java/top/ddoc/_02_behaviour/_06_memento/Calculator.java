package top.ddoc._02_behaviour._06_memento;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 1:19 下午
 */
public interface Calculator
{
	// Create Memento
	PreviousCalculationToCareTaker backupLastCalculation();

	// setMemento
	void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

	int getCalculationResult();

	void setFirstNumber(int firstNumber);

	void setSecondNumber(int secondNumber);
}
