/**Associated contact records of the account**/
public class Queries2 {
    public void Quer2(){
            list<Account> acc=new list<Account>();
            acc=[select ID from Account];
            for(Integer i=0;i<acc.size();i++)
            system.debug(acc);
    }
}