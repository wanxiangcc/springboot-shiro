package com.example.shiro.util;

import java.util.HashMap;

public class ResultMap extends HashMap<String, Object> {
    public ResultMap() {
    }

    public ResultMap success() {
        this.put("result", "success");
        return this;
    }

    public ResultMap fail() {
        this.put("result", "fail");
        return this;
    }

    public ResultMap message(Object message) {
        this.put("message", message);
        return this;
    }
}
