import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Person {
    String surnameAzougar56473 , firstnameAzougar56473,streetAzougar56473,zipCodeAzougar56473,cityAzougar56473;
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    void initialize() throws IOException {
        System.out.println("Enter your Surname :");
        surnameAzougar56473= rd.readLine();
        System.out.println("Enter your First Name :");
        firstnameAzougar56473= rd.readLine();
        System.out.println("Enter your Street :");
        streetAzougar56473= rd.readLine();
        System.out.println("Enter your Zip Code :");
        zipCodeAzougar56473= rd.readLine();
        System.out.println("Enter your City :");
        cityAzougar56473= rd.readLine();
    }
    String print(){
        String resultAzougar56473 = " Surname :"+surnameAzougar56473+"\n First Name :"+firstnameAzougar56473+"\n Street :"+streetAzougar56473+"\n ZipCode :"+zipCodeAzougar56473+"\n City :"+cityAzougar56473;
        System.out.println(resultAzougar56473);
        return resultAzougar56473;
    }
    public static void main(String[]args) throws IOException {
        Person nv=new Person();
        nv.initialize();
        nv.print();
    }
}
class Staff extends Person{
    String educationAzougar56473 , positionAzougar56473;
    Person nv=new Person();
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    void initialize1() throws IOException {
        nv.initialize();
        System.out.println("Enter your education :");
        educationAzougar56473= rd.readLine();
        System.out.println("Enter your Position :");
        positionAzougar56473= rd.readLine();
    }
    void print1(){
        String print=nv.print();
        String result=print+"\n Educataion :"+educationAzougar56473+"\n Position :"+positionAzougar56473;
        System.out.println(result);
    }


    public static void main(String[]args) throws IOException {
        Staff nv=new Staff();
        nv.initialize1();
        nv.print1();
    }
}
public class Task01 {
    public static void main(String[]args) throws IOException {
        Staff obj = new Staff();
        obj.initialize();
        obj.print();
//      Person objj = new Person();
//        objj.initialize();
//        objj.print();
    }
}
