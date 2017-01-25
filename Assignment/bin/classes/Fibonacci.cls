public class Fibonacci{
public String lst;

    public Integer next;
    public Integer first=0;
    public Integer second=1;
    public String series(Integer n){
        for(Integer x=0;x<=n;x++){

            if(x<=1){
                next=x;
                lst=String.valueOf(next+'\t');}
             else{
                next=first+second;
                lst+=String.valueof(next+'\t');
                first=second;
                second=next;

            }
        }
       return lst;
    }
}