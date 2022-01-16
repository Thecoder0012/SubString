public class User {

    private final String fullName;
    private final String userID;

    public User(String fullName, String userID) {
        this.fullName = fullName;
        this.userID = userID;
    }

    public boolean validUserID() {
        String firstHalf = userID.substring(0, 4);
        String secondHalf = userID.substring(4, 8);
        String alphabet = "ABCEFGHIJKLMNOPQRSTUXYZ".toLowerCase();
        String numbers = "1234567890";
        boolean isValid = true;
        for (int i = 0; i < firstHalf.length(); i++) {
            System.out.print(firstHalf.charAt(i));
            if (alphabet.indexOf(firstHalf.charAt(i)) == -1) {
                isValid = false;
            }
        }

        for (int i = 0; i < secondHalf.length(); i++) {
            System.out.print(secondHalf.charAt(i));
            if (numbers.indexOf(secondHalf.charAt(i)) == -1) {
                isValid = false;
            }
        }
        return isValid;

    }
}
