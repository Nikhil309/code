/**SOSL to find test**/
public class SOSL {
    public void srch(){
        list<list<sobject>> searchlist=[find 'test' IN all fields returning Contact,Account,Lead,User];
        for(Integer i=0; i<searchlist.size();i++)
        system.debug(searchlist);
    }
}