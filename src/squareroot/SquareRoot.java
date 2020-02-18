package squareroot;

public class SquareRoot {
	public static int squareRoot(int x) {
		int result = 0;
		while (result*result<=x)
			result ++;
		return result -1;
	}
	

}
