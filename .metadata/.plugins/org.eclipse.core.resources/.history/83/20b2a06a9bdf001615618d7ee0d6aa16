/**To display 100 opportunity recourd with amount greater than 10000 ordered by created date skip first 50 records**/
public  class Prog6 {
    public void pr6(){
        list<Opportunity> Opp=new list<Opportunity>();
        Opp=[select Id,Name from Opportunity Where Amount>10000 order by CreatedDate limit 100 offset 50];
        for(Integer i=0;i<opp.size();i++)
        system.debug(opp);
        
    }
}