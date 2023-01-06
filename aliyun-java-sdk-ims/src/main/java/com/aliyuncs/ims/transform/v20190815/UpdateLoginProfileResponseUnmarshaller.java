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

package com.aliyuncs.ims.transform.v20190815;

import com.aliyuncs.ims.model.v20190815.UpdateLoginProfileResponse;
import com.aliyuncs.ims.model.v20190815.UpdateLoginProfileResponse.LoginProfile;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLoginProfileResponseUnmarshaller {

	public static UpdateLoginProfileResponse unmarshall(UpdateLoginProfileResponse updateLoginProfileResponse, UnmarshallerContext _ctx) {
		
		updateLoginProfileResponse.setRequestId(_ctx.stringValue("UpdateLoginProfileResponse.RequestId"));

		LoginProfile loginProfile = new LoginProfile();
		loginProfile.setUserPrincipalName(_ctx.stringValue("UpdateLoginProfileResponse.LoginProfile.UserPrincipalName"));
		loginProfile.setStatus(_ctx.stringValue("UpdateLoginProfileResponse.LoginProfile.Status"));
		loginProfile.setPassword(_ctx.stringValue("UpdateLoginProfileResponse.LoginProfile.Password"));
		loginProfile.setUpdateDate(_ctx.stringValue("UpdateLoginProfileResponse.LoginProfile.UpdateDate"));
		loginProfile.setPasswordResetRequired(_ctx.booleanValue("UpdateLoginProfileResponse.LoginProfile.PasswordResetRequired"));
		loginProfile.setMFABindRequired(_ctx.booleanValue("UpdateLoginProfileResponse.LoginProfile.MFABindRequired"));
		loginProfile.setCreateDate(_ctx.stringValue("UpdateLoginProfileResponse.LoginProfile.CreateDate"));
		updateLoginProfileResponse.setLoginProfile(loginProfile);
	 
	 	return updateLoginProfileResponse;
	}
}