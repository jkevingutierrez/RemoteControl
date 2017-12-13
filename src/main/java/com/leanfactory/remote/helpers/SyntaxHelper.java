package com.leanfactory.remote.helpers;

public class SyntaxHelper {

	public static boolean hasAValidSyntax(String sentence) {
		if (sentence == null || sentence.equals("") || sentence.endsWith(";") || sentence.endsWith(",")
				|| sentence.startsWith(";") || sentence.startsWith(",")) {
			return false;
		}

		try {
			String[] stringCommands = sentence.split(";");
			for (String commandString : stringCommands) {
				String[] parts = commandString.split(",");
				if (parts.length != 2) {
					return false;
				}
			}

			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
