package com.example.audioplayer;

import javafx.application.Platform;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PlayerTest {

    private MediaPlayer player;

    @BeforeClass
    public static void setUpClass() {
        Platform.startup(() -> {
        });
    }

    @Before
    public void setUp() {
        Platform.runLater(() -> {
            String mediaFile = "file:///C:/Users/mikae/Dropbox/PC/Desktop/Skóladót/Tölvunarfræði%202/AudioPlayer-/AudioPlayer-/src/main/resources/css/media/Minning.mp3";
            Media media = new Media(mediaFile);
            player = new MediaPlayer(media);
        });
    }

    @Test
    public void testPlay() {
        try {
            player.play();
            assertEquals("Player should be in PLAYING state", MediaPlayer.Status.PLAYING, player.getStatus());
        } catch (NullPointerException e) {
            fail("NullPointerException" + e.getMessage());
        }
    }

    @Test
    public void testPause() {
        try {
            player.play();
            player.pause();
            assertEquals("Player should be in PAUSED state", MediaPlayer.Status.PAUSED, player.getStatus());
        } catch (NullPointerException e) {
            fail("NullPointerException" + e.getMessage());
        }
    }
}

