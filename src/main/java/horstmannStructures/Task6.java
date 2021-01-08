package horstmannStructures;

import java.math.BigInteger;

public class Task6 {
	public static BigInteger factorial(BigInteger val) {
		BigInteger b = val.add(BigInteger.valueOf(-1));
		b.max(BigInteger.valueOf(1));
		if (b.equals(BigInteger.valueOf(0))) {
			return BigInteger.valueOf(1);
		}
		return val.multiply(factorial(b));
	}
	
	public static void main(String args[]) {
		BigInteger b = BigInteger.valueOf(1000);
		System.out.println(factorial(b));
	}
}
