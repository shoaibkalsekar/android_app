package in.genii.gamification;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class TasksFragment extends Fragment {
     
    public TasksFragment(){}
     
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_tasks, container, false);
          
        return rootView;
    }
}