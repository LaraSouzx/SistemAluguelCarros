package P011;


public class Aluguel extends Cliente {
	
	private String modCarro;
	private String placa;
	private float kmR;
	
	public Aluguel(String nome, int idade, int nTelefone) {
		super(nome, idade, nTelefone);
	}

	
	public void carros(String modCarro, String placa, float kmR) {
		this.modCarro = modCarro;
		this.placa = placa;
		this.kmR = kmR;
	}

	@Override
	// toString não está retornando os dados
	public String toString() {
		return "aluguel [nome=" + nome + ", idade=" + idade + ", nTelefone=" + nTelefone + ", toString()="
				+ super.toString() + ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getNTelefone()="
				+ getNTelefone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public String getModCarro() {
		return modCarro;
	}

	public void setModCarro(String modCarro) {
		this.modCarro = modCarro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getKmR() {
		return kmR;
	}

	public void setKmR(float kmR) {
		this.kmR = kmR;
	}

}
