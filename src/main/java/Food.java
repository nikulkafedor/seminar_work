public class Food {
    private int count;
    private String nameF;

    public String returnName(){
    return nameF;
    }
    public int returnCount(){
        return count;
    }
    public  Food (String nameF, int count){
        this.nameF = nameF;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Food{" +
                "count=" + count +
                ", nameF='" + nameF + '\'' +
                '}';
    }
}
