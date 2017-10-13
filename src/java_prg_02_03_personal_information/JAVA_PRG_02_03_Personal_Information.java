/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_03_personal_information;

/**
 *
 * @author bluebackdev
 */
public class JAVA_PRG_02_03_Personal_Information {

    /**
     * @param args the command line arguments
     * Write a program that displays the following information, each on a
     * separate line:
     *  - Your name
     *  - Your address, with city, state, and ZIP
     *  - Your telephone number
     *  - Your college major
     * Although these items should be displayed on separate output lines, use
     * only a single println statement in your program.
     */
    public static void main(String[] args) {
        String strName = "Keith";
        String strAddress = "Hermitage, PA";
        String strMajor = "Computer Science";
        
        System.out.println(strName + "\n" + strAddress + "\n" + strMajor);
    }
    
}
