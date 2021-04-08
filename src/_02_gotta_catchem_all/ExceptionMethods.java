package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double n, double d) throws IllegalArgumentException {
		double value = 0;
		if (d == 0.0) {
			throw new IllegalArgumentException();
		}else {
			value = n/d;
		}
	return value;
	}
	public static String reverse(String s) throws IllegalStateException {
		String sNew = "";
		if (s.equalsIgnoreCase("")) {
			throw new IllegalStateException();
		}
		for (int i = 0; i < s.length(); i++) {
		if (Character.isLetter(s.charAt(s.length() - (i + 1)))) {
			sNew += s.charAt(s.length() - (i + 1));
		}
		}
		return sNew;
	}
}
