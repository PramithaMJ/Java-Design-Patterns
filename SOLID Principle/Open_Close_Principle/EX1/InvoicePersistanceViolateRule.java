package Open_Close_Principle.EX1;
/*
 * In Open Close Principle, 
 * we have to make sure that we can extend our classes without modifying them.
 * book InvoicePersistance didn't design to extendable.
 * We have to modify the InvoicePresestance class to save invoice to file or database.
 */
class InvoicePersistanceViolateRule {
    public Invoice invoice;

    public InvoicePersistanceViolateRule(Invoice invoice) {
        this.invoice = invoice;
    }
    
    public void saveToFile(String filename) {
        // save to file with given name
    }

    public void saveToDatabase() {
        // save invoice to database
    }
}