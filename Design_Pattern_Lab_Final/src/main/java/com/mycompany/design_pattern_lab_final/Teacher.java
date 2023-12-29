/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_pattern_lab_final;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wasiq
 */
public class Teacher {
    String name,Department;
    int Id;
    List<Subscriber> subscriber=new ArrayList<Subscriber>();
    ExamBuilder exam=new Exam();
    public void SetQuiz(){
        exam.AddMCQs();
    }
    public void SetSessional(){
    exam.AddMCQs();
    exam.AddTF();
    }
    public void SetFinal(){
    exam.AddMCQs();
    exam.AddShortQuestion();
    exam.AddTF();
    }
    public void Notify(){
        for(Subscriber s:subscriber){
        s.Update();
    }
    }
}
