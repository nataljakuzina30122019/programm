/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author user
 */
public class enums3 {
    static enum Days{
        Esmsapaev, Teisipaev, Kolmapaev, Neljapaev, Rede, Laupaev, Puhapaev}
    
    public static void main(String[] args) {
        System.out.println("=====Дни недели=====");
        for(Days d: Days.values()) {
            System.out.println(d);
        }
        
    }
   
}
