package OOPlab6;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class mySringToken {
    public static void main (String[] args){
        String S = "Welcome to RMUTSV";
        StringTokenizer tokenizer = new StringTokenizer(S);
        // count word in string
        System.out.println(tokenizer.countTokens());
       //cut word in String
        //reverse word in String

        while (tokenizer.hasMoreTokens()){
           StringBuffer buffer = new StringBuffer(tokenizer.nextToken());
            System.out.println(tokenizer.nextToken());
        }






}//main
}//Class
