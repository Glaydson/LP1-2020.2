package unidade5;

public class Celular {

	private String marca;

	private String modelo;

	private int tamanhoMemoria;

	public Celular(String marca, String modelo, int tamanhoMemoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamanhoMemoria = tamanhoMemoria;
	}

	public Celular() {

	}

	public int getTamanhoMemoria() {
		return tamanhoMemoria;
	}

	public void setTamanhoMemoria(int tamanhoMemoria) {
		this.tamanhoMemoria = tamanhoMemoria;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", tamanhoMemoria=" + tamanhoMemoria + "]";
	}

}
