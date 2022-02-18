package design.patterns.SOLID.openclose;

public class CurrentAccount extends Account {

    public CurrentAccount(Double amount) {
        this.amount = amount;
        this.limit = 0.0;
    }

    public CurrentAccount(Double amount, Double limit) {
        this.limit = limit;
        this.amount = amount;
    }

    private Double limit;
    private Double amount;
    private Double futureReleases;

    @Override
    public void Debitar(int valor) {
        Double futureBalance = this.amount - valor;
        if (verifyLimit(futureBalance)) {
            this.amount = futureBalance;
        }
    }

    public boolean verifyLimit(Double futureBalance) {
        if (-this.limit > futureBalance) {
            System.out.println("unpaid debt");
            return false;
        }
        return true;
    }

    public Double getAmount() {
        return amount;
    }
}
