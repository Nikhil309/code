/**Map Structure AccountId as key and Account object as value **/
public class Que6 {
    public void Quer61(){
        map<String,Account> map1=new map<String,Account>();
        for(Account a:[Select Name from Account])
        {map1.put(a.Name,a);}
        system.debug(map1);
    }
}