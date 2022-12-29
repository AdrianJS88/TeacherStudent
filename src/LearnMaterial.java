public class LearnMaterial extends Student {
    // Student learning material ,books,internet links , monthly homework  (subiect, cerinte, disciplina);
    public String books;
    public String internetLinks;
    public String monthlyHomework;

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getInternetLinks() {
        return internetLinks;
    }

    public void setInternetLinks(String internetLinks) {
        this.internetLinks = internetLinks;
    }

    public String getMonthlyHomework() {
        return monthlyHomework;
    }

    public LearnMaterial( String books, String internetLinks, String monthlyHomework) {
        super();

        this.books = books;
        this.internetLinks = internetLinks;
        this.monthlyHomework = monthlyHomework;
    }

    public void setMonthlyHomework(String monthlyHomework) {
        this.monthlyHomework = monthlyHomework;


    }
}
