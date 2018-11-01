package itheritance_exercise.book_shop.book_shop;

public class Book {
    private static final String INVALID_AUTHOR = "Author not valid!";
    private static final String INVALID_TITLE = "Title not valid!";
    private static final String INVALID_PRICE = "Price not valid!";

    private String title;
    private String autohor;
    private double price;

    public Book(String title,String autohor,double price){
        this.setTitle(title);
        this.setAutohor(autohor);
        this.setPrice(price);
    }

    private void setTitle(String title){
        if(title.length()< 3){
            throw new IllegalArgumentException(INVALID_TITLE);
        }
        this.title=title;
    }

    private void setAutohor(String autohor){
        String[] authorTokens = autohor.split("\\s+")
        if(authorTokens.length == 2 && Character.isDigit(authorTokens[1].charAt(0))){
            throw new IllegalArgumentException(INVALID_AUTHOR);
        }
        this.autohor=autohor;
    }

    protected void setPrice(double price){
        if(price <=0){
            throw new IllegalArgumentException(INVALID_PRICE);
        }
        this.price = price;
    }
}
