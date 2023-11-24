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
public class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType){
   
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();			
         
      }else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }	
      else if (audioType.equalsIgnoreCase("mkv")){
         advancedMusicPlayer = new MKVPlayer();
      }	
      else if (audioType.equalsIgnoreCase("avi")){
         advancedMusicPlayer = new AVIPlayer();
      }	
   }

   @Override
   public void play(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
      else if(audioType.equalsIgnoreCase("mkv")){
         advancedMusicPlayer.playMKV(fileName);
      }
      else if(audioType.equalsIgnoreCase("avi")){
         advancedMusicPlayer.playAVI(fileName);
      }
   }
}