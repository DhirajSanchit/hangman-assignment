package nl.hr.cmi.hangman;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HangmanActivity extends Activity {

	private static final String TAG = HangmanActivity.class.toString();

	private LinearLayout llLetters;
	private final String[] woorden = { "JAVA", "XML", "DEX", "APK","CLASS" };

	private int aantalKeerGeraden = 0;
	private int aantalKeerMis = 0;
	private int currentWordIndex = 0;

	private ImageView im_galg;
	private String geradenLetters = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hangman);

	}

	/* Called on button click */
	private void checkLetter(String s) {
		
	}
	
	/* pass argument number 0-10 to load picture */ 
	private void populatePicture(int number){
		im_galg.setImageResource(getResources().getIdentifier("drawable/hang"+number, null, getPackageName()));
	}
}
