package arqsw_exercicio7_1;

public abstract class TransformerTemplate {
	
	protected String texto;
	
	public void transformer() {
		lerTexto();
		transformerTexto();
		imprimirTexto();
	}
	
	protected abstract void lerTexto();
	
	protected abstract void transformerTexto();
	
	protected abstract void imprimirTexto();

}
