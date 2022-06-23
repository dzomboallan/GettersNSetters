public class Account {
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String  getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public static void main (String [] args){

        Account a = new Account();
        a.setName("Richard");
        a.setAge(24);
        System.out.println(a.getName() +" is "+ a.getAge() +" years old");
    }

}
