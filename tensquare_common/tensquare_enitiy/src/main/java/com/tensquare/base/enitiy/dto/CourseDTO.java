package com.tensquare.base.enitiy.dto;

/**
 * @ClassName CourseDTO
 * @auther tangh
 * @date 2019/1/19 0019 15:00
 */
public class CourseDTO {

    private String id;

    private String courseTitle;

    private String isDelete;

    private String state;

    private String cpTitle;

    private String cpIntroduce;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCpTitle() {
        return cpTitle;
    }

    public void setCpTitle(String cpTitle) {
        this.cpTitle = cpTitle;
    }

    public String getCpIntroduce() {
        return cpIntroduce;
    }

    public void setCpIntroduce(String cpIntroduce) {
        this.cpIntroduce = cpIntroduce;
    }
}
