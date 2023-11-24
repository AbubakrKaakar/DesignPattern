/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labwork;

/**
 *
 * @author SP20-BSE-072
 */
public class MKVPlayer implements AdvancedMediaPlayer{

//    @Override
//    public void playVlc(String fileName) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void playMp4(String fileName) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public void playMKV(String fileName) {
        System.out.println(fileName+" is being played.");
    }

//    @Override
//    public void playAVI(String fileName) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
