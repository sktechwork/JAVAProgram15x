package ex_01_Java_basics;

public class Inheritance2 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setSchool_info("City Highschool", "Kothrud Pune","123456789", "ABD");
        s1.display_info();
    }
}

class school {

    String School_name;
    String School_address;
    String School_phone;

     void setSchool_info(String School_name, String School_address, String School_phone) {
         this.School_name = School_name;
         this.School_address = School_address;
         this.School_phone = School_phone;
     }

     void display_info(){
         System.out.println("School Name:"+this.School_name);
         System.out.println("School Address:"+this.School_address);
         System.out.println("School Phone:"+this.School_phone);
     }

}

class student extends school{
    String Student_name;

    void setSchool_info(String School_name, String School_address, String School_phone, String Student_name) {
        this.School_name = School_name;
        this.School_address = School_address;
        this.School_phone = School_phone;
        this.Student_name= Student_name;
    }

    @Override
    void display_info(){
        //System.out.println("School Name:"+this.School_name);
        //System.out.println("School Address:"+this.School_address);
        //System.out.println("School Phone:"+this.School_phone);
        super.display_info();
        System.out.println("Student Name:"+this.Student_name);
    }

}




