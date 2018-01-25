package com.bbc.bbclub.c.Login.Index;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.c.Adapter.MedalDetailAdapter;
import com.bbc.bbclub.c.Adapter.SignRecordAdapter;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MedalDetailActivity extends BaseActivity {

    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @BindView(R.id.medail_list)
    RecyclerView medail_list;

    private MedalDetailAdapter medalDetailAdapter;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_medal_detail;
    }
    @Override
    protected void initView() {
        top_view_title.setText(getString(R.string.medail_detail));
        medail_list.setLayoutManager(new LinearLayoutManager(this));
        medalDetailAdapter = new MedalDetailAdapter();
        medail_list.setAdapter(medalDetailAdapter);
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
