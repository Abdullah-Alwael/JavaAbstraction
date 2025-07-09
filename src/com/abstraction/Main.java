package com.abstraction;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Mathematics: introduction", 130.57,"Dr. Maths");
        Book b3 = new Book("Algorithms: final proofs", 650.99, "Dr. Algo");
        Book b4 = new Book();
        Book b5 = new Book("Ocean Secrets", 236.89, "Dr. Ocean");

        b1.setName("Dr. who?");
        System.out.println("The name of book 1 is: "+b1.getName());

        System.out.println("The author of book 2 titled: "+b2.getName()+" is:"+b2.getAuthor());

        System.out.println("The discount of book 3 titled:"+b3.getName()+" is "+b3.getDiscount());

        b4.setAuthor("Newest Dr.");
        System.out.println("Book 4's author after changing it is: "+b4.getAuthor());

        System.out.println("The price of book 5 titled: "+b5.getName()+"is"+b5.getPrice());
        b5.setPrice(b5.getPrice()-b5.getDiscount());
        System.out.println("The price changed to "+b5.getPrice()+" after discount");

    }
}
