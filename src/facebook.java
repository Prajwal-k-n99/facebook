import java.util.Scanner;

class facebook {
    String name ="Prajwal" ;
    long id;
    String comment;
    String like;
    String search(){
        return name;
    }
    void post(){
        System.out.println("Select images");
        System.out.println("Post the images");
    }
    void like(){
        System.out.println("Liking the post");
    }
    void comment(){
        System.out.println("Enter the comment");
        Scanner sc = new Scanner(System.in);
        comment = sc.nextLine();
    }
    void friendrequest(){
        System.out.println("Send a friend request");
        System.out.println("Accept request");
    }
}
class socialnetwork{
    public static void main(String[] args) {
        facebook myfb = new facebook();
        myfb.search();
        myfb.comment();
        myfb.like();
        myfb.post();
        myfb.friendrequest();
    }
}

