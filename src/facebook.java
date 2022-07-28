import java.util.Scanner;

class Profile {
    String name;
    long id;
    long password;

    void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID");
        id = sc.nextLong();
        System.out.println("Enter your password");
        password = sc.nextLong();
    }
        String search(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name");
            name = sc.nextLine();
            return name;
        }
    }
    class Post{
        String comment;
        String like;
        void post(){
            System.out.println("Select images");
            System.out.println("Post the images");
    }
    void like() {
        for (int i = 0; i>=0; i++) {
            System.out.println("Liking the post");
        }
    }
    void comment() {
        for (int i = 0; i >= 0; i++) {
            System.out.println("Enter the comment");
            Scanner sc = new Scanner(System.in);
            comment = sc.nextLine();
        }
    }
    void friendrequest(){
        System.out.println("Send a friend request");
        System.out.println("Accept request");
    }
}
class facebook{
    public static void main(String[] args) {
        Profile myprofile = new Profile();
        Post mypost = new Post();
        myprofile.login();
        myprofile.search();
        mypost.post();
        mypost.comment();
        mypost.like();
        mypost.friendrequest();
    }
}

