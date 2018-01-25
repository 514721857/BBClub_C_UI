package com.bbc.bbclub.c.Login;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.c.Login.Fragment.ClubFragment;
import com.bbc.bbclub.c.Login.Fragment.MatchFragment;
import com.bbc.bbclub.c.Login.Fragment.SignFragment;
import com.bbc.bbclub.c.Login.Index.PersonInfoActivity;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.UnLogin.HomeActivity;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    @BindView(R.id.main_location_text)
    TextView main_location_text;

    @BindView(R.id.sign_image)
    ImageView sign_image;

    @BindView(R.id.match_image)
    ImageView match_image;

    @BindView(R.id.club_image)
    ImageView club_image;

    @BindView(R.id.main_person)
    ImageView main_person;

    @BindView(R.id.main_title_bg)
    AutoLinearLayout autoRelativeLayout;

    long firstTime;
    private boolean iscycle;

    private SignFragment signFragment;
    private MatchFragment matchFragment;
    private ClubFragment clubFragment;

    private int chooseIndex = 0;//选择项
    private FragmentTransaction transaction;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initImmersionBar() {
        super.initImmersionBar();
    }

    @Override
    protected void initView() {
        super.initView();
        setTabSelection(chooseIndex);
    }

    @OnClick({R.id.main_location_text,R.id.main_person,R.id.club_image,R.id.match_image,R.id.sign_image})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_location_text:
                StartActivityUtil.skipAnotherActivity(this, HomeActivity.class);
                break;
            case R.id.main_person:
                StartActivityUtil.skipAnotherActivity(this, PersonInfoActivity.class);
                break;
            case R.id.club_image:
                chooseIndex = 2;
                setTabSelection(2);
//                autoRelativeLayout.setBackgroundResource(R.mipmap.club_title_bg);
                break;
            case R.id.match_image:
                chooseIndex = 1;
                setTabSelection(1);
                autoRelativeLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.match_bg));
                break;
            case R.id.sign_image:
                chooseIndex = 0;
                setTabSelection(0);
                autoRelativeLayout.setBackgroundResource(R.mipmap.main_s_m_bg);
                break;
        }
    }


    /**
     * 根据传入的index参数来设置选中的tab页。
     *
     * @param index
     *
     */
    private void setTabSelection(int index) {
        transaction=  getFragmentManager().beginTransaction();
        hideFragments(transaction);
        setImageText(index);
        switch (index) {
            case 0:
                if (signFragment == null) {
                    signFragment = new SignFragment();
                    transaction.add(R.id.content, signFragment);
                } else {
                    transaction.show(signFragment);
                }
                transaction.commit();
                break;
            case 1:
                if (matchFragment == null) {
                    matchFragment = new MatchFragment();
                    transaction.add(R.id.content, matchFragment);
                } else {
                    transaction.show(matchFragment);
                }
                transaction.commit();
                break;
            case 2:
                if (clubFragment == null) {
                    clubFragment = new ClubFragment();
                    transaction.add(R.id.content, clubFragment);
                } else {

                    transaction.show(clubFragment);
                }
                transaction.commit();
                break;
        }
    }
    /**
     * 当点击了tab时，改变控件的图片和文字颜色
     * @param index
     */
    private void setImageText(int index) {

        clearSelection();
        switch (index) {
            case 0://
                sign_image.setImageResource(R.mipmap.sign_ico_select);
                break;
            case 1:
                match_image.setImageResource(R.mipmap.match_ico_select);
                break;
            case 2:
                club_image.setImageResource(R.mipmap.club_ico_select);
                break;
        }
    }

    /**
     * 清除掉所有的选中状态。
     */
    private void clearSelection() {
        sign_image.setImageResource(R.mipmap.sign_ico_no);
        match_image.setImageResource(R.mipmap.match_ico_no);
        club_image.setImageResource(R.mipmap.club_ico_no);
    }

    /**
     * 隐藏Fragment
     * @param transaction
     */
    private void hideFragments(FragmentTransaction transaction) {
        if (signFragment != null) {
            transaction.hide(signFragment);
        }
        if (matchFragment != null) {
            transaction.hide(matchFragment);
        }
        if (clubFragment != null) {
            transaction.hide(clubFragment);
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onRestoreInstanceState(savedInstanceState);
        iscycle = savedInstanceState.getBoolean("iscycle");
        chooseIndex = savedInstanceState.getInt("chooseIndex");
        setTabSelection(chooseIndex);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putBoolean("iscycle", true);
        outState.putInt("chooseIndex", chooseIndex);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (iscycle) {
            setImageText(chooseIndex);
        }
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            long secondTime = System.currentTimeMillis();
            if (secondTime - firstTime > 1000) {

                Toast.makeText(MainActivity.this,getString(R.string.app_back), Toast.LENGTH_SHORT).show();
                firstTime = secondTime;
            } else {
              finish();
            }
        }
        return true;
    }



}
