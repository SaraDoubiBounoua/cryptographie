/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_sha.pkg256;

/**
 *
 * @author DELL
 */
public class Tp2_SHA256 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String n="doubisara";
    String y="00005d10cc11e27bd8d4d1ce91bc725665ddba6ca2498ef38a88a58ad48cdb4";

    int i=0,x;
    String s;

for( x=0,s=n+x,s=SHA256.sha256(s);s.compareTo(y)>0;x++,s=n+x,s=SHA256.sha256(s)){
    i++;
  }

System.out.print(" le nom est "+n);
System.out.print("\n la valeur de x="+x);
System.out.print("\n l'emprent de mon nom concaténner avec x est  "+s);
System.out.print("\n nombre d'itération ="+i+"\n");
    }
    
}
