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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetClriskUserResponse;
import com.aliyuncs.sofa.model.v20190815.GetClriskUserResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskUserResponseUnmarshaller {

	public static GetClriskUserResponse unmarshall(GetClriskUserResponse getClriskUserResponse, UnmarshallerContext _ctx) {
		
		getClriskUserResponse.setRequestId(_ctx.stringValue("GetClriskUserResponse.RequestId"));
		getClriskUserResponse.setResultCode(_ctx.stringValue("GetClriskUserResponse.ResultCode"));
		getClriskUserResponse.setResultMessage(_ctx.stringValue("GetClriskUserResponse.ResultMessage"));

		User user = new User();
		user.setEmail(_ctx.stringValue("GetClriskUserResponse.User.Email"));
		user.setLoginName(_ctx.stringValue("GetClriskUserResponse.User.LoginName"));
		user.setMobile(_ctx.stringValue("GetClriskUserResponse.User.Mobile"));
		user.setNickName(_ctx.stringValue("GetClriskUserResponse.User.NickName"));
		user.setOriginId(_ctx.stringValue("GetClriskUserResponse.User.OriginId"));
		user.setType(_ctx.stringValue("GetClriskUserResponse.User.Type"));
		getClriskUserResponse.setUser(user);
	 
	 	return getClriskUserResponse;
	}
}