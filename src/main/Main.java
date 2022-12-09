/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {

        String s = new String("Java");
        String ss = new String("Java");

        Object sObj = s; // override oldugu ucun bu string obyektidir
        Object ssObj = ss; // override oldugu ucun bu string obyektidir

        boolean bool = sObj.equals(ssObj); // override oldugu ucun bu string-leri muqayise edir

        System.out.println(bool);// Java == Java true olacaq 

        BMW b = new BMW(); // 111 Heqiqetde BMW obyektidir -- a hide
//        System.out.println(b.a);
        BMW bmw = new BMW();
        bmw.drive();

        Car car = bmw;
        car.drive();// Car classinin drive() metodunun head hissesini gorur amma icini yox
        // icinde ise BMW classinin drive() metodunun icindekileri yazir  , burada override olunur

        Car c1 = b;        // 111  c1 BMW()-nin Car-a aid hissesini gorur -- a visible
        System.out.println(c1.a);// 
        Mechanic m = b;    // 111 m BMW()-nin Mechanic-a aid hissesini gorur

        Car[] cars = {new BMW(), new Mercedes()};
        driveAllCars(cars);
        
        Integer i = 5;
        Integer i2 = 9;
        
        i.equals("");
        checkValue(5);
        
        
        
    }

    public static void driveAllCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car c = cars[i];
            c.drive();
        }

    }

    public static void checkValue(Object obj) {
        Integer i = 5;
        boolean b = i.equals(obj);
        System.out.println(b);
        
    }

}
