class person {
    private String Name;
    private int Age;    
public String getName(){
    return Name;

}
public void setName(String Name){
    if(Name != null ){
        this.Name = Name;
        }
    else{
        System.out.println("invalid name: " + Name);
    }
}
public int getAge(){
    return Age;
}
public void setAge(int Age){
    if (Age>0){
        this. Age = Age;
        }
    else{
        System.out.println("invalid Age: " + Age);
    }
}
}

public class Encapsulation{
    public static void main(String[] args) {
        person person = new person();
        person.setName("sharath");
        person.setAge(20);

        System.out.println("name: "+person.getName());
        System.out.println("Age: "+person.getAge());

        person.setAge(-5);
    }
}