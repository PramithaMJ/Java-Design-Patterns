package Open_Close_Principle.EX1;

public class PersistanceManager {
    //BookPersistence bookPersistence;
    InvoicePercistence invoicePercistence;

    public PersistanceManager(InvoicePercistence invoicePercistence) {
        this.invoicePercistence = invoicePercistence;
      //  this.bookPersistence = bookPersistence;
    }
}
