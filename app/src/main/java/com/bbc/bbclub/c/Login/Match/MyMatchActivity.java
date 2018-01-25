package com.bbc.bbclub.c.Login.Match;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bbc.bbclub.c.Adapter.MyMatchAdapter;
import com.bbc.bbclub.c.Adapter.OtherMatchAdapter;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;
import com.chad.library.adapter.base.BaseQuickAdapter;

import butterknife.BindView;
import butterknife.OnClick;

public class MyMatchActivity extends BaseActivity implements BaseQuickAdapter.OnItemChildClickListener,BaseQuickAdapter.OnItemClickListener{
    @BindView(R.id.mymatch_list)
    RecyclerView mymatch_list;
    MyMatchAdapter myMatchAdapter;

    @BindView(R.id.top_view_title)
    TextView top_view_title;
    @Override
    protected int setLayoutId() {
        return R.layout.activity_my_match;
    }

    @Override
    protected void initView() {
        super.initView();
        top_view_title.setText(getString(R.string.match_mine));
        mymatch_list.setLayoutManager(new LinearLayoutManager(this));
        myMatchAdapter = new MyMatchAdapter();
        mymatch_list.setAdapter(myMatchAdapter);
        myMatchAdapter.setOnItemChildClickListener(this);
        myMatchAdapter.setOnItemClickListener(this);
    }
    @OnClick({R.id.top_view_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;

        }
    }

    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
        switch (view.getId()) {
            case R.id.find_info:
                 StartActivityUtil.skipAnotherActivity(this,MatchDetailMyActivity.class);
                break;
        }
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        StartActivityUtil.skipAnotherActivity(this,WasMyMatchActivity.class);
    }
}
