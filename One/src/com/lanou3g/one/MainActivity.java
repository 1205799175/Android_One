package com.lanou3g.one;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends FragmentActivity{
	
	private Button button_home, button_question, button_content, button_details, button_stow;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		addListener();
		FragmentManageMethod();
	}
	
	private void FragmentManageMethod() {
		//创建碎片管理者对象
		FragmentManager fm = getSupportFragmentManager();
		//创建业务对象
		FragmentTransaction ft = fm.beginTransaction();
		//添加Fragment对象
		//参数一代表呆添加的位置,参数二为添加的碎片对象
		ft.add(R.id.content1, new Fragment_One());
		button_home.setSelected(true);
		//提交业务
		ft.commit();
	}

	private class MYListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			FragmentManager fm = getSupportFragmentManager();
			FragmentTransaction ft = fm.beginTransaction();
			switch (v.getId()) {
			case R.id.button_home:
				button_home.setSelected(true);
				button_content.setSelected(false);
				button_question.setSelected(false);
				button_stow.setSelected(false);
				button_details.setSelected(false);
				ft.replace(R.id.content1, new Fragment_One());
				break;
			case R.id.button_content:
				button_home.setSelected(false);
				button_content.setSelected(true);
				button_question.setSelected(false);
				button_stow.setSelected(false);
				button_details.setSelected(false);
				ft.replace(R.id.content1, new Fragment_Two());
				break;
			case R.id.button_question:
				button_home.setSelected(false);
				button_content.setSelected(false);
				button_question.setSelected(true);
				button_stow.setSelected(false);
				button_details.setSelected(false);
				ft.replace(R.id.content1, new Fragment_Three());
				break;
			case R.id.button_stow:
				button_home.setSelected(false);
				button_content.setSelected(false);
				button_question.setSelected(false);
				button_stow.setSelected(true);
				button_details.setSelected(false);
				ft.replace(R.id.content1, new Fragment_Four());
				break;
			case R.id.button_details:
				button_home.setSelected(false);
				button_content.setSelected(false);
				button_question.setSelected(false);
				button_stow.setSelected(false);
				button_details.setSelected(true);
				ft.replace(R.id.content1, new Fragment_Five());
				break;
			default:
				break;
			}
			ft.commit();
		}
		
	}
	
	private void addListener() {
		// TODO Auto-generated method stub
		MYListener l = new MYListener();
		button_home.setOnClickListener(l);
		button_content.setOnClickListener(l);
		button_details.setOnClickListener(l);
		button_question.setOnClickListener(l);
		button_stow.setOnClickListener(l);
	}


	private void initView() {
		button_home = (Button) findViewById(R.id.button_home);
		button_content = (Button) findViewById(R.id.button_content);
		button_details = (Button) findViewById(R.id.button_details);
		button_question = (Button) findViewById(R.id.button_question);
		button_stow = (Button) findViewById(R.id.button_stow);
	}
}
