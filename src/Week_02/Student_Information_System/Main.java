package Week_02.Student_Information_System;

public class Main {
    public static void main(String[] args) {

        //here we should pre-define performance grades in Course which is bound to Student otherwise it returns an error
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course mat_performans = new Course("Mat Performans","Mat Performans","PRFM");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course fizik_performans = new Course("Fizik Performans","Fizik Performans","PRFM");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course kimya_performans = new Course("Kimya Performans","Kimya Performans","PRFM");


        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        //here attached performance grades to each student
        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik,kimya,mat_performans,fizik_performans,kimya_performans);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkPerformanceNote(50,50,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya,mat_performans,fizik_performans,kimya_performans);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkPerformanceNote(50,100,100);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya,mat_performans,fizik_performans,kimya_performans);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkPerformanceNote(80,100,90);
        s3.isPass();

    }
}
