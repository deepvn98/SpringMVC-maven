package com.s.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.s.entity.Employee;

public interface EmployeeMapper {
	@Insert("insert into employee(name, email, address, age, gender) values(#{name}, #{email}, #{address}, #{age}, #{gender})")
	public void add(Employee employee);

	@Update("update employee set name=#{name}, email=#{email}, address=#{address}, age=#{age}, gender=#{gender} where id=#{id}")
	public void update(Employee employee);

	@Select("select * from employee where id=#{id}")
	public Employee findById(long id);

	@Select("select * from employee")
	public List<Employee> findAll();

	@Delete("delete from employee where id=#{id}")
	public void delete(long id);

}
