
package Assignment_Q4;


public class place_of_work extends Home_address {
    private String Designation,Depart,email,ph_no;
    private int lvl;
    
    place_of_work(){
        super();
        Designation="";
        Depart="";
        email="abdoo.sa21@gmail.com";
        lvl=1;
        ph_no="01117695134";
    }
    place_of_work(String d,String dept,String e,String p,int lv, String st, String ar, String state,int z, String h,String f, String l, int i){
        super(st,ar,state,z,h,f,l,i);
        Designation=d;
        Depart=dept;
        email=e;
        ph_no=p;
        lvl=lv;
    }
    place_of_work(place_of_work obj){
        super(obj);
        Designation=obj.Designation;
        Depart=obj.Depart;
        email=obj.email;
        ph_no=obj.ph_no;
        lvl=obj.lvl;
    }
    void set_Designation(String d){
        Designation=d;
    }
    String get_Designation(){
        return Designation;
    }
    void set_Depart(String dept){
        Depart=dept;
    }
    String get_Depart(){
        return Depart;
        
    }
    void set_email(String e){
        email=e;
    }
    String get_email(){
        return email;
    }
    void set_lvl(int lv){
       lvl=lv; 
    }
    int get_lvl(){
        return lvl;
    }
    void set_ph_no(String p){
        ph_no=p;
    }
    String get_ph_no(){
        return ph_no;
    }
}
