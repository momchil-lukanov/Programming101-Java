package tasks;
public class getSmallestMultiple {
	
	public static long gcd(long a, long b)
	{
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}
	
	public static long gcd(long[] input)
	{
	    long result = input[0];
	    for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
	    return result;
	}
	
	public static long lcm(long a, long b)
	{
	    return a * (b / gcd(a, b));
	}

	public static long lcm(long[] input)
	{
	    long result = input[0];
	    for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
	    return result;
	}

	public static void main(String[] args) {
		long[] a = {1, 2, 3, 4};
		System.out.println(lcm(a));
	}

}
