package pack;

import java.util.Arrays;

public class correciónExamen {
	
	static int[] desplazarVector(int t[], int ind, int desp) {
		int v[] = new int [t.length];
		boolean esta = false;
		for (int i = ind - 1; i >= 0 && esta == false; i--) {
			
		}
		
		System.out.println(Arrays.toString(v));
		
		int j = desp;
		int pos = ind - desp;
		for (int i = 0; i < pos; i++) {
			v[j] = t[i];
			j++;
		}
		return v;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v[];
		int t[] = {1,2,3,4,5,6,7};
		int ind = 7, desp = 2;
		v = desplazarVector(t, ind, desp);
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		
	}

}
