public class Document {
    protected String id;
    protected String host;
    protected int number;
    public Document(String id, String host, int number){
        this.id = id;
        this.host = host;
        this.number = number;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getHost(){
        return host;
    }
    public void setHost(String host){
        this.host=host;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }
}

