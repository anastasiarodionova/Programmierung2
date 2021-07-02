package themen.Maus;

import java.awt.*;

public class Linie {
    private Point start;
    private Point ende;

    public Linie(Point start, Point ende) {
        this.start = start;
        this.ende = ende;
    }

    public int getXStart() {
        return this.start.x;
    }

    public int getYStart() {
        return this.start.y;
    }

    public int getXEnde() {
        return this.ende.x;
    }

    public int getYEnde() {
        return this.ende.y;
    }

    public void setEnde(Point ende) {
        this.ende = ende;
    }
}