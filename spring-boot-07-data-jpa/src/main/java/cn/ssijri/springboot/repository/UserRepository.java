package cn.ssijri.springboot.repository;

import cn.ssijri.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author inta
 * @date 2019/3/18
 * @describe 继承JpaRepository 来实现对数据库的操作
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
