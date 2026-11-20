import java.util.Comparator;
public class CourseUtility implements Comparator<Course> {
    String dir;
    public CourseUtility(String dir) {
        this.dir = dir;
    }
    @Override
    public int compare(Course c1,Course c2) {
        if(dir.equals("ASC")) {
            if(c1.fee>c2.fee)
                return 1;
            if(c1.fee<c2.fee)
                return -1;
        }
        else {
            if(c1.fee<c2.fee)
                return 1;
            if(c1.fee>c2.fee)
                return -1;
        }
        return 0;
    }
}