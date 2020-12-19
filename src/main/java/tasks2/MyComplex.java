package tasks2;

public class MyComplex {
	private double real = 0.0;
	private double imag = 0.0;

	public MyComplex() {

	}

	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		String re = real == 0.0 ? "" : String.valueOf(real);
		String sing = imag > 0.0 && real != 0.0 ? "+" : "";
		String str = imag == 0.0 ? re : re + sing + imag + "i";
		String res = "(" + str + ")";
		return res;
	}

	public boolean isReal() {
		if (imag == 0)
			return true;
		return false;
	}

	public boolean isImaginary() {
		return !isReal();
	}

	public boolean equals(double real, double imag) {
		if ((Math.abs(this.real - real) < 1E-5) && (Math.abs(this.imag - imag) < 1E-5)) {
			return true;
		}
		return false;
	}

	public boolean equals(MyComplex another) {
		if ((Math.abs(this.real - another.getReal()) < 1E-5) && (Math.abs(this.imag - another.getImag()) < 1E-5)) {
			return true;
		}
		return false;
	}

	public double magnitude() {
		return real * real + imag * imag;
	}

	public double argument() {
		if (real > 0) {
			return Math.atan(imag / real);
		}
		if ((real < 0) && (imag > 0)) {
			return Math.PI + Math.atan(imag / real);
		}

		if ((real < 0) && (imag < 0)) {
			return -Math.PI + Math.atan(imag / real);
		}
		return 0;
	}

	public MyComplex add(MyComplex right) {
		this.setValue(real + right.getReal(), imag + right.getImag());
		return this;
	}

	public MyComplex addNew(MyComplex right) {
		return new MyComplex(real + right.getReal(), imag + right.getImag());
	}

	public MyComplex subtract(MyComplex right) {
		this.setValue(real - right.getReal(), imag - right.getImag());
		return this;
	}

	public MyComplex subtractNew(MyComplex right) {
		return new MyComplex(real - right.getReal(), imag - right.getImag());
	}

	public MyComplex multiply(MyComplex right) {
		this.setValue(real * right.getReal() - imag * right.getImag(), right.getReal() * imag + real * right.getImag());
		return this;
	}

	public MyComplex divide(MyComplex right) {
		double del = right.getReal() * right.getReal() + right.getImag() * right.getImag();
		this.setValue((real * right.getReal() + imag * right.getImag()) / del,
				(right.getReal() * imag - real * right.getImag()) / del);
		return this;
	}

	public MyComplex conjugate() {
		this.setValue(-real, -imag);
		return this;
	}

}
