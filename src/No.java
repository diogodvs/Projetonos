
public class No<T> {
	
	private No<T> proximoNo;
	private T conteudo;
	
	public No (T conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}
	
	public T getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	
	public No<T> getproximoNo() {
		return proximoNo;
	}
	
	public void setproximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}
	
	public String toString() {
		return "No{" +
					"conteudo = " + conteudo +'\'' +
					"}";
	}
	
	
	
}
