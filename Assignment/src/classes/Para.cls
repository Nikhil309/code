public class Para {
    
    String strMsg='Welcome to @pex Programming';
    String name = 'A';
    String result = strMsg.replaceAll('@', name);
    public Para(){
        system.debug(' ' +result);
    }
    
}