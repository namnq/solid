package vn.com.ntq_solution.example.solid;

import java.util.List;

public class StudentService {
    public boolean Add(String emailAddress, String universityId) {
        if (isNullOrEmpty(emailAddress))// input validation
        {
            return false;
        }
        StudentRepository studentRepository = new StudentRepository();
        if (studentRepository.exists(emailAddress)) {
            return false;
        }

        UniversityRepository universityRepository = new UniversityRepository();

        University university = universityRepository.GetById(universityId);

        Student student = new Student(emailAddress, universityId);

        if (university.getPkg() == Package.Standard) {
            student.setCurrentlyBorrowedEbooks(10);
        } else if (university.getPkg() == Package.Premium) {
            student.setCurrentlyBorrowedEbooks(10 * 2);
        }
        studentRepository.Add(student);

        return true;
    }

    private boolean isNullOrEmpty(String check) {
        return check == null || check.isEmpty();
    }

    public List<Student> GetStudentsByUniversity() {
        return null;
    }

    public List<Student> GetStudentsByCurrentlyBorrowedEbooks() {
        return null;
    }
}
