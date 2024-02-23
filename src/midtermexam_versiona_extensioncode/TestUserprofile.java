/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author dhams
 */
public class TestUserprofile {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your favorite actor: ");
        String favoriteActor = scanner.nextLine();
        
        System.out.println("User Profile created");
        System.out.println("User Name: "+ name);
        System.out.println("User's favorite actor: "+ favoriteActor);
        
        
    }
    
}
