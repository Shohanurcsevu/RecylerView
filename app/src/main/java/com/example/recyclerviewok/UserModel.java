package com.example.recyclerviewok;

public class UserModel {

      private String FirstName,LastName,Email;
      private int ImageView;

    public UserModel(String firstname, String lastName, String email, int imageview) {
        FirstName = firstname;
        LastName = lastName;
        Email = email;
        ImageView = imageview;
    }

    public String getFirstname() {
        return FirstName;
    }

    public void setFirstname(String firstname) {
        FirstName = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getImageview() {
        return ImageView;
    }

    public void setImageview(int imageview) {
        ImageView = imageview;
    }
}
