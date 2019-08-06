public class BookManagerImpl implements BookManager {
    @Override
    public void addBook() {
        System.out.println("增加图书");
    }

    @Override
    public void printBook(String book) {
        System.out.println("打印图书:"+book);
    }
}
