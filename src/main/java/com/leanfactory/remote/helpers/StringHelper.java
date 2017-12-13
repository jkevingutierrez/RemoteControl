package com.leanfactory.remote.helpers;

import java.util.LinkedList;
import java.util.List;

import com.leanfactory.remote.core.Command;
import com.leanfactory.remote.core.Direction;

public class StringHelper {
	public static boolean hasAValidSyntax(String sentence) {
		return true;
	}

	public static List<Command> generateCommands(String sentence) {
		sentence = sentence.trim().toUpperCase();
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
