public class Para2 {
    String strMsg='Welcome to @pex Programming';
    String name = 'A';
    String result = strMsg.replaceAll('@', name);
    Integer len=strMsg.length()/2;
    String halfString=strMsg.substring(0,len);
        public Para2(){
        system.debug(' ' +halfString);
    }
   
}