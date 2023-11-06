public class Main {
	public static void main (String[] args) {
		String correctString = "1010";
		String incorrectString = "1o1o1o";

		try {
			int decimal = BinaryToDecimal.bin2Dec(correctString);
			System.out.println("Decimal from correctString: " + decimal);
		} catch (BinaryFormatException ex) {
			System.out.println("correctString threw a BinaryFormatException");
			ex.printStackTrace();
		}

		try {
			int decimal = BinaryToDecimal.bin2Dec(incorrectString);
			System.out.println("Decimal from incorrectString: " + decimal);
		} catch (BinaryFormatException ex) {
			System.out.println("incorrectString threw a BinaryFormatException");
			ex.printStackTrace();
		}
	}
}
