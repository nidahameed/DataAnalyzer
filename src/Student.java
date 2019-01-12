public class Student {
    private String gender;

    public Student() {


    }

    public Student(String gender, String race, String parentalEducation, String lunch, String testPreperationCourse, float mathScore, float writingScore, float readingScore) {
        this.gender = gender;
        this.race = race;
        this.parentalEducation = parentalEducation;
        this.lunch = lunch;
        this.testPreperationCourse = testPreperationCourse;
        this.mathScore = mathScore;
        this.writingScore = writingScore;
        this.readingScore = readingScore;

    }

    private String race;
    private String parentalEducation;
    private String lunch;
    private String testPreperationCourse;
    private float mathScore;
    private float writingScore;
    private float readingScore;
    private Integer IDnumber;


    public boolean getvalue(Integer i, String val) {
        String comp;
        Float f;
        Float fval;
        if (val.equals("*")) {
            return true;
        } else {
            if (i == 0) {
                comp = this.getgender();
                if (comp.equals(val)) {
                    return true;
                } else {
                    return false;
                }
            } else if (i == 1) {
                comp = this.getrace();
                if (comp.equals(val)) {
                    return true;
                } else {
                    return false;
                }
            } else if (i == 2) {
                comp = this.getparentalEducation();
                if (comp.equals(val)) {
                    return true;
                } else {
                    return false;
                }
            } else if (i == 3) {
                comp = this.getlunch();
                if (comp.equals(val)) {
                    return true;
                } else {
                    return false;
                }
            } else if (i == 4) {
                comp = this.gettestPreperationCourse();
                if (comp.equals(val)) {
                    return true;
                } else {
                    return false;
                }
            } else if (i == 5) {
                fval = Float.parseFloat(val);
                f = this.getmathScore();
                if (f >= fval) {
                    return true;
                } else {
                    return false;
                }
            } else if (i == 6) {
                fval = Float.parseFloat(val);
                f = this.getreadingScore();
                if (f >= fval) {
                    return true;
                } else {
                    return false;
                }
            } else if (i == 7) {
                fval = Float.parseFloat(val);
                f = this.getwritingScore();
                if (f >= fval) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

    }


    public Integer getIDnumber() {

        return IDnumber;
    }

    public void setIDnumber() {


        this.IDnumber = IDnumber;
    }

    public String getgender() {

        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getrace() {
        return race;
    }

    public void setrace(String race) {
        this.race = race;
    }

    public String getparentalEducation() {
        return parentalEducation;
    }

    public void setparentalEducation(String parentalEducation) {
        this.parentalEducation = parentalEducation;
    }

    public String getlunch() {
        return lunch;
    }

    public void setlunch(String lunch) {
        this.lunch = lunch;
    }

    public String gettestPreperationCourse() {
        return testPreperationCourse;
    }

    public void settestPreperationCourse(String testPreperationCourse) {
        this.testPreperationCourse = testPreperationCourse;
    }

    public float getmathScore() {

        return mathScore;
    }

    public void setmathScore(float mathScore) {

        this.mathScore = mathScore;
    }

    public float getreadingScore() {
        return readingScore;
    }

    public void setreadingScore(float readingScore) {

        this.readingScore = readingScore;
    }

    public float getwritingScore() {

        return writingScore;
    }

    public void setwritingScore(float writingScore) {
        this.writingScore = writingScore;
    }

    @Override
    public String toString() {
        return String.format("Gender: " + getgender() + ", Race: " + getrace() + ", Parental Education Level: " + getparentalEducation() + ", Lunch: " + getlunch() + ", Test Preparation Course: " + gettestPreperationCourse() + ", Math Score: " + getmathScore() + ", Reading Score: " + getreadingScore() + ", Writing Score: " + getwritingScore());
    }


}
