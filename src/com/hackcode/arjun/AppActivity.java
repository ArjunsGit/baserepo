package com.hackcode.arjun;

import com.hackcode.arjun.adapters.SocialUpdatesAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class AppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.socialupdates);
        
        SocialUpdatesAdapter adapter = new SocialUpdatesAdapter();
        ViewPager socialUpdatesPager = 
        	(ViewPager) findViewById(R.id.abc);
        
        socialUpdatesPager.setAdapter(adapter);
        socialUpdatesPager.setCurrentItem(1);
    }
}