package pack;

public class AA5_12 {
	
	static void desordenar(int t[]) {
		for (int i = 0; i < 20; i++) {
			int indice1 = (int) (Math.random() * t.length);
			int indice2 = (int) (Math.random() * t.length);
			
			int temp = t[indice1];
			t[indice1] = t[indice2];
			t[indice2] = temp;
		}
	}

	public static void main(String[] args) {
		/*
		 *  Escribe la función void desordenar(int t[]), que cambia de forma aleatoria los elementos
		 *  contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo.
		 */
		
		int t[] = {1,2,3,4};
		
		desordenar(t);
				
		for (int i = 0; i < t.length; i++) {
				System.out.println(t[i]);
			}
		}

}
