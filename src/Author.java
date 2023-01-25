import java.util.ArrayList;


public class Author {

    String authorName = "Brandon Sanderson";
    String authorEMail = "brandonsanderson@gmail.com";
    char authorGender = 'm';



    public Author authorClass(String authorName, String authorEMail, char authorGender){
        this.authorName = authorName;
        this.authorEMail = authorEMail;
        this.authorGender = authorGender;
        return null;
    }

    public String getAuthorName(){
        return authorName;
    }

    public String getAuthorEMail(){
        return authorEMail;
    }

    public Character getAuthorGender(){
        return authorGender;
    }

}
