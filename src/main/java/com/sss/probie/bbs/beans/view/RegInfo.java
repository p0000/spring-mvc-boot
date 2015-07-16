package com.sss.probie.bbs.beans.view;

/**
 * Created by K.Kangai on 2015/07/16.
 */
public class RegInfo {

    private String name;

    private String title;

    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RegInfo{");
        sb.append("name='").append(name).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
