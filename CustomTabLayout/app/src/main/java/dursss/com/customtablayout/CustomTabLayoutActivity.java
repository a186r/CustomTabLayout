package dursss.com.customtablayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;


/**
 * Created by dursss on 2017/3/21.
 */

public class CustomTabLayoutActivity extends Activity {

    private CustomTabLayout customtablayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customtablayout);
        customtablayout = (CustomTabLayout) findViewById(R.id.customtablayout);
        viewPager = (ViewPager) findViewById(R.id.customtablayout);
        TabFragmentAdapter homePagerAdapter = new TabFragmentAdapter(getFragmentManager());//V4包？
        homePagerAdapter.addTab(new FirstFragment(), "短信登录");
        homePagerAdapter.addTab(new SecondFragment(), "账号密码登录");

        viewPager.setAdapter(homePagerAdapter);
        customtablayout.setTabTitleTextSize(14);//标题字体大小
        customtablayout.setTextHorizontalPadding(25);
        customtablayout.setTextVerticalPadding(25);
        customtablayout.setTabStripWidth(40);//滑动条宽度
        customtablayout.setDistributeEvenly(true); //均匀平铺选项卡
        customtablayout.setViewPager(viewPager);//最后调用此方法
    }
}
