package vn.plusplus.sms.service;

import vn.plusplus.sms.interfaces.SMSInterface;
import vn.plusplus.sms.model.Student;
import vn.plusplus.sms.model.StudentScore;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class SMSService implements SMSInterface {
    @Override
    public void saveStudentToDatabase(Student student) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Program Files\\Java\\students-management-plusplus\\data\\student.txt");
            fileOutputStream.write(34);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
    }

    @Override
    public List<StudentScore> readAllStudentScore() {
        return null;
    }

    @Override
    public Student findStudentByIdName(String idName) {
        return null;
    }
}
