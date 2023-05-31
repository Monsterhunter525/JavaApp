package userService;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        int userScore = service.getUserScore(new String[]{"testEmail@gmail.com:100",
                "user@yahoo.com:1",
                "second-user@gmail.com:20"}, "testmail@gmail.com");
        System.out.println(userScore);
    }
}
