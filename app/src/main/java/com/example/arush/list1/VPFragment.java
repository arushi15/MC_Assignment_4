package com.example.arush.list1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by arush on 09-11-2016.
 */

public class VPFragment extends Fragment {
    int position;

    public static VPFragment newInstance(int position) {

        Bundle args = new Bundle();

        VPFragment fragment = new VPFragment();
        fragment.position = position;
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
        // TODO: 09-11-2016 make a layout for fragment
        // TODO: 09-11-2016 get task from database at position @Position
        // TODO: 09-11-2016 fill in title and detail inside the view
    }
}
