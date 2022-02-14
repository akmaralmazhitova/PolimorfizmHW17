package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eage()};
        for (Animal res : animals) {
            if (res instanceof Shark) {
                ((Shark) res).attack();
            } else if (res instanceof Turtle) {
                ((Turtle) res).swim();
            } else if (res instanceof Eage) {
                ((Eage) res).fly();
            }
        }

        Shark[] sharks = new Shark[animals.length];
        Turtle[] turtles = new Turtle[animals.length];
        Eage[] eages = new Eage[animals.length];

        for (Animal res: animals) {
            if (res  instanceof Shark){
                System.out.println(res.getClass().getName());
            } else if (res instanceof Turtle){
                System.out.println(res.getClass().getName());
            } else if (res instanceof Eage){
                System.out.println(res.getClass().getName());
            }
        }



    }
}
