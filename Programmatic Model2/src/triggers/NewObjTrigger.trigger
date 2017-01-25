trigger NewObjTrigger on Contact (before insert) {
    list<Contact> con=Trigger.New;
    system.debug(con);
}