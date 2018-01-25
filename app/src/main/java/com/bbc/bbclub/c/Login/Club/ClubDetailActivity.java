package com.bbc.bbclub.c.Login.Club;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.c.Adapter.MoreVideoAdapter;
import com.bbc.bbclub.c.Adapter.VideoAdapter;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.RvGridLayoutManager;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;
import com.bbc.bbclub.c.bean.DataServer;
import com.chad.library.adapter.base.BaseQuickAdapter;

import butterknife.BindView;
import butterknife.OnClick;

public class ClubDetailActivity extends BaseActivity implements BaseQuickAdapter.OnItemClickListener{
    @BindView(R.id.top_view_title)
    TextView top_view_title;


    @BindView(R.id.club_more_list)
    RecyclerView club_more_list;

    VideoAdapter videoAdapter;
    @Override
    protected int setLayoutId() {
        return R.layout.activity_match_detail;
    }

    @Override
    protected void initView() {
        super.initView();
        top_view_title.setText("TNT健身中心");
        club_more_list.setLayoutManager(new RvGridLayoutManager(this, 2));
        club_more_list.setLayoutFrozen(false);
        videoAdapter = new VideoAdapter(DataServer.getSampleData(2));
        videoAdapter.setOnItemClickListener(this);
        club_more_list.setAdapter(videoAdapter);

    }
    @OnClick({R.id.club_more,R.id.top_view_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
               finish();
                break;
            case R.id.club_more:
                StartActivityUtil.skipAnotherActivity(this,ClubMoreVideoActivity.class);
                break;

        }
    }
    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

    }
}
