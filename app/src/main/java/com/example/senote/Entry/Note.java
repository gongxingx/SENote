package com.example.senote.Entry;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Note {
    // 时间戳
    private long timestamp;
    // 标题，没有标题取前十个字符中的第一行；
    private String title;
    // 内容
    private String content;

    public Note(long timestamp, String title, String content) {
        this.timestamp = timestamp;
        this.title = title;
        this.content = content;
    }

    public Note(String title, String content) {
        this.timestamp = System.currentTimeMillis();
        this.title = title;
        this.content = content;
    }

    public Note(String content) {
        this.content = content;
        this.timestamp = System.currentTimeMillis();
        if (content.length() > 10) {
            this.title = content.substring(0, 10) + "...";
        } else {
            this.title = this.content;
        }
        if (title.lastIndexOf('\n') != -1) {
            this.title = this.title.substring(0, this.title.lastIndexOf('\n'));
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @NonNull
    @Override
    public String toString() {
        return "Note{" +
                "timestamp=" + timestamp +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getFormatTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        return simpleDateFormat.format(this.timestamp);
    }
}
