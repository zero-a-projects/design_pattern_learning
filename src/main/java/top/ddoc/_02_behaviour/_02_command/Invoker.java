package top.ddoc._02_behaviour._02_command;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 9:44 下午
 */
public class Invoker
{
	private Command[] onCommands;
	private Command[] offCommands;
	private final int slotNum = 7;

	public Invoker()
	{
		this.onCommands = new Command[slotNum];
		this.offCommands = new Command[slotNum];
	}

	public void setOnCommand(Command command, int slot)
	{
		this.onCommands[slot] = command;
	}

	public void setOffCommand(Command command, int slot)
	{
		this.offCommands[slot] = command;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	
}
