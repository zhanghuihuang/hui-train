package com.hui.train.entity;

import com.hui.core.jpa.po.BaseEntity;
import com.hui.train.enums.UserStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_user")
public class User extends BaseEntity<Long> {

	/**
	 *
	 */
	private static final long serialVersionUID = 5558731197658821957L;
	private Long id; // 主键
	private String userName; // 用户名
	private String password; // 密码
	private UserStatus status; // 昵称
	private String createBy;
	private Date createTime;

	/** 获取Id,主键 */
	@Override
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 22)
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Enumerated(EnumType.STRING)
    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}