package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

     nakresliZmrzlinu(zofka);
     nakresliSnehulaka(zofka);
     nakresliMasinku(zofka);


    }

    private void nakresliMasinku(Turtle zofka) {
        zofka.setLocation(1100.0, 500.0);
        zofka.setPenWidth(3);
        zofka.penDown();
        nakresliObdelnik(zofka, 140.0, 100.0, Color.gray);
        nakresliKolecko(zofka, 8, 40, Color.gray);
        zofka.turnLeft(90.0);
        zofka.move(100.0);
        zofka.turnRight(90.0);
        nakresliObdelnik(zofka, 80.0, 180.0, Color.gray);
        zofka.penUp();
        zofka.penUp();
        zofka.turnLeft(180.0);
        zofka.move(25.0);
        zofka.turnRight(90.0);
        zofka.move(40.0);
        zofka.turnRight(90.0);
        zofka.penDown();
        nakresliKolecko(zofka, 5, 28, Color.gray);
        zofka.penUp();
        zofka.turnLeft(90.0);
        zofka.move(70.0);
        zofka.turnRight(90.0);
        zofka.penDown();
        nakresliKolecko(zofka, 5, 28, Color.gray);
        zofka.penUp();
        zofka.turnLeft(90.0);
        zofka.move(150.0);
        zofka.penDown();
        zofka.turnRight(180.0);
        nakresliRovnoramennyTrojuhelnik(zofka, 80.0,Color.gray);
        zofka.penUp();
    }

    private void nakresliSnehulaka(Turtle zofka) {
        zofka.setLocation(600.0,200.0);
        zofka.turnLeft(90.0);
        zofka.setPenWidth(3);
        nakresliKolecko(zofka, 8, 30, Color.blue);
        zofka.penUp();
        zofka.turnLeft(180.0);
        zofka.move(107.0);
        zofka.turnLeft(90.0);
        zofka.move(30.0);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(zofka,12, 36, Color.blue);
        zofka.penUp();
        zofka.turnLeft(180.0);
        zofka.move(177.0);
        zofka.turnLeft(90.0);
        zofka.move(40.0);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(zofka,16, 42, Color.blue);
        zofka.penUp();
        zofka.move(182.0);
        zofka.turnRight(90);
        zofka.move(17.0);
        zofka.turnLeft(90.0);
        zofka.penDown();
        nakresliKolecko(zofka,6, 30, Color.blue);
        zofka.penUp();
        zofka.turnLeft(90.0);
        zofka.move(193.0);
        zofka.turnRight(90.0);
        zofka.penDown();
        nakresliKolecko(zofka,6, 30, Color.blue);
        zofka.penUp();
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

