import java.util.*;

public class SMSLanguage {
	public String translate(String text) {
        text = removepunc(text);
        text = uppertolower(text);
        text = replaceand(text);
        text = replaceate(text);
        text= replaceat(text);
        text = replaceyou(text);
		return text;
	}


    private String replaceyou(String text) {
        StringBuffer mytext = new StringBuffer();
        int i=0;
        for(i=0;i<text.length()-2;){
            if(text.substring(i,i+3).equals("you")){
                i=i+3;
                mytext.append('U');
            }
            else{
                mytext.append(text.charAt(i));
                i++;
            }
        }
        if(i<=text.length()-2)
            mytext.append(text.charAt(text.length()-2));
        if(i<=text.length()-1)
            mytext.append(text.charAt(text.length()-1));
        return mytext.toString();
    }

    private String replaceat(String text) {

        StringBuffer mytext = new StringBuffer();
        int i=0;
        for(i=0;i<text.length()-1;){
            if(text.substring(i,i+2).equals("at")){
                i=i+2;
                mytext.append('@');
            }
            else{
                mytext.append(text.charAt(i));
                i++;
            }
        }
        if(i<=text.length()-1)
            mytext.append(text.charAt(text.length()-1));
        return mytext.toString();
    }

    private String replaceate(String text) {

        StringBuffer mytext = new StringBuffer();
        int i=0;
        for(i=0;i<text.length()-2;){
            if(text.substring(i,i+3).equals("ate")){
                i=i+3;
                mytext.append('8');
            }
            else{
                mytext.append(text.charAt(i));
                i++;
            }
        }
        if(i<=text.length()-2)
            mytext.append(text.charAt(text.length()-2));
        if(i<=text.length()-1)
            mytext.append(text.charAt(text.length()-1));
        return mytext.toString();
    }

    private String replaceand(String text) {

        StringBuffer mytext = new StringBuffer();
        int i=0;
        for(i=0;i<text.length()-2;){
            if(text.substring(i,i+3).equals("and")){
                i=i+3;
                mytext.append('&');
            }
            else{
                 mytext.append(text.charAt(i));
                i++;
            }
        }
        if(i<=text.length()-2)
            mytext.append(text.charAt(text.length()-2));
        if(i<=text.length()-1)
            mytext.append(text.charAt(text.length()-1));
        return mytext.toString();
    }

    private String uppertolower(String text) {

        StringBuffer mytext = new StringBuffer();
        for(int i=0;i<text.length();i++){
            char temp = text.charAt(i);
            mytext.append(Character.toLowerCase(temp));
        }
        return mytext.toString();
    }

    private String removepunc(String text) {

        StringBuffer mytext = new StringBuffer();
        for(int i=0;i<text.length();i++){
            char temp = text.charAt(i);
            if(temp!='.'&& temp!=',' && temp!='?' && temp!='!') {
                mytext.append(temp);
            }
        }
        return mytext.toString();  //To change body of created methods use File | Settings | File Templates.
    }


}
