/*
    Zadanie 2: Stworzenie klasy Rectangle z metodami obliczeniowymi.
    Autor: Rafał Tęcza
    Index: s19468 
*/
package pjwstk.zadanie2;

/**
 *
 * @author s19468
 */
public class Rectangle {
    
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
    
    public double getPerimeter() {
        return 2 * getLength() + 2 * width;
    }
    
    public double getArea() {
        return getLength() * getWidth();
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
