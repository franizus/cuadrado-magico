package cuadrado;

public class CuadradoMagico {

	private int [][] matriz ;

	public CuadradoMagico(int dimension) {
		super();
		this.matriz = new int [dimension][dimension];
		generarCuadrado();
	}
	
	public int[][] getMatriz() {
		return matriz;
	}

	public void generarCuadrado (){
		int mitad = this.matriz.length/2;
		int ubicacionColumna=mitad;
		int ubicacionFila=0;
		this.matriz[ubicacionFila][ubicacionColumna]=1;

		int ubicacionColumnaActual=ubicacionColumna;
		int ubicacionFilaActual=ubicacionFila;
		
		for (int i = 2; i < Math.pow(matriz.length, 2)+1; i++) {
			ubicacionFila--;
			ubicacionColumna++;
			if (ubicacionFila<0) {
				ubicacionFila=matriz.length-1;
				}
			if (ubicacionColumna>matriz.length-1) {
				ubicacionColumna=0;
			}
			if (matriz[ubicacionFila][ubicacionColumna]==0) {
				matriz[ubicacionFila][ubicacionColumna]=i;
			}else{
				ubicacionFila=ubicacionFilaActual+1;
				ubicacionColumna=ubicacionColumnaActual;
				matriz[ubicacionFila][ubicacionColumna]=i;
			}
			ubicacionFilaActual=ubicacionFila;
			ubicacionColumnaActual=ubicacionColumna;			
	
		}


	}


}
