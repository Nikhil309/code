public class PtoC3{
    public void PC(){
        list<A__c> add=new list<A__c>();
        add=[select Name,(select Name from Cs__r where Name='John')from A__c ];
        for(Integer i=0; i<add.size();i++)
        system.debug(add);
    }
}