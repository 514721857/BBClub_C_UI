package com.bbc.bbclub.c.Login.Match;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bbc.bbclub.c.Adapter.MatchAdapter;
import com.bbc.bbclub.c.Adapter.OtherMatchAdapter;
import com.bbc.bbclub.c.Login.MainActivity;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;
import com.chad.library.adapter.base.BaseQuickAdapter;

import butterknife.BindView;
import butterknife.OnClick;

public class OtherMatchActivity extends BaseActivity implements BaseQuickAdapter.OnItemChildClickListener{
    @BindView(R.id.othermatch_list)
    RecyclerView othermatch_list;
    OtherMatchAdapter otherMatchAdapter;

    @BindView(R.id.top_view_title)
    TextView top_view_title;
    @Override
    protected int setLayoutId() {
        return R.layout.activity_other_match;
    }

    @Override
    protected void initView() {
        super.initView();
        top_view_title.setText(getString(R.string.other_match));
        othermatch_list.setLayoutManager(new LinearLayoutManager(this));
        otherMatchAdapter = new OtherMatchAdapter();
        othermatch_list.setAdapter(otherMatchAdapter);
        otherMatchAdapter.setOnItemChildClickListener(this);

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
            case R.id.btn_once_join:
                StartActivityUtil.skipAnotherActivity(this, ApplyActivity.class);
                break;
        }
    }
}
