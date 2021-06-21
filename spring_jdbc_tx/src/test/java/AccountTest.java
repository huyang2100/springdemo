import com.bean.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 下午5:37
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert(){
        int update = jdbcTemplate.update("insert into account values (?,?)", "莉莉", 2000);
        System.out.println(update);
    }

    @Test
    public void testDel(){
        int update = jdbcTemplate.update("delete from account where name = ?", "小明");
        System.out.println(update);
    }

    @Test
    public void testQuery(){
        List<Account> accountList = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<>(Account.class));
        accountList.forEach(System.out::println);
    }

    @Test
    public void testQueryOne(){
        Account account = jdbcTemplate.queryForObject("select * from account where name = ?", new BeanPropertyRowMapper<>(Account.class), "小明");
        System.out.println(account);
    }

    @Test
    public void testQueryCount(){
        Long num = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        System.out.println(num);
    }

}
