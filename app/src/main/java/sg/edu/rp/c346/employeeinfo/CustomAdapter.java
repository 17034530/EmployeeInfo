package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<employee> employees;
    private double salary;

    public CustomAdapter(@NonNull Context context, int resource ,
                         @NonNull ArrayList<employee> objects) {
        super(context, resource,objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.employees = objects;
    }
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvSalary = rowView.findViewById(R.id.tvSalary);
        employee currentItem = employees.get(position);
        tvName.setText(currentItem.getName());
        tvTitle.setText(currentItem.getTitle());
        tvSalary.setText(currentItem.getSalary()+"");

        return rowView;

    }

}

