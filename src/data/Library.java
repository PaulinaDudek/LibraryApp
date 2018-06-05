package data;


public class Library {
    public static final int MAX_PUBLICATIONS=2000;
    private Publication [] publications;
    private int publicationsNumber;

    public Publication[] getPublications() {
        return publications;
    }

    public void setPublications(Publication[] publications) {
        this.publications = publications;
    }

    public int getPublicationsNumber() {
        return publicationsNumber;
    }

    public void setPublicationsNumber(int publicationsNumber) {
        this.publicationsNumber = publicationsNumber;
    }

    public Library() {
        setPublications(new Publication[MAX_PUBLICATIONS]);
    }


    public void addBook(Book book) {
        addPublication(book);
    }
    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    private void addPublication (Publication publication) throws ArrayIndexOutOfBoundsException{
        if(publicationsNumber==MAX_PUBLICATIONS){
            throw new IndexOutOfBoundsException("MAX_PUBLICATIONS "+MAX_PUBLICATIONS);
        }
        publications[publicationsNumber]=publication;
        publicationsNumber++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<publicationsNumber;i++){
            builder.append(publications[i]);
            builder.append("\n");
        }
        return builder.toString();
    }
}