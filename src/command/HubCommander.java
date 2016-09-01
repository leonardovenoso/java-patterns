package command;

import java.util.ArrayList;

public class HubCommander {

	private ArrayList<Command> commands = new ArrayList<Command>();
	
	public HubCommander() {
		
	}
	
	public void addCommand(Command command) {
		commands.add(command);
	}
	
	public void executeCommands() {
		for(Command command : commands) {
			command.execute();
		}
	}

}
