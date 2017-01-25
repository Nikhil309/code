public class Queries3 {
   // Add Account
    public void Quer3(){
        Account newAcc=new Account(Name='Nikhil');
        try{
        insert newAcc;
        system.debug(newAcc);
        }
        catch(DmlException E){
           //process exception here 
        }
        
    }
    
}