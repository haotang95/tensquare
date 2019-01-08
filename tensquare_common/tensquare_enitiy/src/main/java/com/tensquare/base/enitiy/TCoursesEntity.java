package com.tensquare.base.enitiy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName TCoursesEntity
 * @auther tangh
 * @date 2019/1/8 0008 12:17
 */
@Entity
@Table(name = "t_courses", schema = "eke", catalog = "")
public class TCoursesEntity {
    private String id;
    private String title;
    private String pic;
    private String introduce;
    private String charge;
    private Double money;
    private String grade;
    private String subject;
    private String isTop;
    private Integer topScore;
    private String isDelete;
    private String state;
    private String status;
    private String shelfId;
    private Timestamp shelfTime;
    private String creator;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String fPeriodId;
    private Timestamp submitTime;
    private Timestamp auditTime;
    private int coursePartNum;
    private String auditReason;
    private String parentId;
    private String topicClassId;
    private Integer saleNum;
    private Integer originNum;
    private Integer countNum;
    private String todayDiscount;
    private String tag;
    private String reason;
    private Timestamp stopTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "pic")
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "introduce")
    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Basic
    @Column(name = "charge")
    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    @Basic
    @Column(name = "money")
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Basic
    @Column(name = "grade")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "is_top")
    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    @Basic
    @Column(name = "top_score")
    public Integer getTopScore() {
        return topScore;
    }

    public void setTopScore(Integer topScore) {
        this.topScore = topScore;
    }

    @Basic
    @Column(name = "is_delete")
    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "shelf_id")
    public String getShelfId() {
        return shelfId;
    }

    public void setShelfId(String shelfId) {
        this.shelfId = shelfId;
    }

    @Basic
    @Column(name = "shelf_time")
    public Timestamp getShelfTime() {
        return shelfTime;
    }

    public void setShelfTime(Timestamp shelfTime) {
        this.shelfTime = shelfTime;
    }

    @Basic
    @Column(name = "creator")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "f_period_id")
    public String getfPeriodId() {
        return fPeriodId;
    }

    public void setfPeriodId(String fPeriodId) {
        this.fPeriodId = fPeriodId;
    }

    @Basic
    @Column(name = "submit_time")
    public Timestamp getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Timestamp submitTime) {
        this.submitTime = submitTime;
    }

    @Basic
    @Column(name = "audit_time")
    public Timestamp getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Timestamp auditTime) {
        this.auditTime = auditTime;
    }

    @Basic
    @Column(name = "course_part_num")
    public int getCoursePartNum() {
        return coursePartNum;
    }

    public void setCoursePartNum(int coursePartNum) {
        this.coursePartNum = coursePartNum;
    }

    @Basic
    @Column(name = "audit_reason")
    public String getAuditReason() {
        return auditReason;
    }

    public void setAuditReason(String auditReason) {
        this.auditReason = auditReason;
    }

    @Basic
    @Column(name = "parent_id")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "topic_class_id")
    public String getTopicClassId() {
        return topicClassId;
    }

    public void setTopicClassId(String topicClassId) {
        this.topicClassId = topicClassId;
    }

    @Basic
    @Column(name = "sale_num")
    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    @Basic
    @Column(name = "origin_num")
    public Integer getOriginNum() {
        return originNum;
    }

    public void setOriginNum(Integer originNum) {
        this.originNum = originNum;
    }

    @Basic
    @Column(name = "count_num")
    public Integer getCountNum() {
        return countNum;
    }

    public void setCountNum(Integer countNum) {
        this.countNum = countNum;
    }

    @Basic
    @Column(name = "today_discount")
    public String getTodayDiscount() {
        return todayDiscount;
    }

    public void setTodayDiscount(String todayDiscount) {
        this.todayDiscount = todayDiscount;
    }

    @Basic
    @Column(name = "tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "stop_time")
    public Timestamp getStopTime() {
        return stopTime;
    }

    public void setStopTime(Timestamp stopTime) {
        this.stopTime = stopTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCoursesEntity that = (TCoursesEntity) o;
        return coursePartNum == that.coursePartNum &&
                Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(pic, that.pic) &&
                Objects.equals(introduce, that.introduce) &&
                Objects.equals(charge, that.charge) &&
                Objects.equals(money, that.money) &&
                Objects.equals(grade, that.grade) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(isTop, that.isTop) &&
                Objects.equals(topScore, that.topScore) &&
                Objects.equals(isDelete, that.isDelete) &&
                Objects.equals(state, that.state) &&
                Objects.equals(status, that.status) &&
                Objects.equals(shelfId, that.shelfId) &&
                Objects.equals(shelfTime, that.shelfTime) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(fPeriodId, that.fPeriodId) &&
                Objects.equals(submitTime, that.submitTime) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(auditReason, that.auditReason) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(topicClassId, that.topicClassId) &&
                Objects.equals(saleNum, that.saleNum) &&
                Objects.equals(originNum, that.originNum) &&
                Objects.equals(countNum, that.countNum) &&
                Objects.equals(todayDiscount, that.todayDiscount) &&
                Objects.equals(tag, that.tag) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(stopTime, that.stopTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, pic, introduce, charge, money, grade, subject, isTop, topScore, isDelete, state, status, shelfId, shelfTime, creator, createTime, updateTime, fPeriodId, submitTime, auditTime, coursePartNum, auditReason, parentId, topicClassId, saleNum, originNum, countNum, todayDiscount, tag, reason, stopTime);
    }
}
