package P011;


public class Aluguel extends Cliente {
	
	private String modCarro;
	private String placa;
	private float kmR;
	private int DiAlugados;
	
	public Aluguel(String nome, int idade, int nTelefone) {
		super(nome, idade, nTelefone);
	}

	
	public void carros(String modCarro, String placa, float kmR, int DiAlugados) {
		this.modCarro = modCarro;
		this.placa = placa;
		this.kmR = kmR;
		this.DiAlugados = DiAlugados;
	}

	  

	@Override
	public String toString() {
		return "Aluguel [modCarro= " + modCarro + ", placa= " + placa + ", kmR= " + kmR + ", Dias Alugados: " +DiAlugados+ " " +super.toString()+ " ]";
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
	
	public int getDiAlugados () {
		return DiAlugados ;
	}
	
	public void setDiAlugados(int DiAlugados) {
		 this.DiAlugados = DiAlugados;
	}

}
