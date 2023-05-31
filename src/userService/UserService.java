package userService;

public class UserService {
    public int getUserScore(String[] records, String email) {
        int userScore = -1;
        for (String record : records) {
            String[] split = record.split(":");
            if (split[0].equals(email)) {
                userScore = Integer.parseInt(split[1]);
            }
        }
        if (userScore == -1) {
            throw new UserNotFoundException("User with given email doesn't exist");
        }
        return userScore;
    }
}