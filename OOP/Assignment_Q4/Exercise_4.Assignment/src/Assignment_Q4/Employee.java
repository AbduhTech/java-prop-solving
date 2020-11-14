/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Q4;

/**
 *
 * @author Nafi
 */
public class Employee {
    private String Fname,Lname;
    private int Id_no;
    
    Employee(){
        Fname="Abdelrahman";
        Lname="Belal";
        Id_no=1;
     
    }
    Employee (String F, String L, int K){
        Fname=F;
        Lname=L;
        Id_no=K;
    }
    Employee (Employee obj){
       Fname=obj.Fname;
       Lname=obj.Lname;
       Id_no=obj.Id_no;
    }
    void set_f_name(String f){
        Fname=f;
    }
    String get_f_name(){
        return Fname;
    }
    void set_l_name(String l){
        Lname=l;
    }
    String get_Lname(){
        return Lname;
    }
    void set_Id_no(int K){
        Id_no=K;
    }
    int get_Id_no(){
        return Id_no;
    }
}
