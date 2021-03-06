package com.service;

import com.mapper.TbUserFileMapper;
import com.pojo.FolderAndFile;
import com.pojo.ShowPictures;
import com.pojo.TbFolder;
import com.pojo.TbUserFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: zayvion
 * @Date: 2019-08-27 15:03
 * @Description:用户文件service
 */
public interface UserFileService {

    /**
     * 用户上传新文件
     *
     * @param userFile
     */
    void addFile(TbUserFile userFile);

    /**
     * 获取相同文件名的文件
     *
     * @param filename
     * @return
     */
    int getSameNameFile(String filename, long userId, long fatherFloder);

    /**
     * 重命名文件
     *
     * @param userFile
     */
    String updateUserFile(TbUserFile userFile);

    /**
     * 根据类型返回相关的文件
     *
     * @param userId
     * @param type   类型
     * @return list
     */
    List getUserFileWithType(long userId, String type);

    /**
     * 获取一个用户文件
     *
     * @param userFileId
     * @return
     */
    TbUserFile getUserFile(long userFileId);

    /**
     * 根据文件id删除文件
     * @param fileId
     * @return
     */
    void deleteUserFile(FolderAndFile ff);
    /**
     * 获取文件夹下的文件
     * @param folderId
     * @return
     */
    List getFolderFiles(long folderId);

    /**
     * 查询当前登录用户的所有未删除的图片
     * @param user_id
     * @return
     */
    List<ShowPictures> findAllPic(Long user_id);

    /**
     * 根据文件id删除文件
     * @param fileId
     */
    void deleteUserFileById(Long fileId);


}
