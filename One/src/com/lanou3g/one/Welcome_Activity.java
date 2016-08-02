package com.lanou3g.one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Welcome_Activity extends Activity implements AnimationListener {
	private RelativeLayout layout;
	private Animation anim;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		layout = (RelativeLayout) this.findViewById(R.id.app_image);
		//anim = AnimationUtils.loadAnimation(this, R.anim.set_anim);
		//anim.setAnimationListener(Welcome_Activity.this);
		layout.startAnimation(anim);
	}
	
	public void onAnimationStart(Animation animation) {
	}
	
	@Override
	public void onAnimationEnd(Animation animation) {
		Toast.makeText(this, "动画结束", Toast.LENGTH_LONG).show();
		Intent intent = new Intent(this,MainActivity.class);
		startActivity(intent);
		finish();
	}
	
	@Override
	public void onAnimationRepeat(Animation animation) {
	}
}

