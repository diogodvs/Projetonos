
public class No {
	
	private No proximoNo;
	private String conteudo;
	
	public No (String conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public No getproximoNo() {
		return proximoNo;
	}
	
	public void setproximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
	
	public String toString() {
		return "No{" +
					"conteudo = " + conteudo +'\'' +
					"}";
	}
	
	
	
}
