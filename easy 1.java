class Test {
    	static void printFibonacciNumbers(int n)
	{
		int f1 = 0, f2 = 1, i;
		System.out.print(f1 + " ");
		if (n < 1)
			return;
		
		for (i = 1; i < n; i++) {
			System.out.print(f2 + " ");
			int next = f1 + f2;
			f1 = f2;
			f2 = next;
		}
	}
	public static void main(String[] args)
	{
		printFibonacciNumbers(7);
	}
}