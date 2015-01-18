/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package convertbasenumber;

/**
 *
 * @author Best
 */
public class ConvertBaseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConvertBaseNumber con = new ConvertBaseNumber();
        String bi = "11111101";
        int de = 0;
        int num;
        for(int i = 0 ; i < bi.length() ; i++){
            char c = bi.charAt(i);
            num = Integer.parseInt(c+"");
            de = de + num*con.poweri(2, (bi.length()-1)-i);
        }
        System.out.println(de);
     }
    
     //////////////////////////////////Power//////////
    private int poweri(int number , int poewr){
        int result = 1;
        for(int i = 1 ; i <= poewr ; i++){
             result = result  * number ;
        }
        return result;
    }

         }
   
    
    
    
   
