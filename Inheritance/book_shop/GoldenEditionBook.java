package itheritance_exercise.book_shop.book_shop;

public class GoldenEditionBook extends Book {

    public GoldenEditionBook(String title,String author, double price){
        super(title,author,price);
    }

    protected void setPrices(double price){
        super.setPrice(price + ((price * 30) / 100));
    }
}
