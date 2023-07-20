package hometask;

public class ComplexNumber extends Number {
    Float real;
    Float imaginary;
    Float relNew;
    Float imaginaryNew;

    public ComplexNumber(Float real, Float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Float getReal() {
        return real;
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }

    public Float getImaginary() {
        return imaginary;
    }

    public void setReal(Float real) {
        this.real = real;
    }

    public void setImaginary(Float imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
