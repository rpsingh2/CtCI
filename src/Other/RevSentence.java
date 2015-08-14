/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;



/**
 *
 * @author Shubham
 */
public class RevSentence {
    public static String rev(String str){
        int i,j;
        StringBuilder st=new StringBuilder(str);
        
        j=str.length()-1;
        for(i=0;i<=j;i++){
            char temp;
            temp=str.charAt(i);
            st.setCharAt(i, str.charAt(j));
            st.setCharAt(j, temp); 
            j--;    
        }
        return st.toString();
    }
    public static void main(String args[]){
        String ex = "I am   12 +12#@1           Freaking awesome";
        //Program to reverse the String
        String ans=rev(ex);
        //Progtam to reverse words in sentence.
        System.out.println(ans);
        int i=0;
        String s="";
        for(int j=0; j<ans.length();){
        while(!Character.isLetterOrDigit(ans.charAt(j)) && j<ans.length()){
            s= s+ans.charAt(j);
            j++;i++;
        }
        while(i<ans.length() && Character.isLetterOrDigit(ans.charAt(i))){
            i++;
        }
        s= s+rev(ans.substring(j,i));
        j=i;
        }
        System.out.println(s);
    }
}
