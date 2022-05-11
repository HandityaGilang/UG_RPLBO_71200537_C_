package UG10_71200537;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws UsernameException, EmailException, PasswordException, LoginException{
        String username = System.console().readLine("Nama pengguna: ");
        String email = System.console().readLine("Email: ");
        char[] pass = System.console().readPassword("Password: ");
        char[] conpass = System.console().readPassword("Konfimasi Password: ");
        String password = new String(pass);
        String konpass = new String(conpass);
        try{
            if (password.isEmpty()){
                throw new PasswordException(1);
            }else if((password.length() < 8 || password.length() > 50)){
                throw new PasswordException(2);

            }else if((password.equals(username))){
                throw new PasswordException(4);
            }
            else{
                boolean flagKecil = false;
                boolean flagBesar = false;
                boolean flagAngka = false;
                for(int i=0;i<password.length();i++){
                    char c = password.charAt(i);
                    if(Character.isLetter(c) && Character.isLowerCase(c)) flagKecil = true;
                    if(Character.isLetter(c) && Character.isUpperCase(c)) flagBesar = true;
                    if(Character.isDigit(c)) flagAngka = true;}
                if(!(flagKecil && flagAngka && flagBesar)){ throw new PasswordException(3);}
                }
            } catch (PasswordException e) {
            System.out.println ("Error : " + e.getErrorMessage());
        }

        try {
            if (username.isEmpty()){
                throw new UsernameException(1);
        } else if (username.length() < 6){
                throw new UsernameException(2);
            }
    } catch (UsernameException e) {
            System.out.println ("Error : " + e.getErrorMessage());
        }

        try {
            if (email.isEmpty()){
                throw new EmailException(1);}
            else if (email.length() <6){
                throw new EmailException(2);}
        } catch (EmailException e){System.out.println("Error: " + e.getErrorMessage());}

        try {
            if (username.isEmpty()){
                throw new LoginException(1);
            }
            else if (password.isEmpty()){
                throw new LoginException(2);
            }

        }catch (LoginException e) {
            System.out.println ("Error : " + e.getErrorMessage());
    }
        User baru = new User(username,email,password);
}}
