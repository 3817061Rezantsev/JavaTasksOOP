package tasks2;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}

	public double[] getCoeffs() {
		return coeffs;
	}

	public int getDegree() {
		return coeffs.length;
	}

	@Override
	public String toString() {
		if (coeffs.length == 1) {
			return "" + coeffs[0];
		}
		
		if (coeffs.length == 2) {
			String s = coeffs[coeffs.length - 1] == 1 ? "" : "" + coeffs[coeffs.length - 1];
			String res = s + "x";
			res += "+" + coeffs[0];
			return res;
		}
		String s = coeffs[coeffs.length - 1] == 1 ? "" : "" + coeffs[coeffs.length - 1];
		String res = s + "x^" + (coeffs.length - 1);
		for (int i = coeffs.length - 2; i > 1; i--) {
			s = coeffs[i] == 1 ? "" : "" + coeffs[i];
			res += "+" + s + "x^" + i;
		}
		res += "+" + coeffs[1] + "x";
		res += "+" + coeffs[0];
		return res;
	}

	public double evaluate(double x) {
		double res = 0;
		for (int i = 0; i < coeffs.length; i++) {
			res += coeffs[i] * Math.pow(x, i);
		}
		return res;
	}

	public MyPolynomial add(MyPolynomial right) {
		double[] summ;
		int degree = Math.max(coeffs.length, right.getDegree());
		if (degree == coeffs.length) {
			summ = coeffs;
			for (int i = 0; i < right.getDegree(); i++) {
				summ[i] += right.getCoeffs()[i];
			}
		} else {
			summ = right.getCoeffs();
			for (int i = 0; i < coeffs.length; i++) {
				summ[i] += coeffs[i];
			}
		}
		return new MyPolynomial(summ);
	}

	public MyPolynomial multiply(MyPolynomial right) {
		int degree = coeffs.length + right.getDegree() - 1;
		double[] mul = new double[degree];
		for (int i = 0; i < coeffs.length; i++) {
			for (int j = 0; j < right.getDegree(); j++) {
				mul[i + j] += coeffs[i] * right.getCoeffs()[j];
			}
		}
		return new MyPolynomial(mul);
	}
}
