public class BankAccountMain {
    public static void main(String[] args){
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Sai",25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Krishna",100.00,"sai@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());



        /*BankAccount saiAccount = new BankAccount();
        BankAccount saiKrishnaAccount = new BankAccount("12345",1000.00,"Sai Krishna","sai@123.com","1234-4557-12");
        System.out.println(saiKrishnaAccount.getBankAccountNumber());
        System.out.println(saiKrishnaAccount.getBankAccountBalance());
        System.out.println(saiKrishnaAccount.getCustomerName());
        System.out.println(saiKrishnaAccount.getPhoneNum());
        System.out.println(saiKrishnaAccount.getEmail());
        saiAccount.setBankAccountNumber("64290201000");
        saiAccount.setCustomerName("Sai Krishna");
        saiAccount.setEmail("sai@123.com");
        saiAccount.setPhoneNum("1245678");
        saiAccount.withDrawl(1000);
        saiAccount.deposit(10000);
        saiAccount.withDrawl(100000);
        saiAccount.deposit(600);
        saiAccount.deposit(10000);
        saiAccount.withDrawl(1000);
        BankAccount hk = new BankAccount("Hk","hk@123.com","1234567890");
        System.out.println(hk.getBankAccountNumber()+" name "+hk.getCustomerName());*/
    }

}
