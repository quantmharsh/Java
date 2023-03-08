package abstractInterface;
interface myWifi
{
    String[]  getConnection();
    void  showNetworks( String networks);
    

}
interface  myCamera
{
    void takeSnap();
    void recordVideo();
    // in interface using dafault we can declare and define the function here only
    //and no need to rewrite it in class which implimented this
    default  void  recordIn4k()
    {
        System.out.println("recording in 4K");
    }

    
}
class myPhone
{
    void callNumber( int phoneNumber)
        {
           System.out.println("calling.."+phoneNumber);
        }
        void pickCall()
        {
            System.out.println("connecting;");
        }
    
}
class mySmartPhone  extends myPhone implements myCamera ,myWifi
{
     public void takeSnap()
    {
        System.out.println("clicking");
    }
    public     void recordVideo()
    {
        System.out.println("recording");
    }
    public  String[]  getConnection()
    {
        System.out.println("LIIST");
        String[] networks ={ "HARSH","aman","amit"};
        return networks;

    }

    public  void showNetworks(String Network)
    {
        System.out.println("NETWORKS "+Network);
    }
     
}
public class defaultInInterface {
    public static void main(String[] args) {
         mySmartPhone ms= new mySmartPhone();
         ms.callNumber(13424244);
         ms.recordIn4k();
    }
    
}
