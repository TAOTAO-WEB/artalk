package cn.edu.hdu.artalk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cn.edu.hdu.artalk.adapter.ReadAdapter;

//AR界面_读取
public class ReadActivity extends AppCompatActivity {
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        viewPager = findViewById(R.id.readviewpager);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new ReadMessageFragment());
        fragments.add(new ReadCommentFragment());
        fragments.add(new ReadCommentFragment());
        ReadAdapter adapter = new ReadAdapter(fragments,getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
