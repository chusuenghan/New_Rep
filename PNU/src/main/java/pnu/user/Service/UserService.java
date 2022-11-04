package pnu.user.Service;

import pnu.user.vo.UserVO;

public interface UserService {
	public Boolean selectPwd(String id, String pwd);
	
	public int insertUser(UserVO user);
}
