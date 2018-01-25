package com.bbc.bbclub.c.Login.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.c.Adapter.FragmentClubAdapter;
import com.bbc.bbclub.c.Adapter.NearClubAdapter;
import com.bbc.bbclub.c.Login.Club.ClubDetailActivity;
import com.bbc.bbclub.c.Login.Club.UpVideoActivity;
import com.bbc.bbclub.c.Login.Match.MatchDetailMyActivity;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;

import butterknife.BindView;
import butterknife.OnClick;

/**

 */
public class ClubFragment extends BaseFragment implements BaseQuickAdapter.OnItemClickListener{
    private FragmentClubAdapter fragmentClubAdapter;

    @BindView(R.id.club_up_video)
    ImageView club_up_video;

    @BindView(R.id.video_fragmentclub_list)
    RecyclerView video_fragmentclub_list;

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_club;
    }

    @Override
    protected void initView() {
        super.initView();
        video_fragmentclub_list.setLayoutManager(new LinearLayoutManager(getActivity()));
        fragmentClubAdapter = new FragmentClubAdapter();
        fragmentClubAdapter.setOnItemClickListener(this);
        video_fragmentclub_list.setAdapter(fragmentClubAdapter);
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @OnClick({R.id.club_up_video})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.club_up_video:
                StartActivityUtil.skipAnotherActivity(getActivity(), UpVideoActivity.class);
                break;
        }
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        StartActivityUtil.skipAnotherActivity(getActivity(),ClubDetailActivity.class);
    }
}
