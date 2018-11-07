
public class Aluno {
	private String nome;
	private int pr;
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public void monitoria() {
		if(this.pr >= 7) {
			System.out.println("Aluno pode ser monitor");
		}else {
			System.out.println("Aluno nao pode ser monitor");
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPr() {
		return pr;
	}
	public void setPr(int pr) {
		this.pr = pr;
	}
}
