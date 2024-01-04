public class course {
    String courseName; 
    String instructor;
    String numberStudents;

    course( String courseNames, String courseInstructor, String courseNumberStudents){
courseName = courseNames;
instructor = courseInstructor;
numberStudents = courseNumberStudents;}


public String getcourseName() {
    return courseName;
}

public void setcourseName(String newcourseName) {
    courseName = newcourseName;
}

public String getinstructor() {
    return instructor;
}

public void setinstructor(String newInstructor) {
    instructor= newInstructor;
}

public String getnumberStudents() {
    return numberStudents;
}

public void setnumberStudets(String newnumberStudents) {
    numberStudents = newnumberStudents;
}

public String toString() {
    return "courseName: " + courseName + ", instructor: " + instructor + ", numberStudents: " + numberStudents;
}


    
    public static void main(String[] args) throws Exception {
        
        course Biology= new course("Biology", "Noura", "25");
System.out.println(Biology);
    }


}
