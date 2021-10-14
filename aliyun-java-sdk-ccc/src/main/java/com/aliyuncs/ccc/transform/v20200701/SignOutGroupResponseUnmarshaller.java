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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.SignOutGroupResponse;
import com.aliyuncs.ccc.model.v20200701.SignOutGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SignOutGroupResponseUnmarshaller {

	public static SignOutGroupResponse unmarshall(SignOutGroupResponse signOutGroupResponse, UnmarshallerContext _ctx) {
		
		signOutGroupResponse.setRequestId(_ctx.stringValue("SignOutGroupResponse.RequestId"));
		signOutGroupResponse.setCode(_ctx.stringValue("SignOutGroupResponse.Code"));
		signOutGroupResponse.setHttpStatusCode(_ctx.integerValue("SignOutGroupResponse.HttpStatusCode"));
		signOutGroupResponse.setMessage(_ctx.stringValue("SignOutGroupResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SignOutGroupResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("SignOutGroupResponse.Params["+ i +"]"));
		}
		signOutGroupResponse.setParams(params);

		Data data = new Data();
		data.setBreakCode(_ctx.stringValue("SignOutGroupResponse.Data.BreakCode"));
		data.setDeviceId(_ctx.stringValue("SignOutGroupResponse.Data.DeviceId"));
		data.setExtension(_ctx.stringValue("SignOutGroupResponse.Data.Extension"));
		data.setHeartbeat(_ctx.longValue("SignOutGroupResponse.Data.Heartbeat"));
		data.setInstanceId(_ctx.stringValue("SignOutGroupResponse.Data.InstanceId"));
		data.setJobId(_ctx.stringValue("SignOutGroupResponse.Data.JobId"));
		data.setMobile(_ctx.stringValue("SignOutGroupResponse.Data.Mobile"));
		data.setOutboundScenario(_ctx.booleanValue("SignOutGroupResponse.Data.OutboundScenario"));
		data.setReserved(_ctx.longValue("SignOutGroupResponse.Data.Reserved"));
		data.setUserId(_ctx.stringValue("SignOutGroupResponse.Data.UserId"));
		data.setUserState(_ctx.stringValue("SignOutGroupResponse.Data.UserState"));
		data.setWorkMode(_ctx.stringValue("SignOutGroupResponse.Data.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SignOutGroupResponse.Data.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("SignOutGroupResponse.Data.SignedSkillGroupIdList["+ i +"]"));
		}
		data.setSignedSkillGroupIdList(signedSkillGroupIdList);
		signOutGroupResponse.setData(data);
	 
	 	return signOutGroupResponse;
	}
}