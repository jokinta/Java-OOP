package itheritance_exercise.book_shop.book_shop;

public class GoldenEditionBook extends Book {

    public GoldenEditionBook(String title,String author, double price){
        super(title,author,price);
    }

    @Override
    protected void setPrices(double price){
        double goldenEditionBookPrice = price + ((price * 30) / 100);
        super.setPrice(goldenEditionBookPrice);
    }
}
