package Homework_lec11_3;

import java.util.Date;
import java.util.Scanner;

public class Lecturer extends Person{
    private String idlec;
    private String rank;

    public Lecturer() {
        super();
    }

    public Lecturer(String idlec, String rank, String name, Date date, String sex, String id) {
        super(name, date, sex, id);
        this.idlec = idlec;
        this.rank = rank;
    }
    
    public String getIdlec(){
        return idlec;
    }
    public void setIdlec(String idlec){
        this.idlec = idlec;
    }
    public String getRank(){
        return rank;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
    
    public void competitionRank(){
        Scanner sc = new Scanner(System.in);
        System.out.println("** Competition Ranking **");
        System.out.println("1. Loai A");
        System.out.println("2. Loai B");
        System.out.println("3. Loai c");
        System.out.print("chon loai xep hang giang vien: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1: this.setRank("A"); break;
            case 2: this.setRank("B"); break;
            case 3: this.setRank("C"); break;
            default: System.out.println("nhap khong chinh xac!!!");
        }
    }
    
    @Override
    public void input() throws Exception{
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enten ID Lecturer: ");
        this.setIdlec(sc.nextLine());
        this.competitionRank();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("ID Lecturer: " + this.getIdlec());
        System.out.println("Rank: " + this.getRank());
    }
}
