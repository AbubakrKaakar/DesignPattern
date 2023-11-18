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
class VirtualExamProxy implements Exam {
    private RealExam realExam;

    @Override
    public void load() {
        if (realExam == null) {
            realExam = new RealExam();
        }
        realExam.load();
    }

    @Override
    public ExamResults getResultForStudent(String studentId) {
        load();
        return realExam.getResultForStudent(studentId);
    }

    @Override
    public ExamResults getResultsForTeacher() {
        load();
        return realExam.getResultsForTeacher();
    }
}