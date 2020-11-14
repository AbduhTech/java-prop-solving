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
public class Home_address extends Employee {
    private String Street,Area,State,Home_phone;
    private int Zip_Code;
    
    Home_address(){
        super ();
      Street="bandar sunway";
      Area="Petaling Jaya";
      State="selangor";
      Zip_Code=47500;
      Home_phone="01117695134";
    }
    Home_address(String st, String ar, String state, int z, String hn, String f, String l, int i){
        super(f,l,i);
        Street=st;
        Area=ar;
        State=state;
        Zip_Code=z;
        Home_phone=hn;
    }
    Home_address(Home_address obj){
        super(obj);
        Street=obj.Street;
        Area=obj.Area;
        State=obj.State;
        Zip_Code=obj.Zip_Code;
        Home_phone=obj.Home_phone;
    }
    void set_Street(String st){
        Street=st;
    }
    String get_Street(){
        return Street;
    }
    void set_Area(String ar){
        Area=ar;
    }
    String get_Area(){
        return Area;
    }
    void set_State(String state){
        State=state;
    }
    String get_State(){
        return State;
    }
    void set_Zip_Code(int z){
        Zip_Code=z;
    }
    int get_Zip_Code(){
        return Zip_Code;
    }
    void set_Home_phone(String hn){
        Home_phone=hn;
    }
    String get_Home_phone(){
        return Home_phone;
    }
    
}
