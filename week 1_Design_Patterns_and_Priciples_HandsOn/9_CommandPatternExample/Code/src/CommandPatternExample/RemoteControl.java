package CommandPatternExample;

public class RemoteControl {
	private Command cmd;

	public RemoteControl() {
		super();
		this.cmd = cmd;
	}
	
	public void pressButton() {
		if(cmd!=null) {
			cmd.execute();
		}
		else {
			System.out.println("No cmd");
		}
	}

	public void setCommand(Command cmd) {
		// TODO Auto-generated method stub
		this.cmd=cmd;
	}
	
}
