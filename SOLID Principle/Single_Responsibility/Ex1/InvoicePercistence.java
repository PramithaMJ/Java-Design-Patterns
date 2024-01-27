package Single_Responsibility.Ex1;

public class InvoicePercistence {
    Invoice invoice;

    public InvoicePercistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile() {
        // Save to file
    }
    
}
