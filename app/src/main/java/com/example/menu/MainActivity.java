package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.app.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);
        Button button1=(Button)findViewById(R.id.button2);
        //登录按钮的对话框
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view){
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater=getLayoutInflater();//实列化
                final View v=inflater.inflate(R.layout.login_dialog,null);
                builder.setView(v)
                        .setTitle("Login")
                        .setPositiveButton(getResources().getString(R.string.login), new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                EditText userId=v.findViewById(R.id.editText3);
                                EditText password=v.findViewById(R.id.editText4);
                                String UserId=userId.getText().toString();
                                String Password=password.getText().toString();
                                if(UserId.length()!=0&&Password.length()!=0){
                                    if(UserId.equals("abc")&&Password.equals("123")){
                                        Toast.makeText(MainActivity.this,"successful",Toast.LENGTH_LONG).show();
                                    }
                                    else
                                    {
                                        Toast.makeText(MainActivity.this,"failed",Toast.LENGTH_LONG).show();
                                    }

                                }
                            }
                            //获取资源中的资源
                        }).setNegativeButton(getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
                builder.show();
            }

        });
        ///登录按钮的对话框



        //help按钮的对话框
        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(final View view) {
                                           AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                                           LayoutInflater inflater1 = getLayoutInflater();//实列化
                                           final View v1 = inflater1.inflate(R.layout.help_dialog, null);
                                           builder1.setView(v1)
                                                   .setTitle("Help")
                                                   .setPositiveButton(getResources().getString(R.string.exit), new DialogInterface.OnClickListener() {
                                                       @Override
                                                       public void onClick(DialogInterface dialog, int id) {

                                                           Toast.makeText(MainActivity.this, "nihao", Toast.LENGTH_LONG).show();
                                                       }

                                                   });

                                           builder1.show();
                                       }
                                   });
        ///help按钮的对话框
    }
}
