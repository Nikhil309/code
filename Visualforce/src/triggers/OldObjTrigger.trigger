trigger OldObjTrigger on Account (after insert) {
    list<Account> acc=Trigger.Old;
    system.debug(acc);
    
}