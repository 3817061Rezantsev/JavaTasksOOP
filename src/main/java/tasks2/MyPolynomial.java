package tasks2;

import tasks1.Book;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}

	public double[] getCoeffs() {
		return coeffs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) coeffs[0];
		result = prime * result + coeffs.length;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		MyPolynomial pol = (MyPolynomial) obj;
		if (this.coeffs.length != pol.getCoeffs().length)
			return false;
		for (int i = 0; i < coeffs.length; i++) {
			if (!(coeffs[i] == pol.getCoeffs()[i])) {
				return false;
			}
		}
		return true;
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
			if (coeffs[1] == 0) {
				return "" + coeffs[0];
			}
			String s = coeffs[coeffs.length - 1] == 1 ? "" : "" + coeffs[coeffs.length - 1];
			String res = s + "x";
			res += "+" + coeffs[0];
			return res;
		}
		String s = coeffs[coeffs.length - 1] == 1 ? "" : "" + coeffs[coeffs.length - 1];
		String res = coeffs[coeffs.length - 1] == 0 ? "" : s + "x^" + (coeffs.length - 1);
		for (int i = coeffs.length - 2; i > 1; i--) {
			if (coeffs[i] == 0)
				continue;
			s = coeffs[i] == 1 ? "" : "" + coeffs[i];
			if (res.equals("")) {
				res += s + "x^" + i;
			} else {
				res += "+" + s + "x^" + i;
			}
		}
		if (coeffs[1] != 0)
			res += "+" + coeffs[1] + "x";
		if ((coeffs[0] == 0) && res.equals("")) {
			res += "0";
		} else {
			res += "+" + coeffs[0];
		}
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
