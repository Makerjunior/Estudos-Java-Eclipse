package main;

import java.util.ArrayList;
import java.util.List;

class Usuario  extends Carro{
	 private String nomeString;
	 private String idade;
	 private String endereço;	
	 private Carro newCarro;
	 private ArrayList<String> dadosCar = new ArrayList<String>();
	 private ArrayList<String>dadosUser=new ArrayList<String>();
	 
	 public Usuario(String nomeString, String idadeString,String endereString) {
		 super("", "", "");
			this.nomeString=nomeString;
			this.idade=idadeString;
			this.endereço=endereString;
	}
		 
	 
	     
	public Usuario(String NomU, String idade, String endrec, String NomCar,String SegurCar,String ValoCar) {
		super(NomCar, SegurCar, ValoCar);
		this.nomeString=NomU;
		this.idade=idade;
		this.endereço=endrec;
		
		System.out.println("Novo Usuario adicionado");
	}	
		
	 public  String getNome() {
		 return this.nomeString;
	 }
	 
	 public String getIdade() {
		 return this.idade;
	 }
	 
	 public String getEndereco() {
		 return this.endereço;
	 }
	 
	 public List<String> getDadosUser() {
		 dadosUser.add(getNome());
		 dadosUser.add(getIdade());
		 dadosUser.add(getEndereco());
		 return dadosUser;
	 }

	public void addCarro ( Carro C) {
	    newCarro = C;
	    newCarro.setNone(C.getNome());
	    newCarro.setValor(C.getValor());
	    newCarro.setSeguro(C.getSeguro());
	}

	public List<String> getDadosCarPa() {
         dadosCar.add(newCarro.getNome());
         dadosCar.add(newCarro.getValor());
         dadosCar.add(newCarro.getSeguro());
		return dadosCar;
	}

	 static public void Explicacao() {
	 
	     System.out.println("Classe de Usuarios com Nome , Idade e  Endereço");
	 }


	}