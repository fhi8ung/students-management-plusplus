package vn.plusplus.sms.interfaces;

import vn.plusplus.sms.model.Student;
import vn.plusplus.sms.model.StudentScore;

import java.util.List;

public interface SMSInterface {

    void saveStudentToDatabase(Student student);

    List<StudentScore> readAllStudentScore();

    Student findStudentByIdName(String idName);


}
