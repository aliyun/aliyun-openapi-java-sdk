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

import com.aliyuncs.ccc.model.v20200701.TakeBreakResponse;
import com.aliyuncs.ccc.model.v20200701.TakeBreakResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class TakeBreakResponseUnmarshaller {

	public static TakeBreakResponse unmarshall(TakeBreakResponse takeBreakResponse, UnmarshallerContext _ctx) {
		
		takeBreakResponse.setRequestId(_ctx.stringValue("TakeBreakResponse.RequestId"));
		takeBreakResponse.setCode(_ctx.stringValue("TakeBreakResponse.Code"));
		takeBreakResponse.setHttpStatusCode(_ctx.integerValue("TakeBreakResponse.HttpStatusCode"));
		takeBreakResponse.setMessage(_ctx.stringValue("TakeBreakResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("TakeBreakResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("TakeBreakResponse.Params["+ i +"]"));
		}
		takeBreakResponse.setParams(params);

		Data data = new Data();
		data.setBreakCode(_ctx.stringValue("TakeBreakResponse.Data.BreakCode"));
		data.setDeviceId(_ctx.stringValue("TakeBreakResponse.Data.DeviceId"));
		data.setExtension(_ctx.stringValue("TakeBreakResponse.Data.Extension"));
		data.setHeartbeat(_ctx.longValue("TakeBreakResponse.Data.Heartbeat"));
		data.setInstanceId(_ctx.stringValue("TakeBreakResponse.Data.InstanceId"));
		data.setJobId(_ctx.stringValue("TakeBreakResponse.Data.JobId"));
		data.setMobile(_ctx.stringValue("TakeBreakResponse.Data.Mobile"));
		data.setOutboundScenario(_ctx.booleanValue("TakeBreakResponse.Data.OutboundScenario"));
		data.setReserved(_ctx.longValue("TakeBreakResponse.Data.Reserved"));
		data.setUserId(_ctx.stringValue("TakeBreakResponse.Data.UserId"));
		data.setUserState(_ctx.stringValue("TakeBreakResponse.Data.UserState"));
		data.setWorkMode(_ctx.stringValue("TakeBreakResponse.Data.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("TakeBreakResponse.Data.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("TakeBreakResponse.Data.SignedSkillGroupIdList["+ i +"]"));
		}
		data.setSignedSkillGroupIdList(signedSkillGroupIdList);
		takeBreakResponse.setData(data);
	 
	 	return takeBreakResponse;
	}
}