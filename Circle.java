package com.company;

public class Circle {
    Dot C;
    double D;
    double R;


    public Circle (double radius){
        C =new Dot();
        this.R=radius;
        this.D=2*radius;
    }

    public double getArea() {
        return R * R * Math.PI;
    }

    public double getLength() {
        return D * Math.PI;
    }


    public double getDiameter() {
        return D;
    }

    public double getRadius() {
        return R;
    }

    @Override
    public String toString(){
        return "Circle (diametr = "+ D+", radius = "+R+
                ", center = " + C + ", area = " + getArea()+
                ", perimetr = "+getLength()+ ')';
    }
}
