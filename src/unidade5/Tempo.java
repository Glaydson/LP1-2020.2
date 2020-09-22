package unidade5;

public class Tempo {

	private int hora;
	private int minuto;
	private int segundo;

	// Construtor sem argumentos, inicializa cada atributo para zero
	public Tempo() {
		this(0, 0, 0); // Invoca o construtor com 3 argumentos
	}

	// Inicializa tempo com hora somente
	public Tempo(int hora) {
		this(hora, 0, 0); // Invoca o construtor com 3 argumentos
	}

	// Inicializa tempo com hora e, minuto
	public Tempo(int hora, int minuto) {
		this(hora, minuto, 0); // Invoca o construtor com 3 argumentos
	}

	// Inicializa tempo com hora, minuto e segundos
	public Tempo(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	@Override
	public String toString() {
		return "Tempo [hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + "]";
	}
	
	

}
