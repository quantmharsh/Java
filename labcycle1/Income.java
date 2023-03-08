package labcycle1;
 class Cab {
    private String registrationNo;
    private String name;
    private double rate;
    private double totalDistance;

    public Cab(String registrationNo, String name, double rate, double totalDistance) {
        this.registrationNo = registrationNo;
        this.name = name;
        this.rate = rate;
        this.totalDistance = totalDistance;
    }

    public void setregistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setrate(double rate) {
        this.rate = rate;
    }

    public void setdistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public String getregistrationNo() {
        return registrationNo;
    }

    public String getname() {
        return name;
    }

    public double getrate() {
        return rate;
    }

    public double getdistance() {
        return totalDistance;
    }

    public double ComputeIncome() {
        return totalDistance * rate;
    }

}

    public class Income{

    public static void main(String[] args) {
        
        Cab[] cabslist = new Cab[3];
        for (int i = 0; i < 3; i++) {
            cabslist[i] = new Cab("" + (111 + i), "harsh", 10 * i, 1000 * i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("reg no" + cabslist[i].getregistrationNo());
            System.out.println("income" + cabslist[i].ComputeIncome());
            System.out.println("name" + cabslist[i].getname());
        }
    }
}
