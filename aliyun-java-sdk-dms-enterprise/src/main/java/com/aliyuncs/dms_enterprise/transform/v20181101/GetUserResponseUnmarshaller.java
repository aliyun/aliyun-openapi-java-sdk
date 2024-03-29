/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetUserResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetUserResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext _ctx) {
		
		getUserResponse.setRequestId(_ctx.stringValue("GetUserResponse.RequestId"));
		getUserResponse.setErrorCode(_ctx.stringValue("GetUserResponse.ErrorCode"));
		getUserResponse.setErrorMessage(_ctx.stringValue("GetUserResponse.ErrorMessage"));
		getUserResponse.setSuccess(_ctx.booleanValue("GetUserResponse.Success"));

		User user = new User();
		user.setState(_ctx.stringValue("GetUserResponse.User.State"));
		user.setCurResultCount(_ctx.longValue("GetUserResponse.User.CurResultCount"));
		user.setUserId(_ctx.stringValue("GetUserResponse.User.UserId"));
		user.setLastLoginTime(_ctx.stringValue("GetUserResponse.User.LastLoginTime"));
		user.setMaxResultCount(_ctx.longValue("GetUserResponse.User.MaxResultCount"));
		user.setParentUid(_ctx.longValue("GetUserResponse.User.ParentUid"));
		user.setNickName(_ctx.stringValue("GetUserResponse.User.NickName"));
		user.setMaxExecuteCount(_ctx.longValue("GetUserResponse.User.MaxExecuteCount"));
		user.setCurExecuteCount(_ctx.longValue("GetUserResponse.User.CurExecuteCount"));
		user.setMobile(_ctx.stringValue("GetUserResponse.User.Mobile"));
		user.setUid(_ctx.stringValue("GetUserResponse.User.Uid"));
		user.setEmail(_ctx.stringValue("GetUserResponse.User.Email"));
		user.setDingRobot(_ctx.stringValue("GetUserResponse.User.DingRobot"));
		user.setWebhook(_ctx.stringValue("GetUserResponse.User.Webhook"));
		user.setSignatureMethod(_ctx.stringValue("GetUserResponse.User.SignatureMethod"));
		user.setNotificationMode(_ctx.stringValue("GetUserResponse.User.NotificationMode"));

		List<Integer> roleIdList = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("GetUserResponse.User.RoleIdList.Length"); i++) {
			roleIdList.add(_ctx.integerValue("GetUserResponse.User.RoleIdList["+ i +"]"));
		}
		user.setRoleIdList(roleIdList);

		List<String> roleNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserResponse.User.RoleNameList.Length"); i++) {
			roleNameList.add(_ctx.stringValue("GetUserResponse.User.RoleNameList["+ i +"]"));
		}
		user.setRoleNameList(roleNameList);
		getUserResponse.setUser(user);
	 
	 	return getUserResponse;
	}
}