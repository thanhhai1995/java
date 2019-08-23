package com.example.tablayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {
    private String listTitle[] = {"Fragment_One", "Fragment_Two", "Fragment_Three"};
    private FragmentOne mFragmentOne;
    private FragmentTwo mFragmentTwo;
    private FragmentThree mFragmentThree;
    public MyAdapter(FragmentManager fm) {
        super(fm);
        mFragmentOne = new FragmentOne();
        mFragmentTwo = new FragmentTwo();
        mFragmentThree = new FragmentThree();
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return mFragmentOne;
        }
        else if(position == 1){
            return  mFragmentTwo;
        }
        else{
            return mFragmentThree;
        }
    }

    @Override
    public int getCount() {
        return listTitle.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTitle[position];
    }
}
