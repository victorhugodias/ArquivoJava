package negocio;

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String obterRelatorio(){
		return String.format(
				"Nome: %s\n"
				+"E-mail: %s\n"
				+"Senha: %s\n",
				this.getNome(),
				this.getEmail(),
				this.getSenha());
	}
	
	public void exibir(){
		System.out.printf(this.obterRelatorio());
	}
	




}
