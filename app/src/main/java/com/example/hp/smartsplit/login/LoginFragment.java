package com.example.hp.smartsplit.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.smartsplit.R;

/**
 * Created by hp on 02-10-2017.
 */

public class LoginFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate( R.layout.fragment_login, container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }

    private void init(View view)
    {
        ViewPager viewPager = (ViewPager)view.findViewById(R.id.viewPager);
        viewPager.setAdapter(new LoginPagerAdapter(getFragmentManager(),new String[]{"SIGN-IN","SIGNUP"}));
    }
}
