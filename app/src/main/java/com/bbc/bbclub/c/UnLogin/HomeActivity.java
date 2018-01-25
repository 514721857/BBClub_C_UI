package com.bbc.bbclub.c.UnLogin;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.c.Adapter.VideoAdapter;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;
import com.bbc.bbclub.c.bean.DataServer;

import butterknife.BindView;
import butterknife.OnClick;

/**
 *
 */
public class HomeActivity extends BaseActivity {
    @BindView(R.id.video_edit_list)
    RecyclerView video_rv_list;

    @BindView(R.id.top_view_left)
    TextView top_view_left;

    @BindView(R.id.near_club)
    TextView home_club;


    @BindView(R.id.home_join)
    TextView home_join;


    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.home_more)
    ImageView home_more;



    VideoAdapter videoAdapter;


    @Override
    protected void initImmersionBar() {
        super.initImmersionBar();

    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView() {
        top_view_back.setVisibility(View.GONE);
        top_view_left.setVisibility(View.VISIBLE);
        video_rv_list.setLayoutManager(new GridLayoutManager(this, 2));
        videoAdapter = new VideoAdapter(DataServer.getSampleData(2));
        video_rv_list.setAdapter(videoAdapter);
    }
    @OnClick({R.id.home_join,R.id.near_club,R.id.home_more})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.near_club:
                StartActivityUtil.skipAnotherActivity(this,NearClubActivity.class);
                break;
            case R.id.home_join:
                StartActivityUtil.skipAnotherActivity(this,LoginActivity.class);
                break;
            case R.id.home_more:
                StartActivityUtil.skipAnotherActivity(this,MoreVideoActivity.class);
                break;
        }
    }
}
