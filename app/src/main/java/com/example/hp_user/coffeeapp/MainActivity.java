package com.example.hp_user.coffeeapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer q=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View v)
    {
        q=q+1;
        TextView t1=(TextView)findViewById(R.id.quantity);
        t1.setText(""+q);
    }
    public void decrement(View v)
    {
        q=q-1;
        TextView t1=(TextView)findViewById(R.id.quantity);
        t1.setText(""+q);
    }
    public void order(View v)
    {
        Integer p=0;
        CheckBox c=(CheckBox)findViewById(R.id.c1);
        Boolean t=c.isChecked();
        if(t)
        {
            p=p+10;
        }
        CheckBox w=(CheckBox)findViewById(R.id.c2);
        Boolean w1=w.isChecked();
        if(w1)
        {
            p=p+20;
        }
        p=p+(q*50);

        EditText n=(EditText)findViewById(R.id.t1);
        String name=n.getText().toString();
        String m="price="+p+" quantity="+q+"name="+name;

        Intent i=new Intent(this,Main2Activity.class);
        i.putExtra("mesg",m);
        startActivity(i);

        //Intent intent = new Intent(Intent.ACTION_SENDTO);
        /*intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,
                getString(R.string.order_summary_email_subject, name));
        intent.putExtra(Intent.EXTRA_TEXT, message);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);*/

        //TextView s=(TextView)findViewById(R.id.sumary);
        //s.setText("price="+p+" quantity="+q+"name="+name);
        return ;
    }
}
