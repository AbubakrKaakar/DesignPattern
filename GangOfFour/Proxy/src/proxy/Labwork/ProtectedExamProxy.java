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
class ProtectedExamProxy implements Exam {
    private Exam exam;
    private boolean isTeacher;

    public ProtectedExamProxy(boolean isTeacher) {
        this.isTeacher = isTeacher;
        exam = new VirtualExamProxy();
    }

    @Override
    public void load() {
        exam.load();
    }

    @Override
    public ExamResults getResultForStudent(String studentId) {
        load();
        if (isTeacher) {
            return exam.getResultForStudent(studentId);
        } else {
            // For students, only their own results are visible
            return new SmartExamProxy(studentId).getResultForStudent(studentId);
        }
    }

    @Override
    public ExamResults getResultsForTeacher() {
        load();
        return exam.getResultsForTeacher();
    }
}
