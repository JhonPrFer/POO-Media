
public class Media {
	
	private String nome;
	private int nota1;
	private int nota2;
	private int nota3;
	private int media;
	
	public Media(String nome, int nota1, int nota2, int nota3) {
		this.nome=nome;
		this.nota1=nota1;
		this.nota2=nota2;
		this.nota3=nota3;
	}
	
	public void Resultado() {
		
		this.media=(nota1+nota2+nota3)/3;
		if(media>=5) 
			System.out.println(this.nome+" "+"Aprovado"); 
		else
			System.out.println(this.nome+" "+"Reprovado");
	}

}
