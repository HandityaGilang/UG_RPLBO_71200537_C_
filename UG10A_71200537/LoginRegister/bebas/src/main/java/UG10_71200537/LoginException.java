package UG10_71200537;

public class LoginException extends Exception{
    private int errorcode;
    private String errormsg;
    public LoginException(int ercode){
        super();
        this.errorcode = ercode;
        if(ercode == 1){
            this.errormsg = "Input  username tidak  boleh kosong";
        }
        else if(ercode == 2){
            this.errormsg = "Input  password tidak  boleh kosong";
        }
        else if(ercode == 3){
            this.errormsg = "Username dan password harus sesuai dengan object user yang dibuat ketika melakukan register";
        }
    }
    public LoginException(String errorMessage){
        super(errorMessage); }

    public int getErrorCode(){
        return this.errorcode;}

    public String getErrorMessage(){
        return this.errormsg;

    }
}
