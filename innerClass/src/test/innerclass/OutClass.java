package test.innerclass;

public class OutClass {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public class InnerClass{

        public InnerClass(){

            name = "lal";
            age = 13;
        }

        public void display(){
            System.out.println(name + age);
        }
    }

    public static void main(String[] args){

        OutClass outClass = new OutClass();
        InnerClass innerClass = outClass.new InnerClass();
        innerClass.display();

    }
}
