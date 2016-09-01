> 1.How did you test that your stack implementations were correct?
	First, I used the main function Reverse.java to check is it work.
	Then, I made up a smaller .dat file that contains a little data, and a small client programme that is able to read lines from .dat file, reverse file and check if the outcome is right. I also check every methods respectively by using that small client programme. 

> 2.The file secret.wav is a backwards recording of a word or short phrase. Use sox (or another converter) and your program to reverse it, and write that as the answer to this question.
	The scent of bitter almonds always reminds him of the fate of unrequited love.

> 3.Your array stacks start with a small array and double in size if they become full. For a .dat file with 1 million lines, how many times would this resizing occur? What about with 1 billion lines or 1 trillion lines (assuming the computer had enough memory)? Explain your answer.
	17 times would this resizing occur for 1 million lines; 27 times for 1 billion lines; 37 times for 1 trillion lines; Since we started the size of 10, each resizing doubled previous size two times, which follows 10*(2^n) = lines after nth resizing.

> 4.Suppose that, instead of a DStack interface, you were given a fully-functional FIFO Queue class. How might you implement this project (i.e., simulate a Stack) with one or more instances of a FIFO Queue? 
	For the push() method, we just need add value into Queue at the very beginning, but for the pop() method and peek() method would be more time wasting. Becuase we have to remove every value in front of the top value and add it back.

> 5.Write pseudocode for your push and pop operations. Refer to the Written-Homework Guidelines for instructions on writing pseudocode. Assume your Queue class provides the operations enqueue, dequeue, isEmpty, and size.

	public void push(value) {
		enqueue value to queue
		size++
	}

	public double pop(value) {
		for (this.size - 1){
			dequeue value
			add it back from the front
		}
		remove value
		return value
	}


> 6.In the previous question, what trade-offs did you notice between a Queue implementation of a Stack and your original array-based implementation? Which implementation would you choose, and why?
	Although push() runs same time on both array-based implementation and Queue implementation (if queue also need
	size checking). But pop() on Queue is much more wasting time. Because we have to remove (n-1) number of values
	from the queue and add them back. When the data set is very large, it takes huge amount of time to pop out the
	peek value. Clearly, array-based implementation doesn't has this issue, it just removes very last value, and
	spend same amount of time when dealing with any numbers of data. So I will choose array-based implementation.

> 7.Include a description of how your project goes "above and beyond" the basic requirements (if it does).
	no

> 8.What did you enjoy about this assignment? What did you not enjoy?
	I enjoyed the coding part, and learnt new knowledge about how music file works. There are not obvious things that
	I not enjoyed. I think I could have done extra-credit. But I got 5 courses this summer, and a midterm today, I don't have so much time on solving harder problems. I hope I could try to solve them on next homework!

> 9.What else, if anything, would you would like to include related to this homework?
	no