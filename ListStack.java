/* Yumeng Wang
 * CSE 373, Summer 2016
 * Homework 1: Sound Blaster!
 * 
 * ListStack can be used to store bunch of numbers passed by .dat files
 * as a stack
 */
import java.util.EmptyStackException;

public class ListStack implements DStack{
	private ListStackNode front; 	//An ListStackNode of numbers in given data
	
	// post: constructs an empty ListStack
	public ListStack(){
		this.front = null;
	}
	
	// post: return whether this ListStack is empty
	// (true if it is empty, false if it is not)
	public boolean isEmpty() {
		return this.front == null;
	}
	
	// post: push value into current ListStack
	public void push(double d) {
		if(front == null){
			front = new ListStackNode(d, null);
		}else{
			front = new ListStackNode(d, front);
		}
	}
	
	// pre: current ListStack has to be non-empty
	//		(throws EmptyStackException if it is empty)
	// post: remove the peek value of ListStack
	//		 and remove it from current ListStack
	public double pop() {
		if(this.isEmpty()){
			throw new EmptyStackException();
		}
		double frontValue = this.front.data;
		this.front = this.front.next;
		return frontValue;
	}

	// pre: current ListStack has to be non-empty
	//		(throws EmptyStackException if it is empty)
	// post: look up the peek value and return it
	public double peek() {
		if(this.isEmpty()){
			throw new EmptyStackException();
		}
		return this.front.data;
	}

}
