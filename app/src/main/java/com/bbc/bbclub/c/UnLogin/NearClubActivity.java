package com.bbc.bbclub.c.UnLogin;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.c.Adapter.NearClubAdapter;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class NearClubActivity extends BaseActivity{
    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @BindView(R.id.video_club_list)
    RecyclerView video_club_list;

    private NearClubAdapter nearClubAdapter;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_near_club;
    }

    @Override
    protected void initImmersionBar() {
        super.initImmersionBar();

    }

    @Override
    protected void initView() {
        top_view_title.setText("附近部落");
        video_club_list.setLayoutManager(new LinearLayoutManager(this));
        nearClubAdapter = new NearClubAdapter();
        video_club_list.setAdapter(nearClubAdapter);
    }
    @OnClick({R.id.top_view_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
        }
    }

}
