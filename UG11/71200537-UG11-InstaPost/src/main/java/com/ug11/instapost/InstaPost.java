package com.ug11.instapost;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstaPost {
    private int totalmention;
    private String email;
    private String username;

    public InstaPost(){

    }


    public void login(String email) throws EmailException{
        String regex ="^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@" + "(gmail\\.com|Gmail\\.com)$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        try {
            if (matcher.matches() == false){
                throw new EmailException(1);
            }else if (matcher.matches() == false){
                throw new EmailException(2);
            }else {
                this.email=email;
                this.username = email.substring(0,14);

            }
        }catch (EmailException e){
            System.out.println("Error: " + e.getErrorMessage());
        }
    }

    public void post(String capt){
        int awalisi = 0;
        System.out.println("Caption: "+capt);
        List<String> list = new ArrayList<String>();
        String[] ar = capt.split(" ");
        for (String a : ar){
            Pattern patter = Pattern.compile("^@(.+)");
            Matcher match = patter.matcher(a);
            if (match.matches() == true){
                list.add(a); this.totalmention += 1; awalisi++;
            }
        }
        System.out.println("Pengguna yang anda mention: "+list);
        System.out.println("Total username yang anda mention: "+awalisi);
    }

    public void printInfo(){
        String gedein = this.username.toUpperCase();
        System.out.println("User :" +gedein);
        System.out.println("Email:" + this.email);
        System.out.println("Total Mention :" + this.totalmention);
    }
}
