package vn.com.ntq_solution.example.solid;

public class Student {
    private String EmailAddress;
    private String UniversityId;
    private int MonthlyEbookAllowance;
    private int CurrentlyBorrowedEbooks;

    public Student(String emailAddress, String universityId) {
        super();
        EmailAddress = emailAddress;
        UniversityId = universityId;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getUniversityId() {
        return UniversityId;
    }

    public void setUniversityId(String universityId) {
        UniversityId = universityId;
    }

    public int getMonthlyEbookAllowance() {
        return MonthlyEbookAllowance;
    }

    public void setMonthlyEbookAllowance(int monthlyEbookAllowance) {
        MonthlyEbookAllowance = monthlyEbookAllowance;
    }

    public int getCurrentlyBorrowedEbooks() {
        return CurrentlyBorrowedEbooks;
    }

    public void setCurrentlyBorrowedEbooks(int currentlyBorrowedEbooks) {
        CurrentlyBorrowedEbooks = currentlyBorrowedEbooks;
    }

}
