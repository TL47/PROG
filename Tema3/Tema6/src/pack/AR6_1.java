package pack;

public class AR6_1 {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que muestre todos los caracteres Unicode junto a su code point, cuyo
		 * valor esté comprendido entre \u0000 y \uFFFF.
		 */

		for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
			String xxxx = Integer.toHexString(codePoint);
			System.out.println("\\u" + xxxx + ":"+ (char) codePoint);
		}
		
	}

}
