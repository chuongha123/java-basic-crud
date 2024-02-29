public class Newspaper extends Document{
    private int day;
    public Newspaper(String id, String host, int number, int day){
        super(id, host, number);
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day=day;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "day=" + day +
                ", id='" + id + '\'' +
                ", host='" + host + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
