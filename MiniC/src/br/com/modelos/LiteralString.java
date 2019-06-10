package br.com.modelos;

public class LiteralString implements IExpressao {

	  // Atributos
		
	  private String valor;

	  
	  // Construtor
	  
	  public LiteralString(String valor) {
	 
	    this.setValor( valor );
		
	  }

	  
	  // Metodos
	  
	  public String getValor() {
		
	    return valor;

	  }

	  public void setValor(String valor) {
		
		this.valor = valor;
		
	  }
		
	  @Override

	  public String toString() {

	    return this.getValor();

	  }


	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}

	}