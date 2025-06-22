package CommandPatternExample;

public class LightOffCommand implements Command{
	private Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOff();
	}
	
}
