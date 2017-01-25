/**Prepare Map User Id as Key and User Name as valus**/
public class Prog2 {
    public void pr2(){
             map<string,string> map1=new map<string,string>();
             for(User u:[select Name from User Where IsActive=true])
             {map1.put(u.Id,u.Name);}
             system.debug(map1);
        
    }
    
}