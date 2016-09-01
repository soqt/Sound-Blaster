/* Yumeng Wang
 * CSE 373, Summer 2016
 * Homework 1: Sound Blaster!
 * 
 * ArrayStack can be used to store bunch of numbers passed by .dat files
 * as a stack
 */
import java.util.EmptyStackException;

public class ArrayStack implements DStack{
	private double[] data;		//list of double numbers
	private int size;			//total number of data in the given file
	
	// post: constructs an empty ArrayStack
	public ArrayStack() {
		this.data = new double[10];
		this.size = 0;
	}
	
	// post: return whether this ArrayStack is empty
	// (true if it is empty, false if it is not)
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	// post: push value into current ArrayStack
	public void push(double d) {
		// if current ArrayStack is full, double its size
		if(this.size == this.data.length){
			double[] newArray = new double[this.size * 2];
			for(int i = 0; i < this.size; i++){
				newArray[i] = this.data[i];
			}
			this.data = newArray;
		}
		this.data[this.size] = d;
		this.size++;
	}
	
	// pre: current ArrayStack has to be non-empty
	//		(throws EmptyStackException if it is empty)
	// post: remove the peek value of ArrayList
	//		 and remove it from current ArrayStack
	public double pop() {
		if(this.isEmpty()){
			throw new EmptyStackException();
		}
		double peekValue = this.peek();
		size--;
		return peekValue;
	}

	// pre: current ArrayStack has to be non-empty
	//		(throws EmptyStackException if it is empty)
	// post: look up the peek value and return it
	public double peek() {
		if(this.isEmpty()){
			throw new EmptyStackException();
		}
		return this.data[this.size - 1];
	}
}
