import java.util.ArrayList;

public class Library {
    private ArrayList<String> publicationList = new ArrayList<String>();

    public Library() {
    }

    public Library(ArrayList<String> publicationList) {
        this.publicationList = publicationList;
    }

    @Override
    public String toString() {
        return "Library{" +
                "publicationList=" + publicationList +
                '}';
    }

    public ArrayList<String> getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(ArrayList<String> publicationList) {
        this.publicationList = publicationList;
    }
}
