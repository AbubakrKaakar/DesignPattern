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
class SmartExamProxy implements Exam {
    private ExamResults studentResults;
    private VirtualExamProxy virtualProxy;

    public SmartExamProxy(String studentId) {
        studentResults = new ExamResults(studentId, "Not available", "Not available");
        virtualProxy = new VirtualExamProxy();
    }

    @Override
    public void load() {
        virtualProxy.load();
    }

    @Override
    public ExamResults getResultForStudent(String studentId) {
        if (studentResults.getStudentId().equals(studentId)) {
            studentResults = virtualProxy.getResultForStudent(studentId);
        }
        return studentResults;
    }

    @Override
    public ExamResults getResultsForTeacher() {
        return virtualProxy.getResultsForTeacher();
    }
}
