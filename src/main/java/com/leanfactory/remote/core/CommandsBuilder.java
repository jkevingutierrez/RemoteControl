package com.leanfactory.remote.core;

import java.util.LinkedList;
import java.util.List;

public class CommandsBuilder {
	public static List<Command> buildCommands(String sentence) {
		sentence = sentence.toUpperCase();
		List<Command> commands = new LinkedList<Command>();

		String[] stringCommands = sentence.split(";");

		for (String commandString : stringCommands) {
			String[] parts = commandString.split(",");
			Command command = new Command(Direction.valueOf(parts[1].trim()), Integer.valueOf(parts[0].trim()));
			commands.add(command);
		}

		return commands;
	}
}
