package com.bbc.bbclub.c.Login.Match;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.c.Adapter.BannerViewHolder;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.UnLogin.PayPage;
import com.bbc.bbclub.c.UnLogin.PaySuccessActivity;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;
import com.zhouwei.mzbanner.MZBannerView;
import com.zhouwei.mzbanner.holder.MZHolderCreator;
import com.zhouwei.mzbanner.holder.MZViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import cn.yhq.dialog.core.DialogBuilder;

public class ApplyActivity extends BaseActivity implements MZBannerView.BannerPageClickListener{
    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @BindView(R.id.apply_banner)
    MZBannerView bannerView;

    List<Integer> list;


    public static final int []RES = new int[]{R.mipmap.adv1,R.mipmap.adv2,R.mipmap.adv3};

    @Override
    protected int setLayoutId() {
        return R.layout.activity_apply;
    }

    @Override
    protected void initData() {
        super.initData();
        list=new ArrayList<>();
        for(int i=0;i<RES.length;i++){
            list.add(RES[i]);
        }
    }

    @Override
    protected void initView() {
        super.initView();
        top_view_title.setText("珠江赛区");
        bannerView.setBannerPageClickListener(this);
        bannerView.setPages(list, new MZHolderCreator() {
            @Override
            public MZViewHolder createViewHolder() {
                return new BannerViewHolder();
            }
        });

    }
    @OnClick({R.id.top_view_back,R.id.join_now})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.join_now:
                StartActivityUtil.skipAnotherActivity(this,ApplyInfoActivity.class);
                break;
            case R.id.top_view_back:
                finish();
                break;

        }
    }

    @Override
    public void onPageClick(View view, int i) {
        Toast.makeText(ApplyActivity.this,"click page:"+i,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        bannerView.pause();//暂停轮播
    }

    @Override
    public void onResume() {
        super.onResume();
        bannerView.start();//开始轮播
    }
}
