package org.example.B3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<QuadraticEquation> equations = new ArrayList<>();
        equations.add(new QuadraticEquation(1, -3, 2));  // Корни: 1 и 2
        equations.add(new QuadraticEquation(1, -2, 1));  // Корень: 1
        equations.add(new QuadraticEquation(1, -4, 3));  // Корни: 1 и 3
        equations.add(new QuadraticEquation(1, 2, 1));   // Корень: -1

        double maxRoot = Double.NEGATIVE_INFINITY;
        double minRoot = Double.POSITIVE_INFINITY;

        for (QuadraticEquation equation : equations) {
            List<Double> roots = equation.findRoots();
            for (double root : roots) {
                if (root > maxRoot) {
                    maxRoot = root;
                }
                if (root < minRoot) {
                    minRoot = root;
                }
            }

            System.out.println(equation);
            System.out.println("Корни: " + roots);
            System.out.println("Экстремум: x = " + equation.findExtremum());
            System.out.println("Интервалы убывания/возрастания: " + equation.intervalsOfMonotonicity());
            System.out.println();
        }

        System.out.println("Наибольший корень: " + maxRoot);
        System.out.println("Наименьший корень: " + minRoot);
    }
}
