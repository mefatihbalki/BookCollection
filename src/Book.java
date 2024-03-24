public class Book implements Comparable <Book>{
    //Verilerimizin oluştuğu sınıf
    private String bookName;
    private int pageNumber;
    private String writerName;
    private int pubDate;

    public Book(String bookName, int pageNumber, String writerName, int pubDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.writerName = writerName;
        this.pubDate = pubDate;
    }



    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.bookName.compareTo(otherBook.getBookName());
    }
}
