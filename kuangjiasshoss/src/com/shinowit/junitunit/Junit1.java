package com.shinowit.junitunit;

import java.util.List;

import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.shinowit.dao.BaseDao;
import com.shinowit.entity.Teacher;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml"})
public class Junit1 extends AbstractJUnit4SpringContextTests {

	@Resource
	private SessionFactory sessionfactory;
	
	@Resource
	private BaseDao<Teacher> basedao;

	@Test
	public void test(){
		Session session = this.sessionfactory.openSession();
		try{
			List<Teacher> testliat = basedao.listAll(Teacher.class);
			for(Teacher tea : testliat){
				System.out.print(tea.getName());
			}
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
