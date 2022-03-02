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

import com.aliyuncs.ccc.model.v20200701.BargeInCallResponse;
import com.aliyuncs.ccc.model.v20200701.BargeInCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.BargeInCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.BargeInCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.BargeInCallResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BargeInCallResponseUnmarshaller {

	public static BargeInCallResponse unmarshall(BargeInCallResponse bargeInCallResponse, UnmarshallerContext _ctx) {
		
		bargeInCallResponse.setRequestId(_ctx.stringValue("BargeInCallResponse.RequestId"));
		bargeInCallResponse.setCode(_ctx.stringValue("BargeInCallResponse.Code"));
		bargeInCallResponse.setHttpStatusCode(_ctx.integerValue("BargeInCallResponse.HttpStatusCode"));
		bargeInCallResponse.setMessage(_ctx.stringValue("BargeInCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BargeInCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("BargeInCallResponse.Params["+ i +"]"));
		}
		bargeInCallResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("BargeInCallResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("BargeInCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("BargeInCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("BargeInCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setIndex(_ctx.integerValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].Index"));
			channelContext.setReleaseInitiator(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setChannelState(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setUserId(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));
			channelContext.setChannelFlags(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setSkillGroupId(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].SkillGroupId"));
			channelContext.setTimestamp(_ctx.longValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setAssociatedData(_ctx.mapValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setReleaseReason(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setCallType(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setJobId(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setChannelId(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setUserExtension(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));
			channelContext.setOriginator(_ctx.stringValue("BargeInCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setExtension(_ctx.stringValue("BargeInCallResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("BargeInCallResponse.Data.UserContext.Heartbeat"));
		userContext.setWorkMode(_ctx.stringValue("BargeInCallResponse.Data.UserContext.WorkMode"));
		userContext.setDeviceId(_ctx.stringValue("BargeInCallResponse.Data.UserContext.DeviceId"));
		userContext.setUserId(_ctx.stringValue("BargeInCallResponse.Data.UserContext.UserId"));
		userContext.setReserved(_ctx.longValue("BargeInCallResponse.Data.UserContext.Reserved"));
		userContext.setBreakCode(_ctx.stringValue("BargeInCallResponse.Data.UserContext.BreakCode"));
		userContext.setInstanceId(_ctx.stringValue("BargeInCallResponse.Data.UserContext.InstanceId"));
		userContext.setOutboundScenario(_ctx.booleanValue("BargeInCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setMobile(_ctx.stringValue("BargeInCallResponse.Data.UserContext.Mobile"));
		userContext.setJobId(_ctx.stringValue("BargeInCallResponse.Data.UserContext.JobId"));
		userContext.setUserState(_ctx.stringValue("BargeInCallResponse.Data.UserContext.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BargeInCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("BargeInCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		bargeInCallResponse.setData(data);
	 
	 	return bargeInCallResponse;
	}
}