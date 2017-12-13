package com.leanfactory.remote.core;

public class Menu {

	public static void start() {
		System.out.println(
				"=============================================================================================");
		System.out.println(
				"| VEHÍCULO A CONTROL REMOTO                                                                 |");
		System.out.println(
				"=============================================================================================");
	}

	public static void explain() {
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
	}

	public static void finish() {
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
