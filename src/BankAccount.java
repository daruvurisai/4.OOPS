public class BankAccount {
    private String bankAccountNumber;
    private double bankAccountBalance;
    private String customerName;
    private String email;
    private String phoneNum;

    //Creating a constructor
    public BankAccount(){
        this("12345688",300.00,"Default_name","Default Address","default phone");
        System.out.println("Empty Constructor called");
    }
    public BankAccount(String bankAccountNumber,double bankAccountBalance,String customerName,String email,String phoneNum){
        System.out.println("Account Constructor with params called. ");
        this.bankAccountNumber=bankAccountNumber;
        this.bankAccountBalance=bankAccountBalance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNum=phoneNum;
    }

    public BankAccount(String customerName, String email, String phoneNum) {
        this("0112445000",123.00,customerName,email,phoneNum);
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public void deposit(double depositAmount){
        this.bankAccountBalance+=depositAmount;
        System.out.println("Deposit amount "+depositAmount+" made.New balance is "+this.bankAccountBalance);
    }

    public void withDrawl(double withDrawlAmount){
        if(this.bankAccountBalance-withDrawlAmount<0){
            System.out.println("Only "+this.bankAccountBalance+"available.WithDrawl not available! ");
        }else {
            this.bankAccountBalance-=withDrawlAmount;
            System.out.println("withdrawal of "+withDrawlAmount+" Processes. Remaining balance is "+this.bankAccountBalance);
        }
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public double getBankAccountBalance() {
        return bankAccountBalance;
    }

    public void setBankAccountBalance(double bankAccountBalance) {
        this.bankAccountBalance = bankAccountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
