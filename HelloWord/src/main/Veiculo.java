package main;
import java.util. *;
import main.Trasporte.Transporte;

abstract class Veiculo implements Transporte{
    
	static private final String Tipo = "Carro de Passeio";
    private ArrayList<String> dadosCarPasseio =new ArrayList<String>();
	
    private  String Nome;
    private  String seguro;
    private  String Valor;
	

	
	public Veiculo(String Nom, String Segur, String Valo) {
		setNone(Nom);
		setValor(Valo);
		setSeguro(Segur);
	}
	
    public void setNone( String N) {
    	this.Nome=N;
    }
    public void setValor( String V) {
    	this.Valor=V;
    }
    public void setSeguro( String S) {
    	this.seguro=S;
    }
	
    public String getNome() {
		 if (this.Valor == "Usuario Não Possui Vaiculo") {
				return "";
			}
		return this.Nome;
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
