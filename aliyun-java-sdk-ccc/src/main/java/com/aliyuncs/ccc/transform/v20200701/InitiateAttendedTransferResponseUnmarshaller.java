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

import com.aliyuncs.ccc.model.v20200701.InitiateAttendedTransferResponse;
import com.aliyuncs.ccc.model.v20200701.InitiateAttendedTransferResponse.Data;
import com.aliyuncs.ccc.model.v20200701.InitiateAttendedTransferResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.InitiateAttendedTransferResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.InitiateAttendedTransferResponse.Data.UserContext;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitiateAttendedTransferResponseUnmarshaller {

	public static InitiateAttendedTransferResponse unmarshall(InitiateAttendedTransferResponse initiateAttendedTransferResponse, UnmarshallerContext _ctx) {
		
		initiateAttendedTransferResponse.setRequestId(_ctx.stringValue("InitiateAttendedTransferResponse.RequestId"));
		initiateAttendedTransferResponse.setCode(_ctx.stringValue("InitiateAttendedTransferResponse.Code"));
		initiateAttendedTransferResponse.setHttpStatusCode(_ctx.integerValue("InitiateAttendedTransferResponse.HttpStatusCode"));
		initiateAttendedTransferResponse.setMessage(_ctx.stringValue("InitiateAttendedTransferResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InitiateAttendedTransferResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("InitiateAttendedTransferResponse.Params["+ i +"]"));
		}
		initiateAttendedTransferResponse.setParams(params);

		Data data = new Data();
		data.setContextId(_ctx.longValue("InitiateAttendedTransferResponse.Data.ContextId"));

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setIndex(_ctx.integerValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].Index"));
			channelContext.setReleaseInitiator(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setChannelState(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setUserId(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));
			channelContext.setChannelFlags(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setSkillGroupId(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].SkillGroupId"));
			channelContext.setTimestamp(_ctx.longValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setReleaseReason(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setCallType(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setJobId(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setChannelId(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setUserExtension(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));
			channelContext.setOriginator(_ctx.stringValue("InitiateAttendedTransferResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setExtension(_ctx.stringValue("InitiateAttendedTransferResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("InitiateAttendedTransferResponse.Data.UserContext.Heartbeat"));
		userContext.setWorkMode(_ctx.stringValue("InitiateAttendedTransferResponse.Data.UserContext.WorkMode"));
		userContext.setDeviceId(_ctx.stringValue("InitiateAttendedTransferResponse.Data.UserContext.DeviceId"));
		userContext.setUserId(_ctx.stringValue("InitiateAttendedTransferResponse.Data.UserContext.UserId"));
		userContext.setReserved(_ctx.longValue("InitiateAttendedTransferResponse.Data.UserContext.Reserved"));
		userContext.setBreakCode(_ctx.stringValue("InitiateAttendedTransferResponse.Data.UserContext.BreakCode"));
		userContext.setInstanceId(_ctx.stringValue("InitiateAttendedTransferResponse.Data.UserContext.InstanceId"));
		userContext.setOutboundScenario(_ctx.booleanValue("InitiateAttendedTransferResponse.Data.UserContext.OutboundScenario"));
		userContext.setMobile(_ctx.stringValue("InitiateAttendedTransferResponse.Data.UserContext.Mobile"));
		userContext.setJobId(_ctx.stringValue("InitiateAttendedTransferResponse.Data.UserContext.JobId"));
		userContext.setUserState(_ctx.stringValue("InitiateAttendedTransferResponse.Data.UserContext.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InitiateAttendedTransferResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("InitiateAttendedTransferResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		initiateAttendedTransferResponse.setData(data);
	 
	 	return initiateAttendedTransferResponse;
	}
}