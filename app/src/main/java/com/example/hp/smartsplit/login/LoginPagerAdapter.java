package com.example.hp.smartsplit.login;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by hp on 02-10-2017.
 */

public class LoginPagerAdapter extends FragmentPagerAdapter
{
    private String[] pageTitles;

    public LoginPagerAdapter(FragmentManager fm, String[] pageTitles)
    {
        super(fm);
        this.pageTitles = pageTitles;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:return new SignInFragment();
            case 1:return new SignUpFragment();
        }
        return null;
    }

    @Override
    public int getCount()
    {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return pageTitles[position];
    }
}
