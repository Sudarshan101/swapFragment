package waytofeed.wapptech.com.demo15;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);

        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        Fragment fm= new page2();
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.frag1,fm);
        ft.commit();
    }
}
