
public class MainNo {
	
	public static void main (String[] args) {
		No<String>  no1 = new No<>("Conteudo no1");
		
		No<String>  no2 = new No<>("Conteudo no2");
		no1.setproximoNo(no2);
		
		No<String>  no3 = new No<>("conteudo no3");
		no2.setproximoNo(no3);
	
		No<String>  no4 = new No<>("Conteudo no4");
		no3.setproximoNo(no4);
	
		System.out.println(no1);
		System.out.println(no1.getproximoNo());
		System.out.println(no1.getproximoNo().getproximoNo());
		System.out.println(no1.getproximoNo().getproximoNo().getproximoNo());
		System.out.println(no1.getproximoNo().getproximoNo().getproximoNo().getproximoNo());
	}

}
