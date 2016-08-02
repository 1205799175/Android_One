package com.lanou3g.one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity implements OnClickListener{

	private Button btn;
	private final String APPTAG = "One";
	private final String TAG = "MainActivity";
	private EditText edit_login_username;
	private EditText edit_login_password;
	private TextView text_view;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		Log.d(APPTAG, TAG + ".onCreate");
		//控件绑定 登录界面
		initView();
		//为视图控件添加监听事件----方式一
		addTarget();
		
		//登录按钮  吐司
		btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(LoginActivity.this, MainActivity.class);
				startActivity(intent);
			}
		});	
	}
	//接口方法  点击事件
	private void addTarget() {
		// TODO Auto-generated method stub
		text_view.setOnClickListener(this);
	}
	//控件初始化,绑定
	private void initView() {
		edit_login_username = (EditText) findViewById(R.id.edit_login_username);
		edit_login_password = (EditText) findViewById(R.id.edit_login_password);
		text_view = (TextView) findViewById(R.id.text_view);
	}

	//为了获得后面传回来的值,复写此方法
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//		 TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode == 200) {
//			获得意图对象的值
			String str1 = data.getStringExtra("返回key1");
			String str2 = data.getStringExtra("返回key2");
//			将数值显示在框中
			edit_login_username.setText(str1);
			edit_login_password.setText(str2);
		}	
	}
	
	//新用户注册   注释掉的为从登录界面向注册界面返回的值
//	public void btuonClick(View v) {
//		//获得输入框中的文本
//		String str1 = edit_login_username.getText().toString();
//		String str2 = edit_login_password.getText().toString();
//		//创建意图对象
//		Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//		//将需要传递的数放入到意图对象中
//		intent.putExtra("key1", str1);
//		intent.putExtra("key2", str2);
//		//根据意图对象启动Activity
//		startActivityForResult(intent, 100);
//	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//获得输入框中的文本
		String str1 = edit_login_username.getText().toString();
		String str2 = edit_login_password.getText().toString();
		//创建意图对象
		Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
		//将需要传递的数放入到意图对象中
		intent.putExtra("key1", str1);
		intent.putExtra("key2", str2);
		//根据意图对象启动Activity
		startActivityForResult(intent, 100);
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d(APPTAG, TAG + ".onStart");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d(APPTAG, TAG + ".onResume");
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d(APPTAG, TAG + ".onPause");
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d(APPTAG, TAG + ".onStop");
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d(APPTAG, TAG + ".onRestart");
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d(APPTAG, TAG + ".onDestroy");
	}
	
	@Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
		super.onNewIntent(intent);
	}

	
}
