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
        BMW b = new BMW(); // 111 Heqiqetde BMW obyektidir -- a hide
//        System.out.println(b.a);
        BMW bmw = new BMW();
        bmw.drive();
        
        Car car = bmw;
        car.drive();// Car classinin drive() metodunun head hissesini gorur amma icini yox
        // icinde ise BMW classinin drive() metodunun icindekileri yazir  , burada override olunur
        
        
        
//        Car c1 = b;        // 111  c1 BMW()-nin Car-a aid hissesini gorur -- a visible
//        System.out.println(c1.a);// 
//        Mechanic m = b;    // 111 m BMW()-nin Mechanic-a aid hissesini gorur
//        
//        Car[] cars = {new BMW(), new Mercedes()};
//        driveAllCars(cars);
//    }
//
//    public static void driveAllCars(Car[] cars) {
//        for (int i = 0; i < cars.length; i++) {
//            Car c = cars[i];
//            c.drive(); 
//        }
    }
    

}
