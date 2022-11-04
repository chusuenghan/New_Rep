package pnu.user.service;

import pnu.user.vo.UserVO;

public interface UserService {
	public Boolean selectPwd(String id, String pwd);
	
	public int insertUser(UserVO user);
	
	public UserVO selectUserInfo(String userId);
}
