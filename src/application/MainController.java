package application;
import javafx.scene.media.MediaView;
import javafx.fxml.FXML;
import javafx.scene.media.*;
import javafx.stage.FileChooser;
import java.io.File;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
public class MainController {
			@FXML
			MenuItem selectVideo;
			@FXML
			MediaView videoViewer;
		
	  	String source;
	   
	     
	     public void openVideo(ActionEvent event) {
	    	 FileChooser pickVideo=new FileChooser();
	    	 pickVideo.getExtensionFilters().add(new FileChooser.ExtensionFilter("MP4 or Mkv Files", "*.mp4",".mkv",".mov"));
	    	 File selectedVideo= pickVideo.showOpenDialog(null);
	    	 if (selectedVideo != null) {
	             source = selectedVideo.toURI().toString();
	             Media video = new Media(source);
	             MediaPlayer videoPlayer = new MediaPlayer(video);
	             videoPlayer.setAutoPlay(true);
	             
	             videoViewer.setMediaPlayer(videoPlayer);
	         } else {
	             System.out.println("No video selected.");
	         }
	     }
	     @FXML
	     public void playVideo() {
	    	 System.out.println("Video Will Play");
	     }
	     
	
}
