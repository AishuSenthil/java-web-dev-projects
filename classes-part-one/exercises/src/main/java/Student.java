public class Student {

        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = "Aishwarya Senthilkumar";
                this.numberOfCredits = 1;
                this.gpa = 4.0;
        }


        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

        public String getName(){
                return name;
        }
        public void setName(){
                this.name = name;
        }
        public int getStudentId(){
                return studentId;
        }
        public void setStudentId(){
                this.studentId = studentId;
        }
        public  int getNumberOfCredits(){
                return numberOfCredits;
        }
        public void setNumberOfCredits(){
                this.numberOfCredits = numberOfCredits;
        }
        public double getGpa(){
                return gpa;
        }
        public void setGpa(){
                this.gpa = gpa;
        }
}
