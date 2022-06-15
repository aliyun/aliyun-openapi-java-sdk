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

import com.aliyuncs.ccc.model.v20200701.EndConferenceResponse;
import com.aliyuncs.ccc.model.v20200701.EndConferenceResponse.Data;
import com.aliyuncs.ccc.model.v20200701.EndConferenceResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.EndConferenceResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.EndConferenceResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class EndConferenceResponseUnmarshaller {

	public static EndConferenceResponse unmarshall(EndConferenceResponse endConferenceResponse, UnmarshallerContext _ctx) {
		
		endConferenceResponse.setRequestId(_ctx.stringValue("EndConferenceResponse.RequestId"));
		endConferenceResponse.setCode(_ctx.stringValue("EndConferenceResponse.Code"));
		endConferenceResponse.setHttpStatusCode(_ctx.integerValue("EndConferenceResponse.HttpStatusCode"));
		endConferenceResponse.setMessage(_ctx.stringValue("EndConferenceResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("EndConferenceResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("EndConferenceResponse.Params["+ i +"]"));
		}
		endConferenceResponse.setParams(params);

		Data data = new Data();
		data.setContextId(_ctx.longValue("EndConferenceResponse.Data.ContextId"));

		CallContext callContext = new CallContext();
		callContext.setJobId(_ctx.stringValue("EndConferenceResponse.Data.CallContext.JobId"));
		callContext.setInstanceId(_ctx.stringValue("EndConferenceResponse.Data.CallContext.InstanceId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("EndConferenceResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setReleaseInitiator(_ctx.stringValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setChannelState(_ctx.stringValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setUserId(_ctx.stringValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));
			channelContext.setTimestamp(_ctx.longValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setAssociatedData(_ctx.mapValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setReleaseReason(_ctx.stringValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setCallType(_ctx.stringValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setJobId(_ctx.stringValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setChannelId(_ctx.stringValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setOriginator(_ctx.stringValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setUserExtension(_ctx.stringValue("EndConferenceResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setExtension(_ctx.stringValue("EndConferenceResponse.Data.UserContext.Extension"));
		userContext.setDeviceState(_ctx.stringValue("EndConferenceResponse.Data.UserContext.DeviceState"));
		userContext.setWorkMode(_ctx.stringValue("EndConferenceResponse.Data.UserContext.WorkMode"));
		userContext.setDeviceId(_ctx.stringValue("EndConferenceResponse.Data.UserContext.DeviceId"));
		userContext.setJobId(_ctx.stringValue("EndConferenceResponse.Data.UserContext.JobId"));
		userContext.setUserId(_ctx.stringValue("EndConferenceResponse.Data.UserContext.UserId"));
		userContext.setBreakCode(_ctx.stringValue("EndConferenceResponse.Data.UserContext.BreakCode"));
		userContext.setInstanceId(_ctx.stringValue("EndConferenceResponse.Data.UserContext.InstanceId"));
		userContext.setOutboundScenario(_ctx.booleanValue("EndConferenceResponse.Data.UserContext.OutboundScenario"));
		userContext.setUri(_ctx.stringValue("EndConferenceResponse.Data.UserContext.Uri"));
		userContext.setUserState(_ctx.stringValue("EndConferenceResponse.Data.UserContext.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("EndConferenceResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("EndConferenceResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		endConferenceResponse.setData(data);
	 
	 	return endConferenceResponse;
	}
}