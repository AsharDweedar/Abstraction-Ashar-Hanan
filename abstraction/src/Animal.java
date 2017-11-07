public class Animal implements PersonInterface {
    private int age = 0;
    private String spice = "cat";
    private String Name ="loop";
    public double getPerson(){
        return 2.2;
    };
    public void printInfo(){
        System.out.println( age);
        System.out.println(spice);
        System.out.println(Name);
    };
    public void grow(){
        age++;
    };
    public void setnameColor(String name){
            Name=name;
    };
}

