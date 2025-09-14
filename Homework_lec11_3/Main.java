package Homework_lec11_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        PersonList list = new PersonList();
        
        while(true){
            System.out.println("** MENU **");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Thoat");
            System.out.print("nhap lua chon: ");
            int choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.println("** CHON DOI TUONG NHAP THONG TIN **");
                System.out.println("1. Sinh vien");
                System.out.println("2. Giang vien");
                System.out.print("Moi chon: ");
                int a = sc.nextInt();
                if(a == 1){
                    list.addPerson(new Student());
                }else if(a == 2){
                    list.addPerson(new Lecturer());
                }else{
                    System.out.println("lua chon khong hop le!!");
                }
            }else if(choice == 2){
                list.displayList();
            }else if(choice == 3){
                break;
            }
        }
    }
}
