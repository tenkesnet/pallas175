class IntVectorDemo {
    public static void main(String[] args) {
		IntVector v = new IntVector(new int{1,2,3});
		v.add(1);
		System.out.println(v);
		System.out.println(new int{1,2,3});

        int[] ns = new int{1,2,3};
        IntVector v2 = new IntVector(ns);
        System.out.println(v2);
        ns[0] = 10;             
        System.out.println(ns);
    }
}