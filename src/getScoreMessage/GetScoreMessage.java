package getScoreMessage;

public class GetScoreMessage {
    public static String getScoreMessage(int place) {
        String result;

        switch (place){
            case 1: {
                result = "Congratulations, you won golden medal";
                break;
            }
            case 2: {
                result = "Great job, you won silver medal";
                break;
            }
            case 3 : {
                result = "Cool, you won bronze medal";
                break;
            }
            default: {
                result = "Don't worry, you'll win next time";
                break;
            }
        }
        return result;
    }
}