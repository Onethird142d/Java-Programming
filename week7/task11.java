public class task11 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHAR_PER_LINE = 25;

        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomLowerCaseLetter();
            if ((i + 1) % CHAR_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }

    public class RandomCharacter {
        public static char getRandomLowerCaseLetter() {
            return (char) ('a' + Math.random() * ('z' - 'a' + 1));
        }
    }
}


