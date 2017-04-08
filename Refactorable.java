package refactoring;

public class Refactorable {
	private MyCollection _orders = new MyCollection();
	private String _name = "Customer Name";
	
	void printOwing() {
		Enumeration<E> e = _orders.elements();
		double outstanding = 0.0;
		
		// print banner
		printBanner();
		
		// calculate outstanding
		while(e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
		
		// print details
		System.out.println("Name : " + _name);
		System.out.println("Amount : " + outstanding);
	}

	public void printBanner() {
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");
	}

}
