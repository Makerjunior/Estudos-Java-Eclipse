package main;

public interface Trasporte {
	// Atualizado 
	interface Transporte{
	    public String getVeiculo();
		public String getSeguro();
		public String getValor();
	    public void setNone( String N);
	    public void setValor( String V);
	    public void setSeguro( String S);
	}

}
