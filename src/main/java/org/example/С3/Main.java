package org.example.С3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание полиномов
        List<ComplexNumber> coeffs1 = List.of(new ComplexNumber(1, 1), new ComplexNumber(2, -1), new ComplexNumber(3, 3));
        List<ComplexNumber> coeffs2 = List.of(new ComplexNumber(0, 1), new ComplexNumber(1, 1), new ComplexNumber(-1, -1));
        List<ComplexNumber> coeffs3 = List.of(new ComplexNumber(2, 0), new ComplexNumber(0, -1), new ComplexNumber(1, 1));

        Polynomial p1 = new Polynomial(coeffs1);
        Polynomial p2 = new Polynomial(coeffs2);
        Polynomial p3 = new Polynomial(coeffs3);

        List<Polynomial> polynomials = List.of(p1, p2, p3);

        // Вывод исходных полиномов
        System.out.println("Исходные полиномы:");
        for (Polynomial polynomial : polynomials) {
            System.out.println(polynomial);
        }

        // Вычисление суммы всех полиномов
        Polynomial sum = polynomials.get(0);
        for (int i = 1; i < polynomials.size(); i++) {
            sum = sum.add(polynomials.get(i));
        }

        // Вывод суммы полиномов
        System.out.println("\nСумма полиномов:");
        System.out.println(sum);
    }
}
