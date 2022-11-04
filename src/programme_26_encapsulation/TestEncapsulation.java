package programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate(); //Object creation
        //setting values of the variables
        obj.setName("Manisha");
        obj.setAge(25);
        obj.setRollNo(01);

        //Displaying values of the variables
        System.out.println("Prime's name : " + obj.getName());
        System.out.println("Prime's age : " + obj.getAge());
        System.out.println("Prime's rollNo : " + obj.getRollNo());




    }
}
