package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

     nakresliZmrzlinu(zofka);



    }



    private void nakresliZmrzlinu(Turtle zofka) {
        zofka.setLocation(150.0, 200.00);
        zofka.setPenWidth(3);
        zofka.turnRight(90.0);
        nakresliBarevnyRovnostrannyTrojuhelnik (zofka, 200.0, Color.black);
        zofka.penUp();
        zofka.move(95.0);
        zofka.turnRight (90.0);
        zofka.move(55.0);
        zofka.turnLeft(90.0);
        zofka.penDown();
        nakresliKolecko(zofka, 16, 48, Color.orange);
    }


    private void nakresliBarevnyRovnostrannyTrojuhelnik(Turtle turtle, double velikostStrany,Color barvaCary) {
        turtle.setPenColor(barvaCary);
        for (int i = 0; i < 3; i++) {
            turtle.move(velikostStrany);
            turtle.turnRight (120.0);
        }
    }

    private void nakresliCtverec (Turtle turtle, double velikostStrany, Color barvaCary) {
        turtle.setPenColor(barvaCary);
        for (int i = 0; i < 4; i++) {
            turtle.move(velikostStrany);
            turtle.turnLeft(90.0);

        }
    }

    private void nakresliObdelnik (Turtle turtle, double stranaA, double stranaB, Color barvaCary){
        turtle.setPenColor(barvaCary);
        for (int i = 0; i < 2; i++) {
            turtle.move(stranaA);
            turtle.turnLeft(90.0);
            turtle.move(stranaB);
            turtle.turnLeft(90);

        }
    }


    private void nakresliKolecko (Turtle turtle, double velikostStrany, int pocetStran, Color barvaCary) {
        turtle.setPenColor(barvaCary);
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            turtle.move(velikostStrany);
            turtle.turnLeft(uhel);
            }
    }

     private void nakresliRovnoramennyTrojuhelnik (Turtle turtle, double velikostStrany, Color barvaCary) {
        turtle.setPenColor(barvaCary);
        double velikostPrepony = Math.sqrt(2*Math.pow (velikostStrany, 2));
        turtle.move (velikostStrany);
        turtle.turnLeft(90.0);
        turtle.move(velikostStrany);
        turtle.turnLeft(135.0);
        turtle.move(velikostPrepony);
        turtle.turnLeft(135.0);
       }



    }

