package com.example.kuccps.MODEL_OBJECT;

public class SignUp {

    private int indexnumber;
    private String email;
    private int phonenumber;
    private String password;
    private int confirmpassword;

    public SignUp(int indexnumber, String email, int phonenumber, String password, int confirmpassword) {
        this.indexnumber = indexnumber;
        this.email = email;
        this.phonenumber = phonenumber;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public int getIndexnumber() {
        return indexnumber;
    }

    public String getEmail() {
        return email;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public int getConfirmpassword() {
        return confirmpassword;
    }
}
