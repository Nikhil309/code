/**DML Operation**/
public class DMLoperation {
    
    //Accounnt
     public void newAccount(){
            Account newAcc=new Account(Name='Nikhil');
                try{
                    insert newAcc;
                    system.debug(newAcc);
                   }
                catch(DmlException E){
                    system.debug('Error');
                    }
     }
     
     //Contact
      public void newContact(){
            Contact newcon=new Contact(LastName='Rathod');
                try{
                    insert newcon;
                    system.debug(newcon);
                   }
                catch(DmlException E){
                    system.debug('Error');
                   }
      }
      
      //Lead
       public void newLead(){
            Lead newld=new Lead(LastName='Jadhav',Company='Cogni');
                try{
                    insert newld;
                    system.debug(newld);
                   }
                catch(DmlException E){
                    system.debug('Error');
                   }
      }
      
      //Account
        public void newAccount(){
            Date closeDate=Date.newInstance(2017,5,21);
            Account newopp=new Account(Name='Chips',CloseDate=closeDate,StageName='Prospecting');
                  try{
                    insert newopp;
                    system.debug(newopp);
                   }
                  catch(DmlException E){
                    system.debug('Error');
                   }
      }
}