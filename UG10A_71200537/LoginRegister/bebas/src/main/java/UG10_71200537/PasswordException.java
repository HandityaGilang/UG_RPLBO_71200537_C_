package UG10_71200537;

public class PasswordException extends Exception{
    private int errorcode;
    private String errormsg;
    public PasswordException(int ercode){
        super();
        this.errorcode = ercode;
        if(ercode == 1){
            this.errormsg = "Input  password tidak  boleh kosong";
        }
        else if(ercode == 2){
            this.errormsg = "Password minimal harus terdiri dari 7 karakter";
        }
        else if(ercode == 3){
            this.errormsg = "Password minimal harus mengandung 1 karakter huruf kecil, huruf besar, simbol, dan angka";
        }
        else if(ercode == 4){
            this.errormsg = "Password tidak  boleh  sama dengan username";
        }
        else if(ercode == 5){
            this.errormsg = "Password  harus sama dengan konfirmasi password";
        }
    }
    public PasswordException(String errorMessage){
        super(errorMessage); }

    public int getErrorCode(){
        return this.errorcode;}

    public String getErrorMessage(){
        return this.errormsg;

    }
}
