package com.ingenuity.assignment1;

class Book{
    private int bookNo;
    private String title;
    private String publication;
    private String author;
    private float price;

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
public class BookData {
    private Book[] book = new Book[4];
    public void addBook(){
        BookData obj = new BookData();
//        obj.book = new Book[5];
        Book ob1 = new Book();
        ob1.setBookNo(1);
        ob1.setTitle("hdkjf");
        ob1.setAuthor("ujtgy");
        ob1.setPublication("hdsfhjd");
        ob1.setPrice(20);

        Book ob2 = new Book();
        ob2.setBookNo(1);
        ob2.setTitle("dfdf");
        ob2.setAuthor("dddd");
        ob2.setPublication("dd");
        ob2.setPrice(200);

        Book ob3 = new Book();
        ob3.setBookNo(1);
        ob3.setTitle("hdkjf");
        ob3.setAuthor("ujtgy");
        ob3.setPublication("hdsfhjd");
        ob3.setPrice(2440);

        Book ob4 = new Book();
        ob4.setBookNo(1);
        ob4.setTitle("dfdf");
        ob4.setAuthor("dddd");
        ob4.setPublication("dd");
        ob4.setPrice(28800);

        book[0] = ob1;
        book[1] = ob2;
        book[3] = ob3;
        book[2] = ob4;
    }
    public void getBook(){
        for (int i=0;i<book.length;i++){
            System.out.println(book[i].getBookNo());
            System.out.println(book[i].getAuthor());
            System.out.println(book[i].getTitle());
            System.out.println(book[i].getPublication());
            System.out.println(book[i].getPrice());
        }
    }
    public static void main(String[] args) {

        BookData obj = new BookData();
        obj.addBook();
        obj.getBook();

    }
}
