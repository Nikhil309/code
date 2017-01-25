public class Queries {
    public void Quers(){
      list<Contact> cont=new list<Contact>();
      cont=[select ID from Contact];
for(Integer i=0;i<cont.size();i++) 
      system.debug(cont); 
    }
    
}