package vn.edu.ntu.tuydung.dieptuydun_59130401_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity<privite> extends AppCompatActivity {
    EditText etdTen,edtNs,edtSt;

    RadioGroup rdg;
    RadioButton rdNam, rdNu;
    Button btXn;
    CheckBox cbXp,cbNN,cbCf,cbOn,cbNa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();

    }
    private void addView()
    {
        etdTen=findViewById(R.id.edtTen);
        edtNs=findViewById(R.id.edtNs);
        edtSt=findViewById(R.id.edtSt);
        rdg=findViewById(R.id.rdg);
        btXn=findViewById(R.id.btXn);
        rdNam=findViewById(R.id.rdNam);

        rdNu=findViewById(R.id.rdNu);
        cbXp=findViewById(R.id.cbXp);
        cbNN=findViewById(R.id.cbNn);
        cbCf=findViewById(R.id.cbCf);
        cbOn=findViewById(R.id.cbOn);
        cbNa=findViewById(R.id.cbNa);
    }
    private  void  addEvent()
    {
       btXn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Context context= getApplicationContext();
               String Text ="";
               Text+="Tên :"+etdTen.getText().toString();
               Text+="\nNgày sinh :"+edtNs.getText().toString();
               switch (rdg.getCheckedRadioButtonId())
               {
                   case R.id.rdNam : Text+="\nGiới Tính : Nam";break;
                   case R.id.rdNu : Text+="\nGiới Tính : Nữ";break;
               }
                Text+="\nSở Thích :";
               if(cbXp.isChecked()) Text+=cbXp.getText().toString()+";";
               if(cbNN.isChecked()) Text+=cbNN.getText().toString()+";";
               if(cbCf.isChecked()) Text+=cbCf.getText().toString()+";";
               if(cbOn.isChecked()) Text+=cbOn.getText().toString()+";";
               if(cbNa.isChecked()) Text+=cbNa.getText().toString()+";";
               Text+=edtSt.getText().toString();
               int duration = Toast.LENGTH_LONG;
               Toast toast =Toast.makeText(context,Text,duration);
               toast.show();




           }
       });

    }
    }
