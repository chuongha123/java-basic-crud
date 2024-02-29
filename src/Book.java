public class Book extends Document {
    private String author;
    private int num;
    public Book(String id, String host, int number, String author, int num) {
        super(id, host, number);
        this.author = author;
        this.num = num;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numerPage=" + num +
                ", id='" + id + '\'' +
                ", host='" + host + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
