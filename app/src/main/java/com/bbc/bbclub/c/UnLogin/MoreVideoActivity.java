package com.bbc.bbclub.c.UnLogin;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.c.Adapter.MoreVideoAdapter;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.base.BaseActivity;
import com.bbc.bbclub.c.bean.DataServer;

import butterknife.BindView;
import butterknife.OnClick;

public class MoreVideoActivity extends BaseActivity {

    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @BindView(R.id.video_morevideo_list)
    RecyclerView video_morevideo_list;

    private MoreVideoAdapter moreVideoAdapter;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_more_video;
    }
    @Override
    protected void initView() {
        top_view_title.setText(getString(R.string.video_list));
        video_morevideo_list.setLayoutManager(new GridLayoutManager(this,2));
        moreVideoAdapter = new MoreVideoAdapter(DataServer.getSampleData(4));
        video_morevideo_list.setAdapter(moreVideoAdapter);
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
