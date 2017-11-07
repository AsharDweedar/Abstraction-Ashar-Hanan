public interface PersonInterface {

    public double getPerson();
    public void printInfo();
    abstract public void grow();
    static final String ID = "124587";

//    abstract is redundant in this case. All methods defined on an interface are public and abstract by definition.


}
