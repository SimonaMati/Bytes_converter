import java.util.Scanner;

public class Bytes_converter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of bytes -> ");
		double bytes = input.nextLong();

		convertBytes(bytes);
	}

	public static void convertBytes(double bytes) {
		long kilobyte = 1024;
		String[] postfix = {"bytes", "KB", "MB", "GB", "TB"};

		int i = 0;
		while (bytes > kilobyte) {
			bytes = bytes / kilobyte;
			i++;
		}

		System.out.printf("%4.2f", bytes);
		System.out.print(" " + postfix[i]);
	}

}