package com.example.personalmarkbook.ui.main;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.personalmarkbook.R;

public class TabsPagerAdapter extends FragmentPagerAdapter {

  @StringRes
  private static final int[] TAB_TITLES =
      new int[] { R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3 };
  private final Context mContext;

  public TabsPagerAdapter(Context context, FragmentManager fm) {
    super(fm);
    mContext = context;
  }

  @Override
  public Fragment getItem(int position) {
    switch (position) {
      case 0:
        return UrnikFragment.newInstance();
      case 1:
        return RedovalnicaFragment.newInstance();
      case 2:
        return PlannerFragment.newInstance();
      default:
        return null;
    }
  }

  @Nullable
  @Override
  public CharSequence getPageTitle(int position) {
    return mContext.getResources().getString(TAB_TITLES[position]);
  }

  @Override
  public int getCount() {
    // Show 3 total pages.
    return 3;
  }
}