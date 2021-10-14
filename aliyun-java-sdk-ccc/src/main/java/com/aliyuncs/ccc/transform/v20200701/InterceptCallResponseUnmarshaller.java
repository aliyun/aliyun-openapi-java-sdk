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

import com.aliyuncs.ccc.model.v20200701.InterceptCallResponse;
import com.aliyuncs.ccc.model.v20200701.InterceptCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.InterceptCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.InterceptCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.InterceptCallResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InterceptCallResponseUnmarshaller {

	public static InterceptCallResponse unmarshall(InterceptCallResponse interceptCallResponse, UnmarshallerContext _ctx) {
		
		interceptCallResponse.setRequestId(_ctx.stringValue("InterceptCallResponse.RequestId"));
		interceptCallResponse.setCode(_ctx.stringValue("InterceptCallResponse.Code"));
		interceptCallResponse.setHttpStatusCode(_ctx.integerValue("InterceptCallResponse.HttpStatusCode"));
		interceptCallResponse.setMessage(_ctx.stringValue("InterceptCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InterceptCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("InterceptCallResponse.Params["+ i +"]"));
		}
		interceptCallResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("InterceptCallResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("InterceptCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("InterceptCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("InterceptCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setAssociatedData(_ctx.mapValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setCallType(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setChannelFlags(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setChannelId(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setChannelState(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setIndex(_ctx.integerValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].Index"));
			channelContext.setJobId(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setOriginator(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setReleaseInitiator(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setReleaseReason(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setSkillGroupId(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].SkillGroupId"));
			channelContext.setTimestamp(_ctx.longValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setUserExtension(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));
			channelContext.setUserId(_ctx.stringValue("InterceptCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setBreakCode(_ctx.stringValue("InterceptCallResponse.Data.UserContext.BreakCode"));
		userContext.setDeviceId(_ctx.stringValue("InterceptCallResponse.Data.UserContext.DeviceId"));
		userContext.setExtension(_ctx.stringValue("InterceptCallResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("InterceptCallResponse.Data.UserContext.Heartbeat"));
		userContext.setInstanceId(_ctx.stringValue("InterceptCallResponse.Data.UserContext.InstanceId"));
		userContext.setJobId(_ctx.stringValue("InterceptCallResponse.Data.UserContext.JobId"));
		userContext.setMobile(_ctx.stringValue("InterceptCallResponse.Data.UserContext.Mobile"));
		userContext.setOutboundScenario(_ctx.booleanValue("InterceptCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setReserved(_ctx.longValue("InterceptCallResponse.Data.UserContext.Reserved"));
		userContext.setUserId(_ctx.stringValue("InterceptCallResponse.Data.UserContext.UserId"));
		userContext.setUserState(_ctx.stringValue("InterceptCallResponse.Data.UserContext.UserState"));
		userContext.setWorkMode(_ctx.stringValue("InterceptCallResponse.Data.UserContext.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InterceptCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("InterceptCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		interceptCallResponse.setData(data);
	 
	 	return interceptCallResponse;
	}
}