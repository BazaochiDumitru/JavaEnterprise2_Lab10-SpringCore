package org.example;

public class Hello {
    String nume;

    public void printHello() {
        System.out.println("Salut, " + nume + "!");
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
