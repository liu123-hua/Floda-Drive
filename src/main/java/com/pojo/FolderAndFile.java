package com.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: dc
 * @Date: 2019/8/27 15:50
 * @Description:文件夹文件抽取公共类
 */
public class FolderAndFile {

    private Long id;
    private String fileName;
    private Long belong;
    private Long parentId;
    private Date updatetime;
    private BigDecimal fileSize;
    private String fileType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getBelong() {
        return belong;
    }

    public void setBelong(Long belong) {
        this.belong = belong;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "FolderAndFile{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", belong=" + belong +
                ", parentId=" + parentId +
                ", updatetime=" + updatetime +
                ", fileSize=" + fileSize +
                ", fileType='" + fileType + '\'' +
                '}';
    }
}
