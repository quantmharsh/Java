package exp;

public class practiceString {
    public static void main(String[] args) {
        
         String str ="harsh kumar srivastava  harsh";
          
              System.out.println( str.lastIndexOf("k"));
              System.out.println( str.lastIndexOf("harsh"));
              System.out.println( str.substring(11));
              System.out.println( str.replaceAll("harsh" ,"quantam"));
        StringBuffer buffer =new StringBuffer(" welcome back harsh ");
            System.out.println(buffer);
            System.out.println( buffer.length());
            buffer.append(" Good Night Harsh Srivastava");
            System.out.println(buffer);
            StringBuffer buffer1 =new StringBuffer("  lets play BGMI ");
            System.out.println( buffer.append(buffer1));
            System.out.println( buffer.replace(26 ,31  ,"Morning"));
            

              
    }
    }

