public class Person implements PersonInterface , EmployeeInterface {
    private int age = 0;
    private String position="Hr";
    private  double salary= 250;
    private String Name = "ashar";
    private String eyecolor ="brown";


    public double getPerson(){
        return 2.2;
    };
    public void printInfo(){
        System.out.println( age);
        System.out.println(eyecolor);
        System.out.println(Name);
    };
    public void grow(){
        age++;
    };



    public void seteyeColor(String color){
        eyecolor=color;

    };



    public double getSalary(){
        return salary;
    };
    public void givealaweh(int amount){
        salary+=amount;
    };
    public void Position(){
        System.out.println( position);
    };
}

