package com.okasha.memories;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import java.util.UUID;

public class MemoryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment  getFragment() {
        UUID memoryID =(UUID) getIntent().getSerializableExtra(MemoryFragment.EXTRA_CRIME_ID);

        return MemoryFragment.newInstance(memoryID);

    }


}
