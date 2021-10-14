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

import com.aliyuncs.ccc.model.v20200701.ChangeWorkModeResponse;
import com.aliyuncs.ccc.model.v20200701.ChangeWorkModeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeWorkModeResponseUnmarshaller {

	public static ChangeWorkModeResponse unmarshall(ChangeWorkModeResponse changeWorkModeResponse, UnmarshallerContext _ctx) {
		
		changeWorkModeResponse.setRequestId(_ctx.stringValue("ChangeWorkModeResponse.RequestId"));
		changeWorkModeResponse.setCode(_ctx.stringValue("ChangeWorkModeResponse.Code"));
		changeWorkModeResponse.setHttpStatusCode(_ctx.integerValue("ChangeWorkModeResponse.HttpStatusCode"));
		changeWorkModeResponse.setMessage(_ctx.stringValue("ChangeWorkModeResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ChangeWorkModeResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ChangeWorkModeResponse.Params["+ i +"]"));
		}
		changeWorkModeResponse.setParams(params);

		Data data = new Data();
		data.setBreakCode(_ctx.stringValue("ChangeWorkModeResponse.Data.BreakCode"));
		data.setDeviceId(_ctx.stringValue("ChangeWorkModeResponse.Data.DeviceId"));
		data.setExtension(_ctx.stringValue("ChangeWorkModeResponse.Data.Extension"));
		data.setInstanceId(_ctx.stringValue("ChangeWorkModeResponse.Data.InstanceId"));
		data.setJobId(_ctx.stringValue("ChangeWorkModeResponse.Data.JobId"));
		data.setOutboundScenario(_ctx.booleanValue("ChangeWorkModeResponse.Data.OutboundScenario"));
		data.setUserId(_ctx.stringValue("ChangeWorkModeResponse.Data.UserId"));
		data.setUserState(_ctx.stringValue("ChangeWorkModeResponse.Data.UserState"));
		data.setWorkMode(_ctx.stringValue("ChangeWorkModeResponse.Data.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ChangeWorkModeResponse.Data.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("ChangeWorkModeResponse.Data.SignedSkillGroupIdList["+ i +"]"));
		}
		data.setSignedSkillGroupIdList(signedSkillGroupIdList);
		changeWorkModeResponse.setData(data);
	 
	 	return changeWorkModeResponse;
	}
}