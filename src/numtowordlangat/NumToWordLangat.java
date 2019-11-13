/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numtowordlangat;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author user
 */
public class NumToWordLangat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        System.out.println("Enter a number: ");
        Scanner key=new Scanner(System.in);
        num=key.nextInt();
        switch(num){
                case 1:
                    System.out.println("You entered one");
                    break;
                case 2:
                    System.out.println("You entered two");
                    break;
                case 3:
                    System.out.println("You entered three");
                    break;
                case 4:
                    System.out.println("You entered four");
                    break;
                case 5:
                    System.out.println("You entered five");
                    break;
                case 6:
                    System.out.println("You entered six");
                    break;
                case 7:
                    System.out.println("You entered seven");
                    break;
                case 8:
                    System.out.println("You entered eight");
                    break;
                case 9:
                    System.out.println("You entered nine");
                    break;
                case 10:
                    System.out.println("You entered ten");
                    break;
                default:
                    System.out.println("Please enter a value between 1 and 10 \n");
                    break;
        }     
        
    
}
}
