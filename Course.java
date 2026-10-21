
import java.util.Vector;
import java.util.Enumeration;

public class Course {
    private String title;
    private Vector courseRecords;

    Course() {
        courseRecords = new Vector();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void addCourseRecord(CourseRecord cr) {
        courseRecords.addElement(cr);
    }

    public Enumeration getCourseRecords() {
        return courseRecords.elements();
    }

    public void printCourseStudents() {
        /* lengkapi: cetak seluruh mahasiswa yang mengambil course */
    }

    public void printBestStudent() {
        /* lengkapi: cetak mahasiswa dengan nilai rata-rata terbaik */
    }

    public void printFinalExamStudents() {
        /* lengkapi: cetak mahasiswa yang layak ujian akhir */
    }
}
