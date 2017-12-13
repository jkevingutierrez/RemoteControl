package com.leanfactory.remote.helpers;

import java.util.LinkedList;
import java.util.List;

import com.leanfactory.remote.core.Command;

public class StringHelper {
	public static boolean hasAValidSyntax(String s) {
		return false;
	}

	public static boolean hasOneCommand(String s) {
		return false;
	}

	public static boolean hasMultipleCommands(String s) {
		return false;
	}

	public static Command generateCommand(String s) {
		return null;
	}

	public static List<Command> generateMultipleCommands(String s) {
		List<Command> commands = new LinkedList<Command>();
		return commands;
	}
}
