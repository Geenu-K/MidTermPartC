/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Gurleen Kaur");
        String name = scanner.nextLine();
        
        System.out.println("Amrinder Gill");
        String favouriteActor = scanner.nextLine();
        
        System.out.println("UserProfile was created for " + name + " with favourite actor " + favouriteActor + ".");
        
        scanner.close();
    }
}