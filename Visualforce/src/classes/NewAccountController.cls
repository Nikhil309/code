public class NewAccountController {
    public Account account{get;set;}
    public Contact contact{get;set;}
   
    public PageReference Page1(){
        return Page.AccountPage1;
    }
    public PageReference save(){
        account.phone=contact.phone;
        insert account;
        contact.accountId=account.Id;
        insert contact; 
    }
}