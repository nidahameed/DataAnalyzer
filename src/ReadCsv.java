import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadCsv {

    public void readCsv() {
        String csvFileToRead = "csvFiles/SP.csv";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFileToRead));
            while ((line = br.readLine()) != null) {

                String[] student = line.split(splitBy);
                System.out.println("student [gender = " + student[0] + " , race = "
                        + student[1] + " , parental level of education = " + student[2] + " , lunch = "
                        + student[3] + " , test preparation course = " + student[4] + " , math score = "
                        + student[5] + " , reading score = " + student[6] + " , writing score = " + student[7] + "]");

            }

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

        System.out.println("Done with reading CSV");
    }
}
