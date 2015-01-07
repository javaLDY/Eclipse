package interfence;

import java.util.List;

import entity.UserInfo;

public interface UserInfoInterfence {
	
	public boolean userinsert(UserInfo userinfo);
	
	public List<UserInfo> userinfoselect();

	public boolean userupdate();
	
	public List<UserInfo> singleselect(int stucode);
}
