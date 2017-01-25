/**Replace the occurrence @ with A**/

public class Para2 {
    String strMsg='Welcome to @pex Programming';
  
    String name = 'A';
    String result = strMsg.replaceAll('@', name);
   
        public Para2(){
        system.debug('result ' +result);
    }
   
}