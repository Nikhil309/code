public class Dml1 {
    public void UnIns(){
        list<Account> adacc=new list<Account>();
        for(Integer i=0;i<100;i++)
        {
            Account acc=new Account(Name='Nik1'+i);
            adacc.add(acc);
           
        }
         system.debug(adacc);
        try{
            insert adacc;
           
        }
        catch(DmlException e){
            system.debug('Insertion of account failed');
        }
    }
}