package org.shiftworks.service;

import java.util.List;

import org.shiftworks.domain.EmployeeVO;

public interface EmployeeService {
	
	//��������
	public void register(EmployeeVO empVO);
	public EmployeeVO get(String emp_id);
	public boolean modify(EmployeeVO empVO);
	public boolean remove(String emp_id);
	public List<EmployeeVO> getList();
	

}
