import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        print();
        // reading data from a csv file
        System.out.println("Reading data from csv :");
        // reading data from a csv file and convert to java object
        System.out.println("Reading data from csv and convert to java object:");
        CsvToJava csvToJava = new CsvToJava();
        Processor pmap = csvToJava.convertCsvToJava();
        // Processor j = new Processer();
        printMap(pmap.data);

        search();
    }

    public static void printMap(HashMap<Integer, Student> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }


    public static void search() {
        ArrayList<Student> s;
        s = csvToArray();

        printResults(s, gatherInput());

    }


    public static void printResults(ArrayList<Student> compare, String[] answers) {
        int numberOfRecords = 0;
        int size = compare.size() - 1;
        int half = size / 2 - 10;
        ArrayList<Student> clean = compare;
        Stack<Student> stacky = new Stack<Student>();
        for (int i = 0; i < size; i++) {

            if (!compare.get(i).getgender().equals(answers[0])) {
                if (!answers[0].equals("*")) {

                    continue;
                }


            }

            if (!compare.get(i).getrace().equals(answers[1])) {
                if (!Objects.equals(answers[1], "*")) {
                    continue;
                }
            }

            if (!compare.get(i).getparentalEducation().equals(answers[2])) {
                if (!Objects.equals(answers[2], "*")) {
                    continue;
                }
            }


            if (!compare.get(i).gettestPreperationCourse().equals(answers[4])) {
                if (!Objects.equals(answers[4], "*")) {
                    continue;
                }
            }


            stacky.push(clean.get(i));

        }


        System.out.println("SIZE " + stacky.size());
        while (!stacky.empty()) {
            System.out.println(stacky.pop());
        }

    }

    public static String[] gatherInput() {
        String[] input = new String[8];
        System.out.println("Enter 1 for Female. 2 For Male. 0 for Both");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        if (userInput.equals("0")) {
            input[0] = "*";
        } else if (userInput.equals("1")) {
            input[0] = "female";
        } else {
            input[0] = "male";
        }

        System.out.println("Enter A for Group A. B for Group B. C for Group C. D for Group D. E for Group E. 0 for All.");
        userInput = in.nextLine();
        if (userInput.equals("A")) {
            input[1] = "group A";
        } else if (userInput.equals("B")) {
            input[1] = "group B";
        } else if (userInput.equals("C")) {
            input[1] = "group C";
        } else if (userInput.equals("D")) {
            input[1] = "group D";
        } else if (userInput.equals("E")) {
            input[1] = "group E";
        } else {
            input[1] = "*";
        }

        System.out.println("Enter 1 for Associate's Degree. Enter 2 for high school. Enter 3 for some high school. Enter 4 for Bachelor's degree. Enter 5 for some college. Enter 0 for all.");
        userInput = in.nextLine();
        if (userInput.equals("1")) {
            input[2] = "associate's degree";
        } else if (userInput.equals("2")) {
            input[2] = "high school";
        } else if (userInput.equals("3")) {
            input[2] = "some high school";
        } else if (userInput.equals("4")) {
            input[2] = "bachelor's degree";
        } else if (userInput.equals("5")) {
            input[2] = "some college";
        } else {
            input[2] = "*";
        }

        System.out.println("Enter 1 for standard. Enter 2 for free/reduced. Enter 0 for all.");
        userInput = in.nextLine();
        if (userInput.equals("1")) {
            input[3] = "standard";
        } else if (userInput.equals("2")) {
            input[3] = "free/standard";
        } else {
            input[3] = "*";
        }

        System.out.println("Enter 1 for none. Enter 2 for completed. Enter 0 for all.");
        userInput = in.nextLine();
        if (userInput.equals("1")) {
            input[4] = "none";
        } else if (userInput.equals("2")) {
            input[4] = "completed";
        } else {
            input[4] = "*";
        }

        System.out.println("Enter math score. Must be a minimum of 0: ");
        userInput = in.nextLine();
        input[5] = userInput;

        System.out.println("Enter reading score. Must be a minimum of 0: ");
        userInput = in.nextLine();
        input[6] = userInput;

        System.out.println("Enter writing score. Must be a minimum of 0: ");
        userInput = in.nextLine();
        input[7] = userInput;
        System.out.println(Arrays.toString(input));
        return input;
    }

    public static ArrayList<Student> csvToArray() {

        String csvFileToRead = "csvFiles/StudentPerformance.csv";
        BufferedReader br = null;

        String splitBy = ",";

        ArrayList<Student> studentList = new ArrayList<Student>(1000);
        try {
            //Reading the csv file
            br = new BufferedReader(new FileReader("csvFiles/SP.csv"));

            //Create List for holding Employee objects


            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while ((line = br.readLine()) != null) {
                String[] studentDetails = line.split(splitBy);

                if (studentDetails.length > 0) {
                    //Save the employee details in Employee object
                    Student s = new Student(studentDetails[1],
                            studentDetails[2], studentDetails[3],
                            studentDetails[4], studentDetails[5],
                            Float.parseFloat(studentDetails[6]),
                            Float.parseFloat(studentDetails[7]),
                            Float.parseFloat(studentDetails[8]));

                    studentList.add(s);
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return studentList;
    }


    public static void print() {


        System.out.println(" .//oo+/.                          \r\n" +
                "                     .:/+o+/osso/+o+/:.                     \r\n" +
                "                   +++/+ossyyo++syso+/+++                   \r\n" +
                "                   ./yyyyyo+:---:oyyyys/.                   \r\n" +
                "                    -yyyyhsoo+::++yyyyy-                    \r\n" +
                "                    `yyyyy/+ossso/yysyy.                    \r\n" +
                "                    -sssssyo+::+oysssss-                    \r\n" +
                "                    `yyyo/:/syys/:/oyyy`                    \r\n" +
                "                 `-//+/:+syysyyyyys+:/+//-`                 \r\n" +
                "           `.-//////+syyyyyyyyyyyyyyyyso//////-.`           \r\n" +
                "   ...:::////::+osyysssooooooooooooossssyyso+/:////:::...   \r\n" +
                "+////:://+ossyyysyyo:oooo++ssoo+ss+os/:+yyyyyyyssso//://///+\r\n" +
                ".---yyyyyyyyyyyyyyys+ooosooooossosooso+syyyyyyyyyyyyyyyy---`\r\n" +
                "    osysyyyssssyyyyso+//:::://:/::://+osyyyysooossyyyyys    \r\n" +
                "    :yyyyo:-+:-:oyyoooosssssosossssso++oyys/-.:/.:oyyyy/    \r\n" +
                "    .yyy+-../:..-oyyys:-.``sosos....-ssyyy/.../:``-oyyy.    \r\n" +
                "     syy/.../:...+yyys.``..osyos.``..ssyys/..`::``.oyyy     \r\n" +
                "     +yy+/:://:::+yyys//+++ssyos+++//ssyss/-:://::/oyy+     \r\n" +
                "     :yy+...//.../hyyssssssssyssssssssyyys:.../:..:oyy/     \r\n" +
                "     .yyo...:/.../yyyssssss/sys/ssssssyyyo:...+-..:oyy-     \r\n" +
                "     `yyo-..:/---+hyyssssssssyssssssssyyy+/---+:--/syy`     \r\n" +
                "     `ys/::::-----/yyssssssssyssssssssyyy//:::----:/yy`     \r\n" +
                "      ss+oossyyyyyyyhssssssssysssssssshyyyyyyyhhyyysys      \r\n" +
                "      oyyyyyysysyyysyyyysssssysssssyyshsysyysyysyyyyys      \r\n" +
                "     `oyyyhhhyyyyhyyhho+o+o+/o+++o+o/shhyhhhhyyhhhyyys.     \r\n" +
                "    shhhhhyyhhhhhyyh+++////////////////shyyhhhhhyhyhhhhs`   \r\n" +
                "   `yyyyyyyyyyyyyyyy:::::::::::::::::::+yyyyyyyyhyyyyyyys.  \r\n" +
                "  `syyyyyyhyyyyyyys-```````````````````./yyyyyyyyhyyyyyyys. \r\n" +
                "  -yyyyyyyhyyyyyyy:-::::::::::::::::::::-/yyyyyyyhyyyyyyyy: \r\n" +
                "   .::::/:://::://:::::::::::::::::::::::/:::-:-----:----` ");


    }

}
