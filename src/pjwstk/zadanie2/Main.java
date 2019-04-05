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
public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Pole: " + rectangle.getArea());
        System.out.println("Obwod: " + rectangle.getPerimeter());
        System.out.println("Przekatna: " + rectangle.getDiagonal());
    }
    
}
