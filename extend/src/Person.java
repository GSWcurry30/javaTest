/**
 * @Auther: liuyi
 * @Date: 2019/7/31 17:29
 * @Description:
 */
public class Person {

    private int age;
    private String name;

    public Person(){}

    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }

    public void say(){
        System.out.println("people say");
    }

    public void cry(){
        System.out.println("people cry");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
