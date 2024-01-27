package Open_Close_Principle;

interface InvoicePercistence {
    public void saveToFile(Invoice invoice);
}

public Class databasePersistence implements InvoicePercistence {
    @Override
    public void saveToFile(Invoice invoice) {
        // save invoice to database
    }
}

public Class filePersistence implements InvoicePercistence {
    @Override
    public void saveToFile(Invoice invoice) {
        // save invoice to file
    }
}

public Class PersistanceManager {
    BookPersistence bookPersistence;
    InvoicePercistence invoicePercistence;

    public PersistanceManager(InvoicePercistence invoicePercistence, BookPersistence bookPersistence) {
        this.invoicePercistence = invoicePercistence;
        this.bookPersistence = bookPersistence;
    }
}