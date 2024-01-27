package Single_Responsibility.Ex1;
/*
 * This class is responsible for creating invoices and saving them to a file.
 * It is also responsible for calculating the total price of the invoice.
 * In The solid principles, this class violates the Single Responsibility Principle.
 * It should be split into two classes: Invoice and InvoicePercistence.
 */
public class InvoiceViolateSRP {
    private Book book;
    private int quantity;
    private double discount;
    private double taxRate;
    private double total;

    public InvoiceViolateSRP(Book book, int quantity, double discount, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discount = discount;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    public double calculateTotal() {
        double price = ((book.price - book.price * discount) * this.quantity);
        double priceWithTax = price*(1+taxRate);
        return priceWithTax;
    }

    public void printInvoice() {
        System.out.println("Book: " + book.name);
        System.out.println("Author: " + book.authorName);
        System.out.println("Year: " + book.year);
        System.out.println("Price: " + book.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Discount: " + this.discount);
        System.out.println("Tax Rate: " + this.taxRate);
        System.out.println("Total: " + this.total);
    }

    public void saveToFile() {
        // Save to file
    }
}