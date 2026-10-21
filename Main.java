public class Main {
    public static void main(String[] args) {

        Course course = new Course();
        course.setTitle("Pemrograman Berorientasi Objek");

        Student student = new Student();
        student.setName("Andi");

        CourseRecord record = new CourseRecord();
        record.setStudent(student);

        Assignment assignment1 = new Assignment();
        assignment1.setMark(85);

        Assignment assignment2 = new Assignment();
        assignment2.setMark(90);

        record.addAssignment(assignment1);
        record.addAssignment(assignment2);

        course.addCourseRecord(record);

        System.out.println("Nama Mata Kuliah: " + course.getTitle());
        System.out.println("Nama Mahasiswa: "
                + record.getStudent().getName());

        try {
            System.out.println("Nilai Tugas 1: "
                    + assignment1.getMark());

            System.out.println("Nilai Tugas 2: "
                    + assignment2.getMark());

        } catch (NotYetSetException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
