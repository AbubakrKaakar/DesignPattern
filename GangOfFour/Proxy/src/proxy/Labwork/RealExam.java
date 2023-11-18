/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.Labwork;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author abuba
 */
class RealExam implements Exam {
    private Map<String, ExamResults> studentResults;
    
    public RealExam() {
        // Simulate loading exam data from a database or file
        studentResults = new HashMap<>();
        // Initialize the exam with some default results
        // For simplicity, we'll use only two questions
        studentResults.put("student1", new ExamResults("student1", "Answer1", "Answer2"));
        studentResults.put("student2", new ExamResults("student2", "Answer3", "Answer4"));
    }

    @Override
    public void load() {
        System.out.println("Loading exam...");
    }

    @Override
    public ExamResults getResultForStudent(String studentId) {
        return studentResults.get(studentId);
    }

    @Override
    public ExamResults getResultsForTeacher() {
        return new ExamResults(studentResults.values());
    }
}
