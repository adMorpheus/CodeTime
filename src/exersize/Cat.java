package exersize;

public class Cat {
    int age;
    String name;

    public Cat() {
    }

    public void vois(){
         System.out.println("mew");

     }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        String str = "Cat " + name + ", " + age + " ears old";
        return str;
    }

}
