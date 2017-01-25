/**SOQL query to show parent to child relationship**/
public class Queries4 {
    public void Quer4(){
        list<Account> acc=new list<Account>();
        acc=[Select Account.Name,(Select Contact.Name from Contacts)from Account];
        for(Integer i=0;i<acc.size();i++)
        system.debug(acc);
        
    }
    
}