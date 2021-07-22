package com.company;

import java.util.Random;

public class Dot {
        double X;
        double Y;

        Dot(double X, double Y){
            this.X=X;
            this.Y=Y;
        }

        Dot(){
            Random rand = new Random();
            this.X=rand.nextDouble()*10;
            this.Y=rand.nextDouble()*10;
        }

}

