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

import com.aliyuncs.ccc.model.v20200701.StartPredictiveCallResponse;
import com.aliyuncs.ccc.model.v20200701.StartPredictiveCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.StartPredictiveCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.StartPredictiveCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.StartPredictiveCallResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartPredictiveCallResponseUnmarshaller {

	public static StartPredictiveCallResponse unmarshall(StartPredictiveCallResponse startPredictiveCallResponse, UnmarshallerContext _ctx) {
		
		startPredictiveCallResponse.setRequestId(_ctx.stringValue("StartPredictiveCallResponse.RequestId"));
		startPredictiveCallResponse.setCode(_ctx.stringValue("StartPredictiveCallResponse.Code"));
		startPredictiveCallResponse.setHttpStatusCode(_ctx.integerValue("StartPredictiveCallResponse.HttpStatusCode"));
		startPredictiveCallResponse.setMessage(_ctx.stringValue("StartPredictiveCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartPredictiveCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("StartPredictiveCallResponse.Params["+ i +"]"));
		}
		startPredictiveCallResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setReleaseInitiator(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setChannelState(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setUserId(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));
			channelContext.setChannelFlags(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setTimestamp(_ctx.longValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setAssociatedData(_ctx.mapValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setReleaseReason(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setCallType(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setJobId(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setChannelId(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setOriginator(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setUserExtension(_ctx.stringValue("StartPredictiveCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setExtension(_ctx.stringValue("StartPredictiveCallResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("StartPredictiveCallResponse.Data.UserContext.Heartbeat"));
		userContext.setWorkMode(_ctx.stringValue("StartPredictiveCallResponse.Data.UserContext.WorkMode"));
		userContext.setDeviceId(_ctx.stringValue("StartPredictiveCallResponse.Data.UserContext.DeviceId"));
		userContext.setUserId(_ctx.stringValue("StartPredictiveCallResponse.Data.UserContext.UserId"));
		userContext.setReserved(_ctx.longValue("StartPredictiveCallResponse.Data.UserContext.Reserved"));
		userContext.setBreakCode(_ctx.stringValue("StartPredictiveCallResponse.Data.UserContext.BreakCode"));
		userContext.setInstanceId(_ctx.stringValue("StartPredictiveCallResponse.Data.UserContext.InstanceId"));
		userContext.setOutboundScenario(_ctx.booleanValue("StartPredictiveCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setDeviceState(_ctx.stringValue("StartPredictiveCallResponse.Data.UserContext.DeviceState"));
		userContext.setMobile(_ctx.stringValue("StartPredictiveCallResponse.Data.UserContext.Mobile"));
		userContext.setJobId(_ctx.stringValue("StartPredictiveCallResponse.Data.UserContext.JobId"));
		userContext.setUserState(_ctx.stringValue("StartPredictiveCallResponse.Data.UserContext.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartPredictiveCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("StartPredictiveCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		startPredictiveCallResponse.setData(data);
	 
	 	return startPredictiveCallResponse;
	}
}