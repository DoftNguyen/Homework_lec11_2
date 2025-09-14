package Homework_lec11_3;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> PersonList = new ArrayList<>();
    
    public void addPerson(Person p) throws Exception{
        p.input();
        PersonList.add(p);
    }
    
    public void displayList(){
        if(PersonList.isEmpty()){
            System.out.println("Danh sach rong!!!");
        }else{
            for(Person p : PersonList){
                p.display();
                System.out.println();
            }
        }
    }
}
