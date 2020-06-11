package vn.plusplus.sms.service;

import vn.plusplus.sms.interfaces.SMSInterface;
import vn.plusplus.sms.model.Student;
import vn.plusplus.sms.model.StudentScore;

import java.util.List;

public class SMSService implements SMSInterface {
    @Override
    public void saveStudentToDatabase(Student student) {

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
