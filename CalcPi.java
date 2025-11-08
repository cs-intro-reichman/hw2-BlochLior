// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int iterations = Integer.parseInt(args[0]);
		int i = 0;
		int denominator = 1;
		double approxPi = 0.0;
		boolean flagPlus = true;
		while (i < iterations) {
			if (!flagPlus) {
				approxPi -= 1.0 / denominator;
				flagPlus = true;
			} else {
				approxPi += 1.0 / denominator;
				flagPlus = false;
			}
			denominator += 2;
			i++;
		}
		
		approxPi *= 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approxPi);

	}
}
