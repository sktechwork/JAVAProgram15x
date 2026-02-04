package ex_01_Java_basics;

public class Inheritance_1 {

    static void main(String[] args) {
        vehicle v = new vehicle();
        System.out.println("Objects in vehicle : SuperClass");
        v.color = "Red";
        v.name =  "Altroz";
        v.speed = 100;
        System.out.println("Vehicle Name:" +" "+v.name );
        System.out.println("Vehicle Color:"+ " " +v.color);
        System.out.println("Vehicle Speed:" +" "+ v.speed);

        cars c = new cars();
        System.out.println("object in cars : SubClass");
        c.color = "Blue";
        c.name =  "Benz";
        c.speed = 100;
        c.Brand_name = "Mercedes";
        c.price = "4.80 Cr";
        System.out.println("Vehicle Name:" +" "+c.name );
        System.out.println("Vehicle Color:"+ " " +c.color);
        System.out.println("Vehicle Speed:" +" "+ c.speed);
        System.out.println("Vehicle Brand:" +" " +c.Brand_name);
        System.out.println("Vehicle Price:" +" "+ c.price);;
    }
}

    class vehicle{

    int speed;
    String name;
    String color;

}

class cars extends  vehicle{
    String Brand_name;
    String price;
}