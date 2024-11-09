package org.example.B3;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public List<Double> findRoots() {
        List<Double> roots = new ArrayList<>();
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            roots.add((-b + Math.sqrt(discriminant)) / (2 * a));
            roots.add((-b - Math.sqrt(discriminant)) / (2 * a));
        } else if (discriminant == 0) {
            roots.add(-b / (2 * a));
        }
        return roots;
    }

    public double findExtremum() {
        return -b / (2 * a);
    }

    public String intervalsOfMonotonicity() {
        double extremum = findExtremum();
        if (a > 0) {
            return "Убывание: (-∞, " + extremum + "), Возрастание: (" + extremum + ", +∞)";
        } else {
            return "Возрастание: (-∞, " + extremum + "), Убывание: (" + extremum + ", +∞)";
        }
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

