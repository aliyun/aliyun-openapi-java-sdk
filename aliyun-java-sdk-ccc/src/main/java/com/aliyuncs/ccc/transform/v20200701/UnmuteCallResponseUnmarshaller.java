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

import com.aliyuncs.ccc.model.v20200701.UnmuteCallResponse;
import com.aliyuncs.ccc.model.v20200701.UnmuteCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.UnmuteCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.UnmuteCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.UnmuteCallResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnmuteCallResponseUnmarshaller {

	public static UnmuteCallResponse unmarshall(UnmuteCallResponse unmuteCallResponse, UnmarshallerContext _ctx) {
		
		unmuteCallResponse.setRequestId(_ctx.stringValue("UnmuteCallResponse.RequestId"));
		unmuteCallResponse.setCode(_ctx.stringValue("UnmuteCallResponse.Code"));
		unmuteCallResponse.setHttpStatusCode(_ctx.integerValue("UnmuteCallResponse.HttpStatusCode"));
		unmuteCallResponse.setMessage(_ctx.stringValue("UnmuteCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UnmuteCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("UnmuteCallResponse.Params["+ i +"]"));
		}
		unmuteCallResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("UnmuteCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setAssociatedData(_ctx.mapValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setCallType(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setChannelFlags(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setChannelId(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setChannelState(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setIndex(_ctx.integerValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].Index"));
			channelContext.setJobId(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setOriginator(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setReleaseInitiator(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setReleaseReason(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setSkillGroupId(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].SkillGroupId"));
			channelContext.setTimestamp(_ctx.longValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setUserExtension(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));
			channelContext.setUserId(_ctx.stringValue("UnmuteCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setBreakCode(_ctx.stringValue("UnmuteCallResponse.Data.UserContext.BreakCode"));
		userContext.setDeviceId(_ctx.stringValue("UnmuteCallResponse.Data.UserContext.DeviceId"));
		userContext.setExtension(_ctx.stringValue("UnmuteCallResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("UnmuteCallResponse.Data.UserContext.Heartbeat"));
		userContext.setInstanceId(_ctx.stringValue("UnmuteCallResponse.Data.UserContext.InstanceId"));
		userContext.setJobId(_ctx.stringValue("UnmuteCallResponse.Data.UserContext.JobId"));
		userContext.setMobile(_ctx.stringValue("UnmuteCallResponse.Data.UserContext.Mobile"));
		userContext.setOutboundScenario(_ctx.booleanValue("UnmuteCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setUserId(_ctx.stringValue("UnmuteCallResponse.Data.UserContext.UserId"));
		userContext.setUserState(_ctx.stringValue("UnmuteCallResponse.Data.UserContext.UserState"));
		userContext.setWorkMode(_ctx.stringValue("UnmuteCallResponse.Data.UserContext.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UnmuteCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("UnmuteCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		unmuteCallResponse.setData(data);
	 
	 	return unmuteCallResponse;
	}
}