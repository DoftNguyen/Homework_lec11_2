package Homework_lec11_3;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person{
    private String idstu;
    private String practice;

    public Student() {
        super();
    }

    public Student(String idstu, String practice, String name, Date date, String sex, String id) {
        super(name, date, sex, id);
        this.idstu = idstu;
        this.practice = practice;
    }
    
    public String getIdstu(){
        return idstu;
    }
    public void setIdstu(String idstu){
        this.idstu = idstu;
    }
    public String getPractice(){
        return practice;
    }
    public void setPractice(String practice){
        this.practice = practice;
    }
    
    public void trainingAssessment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("** Training Assessment **");
        System.out.println("1. Tot");
        System.out.println("2. Kha");
        System.out.println("3. Trung Binh");
        System.out.println("4. Yeu");
        System.out.print("chon loai ren luyen cua sinh vien: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1: this.setPractice("Gioi"); break;
            case 2: this.setPractice("Kha"); break;
            case 3: this.setPractice("Trung Binh"); break;
            case 4: this.setPractice("Yeu"); break;
            default: System.out.println("nhap khong chinh xac!!");
        }
    }
    
    @Override
    public void input() throws Exception{
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter ID Student: ");
        this.setIdstu(sc.nextLine());
        this.trainingAssessment();
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("ID Student: " + this.getIdstu());
        System.out.println("Training Assessment: " + this.getPractice());
    }
}
