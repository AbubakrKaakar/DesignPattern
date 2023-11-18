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
public class VirtualProxyImage implements Image {
    private RealImage realImage;
   private String fileName;

   public VirtualProxyImage(String fileName){
      this.fileName = fileName;
   }

   @Override
  public void display() {
        if (realImage == null) {
            // Check if the image type is supported
            if (isImageTypeSupported(fileName)) {
                realImage = new RealImage(fileName);
            } else {
                // Display a fake representation for unsupported image types
                System.out.println("Displaying fake representation for unsupported image type: " + fileName);
                return;
            }
        }
        realImage.display();
    }

    private boolean isImageTypeSupported(String fileName) {
        // Implement logic to check if the image type is supported
        // For simplicity, let's assume only JPG and PNG are supported
        return fileName.toLowerCase().endsWith(".jpg") || fileName.toLowerCase().endsWith(".png");
    }
}
