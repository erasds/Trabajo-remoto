import java.math.BigInteger;

public class Jedi9 {
	
	public static void main(String[]args) {
		long longValue = Long.MAX_VALUE;
		BigInteger valueFromLong = BigInteger.valueOf(longValue);
		System.out.println("El mayor long impar es : " + longValue);
		BigInteger a = new BigInteger("9223372036854775807");
		BigInteger result = a.nextProbablePrime();
		System.out.println("El primer primo probable mayor es: " + result);
		BigInteger result2 = result.nextProbablePrime();
		System.out.println("El siguiente primo probable mayor es: " + result2);
	}
}