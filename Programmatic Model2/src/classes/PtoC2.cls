public class PtoC2 {
     public void PC(){
        list<Account> acc=new list<Account>();
        acc=[select Id,Name,(select Amount from Account.Opportunities where StageName='Closed Won') from Account ];
        for(Integer i=0;i<acc.size();i++)
        system.debug(acc);
    }
    
}