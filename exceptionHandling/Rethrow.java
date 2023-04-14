package exceptionHandling;



public class Rethrow {
    void someMethod2() throws Exception{
        throw new Exception("thrown");
    }

    void someMethod() throws Exception{
        try {
            someMethod2();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        Rethrow re = new Rethrow();

        try {
            re.someMethod();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
