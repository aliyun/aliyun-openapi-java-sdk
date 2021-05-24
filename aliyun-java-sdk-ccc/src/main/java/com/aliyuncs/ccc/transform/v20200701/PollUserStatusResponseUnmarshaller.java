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

import com.aliyuncs.ccc.model.v20200701.PollUserStatusResponse;
import com.aliyuncs.ccc.model.v20200701.PollUserStatusResponse.Data;
import com.aliyuncs.ccc.model.v20200701.PollUserStatusResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.PollUserStatusResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.PollUserStatusResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PollUserStatusResponseUnmarshaller {

	public static PollUserStatusResponse unmarshall(PollUserStatusResponse pollUserStatusResponse, UnmarshallerContext _ctx) {
		
		pollUserStatusResponse.setRequestId(_ctx.stringValue("PollUserStatusResponse.RequestId"));
		pollUserStatusResponse.setCode(_ctx.stringValue("PollUserStatusResponse.Code"));
		pollUserStatusResponse.setHttpStatusCode(_ctx.integerValue("PollUserStatusResponse.HttpStatusCode"));
		pollUserStatusResponse.setMessage(_ctx.stringValue("PollUserStatusResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PollUserStatusResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("PollUserStatusResponse.Params["+ i +"]"));
		}
		pollUserStatusResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("PollUserStatusResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setAssociatedData(_ctx.mapValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setCallType(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setChannelFlags(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setChannelId(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setChannelState(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setIndex(_ctx.integerValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].Index"));
			channelContext.setJobId(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setOriginator(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setReleaseInitiator(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setReleaseReason(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setSkillGroupId(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].SkillGroupId"));
			channelContext.setTimestamp(_ctx.longValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setUserExtension(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));
			channelContext.setUserId(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));
			channelContext.setChannelVariables(_ctx.stringValue("PollUserStatusResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelVariables"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setBreakCode(_ctx.stringValue("PollUserStatusResponse.Data.UserContext.BreakCode"));
		userContext.setDeviceId(_ctx.stringValue("PollUserStatusResponse.Data.UserContext.DeviceId"));
		userContext.setExtension(_ctx.stringValue("PollUserStatusResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("PollUserStatusResponse.Data.UserContext.Heartbeat"));
		userContext.setInstanceId(_ctx.stringValue("PollUserStatusResponse.Data.UserContext.InstanceId"));
		userContext.setJobId(_ctx.stringValue("PollUserStatusResponse.Data.UserContext.JobId"));
		userContext.setMobile(_ctx.stringValue("PollUserStatusResponse.Data.UserContext.Mobile"));
		userContext.setOutboundScenario(_ctx.booleanValue("PollUserStatusResponse.Data.UserContext.OutboundScenario"));
		userContext.setReserved(_ctx.longValue("PollUserStatusResponse.Data.UserContext.Reserved"));
		userContext.setUserId(_ctx.stringValue("PollUserStatusResponse.Data.UserContext.UserId"));
		userContext.setUserState(_ctx.stringValue("PollUserStatusResponse.Data.UserContext.UserState"));
		userContext.setWorkMode(_ctx.stringValue("PollUserStatusResponse.Data.UserContext.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PollUserStatusResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("PollUserStatusResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		pollUserStatusResponse.setData(data);
	 
	 	return pollUserStatusResponse;
	}
}