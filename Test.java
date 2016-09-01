public class Test {
	public static void main(String[]args) {
		DStack test1 = new ListStack();	//create an empty ArrayStack
		if(test1.isEmpty()){
			System.out.println("true");
		};
		test1.push(0.5);
		test1.push(0.2);
		if(test1.isEmpty()){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		System.out.println(test1.peek());
		while(!test1.isEmpty()){
			System.out.print(test1.pop() + " ");
		}
		System.out.println();

		if(test1.isEmpty()){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}