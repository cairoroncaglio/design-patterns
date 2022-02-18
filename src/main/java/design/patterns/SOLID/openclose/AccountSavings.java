package design.patterns.SOLID.openclose;

class AccountSavings extends Account {

    public AccountSavings(Double amount) {
        this.amount = amount;
    }

    private Double amount;

    @Override
    public void Debitar(int valor) {
        this.amount = this.amount - valor;
    }

    public Double getAmount() {
        return amount;
    }
}
