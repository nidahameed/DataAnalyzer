import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Processor {
    HashMap<Integer, Student> data;
    ArrayList<Student> listof;

    public Processor(HashMap<Integer, Student> Database, List<Student> studentList) {

        this.data = Database;
        this.listof = (ArrayList<Student>) studentList;


    }

    public ArrayList<Student> process(String query) {

        String[] quests = this.parseInput(query);

        ArrayList<Student> result = listof;
        System.out.println("Quests 0" + quests[0]);

        System.err.println("the length of quests is: " + quests.length);

        for (int i = 0; i < quests.length; i++) {

            /// 8 parameters in quests

            for (int j = 0; j < result.size(); j++) {
                // total of 1000 students in the list
                if (!result.get(j).getvalue(i, quests[i])) {

                    System.err.println("Doesn't Match");
                    result.remove(j);

                } else {
                    System.err.println("There was a match.");
                }
            }


        }


        return result;
    }

    public String[] parseInput(String query) {

        return query.split("\\.");


    }
}
