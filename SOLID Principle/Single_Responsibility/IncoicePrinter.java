package Single_Responsibility;

public class IncoicePrinter {
    private Invoice invoice;

    //ctor
    public IncoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }
    
    public void printInvoice() {
        System.out.println("Book: " + invoice.getBook());
        System.out.println("Year: " + invoice.getTotal());
        System.out.println("Price: " + invoice.getQuantity());
        System.out.println("Quantity: " + invoice.getDiscount());
        System.out.println("Discount: " + invoice.getTaxRate());
        System.out.println("Tax Rate: " + invoice.getTotal());
    }
}
