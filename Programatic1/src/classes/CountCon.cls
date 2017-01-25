/** Count the occurence of every character**/
public class CountCon {
    public void Con(){
        List<String> lArray = new List<String>{'A','B','C','D','A','B','A','A','A','A'};
        Map<String,Integer> cou = new Map<String,Integer>();

        for(String key : lArray)
        {
        if(!cou.containsKey(key)){
        cou.put(key,0);
        }
        Integer currentInt=cou.get(key)+1;
        cou.put(key,currentInt);
    }
    system.debug(cou);
   }
    
}