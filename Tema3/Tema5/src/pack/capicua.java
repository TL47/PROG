package pack;

public class capicua {
	
	static boolean esCapicua(int capicua[]) {
		boolean es = true;
		for (int i = 0; i < capicua.length && es == true; i++) {
			if (capicua[i] == capicua[capicua.length - i - 1]) {
				es = true;
			} else {
				es = false;
			}
		}
		return es;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int capicua[] = {1,2,3,2,1};
		if (esCapicua(capicua)){
			System.out.println("El número es capicua");
		} else {
			System.out.println("No es capicua");
		}
		
	}

}
