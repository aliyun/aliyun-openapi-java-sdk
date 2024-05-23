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

import com.aliyuncs.ccc.model.v20200701.ChangeVisibilityResponse;
import com.aliyuncs.ccc.model.v20200701.ChangeVisibilityResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeVisibilityResponseUnmarshaller {

	public static ChangeVisibilityResponse unmarshall(ChangeVisibilityResponse changeVisibilityResponse, UnmarshallerContext _ctx) {
		
		changeVisibilityResponse.setRequestId(_ctx.stringValue("ChangeVisibilityResponse.RequestId"));
		changeVisibilityResponse.setCode(_ctx.stringValue("ChangeVisibilityResponse.Code"));
		changeVisibilityResponse.setHttpStatusCode(_ctx.integerValue("ChangeVisibilityResponse.HttpStatusCode"));
		changeVisibilityResponse.setMessage(_ctx.stringValue("ChangeVisibilityResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ChangeVisibilityResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ChangeVisibilityResponse.Params["+ i +"]"));
		}
		changeVisibilityResponse.setParams(params);

		Data data = new Data();
		data.setExtension(_ctx.stringValue("ChangeVisibilityResponse.Data.Extension"));
		data.setWorkMode(_ctx.stringValue("ChangeVisibilityResponse.Data.WorkMode"));
		data.setDeviceId(_ctx.stringValue("ChangeVisibilityResponse.Data.DeviceId"));
		data.setJobId(_ctx.stringValue("ChangeVisibilityResponse.Data.JobId"));
		data.setUserId(_ctx.stringValue("ChangeVisibilityResponse.Data.UserId"));
		data.setBreakCode(_ctx.stringValue("ChangeVisibilityResponse.Data.BreakCode"));
		data.setInstanceId(_ctx.stringValue("ChangeVisibilityResponse.Data.InstanceId"));
		data.setOutboundScenario(_ctx.booleanValue("ChangeVisibilityResponse.Data.OutboundScenario"));
		data.setUserState(_ctx.stringValue("ChangeVisibilityResponse.Data.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ChangeVisibilityResponse.Data.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("ChangeVisibilityResponse.Data.SignedSkillGroupIdList["+ i +"]"));
		}
		data.setSignedSkillGroupIdList(signedSkillGroupIdList);
		changeVisibilityResponse.setData(data);
	 
	 	return changeVisibilityResponse;
	}
}