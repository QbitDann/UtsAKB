package com.example.utsakb.model;

public class TemanModel {

    private String Name;
    private String Nim;
    private String Kelas;
    private String Phone;
    private String Email;

             public TemanModel(String nama, String nim, String kelas, String telepon, String email){
                Name = nama;
                Nim = nim;
                Kelas = kelas;
                Phone = telepon;
                Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setNama(String nama) {
        Name = nama;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String nim) {
        Nim = nim;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }

    public String getPhone() {
        return Phone;
    }

    public void setTelepon(String telepon) {
        Phone = telepon;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
