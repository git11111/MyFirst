public class CallingLambda {
	
	interface IMyInterface{
		void add(int x, int y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IMyInterface myinter = (p, q) -> System.out.println("the sum is "+ (p+q));
		
		myinter.add(10, 20);

	}

}
