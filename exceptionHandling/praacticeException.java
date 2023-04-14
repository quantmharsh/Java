package exceptionHandling;
class   loginEroor extends Exception{
    loginEroor(String str)
    {
        super(str);
    }

}
class login 
{
    private  String userName;
    private String password;
    login(String userName , String password) 
    {
        this.userName=userName;
        this.password=password;
    } 
      public void check(String userName , String password) throws loginEroor
     {
        
        if (userName.length()<6  || password!=this.password)
        {
            throw new loginEroor(" invalid username and password"); 
        }
        else{
            System.out.println(" login succesfull..");
        }
         
     

      }
      void input(String userName , String password)  throws loginEroor
      {
        try{
            check(userName , password);
        }
        catch(loginEroor le)
        {
            throw le;
        }
        finally
        {
            System.out.println("exiting input");
          }
      }
    }

public class praacticeException {
  
    public static void main(String[] args) {
        login log= new login("harshit", "12344");
         try{
            log.input("harshit" ,"12344");
         }
         catch(loginEroor le)
         {
              le.printStackTrace();
         }
    }
}
