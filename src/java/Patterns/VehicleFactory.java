/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns;

/**
 *
 * @author miracle
 */
public class VehicleFactory 
{
 public FactoryInter createFactor(String choice)
 {
     if(choice == null || choice.isEmpty())
     {
         return null;
     }
     if(choice.equalsIgnoreCase("Car"))
     {
         return new Car();
     }
     else if("Bike".equalsIgnoreCase(choice))
     {
         return new Bike();
     }
     else if("Bus".equalsIgnoreCase(choice))
     {
         return new Bus();
     }
     return null;
     
 }
}
