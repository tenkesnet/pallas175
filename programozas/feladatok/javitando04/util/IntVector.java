package util;

public class IntVector {
    int[] ns;

    IntVector(int[] numbers) {
		ns = numbers;
    }

    public void add(int n) {
		for (int i = 0; i < ns.length-1; i++)
			ns[i] += n;
    }

    public String toString() {
		return Arrays.toString(ns);
    }
}

