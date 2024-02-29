public class Work extends Office{
    private int level;

    public Work(String name, int age, String gender, String adderss, int level){
        super(name, age, gender, adderss);
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level=level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
