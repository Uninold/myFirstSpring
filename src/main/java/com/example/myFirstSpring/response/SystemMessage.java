package com.example.myFirstSpring.response;

/**
 * Created by jiptc22 on 5/16/2018.
 */
public class SystemMessage {
    private boolean flag;
    private String message;

    public SystemMessage(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
