/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.Labwork;

/**
 *
 * @author abuba
 */
class ExamResults {
    private String studentId;
    private String answer1;
    private String answer2;

    public ExamResults(String studentId, String answer1, String answer2) {
        this.studentId = studentId;
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    // Constructor for teacher's view
    public ExamResults(Iterable<ExamResults> results) {
        // Initialize with a collection of results
        // This constructor is used when a teacher is viewing the results
    }

    public String getStudentId() {
        return studentId;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Answer1: " + answer1 + ", Answer2: " + answer2;
    }
}
