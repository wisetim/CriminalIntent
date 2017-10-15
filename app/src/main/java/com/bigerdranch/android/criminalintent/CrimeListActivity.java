package com.bigerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Tim on 2017/10/15.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
