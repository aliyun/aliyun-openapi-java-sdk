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

import com.aliyuncs.ccc.model.v20200701.ReadyForServiceResponse;
import com.aliyuncs.ccc.model.v20200701.ReadyForServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReadyForServiceResponseUnmarshaller {

	public static ReadyForServiceResponse unmarshall(ReadyForServiceResponse readyForServiceResponse, UnmarshallerContext _ctx) {
		
		readyForServiceResponse.setRequestId(_ctx.stringValue("ReadyForServiceResponse.RequestId"));
		readyForServiceResponse.setCode(_ctx.stringValue("ReadyForServiceResponse.Code"));
		readyForServiceResponse.setHttpStatusCode(_ctx.integerValue("ReadyForServiceResponse.HttpStatusCode"));
		readyForServiceResponse.setMessage(_ctx.stringValue("ReadyForServiceResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReadyForServiceResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ReadyForServiceResponse.Params["+ i +"]"));
		}
		readyForServiceResponse.setParams(params);

		Data data = new Data();
		data.setBreakCode(_ctx.stringValue("ReadyForServiceResponse.Data.BreakCode"));
		data.setDeviceId(_ctx.stringValue("ReadyForServiceResponse.Data.DeviceId"));
		data.setExtension(_ctx.stringValue("ReadyForServiceResponse.Data.Extension"));
		data.setInstanceId(_ctx.stringValue("ReadyForServiceResponse.Data.InstanceId"));
		data.setJobId(_ctx.stringValue("ReadyForServiceResponse.Data.JobId"));
		data.setOutboundScenario(_ctx.booleanValue("ReadyForServiceResponse.Data.OutboundScenario"));
		data.setUserId(_ctx.stringValue("ReadyForServiceResponse.Data.UserId"));
		data.setUserState(_ctx.stringValue("ReadyForServiceResponse.Data.UserState"));
		data.setWorkMode(_ctx.stringValue("ReadyForServiceResponse.Data.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReadyForServiceResponse.Data.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("ReadyForServiceResponse.Data.SignedSkillGroupIdList["+ i +"]"));
		}
		data.setSignedSkillGroupIdList(signedSkillGroupIdList);
		readyForServiceResponse.setData(data);
	 
	 	return readyForServiceResponse;
	}
}