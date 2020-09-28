package com.example.kuccps.ADAPTERS;

import android.content.Context;

import com.example.kuccps.UI.EngineeringcourseFragment;
import com.example.kuccps.UI.SciencieCoursesFragment;
import com.example.kuccps.UI.ArtcourseFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public FragmentAdapter(@NonNull FragmentManager fm, Context myContext, int totalTabs) {
        super(fm);
        this.myContext = myContext;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ArtcourseFragment artcourseFragment = new ArtcourseFragment();
                return artcourseFragment;
            case 1:
                SciencieCoursesFragment coursesFragment= new SciencieCoursesFragment();
                return coursesFragment;
            case 2:
                EngineeringcourseFragment extra = new EngineeringcourseFragment();
                return extra;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }

}
