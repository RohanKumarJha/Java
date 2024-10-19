public class Tester {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setStudentId(1);
        obj.setName("Rohan");
        obj.setQualifyingMarks(33);
        obj.setResidentialStatus('H');
        obj.setYearOfEngg(2021);

        System.out.println(obj.getStudentId()+" "+obj.getName()+" "+obj.getQualifyingExamMarks()+" "+obj.getResidentialStatus()+" "+obj.getYearOfEngg());
    }
}