/**Multi-Picklist where enrpllment year is 2010**/
public class Prog4 {
    public void pr4(){
                list<Account> acc=new list<Account>();
                acc=[select Id from Account Where Enrollment_Year__c INCLUDES('2010')];
                for(Integer i=0;i<acc.size();i++)
                system.debug(acc);
       }
}