/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author rhysmcqueen
 */
public class TestUserprofile {
    public static void main (String[] args){
        String name1="";
        String name = "";
        String genre = "";
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your Genrea");
        System.out.println("Comedy ");
        System.out.println("Drama");
        System.out.println("Action");
        System.out.println("Mystery");
        
        
        genre = scan.nextLine();
        
        if(name!=name1&&genre.equals("Comedy")||genre.equals("Drama")||genre.equals("Action")||genre.equals("Mystery")){
            System.out.println("You account has been created!");
        }
    }
}
