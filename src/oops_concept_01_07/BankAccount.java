package src.oops_concept_01_07;


public class BankAccount {

    String bank_Name;
    int balance;

    String bankCode;

    BankAccount() {
        System.out.println("Default Const");
    }
    BankAccount(String bName){
        this.bank_Name = bName;
        bankCode = "65466";
        System.out.println("Parametrized Const");

    }

    BankAccount(String bName, String bCode) {
        this.bank_Name = bName;
        this.bankCode = "bcode";
        System.out.println("Parametrized Const");
    }
    void printDetails(){
        System.out.println(bank_Name);
        System.out.println(balance);
        System.out.println(bankCode);
    }


}

