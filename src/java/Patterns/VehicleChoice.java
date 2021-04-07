/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class VehicleChoice 
{
    public static void main(String args[])
    {
        VehicleFactory userChoice = new VehicleFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter user choice");
        int num = sc.nextInt();
        if(num==1)
        {
            FactoryInter noti = userChoice.createFactor("bus");
            noti.vehicle();
        }
        else if(num==2)
        {
            FactoryInter noti1 = userChoice.createFactor("bike");
            noti1.vehicle();
        }
        else if(num==3)
        {
            FactoryInter noti2 = userChoice.createFactor("car");
            noti2.vehicle();
        }
        else 
        {
            System.out.println("enter correct number");
        }
    }
    
}
