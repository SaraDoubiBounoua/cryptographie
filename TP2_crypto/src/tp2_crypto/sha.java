/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_crypto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class sha {
    
    
    static String SHA1(String input){
       
        try {
            MessageDigest  md = MessageDigest.getInstance("SHA1");
            byte[] result =md.digest(input.getBytes());
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<result.length;i++){
                sb.append(Integer.toString((result[i] & 0xff)+ 0x100,16).substring(1));
            }
            return sb.toString();
        } catch (Exception ex) {
          throw new RuntimeException(ex);
        }
        
    }
}
