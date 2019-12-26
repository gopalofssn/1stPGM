import java.util.LinkedList;
/*
 Buffer buf = new Buffer(5); // [. . . . .]
buf.write([abc]); // => 3 [abc . .]
buf.write([def]); // => 2 because the buffer is full, you can only write two chars [abcde]
buf.read(3); // => [abc] [. . . de]
buf.write([xyzabc]); // => 3 [xyzde]
buf.read(8); // returns [dexyz] becuase 'de' was written first [. . . . .]
 */

public class Buffer {
	
	final int capacity; // why final?, nobody can change after we call new Buffer(n). 

	LinkedList<Character> ll = new LinkedList<Character>();
	
	public Buffer(int _capacity) {
		capacity = _capacity;
	}

	public int getCapcity() {
		return capacity;
	}
	/**
	* Transfers the content of the given source char array into this buffer.
	* Returns the the number of chars that were written into the buffer.
	*/
	public int write(char[] src) { 
		 @ TODO
	}

	public int write(String src) {
		return write(src.toCharArray());
	}
	public char[] read(int n) {
		@TODO
	}
	
	public static void main(String[] args) {
		Buffer buf = new Buffer(5); // [. . . . .]
		System.err.println(buf.write("abc")); // => 3 [abc . .]
		System.err.println(new char[]{'d','e','f'}); // => 2 because the buffer is full, you can only write two chars [abcde]
		System.err.println(buf.read(3)); // => [abc] [. . . de]
		System.err.println(buf.write("xyzabc")); // => 3 [xyzde]
		System.err.println(buf.read(8)); //returns [dexyz] becuase 'de' was written first [. . . . .]
	}
}
