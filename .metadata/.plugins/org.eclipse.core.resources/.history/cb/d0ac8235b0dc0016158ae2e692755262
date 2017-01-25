public class Dml2 {
    public void Dele(){
             Account[] DelAcc = [SELECT Id, Name FROM Account WHERE Active__c='No' and CreatedDate = LAST_N_DAYS:90];
                try {
                    delete DelAcc;
                    }
                catch (DmlException e) {
                    // Process exception here
                    }
          }
}