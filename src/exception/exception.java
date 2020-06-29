/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import javax.swing.JOptionPane;

/**
 *
 * @author Fujitsu
 */
public class exception {
    public static void main(String[]args){
        try{
            int a=10/0;
            System.out.println(a);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"terjadi eror karena :" +e);
}
}
}
