package cuj.basic.controller;

/**
 * @Auther: cujamin
 * @Date: 2019/1/9 10:40
 * @Description:
 */
public class BookVo {
    private String bookname;
    private float price;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookVo{" +
                "bookname='" + bookname + '\'' +
                ", price=" + price +
                '}';
    }
}
