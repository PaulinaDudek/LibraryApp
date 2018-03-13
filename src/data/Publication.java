package data;//Created by Paulina on 2018-03-12.

public class Publication {
    private int year;
    private String title;
    private String publisher;

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getPublisher() {

        return publisher;
    }

    public void setPublisher(String publisher) {

        this.publisher = publisher;
    }

    protected Publication(int year, String title, String publisher){
        setYear(year);
        setTitle(title);
        setPublisher(publisher);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publication)) return false;

        Publication that = (Publication) o;

        if (getYear() != that.getYear()) return false;
        if (!getTitle().equals(that.getTitle())) return false;
        return getPublisher().equals(that.getPublisher());
    }

    @Override
    public int hashCode() {
        int result = getYear();
        result = 31 * result + getTitle().hashCode();
        result = 31 * result + getPublisher().hashCode();
        return result;
    }
}
