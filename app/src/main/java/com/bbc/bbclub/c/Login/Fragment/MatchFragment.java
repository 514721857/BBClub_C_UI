package com.bbc.bbclub.c.Login.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bbc.bbclub.c.Adapter.MatchAdapter;
import com.bbc.bbclub.c.Adapter.VideoAdapter;
import com.bbc.bbclub.c.Login.Match.ApplyActivity;
import com.bbc.bbclub.c.Login.Match.MyMatchActivity;
import com.bbc.bbclub.c.Login.Match.OtherMatchActivity;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.RvLayoutManager;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class MatchFragment extends BaseFragment implements BaseQuickAdapter.OnItemChildClickListener,BaseQuickAdapter.OnItemClickListener{
    @BindView(R.id.match_list)
    RecyclerView match_list;

    MatchAdapter matchAdapter;
    @Override
    protected int setLayoutId() {
        return R.layout.fragment_match;
    }

    @Override
    protected void initView() {
        super.initView();



        match_list.setLayoutManager(new RvLayoutManager(getActivity()));
        match_list.setLayoutFrozen(false);
        matchAdapter = new MatchAdapter();
        match_list.setAdapter(matchAdapter);
        matchAdapter.setOnItemChildClickListener(this);
    }
    @OnClick({R.id.other_match,R.id.my_match})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.other_match:
               StartActivityUtil.skipAnotherActivity(getActivity(), OtherMatchActivity.class);
                break;
            case R.id.my_match:
                StartActivityUtil.skipAnotherActivity(getActivity(), MyMatchActivity.class);
                break;

        }
    }
    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
    /*    String content = null;
        Status status = (Status) adapter.getItem(position);*/
        switch (view.getId()) {
            case R.id.btn_once_join:
              StartActivityUtil.skipAnotherActivity(getActivity(), ApplyActivity.class);
                break;
        }
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

    }
}
