package hometask;

import hometask.logging.Logger;

public class CalcComplexModel implements CalcModel<ComplexNumber> {

    ComplexNumber a, b;

    Logger logger;

    public CalcComplexModel(Logger logger) {
        this.a = a;
        this.b = b;
        this.logger = logger;
    }

    @Override
    public void SetA(ComplexNumber a) {
        this.a = a;
    }

    @Override
    public void SetB(ComplexNumber b) {
        this.b = b;
    }

    @Override
    public ComplexNumber add() {
        logger.log(String.format(" Summing " + a + " and " + b));
        Float realNew = a.getReal() + b.getReal();
        Float imaginaryNew = a.getImaginary() + b.getImaginary();
        ComplexNumber resultComplex = new ComplexNumber(realNew, imaginaryNew);
        logger.log(String.format("Result: " + resultComplex));
        return resultComplex;
    }

    @Override
    public ComplexNumber substact() {
        logger.log(String.format(" Subtracting " + b + " from " + a));
        Float realNew = a.getReal() - b.getReal();
        Float imaginaryNew = a.getImaginary() - b.getImaginary();
        ComplexNumber resultComplex = new ComplexNumber(realNew, imaginaryNew);
        logger.log(String.format("Result: " + resultComplex));
        return resultComplex;
    }

    @Override
    public ComplexNumber multiply() {
        logger.log(String.format(" Multiplying " + a + " by " + b));
        Float realNew = (a.getReal() * b.getReal()) - (a.getImaginary() * b.getImaginary());
        Float imaginaryNew = (a.getImaginary() * b.getReal()) + (a.getReal() * b.getImaginary());
        ComplexNumber resultComplex = new ComplexNumber(realNew, imaginaryNew);
        logger.log(String.format("Result" + resultComplex));
        return resultComplex;
    }

    @Override
    public ComplexNumber divide() {
        logger.log(String.format("Dividing " + a + " by " + b));
        Float realNew = ((a.getReal() * b.getReal()) + (a.getImaginary() * b.getImaginary())) /
                (( b.getReal() *  b.getReal()) + (b.getImaginary() * b.getImaginary()));
        Float imaginaryNew = ((a.getImaginary() * b.getReal()) - (a.getReal() * b.getImaginary())) /
                (( b.getReal() *  b.getReal()) + (b.getImaginary() * b.getImaginary()));
        ComplexNumber resultComplex = new ComplexNumber(realNew, imaginaryNew);
        logger.log(String.format("Result: " + resultComplex));
        return resultComplex;
    }
}
