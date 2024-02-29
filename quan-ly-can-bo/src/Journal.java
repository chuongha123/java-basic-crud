public class Journal extends Document{
    private int num2;
    private int month;
    public Journal(String id, String host, int number, int month, int num2){
        super(id, host, number);
        this.month = month;
        this.num2 = num2;
    }
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month=month;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "num2=" + num2 +
                ", month=" + month +
                ", id='" + id + '\'' +
                ", host='" + host + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
