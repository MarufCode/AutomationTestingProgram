package src.oops_concept_01_07;


public class Lab144 {

 public static void main (String[] maruf) {


     BankAccount sbi = new BankAccount();
     sbi.printDetails();


     BankAccount icici = new BankAccount("ICICI", "001");
     icici.bankCode = "777";
     icici.printDetails();


     BankAccount hdfc = new BankAccount("hdfc", "002322");
     hdfc.printDetails();







 }
}

