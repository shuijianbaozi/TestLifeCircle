package com.yuntao.testlifecircle.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by pengyuntao on 16/5/19.
 */
public class BaseFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        print("onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        print("onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        print("onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        print("onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        print("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        print("onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        print("onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        print("onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        print("onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        print("onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        print("onDetach");
    }

    private void print(String text) {
        Log.i("pyt", this.getClass().getSimpleName() + "----" + text);
    }
}
