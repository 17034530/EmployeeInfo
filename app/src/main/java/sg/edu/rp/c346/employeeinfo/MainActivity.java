package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvemployee;
    ArrayList<employee> employeeArrayList;
    CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvemployee = findViewById(R.id.lvEmployee);

        employeeArrayList = new ArrayList<>();
        employee info1 = new employee("John","Software Technical Leader",3400.0);
        employee info2 = new employee("May","programmer",2200.0);
        employeeArrayList.add(info1);
        employeeArrayList.add(info2);

        customAdapter = new CustomAdapter(this,R.layout.employee2_item,employeeArrayList);
        lvemployee.setAdapter(customAdapter);
    }
}
