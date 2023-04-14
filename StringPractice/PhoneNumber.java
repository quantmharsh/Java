package StringPractice;
import java.util.Arrays;

class PhoneNumber2 {
    public static void main(String[] args) {
        String phoneNumber = "(555)555-5555";
        String[] arrPh = phoneNumber.split("-");
        String areaCode = arrPh[0].substring(1,4);
        System.out.println("Area code: " + areaCode);
        System.out.println("Number: "+ arrPh[0].substring(5) + arrPh[1]);
    }
}
