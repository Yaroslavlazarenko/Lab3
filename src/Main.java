
public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        task5();
        //task6();
    }


    /**
     * Дано четное число N (> 0) и символы C1 и C2.
     * Вывести строку длины N, которая состоит из чередующихся символов C1 и C2, начиная с C1.
     */
    public static void task1() {
        byte N;
        do
            N = (byte) (Math.random() * 50);
        while (N % 2 != 0 || N == 0);
        System.out.println("Число N равно: " + N);

        char C1 = 'u', C2 = 'k';
        char[] resultChar = new char[N];

        for (byte i = 0; i < N; i += 2) {
            resultChar[i] = C1;
            resultChar[i + 1] = C2;
        }

        String finalString = (new String(resultChar));
        System.out.println(finalString);
    }


    /**
     * Даны строки S и S0. Найти количество вхождений строки S0 в строку S.
     */
    public static void task2() {
        String S = "gf fgd abcabcs", S0 = "abc";
        System.out.println("Количество вхождений >" + S0 + "< в >" + S + "<: " +
                (S.length() - S.replace(S0, "").length()) / S0.length());
    }


    /**
     * Дана строка-предложение заданное кириллицей. Вывести самое длинное слово в предложении.
     * Если таких слов несколько, то вывести первое из них. Словом считать набор символов, не содержащий пробелов,
     * знаков препинания и ограниченный пробелами, знаками препинания или началом/концом строки.
     */
    public static void task3() {
        String SentenceString = "В данной строке предложении самое длинное слово предложении", maxWord = "";
        String[] words = SentenceString.split(" ");
        for (String word : words)
            if (word.length() > maxWord.length())
                maxWord = word;
        System.out.println("Самое длинное слово: " + maxWord);
    }


    /**
     * Дана строка-предложение. Зашифровать ее, поместив вначале все символы, расположенные на четных позициях строки,
     * а затем, в обратном порядке, все символы, расположенные на нечетных позициях (например, строка «Программа»
     * превратится в «ргамамроП»).
     */
    public static void task4() {
        byte m = 0;
        String SentenceString = "Зашифруем его";
        char[] save = SentenceString.toCharArray();
        char[] finalSentence = new char[SentenceString.length()];
        int length = SentenceString.length();
        for (int i = 1; i < length; i += 2) {
            finalSentence[m] = save[i];
            m++;
        }
        for (int i = length - 1; i >= 0; i -= 2) {
            finalSentence[m] = save[i];
            m++;
        }
        System.out.println(finalSentence);
    }


    /**
     * Дана строка-предложение заданное кириллицей и число K (0 < K < 10). Зашифровать строку, выполнив циклическую
     * замену каждой буквы на букву того же регистра, расположенную в алфавите на K-й позиции после шифруемой буквы
     * (например, для K = 2 «А» перейдет в «В», «а» — в «в», «Б» — в «Г», «я» — в «б» и т. д.). Букву «ё» в алфавите
     * не учитывать, знаки препинания и пробелы не изменять.
     */
    public static void task5() {
        String inputString = "ЯБа Бв,.я";
        final byte K = (byte) (Math.random() * 8 + 1);
        System.out.println("Число К равно: " + K);
        char[] stringToArray = inputString.toCharArray();
        for (int i = 0; i < stringToArray.length; i++) {
            if (stringToArray[i] < 1040 || stringToArray[i] > 1103) {
            } else if (stringToArray[i] < 1072) {
                stringToArray[i] += stringToArray[i] + K < 1072 ? K : K - 32;
            } else if (stringToArray[i] < 1104) {
                stringToArray[i] += stringToArray[i] + K < 1104 ? K : K - 32;
            }
        }
        System.out.println("Начальный вид:\n"+inputString+" \nИтоговый вид:");
        System.out.print(stringToArray);
    }


    /**
     * Дана строка, содержащая полное имя файла. Выделить из этой строки название первого каталога (без символов «\»).
     * Если файл содержится в корневом каталоге, то вывести символ «\».
     */
    public static void task6() {
        String filepath = "//C:\\Project.exe";
        String[] words = filepath.split("\\\\");
        System.out.println(words.length > 2
                ? "Название первого каталога: " + words[1] : "Файл находится в корневом каталоге: \\");
    }
}