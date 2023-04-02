package ExampleSDP211;

import static java.lang.System.*;

import java.awt.*;
import java.util.Date;
import java.util.Objects;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args){
        out.println("ahahahahah");

        java.util.Date utilDate = new Date();
        java.sql.Date sqlDate = new java.sql.Date(2023, 11, 13);

        double result = sqrt(9);

        Person Alex = new Person("Alex") {
            @Override
            public void display() {
                out.println(this.getName());
            }
        };
        Alex.display();
        out.println();

        Employee Jhon = new Employee("Jhon", "Google");
        Jhon.display();
        out.println();

        Object Saimon = new Client("Saimon", "GoogleV2", 100000);
        if (Saimon instanceof Client){
            Client clientSaimon = (Client) Saimon;
        }
        // Saimon.display();

        Book b = new Book("Робин Гуд. Король разбойников", "А. Дюм");
        b.print();
        out.println();

        Journal j = new Journal("Forbes", "Forbs Bertly Charles");
        j.print();
        out.println();

        Printable p = new Journal("Forbes2", "Forbs Bertly Charles");
        p.print();
        String name = ((Journal)p).getName();
    }
}
