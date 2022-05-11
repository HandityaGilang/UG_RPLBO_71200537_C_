package UG10_71200537;

public class EmailException extends Exception{
    private int errorcode;
    private String errormsg;
    public EmailException(int ercode){
        super();
        this.errorcode = ercode;
        if(ercode == 1){
            this.errormsg = "Input email tidak boleh kosong";
        }
        else if(ercode == 2){
            this.errormsg = "Format email  harus valid (cth: email@ukdw.com)";
        }
    }
    public EmailException(String errorMessage){
        super(errorMessage); }

    public int getErrorCode(){
        return this.errorcode;}

    public String getErrorMessage(){
        return this.errormsg;

    }
}
