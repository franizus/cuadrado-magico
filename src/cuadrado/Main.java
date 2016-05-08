package cuadrado;

public class Main {

	public static void main(String[] args) {
		int dimension=3;

		CuadradoMagico cuadrado = new CuadradoMagico(dimension);

		imprimirCuadrado(cuadrado.getMatriz());
	}
	
	public static void imprimirCuadrado(int [][]matriz){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("|"+matriz[i][j]+"|");
			}
			System.out.println();
		}
	}



}
