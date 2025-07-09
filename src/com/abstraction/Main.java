package com.abstraction;
// Deadline 7 PM
public class Main {
    public static void main(String[] args) {
        // all names are imaginary (no Ai this time)
        //Q1:
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

        Movie m1 = new Movie();
        Movie m2 = new Movie("The must watch", 55.3, "The best director");
        Movie m3 = new Movie("Sudden Awakening", 99.9,"Mr. Nightmare");
        Movie m4 = new Movie();
        Movie m5 = new Movie("Full boost", 78.6, "Dr. turbo");

        m1.setName("First walk: step one");
        System.out.println("The name of the first movie was:"+m1.getName());

        System.out.println("The price of the second movie titled: "+m2.getName()+" was: "+m2.getPrice());
        System.out.println("The discount: "+m2.getDiscount());
        m2.setPrice(m2.getPrice()-m2.getDiscount());
        System.out.println("The second movie has lower price for a limited time only!");
        System.out.println("Rent now for a price of just: "+m2.getPrice());

        System.out.println("The director of movie 3 titled: "+m3.getName()+" is: "+m3.getDirector());
        m3.setDirector("Mr. The next budget");
        System.out.println("The studio decided to change the director to: "+m3.getDirector()+" for financial reasons");

        System.out.println("We also offer other movies: ");

        m4.setName("The Other Movie");
        m4.setDirector("Mr. That director once was");
        m4.setPrice(97.2);

        System.out.println("Movie 4 title: "+m4.getName()+" price: "+ m4.getPrice()+" Director: "+m4.getDirector());
        System.out.println("Movie 4 has a discount of: "+m4.getDiscount());

        System.out.println("Movie 5 title: "+m5.getName()+" price: "+ m5.getPrice()+" Director: "+m5.getDirector());
        System.out.println("Movie 5 has a discount of: "+m5.getDiscount());

        //Q2:

    }
}
