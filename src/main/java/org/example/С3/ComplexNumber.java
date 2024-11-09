package org.example.С3;

import java.util.ArrayList;
import java.util.List;
class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Сложение комплексных чисел
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    @Override
    public String toString() {
        return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
    }
}

class Polynomial {
    private List<ComplexNumber> coefficients;

    public Polynomial(List<ComplexNumber> coefficients) {
        this.coefficients = coefficients;
    }

    public Polynomial add(Polynomial other) {
        List<ComplexNumber> resultCoefficients = new ArrayList<>();
        int maxDegree = Math.max(this.coefficients.size(), other.coefficients.size());

        for (int i = 0; i < maxDegree; i++) {
            ComplexNumber a = i < this.coefficients.size() ? this.coefficients.get(i) : new ComplexNumber(0, 0);
            ComplexNumber b = i < other.coefficients.size() ? other.coefficients.get(i) : new ComplexNumber(0, 0);
            resultCoefficients.add(a.add(b));
        }

        return new Polynomial(resultCoefficients);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < coefficients.size(); i++) {
            result.append(coefficients.get(i).toString()).append(" * x^").append(i);
            if (i < coefficients.size() - 1) {
                result.append(" + ");
            }
        }
        return result.toString();
    }
}



