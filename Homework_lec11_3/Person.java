package Homework_lec11_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {

    private String name;
    private Date date;
    private String sex;
    private String id;

    public Person() {
    }

    public Person(String name, Date date, String sex, String id) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void input() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        this.setName(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter Date: ");
        String df = sc.nextLine();
        this.setDate(sdf.parse(df));
        System.out.print("Enter Sex: ");
        this.setSex(sc.nextLine());
        System.out.print("Enter ID: ");
        this.setId(sc.nextLine());
    }
    
    public void display(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Name: " + this.getName());
        System.out.println("Date: " + sdf.format(this.getDate()));
        System.out.println("Sex: " + this.getSex());
        System.out.println("ID: " + this.getId());
    }
}
