class Test {
	public static void main (String[] args) {
		
		Sorting sort = new Sorting(3);
		sort.getValue(0,"Jowin", "Cueto", 19, "Apalit, Pampanga");
		sort.getValue(1,"Jeff Vincent", "Pecana", 16, "Antipolo, Rizal");
		sort.getValue(2,"Christian", "Guardiana", 20, "Manaoag, Pangasinan");

		System.out.println("\n**** ORIG ****");
		sort.display();

		System.out.println("\n **** Sort ****");
		sort.bubbleSort();
		sort.display();
	}
}

