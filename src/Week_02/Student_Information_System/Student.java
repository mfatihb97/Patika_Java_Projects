package Week_02.Student_Information_System;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course mat_performans;
    Course fizik;
    Course fizik_performans;
    Course kimya;
    Course kimya_performans;
    double  avarage;
    boolean isPass;




    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya,Course mat_performans,Course fizik_performans,Course kimya_performans) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.mat_performans = mat_performans;
        this.fizik_performans= fizik_performans;
        this.kimya_performans = kimya_performans;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }


        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }


        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }


    }

    // here created a new method to enter performance grades

    public void addBulkPerformanceNote(int mat_performans,int fizik_performans,int kimya_performans){
        if (mat_performans>=0 && mat_performans<=100){
            this.mat_performans.note=mat_performans;
        }
        if (fizik_performans>=0 && fizik_performans <= 100){
            this.fizik_performans.note=fizik_performans;
        }
        if (kimya_performans>=0 && kimya_performans<=100){
            this.kimya_performans.note=kimya_performans;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }


    //re-evaluated avarage grades of students accordingly with their performance grades
    public void calcAvarage() {
        this.avarage = (int) ((((this.fizik.note*0.8)+(fizik_performans.note*0.2) + (this.kimya.note*0.8)+(kimya_performans.note*0.2) + (this.mat.note*0.8+mat_performans.note*0.2)) / 3));
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Performans Notu : "+this.mat_performans.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Performans Notu : "+this.fizik_performans.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Performans Notu : "+this.kimya_performans.note);

    }

}
