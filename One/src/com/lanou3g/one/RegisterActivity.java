package com.lanou3g.one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class RegisterActivity extends Activity implements OnClickListener{

	private final String APPTAG = "One";
	private final String TAG = "SecondActivity";
	private EditText edit_register_phone;
	private EditText edit_register_code;
	private Button btn_next;
	private ImageButton imagebutton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		Log.d(APPTAG, TAG + ".onCreate");
		//控件绑定  注册界面 
		initView();
		//为视图控件添加监听事件----方式一
		addTarget();
		//获得意图对象
		Intent intent = getIntent();
		//获得意图对象携带的值
		String str1 = intent.getStringExtra("key1");
		String str2 = intent.getStringExtra("key2");
		//将数据显示在框中
		edit_register_phone.setText(str1);
		edit_register_code.setText(str2);
	}
	private void addTarget() {
		// TODO Auto-generated method stub
		btn_next.setOnClickListener(this);
		imagebutton.setOnClickListener(this);
	}
	//初始化,绑定控件
	private void initView() {
		edit_register_phone = (EditText) findViewById(R.id.edit_register_phone);
		edit_register_code = (EditText) findViewById(R.id.edit_register_code);
		btn_next = (Button) findViewById(R.id.btn_next);
		imagebutton = (ImageButton) findViewById(R.id.imagebutton);
	}
	//点击"<"返回登录界面
//	public void imageClick(View v) {
//		Intent intent = new Intent(SecondActivity.this, MainActivity.class);
//		startActivity(intent);
//	}
	
	//点击下一步按钮返回到登陆界面,且将在注册界面输入的值返回
//	public void btn_nextClick(View v) {
//		//获得输入框中的内容
//				String str1 = edit_register_phone.getText().toString();
//				String str2 = edit_register_code.getText().toString();
//				//创建意图对象
//				Intent intent = new Intent();
//				//将数据添加到意图对象中
//				intent.putExtra("返回key1", str1);
//				intent.putExtra("返回key2", str2);
//				//将意图对象返回
//				setResult(200, intent);
//				//结束Activity
//				finish();	
//	}
	//接口形式  点击事件
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_next:
			//获得输入框中的内容
			String str1 = edit_register_phone.getText().toString();
			String str2 = edit_register_code.getText().toString();
			//创建意图对象
			Intent intent = new Intent();
			//将数据添加到意图对象中
			intent.putExtra("返回key1", str1);
			intent.putExtra("返回key2", str2);
			//将意图对象返回
			setResult(200, intent);
			//结束Activity
			finish();	
			break;
		case R.id.imagebutton:
			Intent intent2 = new Intent(RegisterActivity.this, LoginActivity.class);
			startActivityForResult(intent2, 100);
		default:
			break;
		}
		
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
		Log.d(APPTAG, TAG + ".onDestory");
	}
	
	@Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
		super.onNewIntent(intent);
	}
	
	
}

