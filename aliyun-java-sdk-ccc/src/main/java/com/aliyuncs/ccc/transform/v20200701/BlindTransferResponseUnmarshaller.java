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

import com.aliyuncs.ccc.model.v20200701.BlindTransferResponse;
import com.aliyuncs.ccc.model.v20200701.BlindTransferResponse.Data;
import com.aliyuncs.ccc.model.v20200701.BlindTransferResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.BlindTransferResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.BlindTransferResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BlindTransferResponseUnmarshaller {

	public static BlindTransferResponse unmarshall(BlindTransferResponse blindTransferResponse, UnmarshallerContext _ctx) {
		
		blindTransferResponse.setRequestId(_ctx.stringValue("BlindTransferResponse.RequestId"));
		blindTransferResponse.setCode(_ctx.stringValue("BlindTransferResponse.Code"));
		blindTransferResponse.setHttpStatusCode(_ctx.integerValue("BlindTransferResponse.HttpStatusCode"));
		blindTransferResponse.setMessage(_ctx.stringValue("BlindTransferResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BlindTransferResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("BlindTransferResponse.Params["+ i +"]"));
		}
		blindTransferResponse.setParams(params);

		Data data = new Data();
		data.setContextId(_ctx.longValue("BlindTransferResponse.Data.ContextId"));

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("BlindTransferResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("BlindTransferResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("BlindTransferResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("BlindTransferResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setReleaseInitiator(_ctx.stringValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setChannelState(_ctx.stringValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setUserId(_ctx.stringValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));
			channelContext.setChannelFlags(_ctx.stringValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setTimestamp(_ctx.longValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setAssociatedData(_ctx.mapValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setReleaseReason(_ctx.stringValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setCallType(_ctx.stringValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setJobId(_ctx.stringValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setChannelId(_ctx.stringValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setOriginator(_ctx.stringValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setUserExtension(_ctx.stringValue("BlindTransferResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setExtension(_ctx.stringValue("BlindTransferResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("BlindTransferResponse.Data.UserContext.Heartbeat"));
		userContext.setWorkMode(_ctx.stringValue("BlindTransferResponse.Data.UserContext.WorkMode"));
		userContext.setDeviceId(_ctx.stringValue("BlindTransferResponse.Data.UserContext.DeviceId"));
		userContext.setUserId(_ctx.stringValue("BlindTransferResponse.Data.UserContext.UserId"));
		userContext.setReserved(_ctx.longValue("BlindTransferResponse.Data.UserContext.Reserved"));
		userContext.setBreakCode(_ctx.stringValue("BlindTransferResponse.Data.UserContext.BreakCode"));
		userContext.setInstanceId(_ctx.stringValue("BlindTransferResponse.Data.UserContext.InstanceId"));
		userContext.setOutboundScenario(_ctx.booleanValue("BlindTransferResponse.Data.UserContext.OutboundScenario"));
		userContext.setMobile(_ctx.stringValue("BlindTransferResponse.Data.UserContext.Mobile"));
		userContext.setJobId(_ctx.stringValue("BlindTransferResponse.Data.UserContext.JobId"));
		userContext.setUserState(_ctx.stringValue("BlindTransferResponse.Data.UserContext.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BlindTransferResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("BlindTransferResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		blindTransferResponse.setData(data);
	 
	 	return blindTransferResponse;
	}
}