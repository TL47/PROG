package pack;

public class correcionExamen {
    
    static int[] desplazarVector(int t[], int ind, int desp) {
        int v[] = new int[t.length];
        int pos = ind - desp;
        for (int i = 0; i < desp; i++) {
            int j = pos + i;
            v[i] = t[j];
        }
        
        int j = desp;
		for (int i = 0; i < pos; i++) {
			v[j] = t[i];
			j++;
		}
        
        return v;
    }

    public static void main(String[] args) {
        int t[] = {1,2,3,4,5,6,7};
        int ind = 7, desp = 4;
        int v[] = desplazarVector(t, ind, desp);
        
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
