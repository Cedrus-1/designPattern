package com.cedrus.design.adapter.loginadapter.v2.adapters;

import com.cedrus.design.adapter.loginadapter.ResultMsg;


public class LoginForTokenAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }
    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
