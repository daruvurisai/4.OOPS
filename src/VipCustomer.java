public class VipCustomer {
    private  String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default Name",50000.00,"default@gmail.com");
    }

    public VipCustomer(String name, Double creditLimit) {
        this(name,creditLimit,"Unknown@email.com");
    }

    public VipCustomer(String name, Double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
