/**Child to Parent relationship where Industry=Media**/
public class CtoP1 {
    public void CP(){
        list<Contact> con=new list<Contact>();
        con=[SELECT Id, Name, Account.Name FROM Contact WHERE Account.Industry = 'Media'];
        for(Integer i=0;i<con.size();i++)
        system.debug(con);
    }
    
}