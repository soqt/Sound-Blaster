/* Yumeng Wang
 * CSE 373, Summer 2016
 * Homework 1: Sound Blaster!
 * 
 * ListStackNode is a class for storing a single node of a stack linked
 * list storing double values between -1.0 and 1.0.*/

public class ListStackNode {
	public double data;			//a node storing a double value data
	public ListStackNode next;	//link to next node in the stack list
	
	// post: constructs a node with given data and null link
	public ListStackNode(double data){
		this(data, null);
	}
	
	// post: constructs a node with given data and given link
	public ListStackNode(double value, ListStackNode next) {
		this.data = value;
		this.next = next;
	}
}
