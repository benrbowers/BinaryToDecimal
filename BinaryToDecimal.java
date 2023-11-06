public class BinaryToDecimal {
	public static int bin2Dec(String binaryString) throws BinaryFormatException {
		char[] binaryChars = binaryString.toCharArray();

		for (int i = 0; i < binaryChars.length; i++) {
			char currChar = binaryChars[i];

			if (currChar != '0' && currChar != '1') {
				throw new BinaryFormatException(binaryString);
			}
		}

		int decimal = 0;

		for (int i = 0; i < binaryChars.length; i++) {
			char currChar = binaryChars[i];
			int exponent = binaryChars.length - i - 1; // First digit is 2^(len - 1)

			if (currChar == '1') {
				decimal += Math.pow(2, exponent);
			}
		}

		return decimal;
	}
}