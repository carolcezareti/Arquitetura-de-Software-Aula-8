package arqsw_exercicio6_2;

public class InsertSort implements Ordenacao{

	public int[] ordena(int[] v) {
		int i, j, x;
		for (j = 1; j < v.length; ++j) {
		x = v[j];
		for (i = j - 1; i >= 0 && v[i] > x; --i) {
		v[i + 1] = v[i];
		}
		v[i + 1] = x;
		}
		return v;
	}
}
