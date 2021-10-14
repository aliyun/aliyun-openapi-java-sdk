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

import com.aliyuncs.ccc.model.v20200701.ResetAgentStateResponse;
import com.aliyuncs.ccc.model.v20200701.ResetAgentStateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetAgentStateResponseUnmarshaller {

	public static ResetAgentStateResponse unmarshall(ResetAgentStateResponse resetAgentStateResponse, UnmarshallerContext _ctx) {
		
		resetAgentStateResponse.setRequestId(_ctx.stringValue("ResetAgentStateResponse.RequestId"));
		resetAgentStateResponse.setCode(_ctx.stringValue("ResetAgentStateResponse.Code"));
		resetAgentStateResponse.setHttpStatusCode(_ctx.integerValue("ResetAgentStateResponse.HttpStatusCode"));
		resetAgentStateResponse.setMessage(_ctx.stringValue("ResetAgentStateResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ResetAgentStateResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ResetAgentStateResponse.Params["+ i +"]"));
		}
		resetAgentStateResponse.setParams(params);

		Data data = new Data();
		data.setBreakCode(_ctx.stringValue("ResetAgentStateResponse.Data.BreakCode"));
		data.setDeviceId(_ctx.stringValue("ResetAgentStateResponse.Data.DeviceId"));
		data.setExtension(_ctx.stringValue("ResetAgentStateResponse.Data.Extension"));
		data.setInstanceId(_ctx.stringValue("ResetAgentStateResponse.Data.InstanceId"));
		data.setJobId(_ctx.stringValue("ResetAgentStateResponse.Data.JobId"));
		data.setOutboundScenario(_ctx.booleanValue("ResetAgentStateResponse.Data.OutboundScenario"));
		data.setUserId(_ctx.stringValue("ResetAgentStateResponse.Data.UserId"));
		data.setUserState(_ctx.stringValue("ResetAgentStateResponse.Data.UserState"));
		data.setWorkMode(_ctx.stringValue("ResetAgentStateResponse.Data.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ResetAgentStateResponse.Data.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("ResetAgentStateResponse.Data.SignedSkillGroupIdList["+ i +"]"));
		}
		data.setSignedSkillGroupIdList(signedSkillGroupIdList);
		resetAgentStateResponse.setData(data);
	 
	 	return resetAgentStateResponse;
	}
}