public class PtoC1 {
    public void PC(){
        list<Account> acc=new list<Account>();
        acc=[select Name,(select Name from Contacts where Contact.Name='John')from Account];
        for(Integer i=0;i<acc.size();i++)
        system.debug(acc);
    }
    
}