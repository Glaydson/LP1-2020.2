package unidade5;

public class TesteCelulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Celular samsung = new Celular("Samsung", "S14", 128);

//		System.out.println(samsung.getMarca());
//		System.out.println(samsung);
		
		int memoriaInterna = 128;
		Celular iphone7 = new Celular (
			"Iphone", "7plus", memoriaInterna);
		memoriaInterna = 256;
		Celular samsung = new Celular(
			"Samsung", "Galaxy", iphone7.getTamanhoMemoria());
		System.out.println(
			samsung.getTamanhoMemoria());

	}

}
