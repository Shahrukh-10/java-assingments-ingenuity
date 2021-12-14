package com.ingenuity.assignment1;
class Books{
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
public class BooksData {
    public static void main(String[] args) {
        BookData obj = new BookData();
//        obj.book = new Book[5];
        Book ob1 = new Book();
        ob1.setBookNo(1);
        ob1.setTitle("hdkjf");
        ob1.setAuthor("ujtgy");
        ob1.setPublication("hdsfhjd");
        ob1.setPrice(20);

        Book ob5 = new Book();
        ob5.setBookNo(5);
        ob5.setTitle("hdkjf");
        ob5.setAuthor("ujtgy");
        ob5.setPublication("hdsfhjd");
        ob5.setPrice(200000);

        Book ob2 = new Book();
        ob2.setBookNo(2);
        ob2.setTitle("dfdf");
        ob2.setAuthor("dddd");
        ob2.setPublication("dd");
        ob2.setPrice(200);

        Book ob3 = new Book();
        ob3.setBookNo(3);
        ob3.setTitle("hdkjf");
        ob3.setAuthor("ujtgy");
        ob3.setPublication("hdsfhjd");
        ob3.setPrice(2440);

        Book ob4 = new Book();
        ob4.setBookNo(4);
        ob4.setTitle("dfdf");
        ob4.setAuthor("dddd");
        ob4.setPublication("dd");
        ob4.setPrice(28800);

        System.out.println(ob1.getTitle()+" , "+ob1.getAuthor()+" , "+ob1.getPublication()+" , "+ob1.getBookNo()+" , "+ob1.getPrice());
        System.out.println(ob2.getTitle()+" , "+ob2.getAuthor()+" , "+ob2.getPublication()+" , "+ob2.getBookNo()+" , "+ob2.getPrice());
        System.out.println(ob3.getTitle()+" , "+ob3.getAuthor()+" , "+ob3.getPublication()+" , "+ob3.getBookNo()+" , "+ob3.getPrice());
        System.out.println(ob4.getTitle()+" , "+ob4.getAuthor()+" , "+ob4.getPublication()+" , "+ob4.getBookNo()+" , "+ob4.getPrice());
        System.out.println(ob5.getTitle()+" , "+ob5.getAuthor()+" , "+ob5.getPublication()+" , "+ob5.getBookNo()+" , "+ob5.getPrice());

    }
}
