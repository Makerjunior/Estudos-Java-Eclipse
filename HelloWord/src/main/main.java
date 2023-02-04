package main;

import java.util.*;

public class main {

	public static void main(String[] args) {

	/*	Usuario.Explicacao();
		Usuario junior= new Usuario("Junior", "35","Cachoeirinha");
         	
         for (String string : junior.getDadosUser()) {
			System.out.println(string);		}
		
		   //****************************************************************
         
         
         Carro unoCarro = new Carro("Uno", "10.000", "7.000");
	     Carro.Tipo();
		 
		 for (String dUno : unoCarro.getDadosCarPasseio()) {
			System.out.println(dUno);
		}
		
		*/
		
		
		   //  USUARIO COM CARRO
	Usuario juniorUsuario =new Usuario("Junior", "35", "Belo Horizonte", "Uno", "10.000", "5000");
	
	for (String user : juniorUsuario.getDadosUser()) {
		System.out.println(user);
	}
	for (String car : juniorUsuario.getDadosCarPasseio()) {
		System.out.println(car);
	}
	
	System.out.println("----------------------------------------------------------");
	
	
	   // CARRO
	Carro voiageCarro =new Carro("Voiage", "40.000", "50.000");
	
	for (String car : voiageCarro.getDadosCarPasseio()) {
		System.out.println(car);
	}
	
	System.out.println("----------------------------------------------------------");
	
	
	
	    // USUARIO 
	Usuario pauloUsuario = new Usuario("Paulo", "45", "Santa Cruz");
	for (String use : pauloUsuario.getDadosUser()) {
		System.out.println(use);
	}

//	pauloUsuario.addCarro(voiageCarro);
   
	
	for (String use : pauloUsuario.getDadosCarPa()) {
		System.out.println(use);
	}

	
	
	
	}


	
   

	
}

