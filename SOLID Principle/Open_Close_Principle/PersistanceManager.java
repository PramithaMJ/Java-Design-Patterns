package Open_Close_Principle;

public class PersistanceManager {
    //BookPersistence bookPersistence;
    InvoicePercistence invoicePercistence;

    public PersistanceManager(InvoicePercistence invoicePercistence) {
        this.invoicePercistence = invoicePercistence;
      //  this.bookPersistence = bookPersistence;
    }
}
