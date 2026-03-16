class Account {

    double balance = 20000;

}
class SavingsAccount extends Account {
}

class PremiumSavings extends SavingsAccount {

    void calculateInterest() {
        double interest = balance * 0.07;
        int interestInt = (int) interest;
        System.out.println("Interest: " + interestInt);
    }
    public static void main(String[] args) {
        PremiumSavings p = new PremiumSavings();
        System.out.println("Balance: " + p.balance);
        p.calculateInterest();
    }
}
