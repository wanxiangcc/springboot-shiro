package com.example.shiro.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Data Access Object基类，已经包含了常用的增删改查操作。<br>
 * 使用时只需要继承接口，不需要实现类，spring自动通过cglib生成实现类
 *
 * @param <T> 实体类型
 */
@NoRepositoryBean
public interface BaseDao<T> extends CrudRepository<T, Serializable>, JpaSpecificationExecutor<T> {
}