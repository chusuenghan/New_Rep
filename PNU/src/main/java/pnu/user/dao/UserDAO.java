package pnu.user.dao;

import pnu.user.vo.UserVO;

public interface UserDAO {
	public String selectPwd(String userId);
	
	public int insertUser(UserVO user);
	
	public UserVO selectUserInfo(String userId);
	
	public int updateUser(UserVO user);
}
