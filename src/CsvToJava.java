import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class CsvToJava {

    public Processor convertCsvToJava() {
        String csvFileToRead = "csvFiles/SP.csv";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";
        List<Student> studentList = new ArrayList<Student>();
        HashMap<Integer, Student> record = new HashMap<Integer, Student>();


        try {

            br = new BufferedReader(new FileReader(csvFileToRead));

            while ((line = br.readLine()) != null) {

                // split on comma(',')
                String[] students = line.split(splitBy);

                // create student object to store values
                Student studentObject = new Student();

                Integer studentNumber = Integer.parseInt(students[0]);
                // add values from csv to car object
                studentObject.setgender(students[1]);
                studentObject.setrace(students[2]);
                studentObject.setparentalEducation(students[3]);
                studentObject.setlunch(students[4]);
                studentObject.settestPreperationCourse(students[5]);
                System.out.println(students[6]);
                studentObject.setmathScore(Float.parseFloat(students[6]));
                studentObject.setreadingScore(Float.parseFloat(students[7]));
                studentObject.setwritingScore(Float.parseFloat(students[8]));

                // adding student objects to a list
                studentList.add(studentObject);
                record.put(studentNumber, studentObject);
            }
            // print values stored in studentList
            printStudentList(studentList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Processor P = new Processor(record, studentList);
        return P;
    }

    public void printStudentList(List<Student> studentListToPrint) {
        for (int i = 0; i < studentListToPrint.size(); i++) {
            System.out.println("STUDENTS [gender= " + studentListToPrint.get(i).getgender()
                    + " , race=" + studentListToPrint.get(i).getrace()
                    + " , parentalEducation=" + studentListToPrint.get(i).getparentalEducation()
                    + " , lunch=" + studentListToPrint.get(i).getlunch() + " , testPreperationCourse="
                    + studentListToPrint.get(i).gettestPreperationCourse() + " , mathScore=" + studentListToPrint.get(i).getmathScore() +
                    " , readingScore=" + studentListToPrint.get(i).getreadingScore() +
                    " , writingScore=" + studentListToPrint.get(i).getwritingScore() + "]");
        }

    }

}
