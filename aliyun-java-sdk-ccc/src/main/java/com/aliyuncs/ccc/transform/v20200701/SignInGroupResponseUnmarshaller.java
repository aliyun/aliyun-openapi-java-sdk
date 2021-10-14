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

import com.aliyuncs.ccc.model.v20200701.SignInGroupResponse;
import com.aliyuncs.ccc.model.v20200701.SignInGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SignInGroupResponseUnmarshaller {

	public static SignInGroupResponse unmarshall(SignInGroupResponse signInGroupResponse, UnmarshallerContext _ctx) {
		
		signInGroupResponse.setRequestId(_ctx.stringValue("SignInGroupResponse.RequestId"));
		signInGroupResponse.setCode(_ctx.stringValue("SignInGroupResponse.Code"));
		signInGroupResponse.setHttpStatusCode(_ctx.integerValue("SignInGroupResponse.HttpStatusCode"));
		signInGroupResponse.setMessage(_ctx.stringValue("SignInGroupResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SignInGroupResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("SignInGroupResponse.Params["+ i +"]"));
		}
		signInGroupResponse.setParams(params);

		Data data = new Data();
		data.setBreakCode(_ctx.stringValue("SignInGroupResponse.Data.BreakCode"));
		data.setDeviceId(_ctx.stringValue("SignInGroupResponse.Data.DeviceId"));
		data.setExtension(_ctx.stringValue("SignInGroupResponse.Data.Extension"));
		data.setInstanceId(_ctx.stringValue("SignInGroupResponse.Data.InstanceId"));
		data.setJobId(_ctx.stringValue("SignInGroupResponse.Data.JobId"));
		data.setOutboundScenario(_ctx.booleanValue("SignInGroupResponse.Data.OutboundScenario"));
		data.setUserId(_ctx.stringValue("SignInGroupResponse.Data.UserId"));
		data.setUserState(_ctx.stringValue("SignInGroupResponse.Data.UserState"));
		data.setWorkMode(_ctx.stringValue("SignInGroupResponse.Data.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SignInGroupResponse.Data.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("SignInGroupResponse.Data.SignedSkillGroupIdList["+ i +"]"));
		}
		data.setSignedSkillGroupIdList(signedSkillGroupIdList);
		signInGroupResponse.setData(data);
	 
	 	return signInGroupResponse;
	}
}