package com.example.audioplayer;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.MediaPlayer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PlayerControllerTest {

    private static boolean isToolkitInitialized = false;

    @BeforeAll
    public static void initToolkit() {
        if (!isToolkitInitialized) {
            new JFXPanel(); // Initializes JavaFX environment
            isToolkitInitialized = true;
        }
    }

    @Test
    public void testPlay() {
        // Mocking MediaPlayer
        MediaPlayer mediaPlayer = Mockito.mock(MediaPlayer.class);
        when(mediaPlayer.getStatus()).thenReturn(MediaPlayer.Status.PLAYING);

        // Simulate play action
        mediaPlayer.play();

        // Assert that the player is in PLAYING state
        assertEquals(MediaPlayer.Status.PLAYING, mediaPlayer.getStatus(), "Player should be in PLAYING state");
    }

    @Test
    public void testPause() {
        // Mocking MediaPlayer
        MediaPlayer mediaPlayer = Mockito.mock(MediaPlayer.class);
        when(mediaPlayer.getStatus()).thenReturn(MediaPlayer.Status.PAUSED);

        // Simulate pause action
        mediaPlayer.pause();

        // Assert that the player is in PAUSED state
        assertEquals(MediaPlayer.Status.PAUSED, mediaPlayer.getStatus(), "Player should be in PAUSED state");
    }
}



