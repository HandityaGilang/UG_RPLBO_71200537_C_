package UG10_71200537;

public class UsernameException extends Exception{
    private int errorcode;
    private String errormsg;
    public UsernameException(int ercode){
        super();
        this.errorcode = ercode;
        if(ercode == 1){
            this.errormsg = "Input username tidak boleh kosong";
        }
        else if(ercode == 2){
            this.errormsg = "Username minimal harus terdiri dari 6 karakter";
        }
    }
    public UsernameException(String errorMessage){
        super(errorMessage); }

    public int getErrorCode(){
        return this.errorcode;}

    public String getErrorMessage(){
        return this.errormsg;

    }


}
