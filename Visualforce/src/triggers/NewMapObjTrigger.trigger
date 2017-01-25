trigger NewMapObjTrigger on A__c (after insert) {
           
             system.debug(Trigger.newMap);
    
}