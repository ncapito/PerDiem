package com.smellydog.android.perdiem.activities;

import com.smellydog.android.perdiem.R;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.view.animation.Animation.AnimationListener;
import android.widget.TableRow;
import android.widget.TextView;

public class Welcome extends BaseActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
	}

	public void animate() {
		Log.i(DEBUG_TAG, "animate() Called");
		
		TextView bottomText = (TextView) findViewById(R.id.bottomTV);
		Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
		bottomText.startAnimation(fadeIn);

		fadeIn.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				//Once our timeout hits/animation ends lets start the menu activity
				startActivity(new Intent(Welcome.this, MainMenuActivity.class));
				Welcome.this.finish();
			}

			public void onAnimationRepeat(Animation animation) {
			}

			public void onAnimationStart(Animation animation) {
			}
		});
		
        Animation spinin = AnimationUtils.loadAnimation(this, R.anim.spin);
        LayoutAnimationController controller = new LayoutAnimationController(spinin);

        TableRow logoRow = (TableRow) findViewById(R.id.logoRow);
        logoRow.setLayoutAnimation(controller);
        
        
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onResume() {
		animate();
		super.onResume();
	}

}
