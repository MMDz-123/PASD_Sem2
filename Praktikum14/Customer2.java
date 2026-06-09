package Praktikum14;

public class Customer2 {
    public int id;
    public String name;

    public Customer2(){

    }

    public Customer2(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return " ID: " + this.id + " Nama: " + this.name;
    }
}
