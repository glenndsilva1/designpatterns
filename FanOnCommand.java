public class FanOnCommand implements Command{
	Fan fan;
	
	FanOnCommand(Fan fan){
		this.fan = fan;
	}
	
	@Override
	public void execute(){
		this.fan.on();
	}
	
	public static void main(String args[]) {
		LightOnCommand lo = new LightOnCommand(new Light());
		lo.execute();
		FanOnCommand fo = new FanOnCommand(new Fan());
		fo.execute();
	}
}
