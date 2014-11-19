package ctec.mlgrockpaperscissors.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class GameResultActivity extends Activity
{
	private Button playAgainButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_result);
		
		playAgainButton = (Button) findViewById(R.id.achievementButton);
		
		setupListners();
	}
	
	private void setupListners()
	{
		playAgainButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				Intent currentIntent = new Intent();
				setResult(RESULT_OK, currentIntent);
				finish();
			}
		});
	}
}
