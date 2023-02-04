package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    void run(Scanner scanner) {
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();
        showQuarter(new Point(x, y));
    }

    private void showQuarter(Point point) {
        if (isFirstQuarter(point)) {
            System.out.println(point.getDescription() + " leży w I ćwiartce układu współrzędnych");
        } else if (isSecondQuarter(point)) {
            System.out.println(point.getDescription() + " leży w II ćwiartce układu współrzędnych");
        } else if (isThirdQuarter(point)) {
            System.out.println(point.getDescription() + " leży w III ćwiartce układu współrzędnych");
        } else if (isFourthQuarter(point)) {
            System.out.println(point.getDescription() + " leży w IV ćwiartce układu współrzędnych");
        } else if (isCenterAxis(point)) {
            System.out.println(point.getDescription() + " leży na środku układu współrzędnych");
        } else if (isXaxis(point)) {
            System.out.println(point.getDescription() + " leży na osi X");
        } else if (isYaxis(point)) {
            System.out.println(point.getDescription() + " leży na osi Y");
        }
    }

    private boolean isFirstQuarter(Point point) {
        return point.getX() > 0 && point.getY() > 0;
    }

    private boolean isSecondQuarter(Point point) {
        return point.getX() < 0 && point.getY() > 0;
    }

    private boolean isThirdQuarter(Point point) {
        return point.getX() < 0 && point.getY() < 0;
    }

    private boolean isFourthQuarter(Point point) {
        return point.getX() > 0 && point.getY() < 0;
    }

    private boolean isXaxis(Point point) {
        return point.getY() == 0;
    }

    private boolean isYaxis(Point point) {
        return point.getX() == 0;
    }

    private boolean isCenterAxis(Point point) {
        return isXaxis(point) && isYaxis(point);
    }
}
