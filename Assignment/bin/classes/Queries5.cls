public class Queries5 {
    public void Quer5(){
        
        map<String,String> map1=new map<String,String>();
        for(User u:[Select Name from User where IsActive=true])
        {map1.put(u.Id,u.Name);}
        system.debug(map1);
        
        
    }
    
}