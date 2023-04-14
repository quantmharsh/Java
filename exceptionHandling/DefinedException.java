package exceptionHandling;

class LoginError extends Exception {
    LoginError(String str){
        super(str);
    }
}

class User {
    String name;
    String password;

    User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public void login(String name, String password) throws LoginError {
        if (name.length() < 6) throw new LoginError("Username invalid");
        if(name != this.name || password != this.password)
            throw new LoginError("incorret username or password");

        System.out.println("logged in");
    }
}

class DriverLogin {
    public static void main(String[] args) {
        User u = new User("harshit", "13432");
        try {
            u.login("harshit", "1343");
        } catch (LoginError l){
            System.out.println(l.getMessage());
        } finally {
            System.out.println("exiting..");
        }
    }
}
