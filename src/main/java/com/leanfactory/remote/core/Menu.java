package com.leanfactory.remote.core;

import java.util.List;
import java.util.Scanner;

import com.leanfactory.remote.helpers.StringHelper;

public class Menu {

	public static void start() {
		Scanner in = new Scanner(System.in);

		System.out.println(
				"=============================================================================================");
		System.out.println(
				"| VEHÍCULO A CONTROL REMOTO                                                                 |");
		System.out.println(
				"=============================================================================================");
		System.out.println(
				"| 1. Ingrese las dimensiones del tablero (n x m)                                            |");
		System.out.println(
				"| 1.1 Ingrese n                                                                             |");

		int n = in.nextInt();

		System.out.println(
				"| 1.1 Ingrese m                                                                             |");

		int m = in.nextInt();

		Board board = new Board(n, m);
		Vehicle vehicle = new Vehicle(board.getN(), board.getM());

		System.out.println(
				"=============================================================================================");
		System.out.println(
				"| Muy bien, ahora puede controlar el vehículo mediante una serie de comandos.               |");
		System.out.println(
				"| Los comandos deben tener la estructura <Desplazamiento>,<Dirección>.                      |");
		System.out.println(
				"| Un ejemplo valido de un comando es: \'10,N\'                                                |");
		System.out.println(
				"| El vehículo puede recibir una lista de comandos separados por el signo ; (punto y coma).  |");
		System.out.println(
				"| Un ejemplo valido de una lista de comandos es: \'5,E;2,N;3,S\'                              |");
		System.out.println(
				"=============================================================================================");
		System.out.println(
				"| *** Para terminar con la ejecución del programa, presione la tecla (c) ***                |");
		System.out.println(
				"=============================================================================================");
		System.out.println("");

		String sentence;
		do {
			System.out.println("\tIngrese un comando o una lista de comandos:");
			sentence = in.next();
			if (StringHelper.hasAValidSyntax(sentence)) {
				List<Command> commands = StringHelper.generateCommands(sentence);
				for (Command command : commands) {
					if (!command.execute(vehicle)) {
						System.out.println("\n-- Se ha detenido el avance por salirse de los límites --\n");
						break;
					}
				}
			} else {
				System.out.println("\n-- Error en formato de comando --\n");
			}

		} while (!sentence.toLowerCase().equals("c"));

		System.out.println(
				"=============================================================================================");
		System.out.println(
				"=============================================================================================");
		System.out.println("\n | EL PROGRAMA HA FINALIZADO | \n");
		System.out.println(
				"=============================================================================================");
		System.out.println(
				"=============================================================================================");

	}
}
