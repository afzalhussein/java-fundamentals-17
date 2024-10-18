/**
 * 
 */
package fundamentals;

/**
 * 
 */
public class Primitives {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		integerDemo();
	}

	private static void integerDemo() {
		System.out.println("int and Integer demo");
		intDemo();
		integerWrapperDemo();
	}

	private static void integerWrapperDemo() {
		System.out.println("The Integer class is a wrapper class with utility methods and constants");
		System.out.println("Max constant: " + Integer.MAX_VALUE);
		System.out.println("Min constant: " + Integer.MIN_VALUE);
		System.out.println("Computes min of two integers 10,01: " + Integer.min(10, 01));
		System.out.println("Computes max of two integers 10,01: " + Integer.max(10, 01));

		System.out.println("Integer valueOf demo and unchecked exception handling");
		try {
			valueOfDemo("100");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		try {
			valueOfDemo("");
		} catch (NumberFormatException e) {
			System.out.println("Exception thrown: " + e.getMessage());
		}

		System.out.println("Computes division of two integers 10, 2: " + Integer.divideUnsigned(10, 2));
		System.out.println("Computes remainder of two integers 10, 2: " + Integer.remainderUnsigned(10, 2));
		System.out.println("Computes sum of two integers 10, 2: " + Integer.sum(10, 2));

		System.out.println("Integer parseInt demo and unchecked exception handling");
		System.out.println("Convert string \"100\" to integer: " + Integer.parseInt("100"));
		try {
			System.out.println("Convert string \"\" to integer: " + Integer.parseInt(""));
		} catch (NumberFormatException e) {
			System.out.println("Exception thrown: " + e.getMessage());
		}
	}

	private static void valueOfDemo(String strInt) throws NumberFormatException {
		System.out.println("Extract integer from string " + strInt + ": " + Integer.valueOf(strInt));
	}

	private static void intDemo() {
		System.out.println("There are two types of integers");
		intTypeDemo();
		longDemo();
	}

	private static void intTypeDemo() {
		System.out.println("int type");
		int age = 20;
		System.out.println("int age = " + age);
	}

	private static void longDemo() {
		System.out.println("long type");
		long numberOfEggs = 2000l;
		System.out.println("long numberOfEggs = " + numberOfEggs);
	}

}
