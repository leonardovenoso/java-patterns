package command;

public class Main {

	public static void main(String[] args) {
		HubCommander hub = new HubCommander();
		hub.addCommand(new TurnOnCPUCommand());
		hub.addCommand(new TurnOnMonitorCommand());
		hub.addCommand(new TurnOnMouseCommand());
		
		hub.executeCommands();
	}

}
