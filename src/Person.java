public class Person{
    public static void main(String[] args){

    }

    private String name;
    private int age;
    private boolean married;

    Person(String name, int age, boolean married){
        this.name = name;
        this.age = age;
        this.married = married;
        if (married){
            System.out.println(name + " is " + age + "years old and they are married.");
        } else {
            System.out.println(name + " is " + age + "years old and they are not married.");
        }

    }
        public String getName(){
            return name;
    }
        public int getAge() {
            return age;
    }
        public boolean isMarried(){
            return married;
    }
}
