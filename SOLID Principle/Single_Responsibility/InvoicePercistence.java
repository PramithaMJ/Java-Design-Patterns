package Single_Responsibility;

public class InvoicePercistence {
    Invoice invoice;

    public InvoicePercistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile() {
        // Save to file
    }
    
}
