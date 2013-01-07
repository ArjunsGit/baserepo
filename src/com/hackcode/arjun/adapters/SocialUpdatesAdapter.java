package com.hackcode.arjun.adapters;

import com.hackcode.arjun.R;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SocialUpdatesAdapter extends PagerAdapter {
	
	private final int numOfPages = 5;

	@Override
	public int getCount() {
		return 3;
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return ( arg0 == ((View) arg1));
	}
	
	
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
		LayoutInflater inflater = 
			(LayoutInflater) container
			         .getContext().
			         getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		int resId = 0;
		
		switch(position) {
		case 0:
			resId = R.layout.first;
			break;
		case 1:
			resId = R.layout.second;
			break;
		case 2:
			resId = R.layout.third;
			break;
			
		}
		
		View v = inflater.inflate(resId, null);
		
		((ViewPager) container).addView(v);
		
		return v;
    }
    
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    	
    	container.removeView((View) object);
    }

}
