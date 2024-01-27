package Open_Close_Principle;

public class PersistanceManager {
    BookPersistence bookPersistence;
    InvoicePercistence invoicePercistence;

    public PersistanceManager(InvoicePercistence invoicePercistence, BookPersistence bookPersistence) {
        this.invoicePercistence = invoicePercistence;
        this.bookPersistence = bookPersistence;
    }
}
