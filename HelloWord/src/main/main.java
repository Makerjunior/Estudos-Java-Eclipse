package main;

import java.util.*;

// Atualizado 

interface Transporte{
    public String getVeiculo();
	public String getSeguro();
	public String getValor();
}



abstract class Veiculo implements Transporte{
    static private final String Tipo = "Carro de Passeio";
    private ArrayList<String> dadosCarPasseio =new ArrayList<String>();
	private String Nome;
	private String seguro;
	private String Valor;
	
	public Veiculo(String Nom, String Segur, String Valo) {
		this.Nome=Nom;
		this.seguro=Segur;
		this.Valor=Valo;
	}
	
	public String getVeiculo() {
	 if (this.Nome == "Usuario Não Possui Vaiculo") {
		return "";
	}
	 return this.Nome;
	}
	public String getSeguro() {
		 if (this.seguro == "Usuario Não Possui Vaiculo") {
				return "";
			}
		return this.seguro;
	}
	public String getValor() {
		 if (this.Valor == "Usuario Não Possui Vaiculo") {
				return "";
			}
		return this.Valor;
	}
	
	static public void Tipo() {
		System.out.println(Tipo);
	}
	public  List<String> getDadosCarPasseio () {
		dadosCarPasseio.add(getVeiculo());
		dadosCarPasseio.add(getValor());
		dadosCarPasseio.add(getSeguro());
		return dadosCarPasseio;
	}
   

}

class Carro extends Veiculo{

	public Carro(String Nom, String Sugur, String Valo) {
		super(Nom, Sugur, Valo);
	
	}

	
	
}











class Usuario  extends Carro{
 private String nomeString;
 private String idade;
 private String endereço;	
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

public void addCarro ( Carro newCarro) {
//Carro newCarro =new Carro(newCarro.getVeiculo(), newCarro.getValor(), newCarro.getSeguro()); 
	Carro userCarro = newCarro;
}


 static public void Explicacao() {
 
     System.out.println("Classe de Usuarios com Nome , Idade e  Endereço");
 }


}



















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
		
	Usuario juniorUsuario =new Usuario("Junior", "35", "Belo Horizonte", "Uno", "10.000", "5000");
	
	for (String user : juniorUsuario.getDadosUser()) {
		System.out.println(user);
	}
	for (String car : juniorUsuario.getDadosCarPasseio()) {
		System.out.println(car);
	}
	
	System.out.println("----------------------------------------------------------");
	
	Carro voiageCarro =new Carro("Voiage", "40.000", "50.000");
	
	for (String car : voiageCarro.getDadosCarPasseio()) {
		System.out.println(car);
	}
	
	System.out.println("----------------------------------------------------------");
	
	
	Usuario pauloUsuario = new Usuario("Paulo", "45", "Santa Cruz");
	for (String use : pauloUsuario.getDadosUser()) {
		System.out.println(use);
	}

	
   
	
	
	
	
	}


	
   

	
}

