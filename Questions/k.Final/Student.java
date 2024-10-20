public class Student {
    final private int stipend=100;
    private int studentId;
    private int aggregateMarks;

    public double calculateTotalStipend() {
        if(aggregateMarks>=85 && aggregateMarks<90) {
            return stipend+10;
        } else if(aggregateMarks>=90 && aggregateMarks<95) {
            return stipend+15;
        } else if(aggregateMarks>=95 && aggregateMarks<100) {
            return stipend+20;
        }  return stipend+0;
    }

    public int getStipend() {
        return stipend;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAggregateMarks() {
        return aggregateMarks;
    }
    public void setAggregateMarks(int aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }
}