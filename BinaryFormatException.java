public class BinaryFormatException extends Exception {
	private String binaryString;

	public BinaryFormatException(String binaryString) {
		super("Binary string has incorrect format: " + binaryString);

		this.binaryString = binaryString;
	}

	public String getBinaryString() {
		return binaryString;
	}
}
