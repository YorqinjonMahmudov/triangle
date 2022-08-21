package com.epam.rd.autotasks.triangle;

import static java.lang.Math.abs;

public class Triangle {

    private Point first;

    private Point second;

    private Point third;

    public Triangle(Point parameter1, Point parameter2, Point parameter3) {
        this.first = parameter1;
        this.second = parameter2;
        this.third = parameter3;

         if ((first == null) || (second == null) || (third == null))
            throw new RuntimeException();

        if (
                (second.getY() - first.getY() + second.getY() - third.getY()) < third.getY() - first.getY()
                        || (second.getY() - first.getY() + third.getY() - first.getY() < second.getY() - third.getY())
                        || (third.getY() - first.getY() + second.getY() - third.getY() < second.getY() - first.getY())
        )
            throw new RuntimeException();

    }


    public double area() {
        double x1 = first.getX();
        double x2 = second.getX();
        double x3 = third.getX();
        double y1 = first.getY();
        double y2 = second.getY();
        double y3 = third.getY();
        return abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
    }


    public Point centroid() {
        double centerY = (1 / 3.) * (first.getY() + second.getY() + third.getY());

        double centerX = (1 / 3.) * (first.getX() + second.getX() + third.getX());

        return new Point(centerX, centerY);



    }


}
