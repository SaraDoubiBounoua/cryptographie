/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_crypto;

/**
 *
 * @author DELL
 */

public class TP2_crypto {
    public static void main(String[] args) {
    String n="doubisara";
    String y="03b1663dda6549a0939ffdd712a852e0d4234e6b";

    int i=0,x;
    String s;

for( x=0,s=n+x,s=sha.SHA1(s);s.compareTo(y)>0;x++,s=n+x,s=sha.SHA1(s)){
    i++;
  }

System.out.print(" le nom est "+n);
System.out.print("\n la valeur de x="+x);
System.out.print("\n l'emprent de mon nom concaténner avec x est  "+s);
System.out.print("\n nombre d'itération ="+i+"\n");
    }
}
