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

import com.aliyuncs.ccc.model.v20200701.MakeCallResponse;
import com.aliyuncs.ccc.model.v20200701.MakeCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.MakeCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.MakeCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.MakeCallResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class MakeCallResponseUnmarshaller {

	public static MakeCallResponse unmarshall(MakeCallResponse makeCallResponse, UnmarshallerContext _ctx) {
		
		makeCallResponse.setRequestId(_ctx.stringValue("MakeCallResponse.RequestId"));
		makeCallResponse.setCode(_ctx.stringValue("MakeCallResponse.Code"));
		makeCallResponse.setHttpStatusCode(_ctx.integerValue("MakeCallResponse.HttpStatusCode"));
		makeCallResponse.setMessage(_ctx.stringValue("MakeCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("MakeCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("MakeCallResponse.Params["+ i +"]"));
		}
		makeCallResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("MakeCallResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("MakeCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("MakeCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("MakeCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setAssociatedData(_ctx.mapValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setCallType(_ctx.stringValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setChannelFlags(_ctx.stringValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setChannelId(_ctx.stringValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setChannelState(_ctx.stringValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setJobId(_ctx.stringValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setOriginator(_ctx.stringValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setReleaseInitiator(_ctx.stringValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setReleaseReason(_ctx.stringValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setTimestamp(_ctx.longValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setUserExtension(_ctx.stringValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));
			channelContext.setUserId(_ctx.stringValue("MakeCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setBreakCode(_ctx.stringValue("MakeCallResponse.Data.UserContext.BreakCode"));
		userContext.setDeviceId(_ctx.stringValue("MakeCallResponse.Data.UserContext.DeviceId"));
		userContext.setExtension(_ctx.stringValue("MakeCallResponse.Data.UserContext.Extension"));
		userContext.setInstanceId(_ctx.stringValue("MakeCallResponse.Data.UserContext.InstanceId"));
		userContext.setJobId(_ctx.stringValue("MakeCallResponse.Data.UserContext.JobId"));
		userContext.setOutboundScenario(_ctx.booleanValue("MakeCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setUserId(_ctx.stringValue("MakeCallResponse.Data.UserContext.UserId"));
		userContext.setUserState(_ctx.stringValue("MakeCallResponse.Data.UserContext.UserState"));
		userContext.setWorkMode(_ctx.stringValue("MakeCallResponse.Data.UserContext.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("MakeCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("MakeCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		makeCallResponse.setData(data);
	 
	 	return makeCallResponse;
	}
}