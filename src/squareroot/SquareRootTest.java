package squareroot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareRootTest {
	/**
	* Return the square root, rounded down, of the given number.
	* 
	* @pre The given number is nonnegative.
	* 	|0<=x 
	* @post The square of the result is not greater than the given number.
	* 	| result*result <=x
	* @post The result is the greatest number whose square is not greater than the given number.
	* 	| x<(result +1)*(result+1)
	*/
	@Test
	void test() {
		assert SquareRoot.squareRoot(9) ==3;
		assert SquareRoot.squareRoot(16)==4;
		assert SquareRoot.squareRoot(0)==0;
	}

}
