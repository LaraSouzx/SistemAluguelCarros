package P011;

public class Cliente {
	
	 protected  String nome;
	 protected int idade;
	 protected int nTelefone;
	 
	 
	 public Cliente (String nome, int idade,int nTelefone) {
		 this.nome = nome;
		 this.idade = idade;
		 this.nTelefone = nTelefone;
		  
	 }
	 
	
	

	@Override
	public String toString() {
		return "cliente [nome= " + nome + ", idade= " + idade + ", nTelefone= " + nTelefone + " ]";
	}

	 public String getNome() {
		 return nome;
	 }
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 public int getIdade() {
		  return idade;
	 }
	 public void setIdade(int idade) {
		 this.idade = idade;
	 }
	 public int getNTelefone() {
		 return nTelefone;
	 }
	 public void setNTelefone(int nTelefone) {
		 this.nTelefone = nTelefone;
	 }
	
	 }

