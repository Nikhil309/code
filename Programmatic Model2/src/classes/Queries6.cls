public  class Queries6 {
    public void Quer6(){
        map<String,String> map1=new map<String,String>();
        for(Account a:[Select Id,Name from Account])
        {map1.put(a.Name,a.Id);}
        system.debug(map1);
    }
}