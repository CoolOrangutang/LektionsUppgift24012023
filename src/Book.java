import java.util.Scanner;


public class Book extends Author {

public Book(){

    //getName();
    //getauthor();
    //getPrice();
    //getQuantity();
    //getEMail();
    //setPrice();
    //toString();

}

    String bookName = "Mistborn";
    double bookPrice = 150;
    int bookQuantity = 3;

    //Things

    String getBookName(){
    return bookName;
}

    String getAuthor(){
    return authorName;
}

    double getBookPrice(){
    return bookPrice;
}

    int getBookQuantity(){
    return bookQuantity;
}

//Methods

        public void getEMail(){ System.out.println("Email: "+authorEMail);}
        public void getName(){System.out.println("The name of the book is : "+bookName);}
        Author getauthor(){System.out.println("The name of the author is: "+authorName);return null;}
        public void getPrice(){System.out.println("The price of this book is: "+bookPrice);}
        public void getQuantity(){System.out.println("The quantity of books is: "+bookQuantity);}

    public void setPrice(){

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Skriv in nytt pris: ");

        double newPrice = inputScanner.nextDouble();
        double bookPrice = newPrice;

        System.out.println("The new price is: "+bookPrice);
    }

    public void setQuantity(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Skriv in ny kvantitet: ");

        int newBookQuantity = inputScanner.nextInt();
        int bookQuantity = newBookQuantity;

        System.out.println("The new book quantity is: "+bookQuantity);

    }

    public void infoToString(){

        System.out.println("Book: "+bookName+", Author: "+authorName+", Email: "+authorEMail+", Gender: "+authorGender+", Price: "+ bookPrice+", Quantity: "+bookQuantity);

    }

}
