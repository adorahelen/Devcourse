package edu.java.jdbc.vo;

import java.sql.Date;

public class BordVO {

// 선언은 전부 해놔야 하고,
    // 셀렉트 에서는 언더바 붙여서 가져오고
    // 여기다 값을 넣고 쓰기에 언더바 없어도
private int bno;
private String content;
private int hit;
private String title;
public Date writeDate;
private String writer;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }
}
