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

import com.aliyuncs.ccc.model.v20200701.HoldCallResponse;
import com.aliyuncs.ccc.model.v20200701.HoldCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.HoldCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.HoldCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.HoldCallResponse.Data.UserContext;
import com.aliyuncs.transform.UnmarshallerContext;


public class HoldCallResponseUnmarshaller {

	public static HoldCallResponse unmarshall(HoldCallResponse holdCallResponse, UnmarshallerContext _ctx) {
		
		holdCallResponse.setRequestId(_ctx.stringValue("HoldCallResponse.RequestId"));
		holdCallResponse.setCode(_ctx.stringValue("HoldCallResponse.Code"));
		holdCallResponse.setHttpStatusCode(_ctx.integerValue("HoldCallResponse.HttpStatusCode"));
		holdCallResponse.setMessage(_ctx.stringValue("HoldCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("HoldCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("HoldCallResponse.Params["+ i +"]"));
		}
		holdCallResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("HoldCallResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("HoldCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("HoldCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("HoldCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setReleaseInitiator(_ctx.stringValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setChannelState(_ctx.stringValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setUserId(_ctx.stringValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));
			channelContext.setSkillGroupId(_ctx.stringValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].SkillGroupId"));
			channelContext.setTimestamp(_ctx.longValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setReleaseReason(_ctx.stringValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setCallType(_ctx.stringValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setJobId(_ctx.stringValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setChannelId(_ctx.stringValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setOriginator(_ctx.stringValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setUserExtension(_ctx.stringValue("HoldCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setExtension(_ctx.stringValue("HoldCallResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("HoldCallResponse.Data.UserContext.Heartbeat"));
		userContext.setWorkMode(_ctx.stringValue("HoldCallResponse.Data.UserContext.WorkMode"));
		userContext.setDeviceId(_ctx.stringValue("HoldCallResponse.Data.UserContext.DeviceId"));
		userContext.setUserId(_ctx.stringValue("HoldCallResponse.Data.UserContext.UserId"));
		userContext.setReserved(_ctx.longValue("HoldCallResponse.Data.UserContext.Reserved"));
		userContext.setBreakCode(_ctx.stringValue("HoldCallResponse.Data.UserContext.BreakCode"));
		userContext.setInstanceId(_ctx.stringValue("HoldCallResponse.Data.UserContext.InstanceId"));
		userContext.setOutboundScenario(_ctx.booleanValue("HoldCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setMobile(_ctx.stringValue("HoldCallResponse.Data.UserContext.Mobile"));
		userContext.setJobId(_ctx.stringValue("HoldCallResponse.Data.UserContext.JobId"));
		userContext.setUserState(_ctx.stringValue("HoldCallResponse.Data.UserContext.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("HoldCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("HoldCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		holdCallResponse.setData(data);
	 
	 	return holdCallResponse;
	}
}