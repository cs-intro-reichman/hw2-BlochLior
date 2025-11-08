// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int highestSeed = Integer.parseInt(args[0]);
		String mode = args[1];
		int currentSeed = 1;

		while (currentSeed <= highestSeed) {
			int currentValue = currentSeed;
			int currentSeqCount = 1;
			if (mode.equals("v")) {
				System.out.print(currentValue);
			}
			if (currentSeed == 1 && currentValue == 1) {
				currentSeqCount++;
				currentValue = currentValue * 3 + 1;
				if (mode.equals("v")) {
					System.out.print(" " + currentValue);
				}
			}
			while (currentValue != 1) {
				currentSeqCount++;
				if (currentValue % 2 == 0) {
					currentValue /= 2;
				} else {
					currentValue = currentValue * 3 + 1;
				}
				if (mode.equals("v")) {
					System.out.print(" " + currentValue);
				}
			}
			if (mode.equals("v")) {
				System.out.print(" (" + currentSeqCount + ")");
				System.out.println();
			}
			currentSeed++;
		}
		System.out.println("Every one of the first " + highestSeed +
								" hailstone sequences reached 1.");
	}
}
