
package databaselogin;

import java.net.InetAddress;

public class Client {

    private String surephrase, mac ,name, Surname,ID,address1,address2,address3, email, cell, nokName, nokSurname, nokEmail, Username, Password,day,month,year;
    String ip;
    private int login;
    private double keyPressed,sessionDuration;
    public Client() {
    }

    public Client(String username, String password,String name, String Surname, String ID, String address1, String address2, String address3, String email, String cell, String nokName, String nokSurname, String nokEmail, String day, String month, String year, String ip, String mac,String surephrase,int sessionDuration,int keyPressed,int login){
        this.Username = username;
        this.Password = password;
        this.name       = name;
        this.Surname    = Surname;
        this.ID         = ID;
        this.address1   = address1;
        this.address2   = address2;
        this.address3   = address3;
        this.email      = email;
        this.cell       = cell;
        this.nokName    = nokName;
        this.nokSurname = nokSurname;
        this.nokEmail   = nokEmail;
        this.day = day;
        this.month = month;
        this.year = year;
        this.ip = ip;
        this.mac = mac;
        this.surephrase = surephrase;
        this.sessionDuration = sessionDuration;
        this.keyPressed = keyPressed;
        this.login=login;

    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public double getKeyPressed() {
        return keyPressed;
    }

    public void setKeyPressed(double keyPressed) {
        this.keyPressed = keyPressed;
    }

    public double getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(double sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    public String getSurephrase() {
        return surephrase;
    }

    public void setSurephrase(String surephrase) {
        this.surephrase = surephrase;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getNokName() {
        return nokName;
    }

    public void setNokName(String nokName) {
        this.nokName = nokName;
    }

    public String getNokSurname() {
        return nokSurname;
    }

    public void setNokSurname(String nokSurname) {
        this.nokSurname = nokSurname;
    }

    public String getNokEmail() {
        return nokEmail;
    }

    public void setNokEmail(String nokEmail) {
        this.nokEmail = nokEmail;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


    @Override
    public String toString() {
        return "client{" +
                "mac='" + mac + '\'' +
                ", name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", ID='" + ID + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", email='" + email + '\'' +
                ", cell='" + cell + '\'' +
                ", nokName='" + nokName + '\'' +
                ", nokSurname='" + nokSurname + '\'' +
                ", nokEmail='" + nokEmail + '\'' +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", ip=" + ip +
                '}';
    }


}

