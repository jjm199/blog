package com.jjm.gm_springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 蒋金铭
 * @since 2021-11-04
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class GmUsers implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 用户ID
     */
        @TableId(value = "user_id", type = IdType.AUTO)
      private Long userId;

      /**
     * 用户IP
     */
      private String userIp;

      /**
     * 用户名
     */
      private String userName;

      /**
     * 用户密码
     */
      private String userPassword;

      /**
     * 用户邮箱
     */
      private String userEmail;

      /**
     * 用户头像
     */
      private String userProfilePhoto;

      /**
     * 注册时间
     */
      private LocalDateTime userRegistrationTime;

      /**
     * 用户生日
     */
      private LocalDate userBirthday;

      /**
     * 用户年龄
     */
      private Integer userAge;

      /**
     * 用户手机号
     */
      private Integer userTelephoneNumber;

      /**
     * 用户昵称
     */
      private String userNickname;


}
