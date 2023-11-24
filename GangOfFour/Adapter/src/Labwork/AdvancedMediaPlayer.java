package Labwork;

import Example.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author SP20-BSE-072
 */
public interface AdvancedMediaPlayer{
    default public void playVlc(String fileName){
     };
    default public void playMp4(String fileName){};
    default public void playMKV(String fileName){};
    default public void playAVI(String fileName){};
}
