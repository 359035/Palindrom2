/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrom2;

/**
 *
 * @author Samsung
 */
public class Palindrom2 {

    /**
     * @param args the command line arguments
     */
    static boolean isPalindrom(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }    
            i++;
            j--;    
                
        }    
        return true;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isPalindrom("abba"));
    }
    
}
