package ejercicio02;
	
//Consigna:
//Escribir un método en Java que de una matriz numérica dada, devuelva una matriz con la misma cantidad de elementos, 
//pero donde cada valor es la suma de sus adyacentes originales (arriba, abajo, izquierda, y derecha; si existen)
//
//Ejemplo:
//Para la matriz
// 8  2 -3  4
// 5 -6 -6 20
//21  1 -5  0
//
//La salida debe ser
//15  1  -3 21
//28 -4   0 18
//27 11 -10 15
	
public class ejercicio02 {
	public int[][] devolverMatrizSuma(int[][] matriz) {
		
		int filas = matriz.length;
		int columnas = matriz[0].length;

		// Creo la nueva matriz
		int[][] nuevaMatriz = new int[filas][columnas];
		
		// Inicializo la nueva matriz
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				nuevaMatriz[i][j] = 0;
			}
		}
		
		for (int i = 0; i < filas; i++) {
			// Pregunto si existe el inferior una vez por cada fila
			if (i + 1 < filas) {
				for (int j = 0; j < columnas; j++) {
					// Pregunto si existe el derecho
					if (j + 1 < columnas) {
						// Caso donde existe inferior y derecho
						nuevaMatriz[i][j] += matriz[i][j];
						nuevaMatriz[i][j] += matriz[i + 1][j];
						nuevaMatriz[i + 1][j] += matriz[i][j];
						nuevaMatriz[i][j] += matriz[i][j + 1];
						nuevaMatriz[i][j + 1] += matriz[i][j];
					} else {
						// Caso donde solo existe inferior
						nuevaMatriz[i][j] += matriz[i][j];
						nuevaMatriz[i][j] += matriz[i + 1][j];
						nuevaMatriz[i + 1][j] += matriz[i][j];
					}
				}
			} else {
				for (int j = 0; j < columnas; j++) {
					// Pregunto si existe el derecho
					if (j + 1 < columnas) {
						// Caso donde solo existe derecho
						nuevaMatriz[i][j] += matriz[i][j];
						nuevaMatriz[i][j] += matriz[i][j + 1];
						nuevaMatriz[i][j + 1] += matriz[i][j];
					} else {
						// Caso donde no existe inferior ni derecho
						nuevaMatriz[i][j] += matriz[i][j];
					}
				}
			}
		}
		// Devuelvo nueva matriz
		return nuevaMatriz;
	}
	
	public static void main(String[] args) {

		int[][] test = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		//int[][] test = { { 8, 2, -3, 4 }, { 5, -6, -6, 20 }, { 21, 1, -5, 0 } };
		ejercicio02 miEjercicio = new ejercicio02();
		int[][] nuevaMatriz = miEjercicio.devolverMatrizSuma(test);

		int rows = nuevaMatriz.length;
		int coloumns = nuevaMatriz[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloumns; j++) {
				System.out.print(nuevaMatriz[i][j]);
				System.out.print(' ');
			}
			System.out.println('\n');
		}
	}
}
