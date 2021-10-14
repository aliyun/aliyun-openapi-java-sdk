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

import com.aliyuncs.ccc.model.v20200701.RetrieveCallResponse;
import com.aliyuncs.ccc.model.v20200701.RetrieveCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.RetrieveCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.RetrieveCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.RetrieveCallResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetrieveCallResponseUnmarshaller {

	public static RetrieveCallResponse unmarshall(RetrieveCallResponse retrieveCallResponse, UnmarshallerContext _ctx) {
		
		retrieveCallResponse.setRequestId(_ctx.stringValue("RetrieveCallResponse.RequestId"));
		retrieveCallResponse.setCode(_ctx.stringValue("RetrieveCallResponse.Code"));
		retrieveCallResponse.setHttpStatusCode(_ctx.integerValue("RetrieveCallResponse.HttpStatusCode"));
		retrieveCallResponse.setMessage(_ctx.stringValue("RetrieveCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RetrieveCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("RetrieveCallResponse.Params["+ i +"]"));
		}
		retrieveCallResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("RetrieveCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setAssociatedData(_ctx.mapValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setCallType(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setChannelId(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setChannelState(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setJobId(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setOriginator(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setReleaseInitiator(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setReleaseReason(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setSkillGroupId(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].SkillGroupId"));
			channelContext.setTimestamp(_ctx.longValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setUserExtension(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));
			channelContext.setUserId(_ctx.stringValue("RetrieveCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setBreakCode(_ctx.stringValue("RetrieveCallResponse.Data.UserContext.BreakCode"));
		userContext.setDeviceId(_ctx.stringValue("RetrieveCallResponse.Data.UserContext.DeviceId"));
		userContext.setExtension(_ctx.stringValue("RetrieveCallResponse.Data.UserContext.Extension"));
		userContext.setHeartbeat(_ctx.longValue("RetrieveCallResponse.Data.UserContext.Heartbeat"));
		userContext.setInstanceId(_ctx.stringValue("RetrieveCallResponse.Data.UserContext.InstanceId"));
		userContext.setJobId(_ctx.stringValue("RetrieveCallResponse.Data.UserContext.JobId"));
		userContext.setMobile(_ctx.stringValue("RetrieveCallResponse.Data.UserContext.Mobile"));
		userContext.setOutboundScenario(_ctx.booleanValue("RetrieveCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setReserved(_ctx.longValue("RetrieveCallResponse.Data.UserContext.Reserved"));
		userContext.setUserId(_ctx.stringValue("RetrieveCallResponse.Data.UserContext.UserId"));
		userContext.setUserState(_ctx.stringValue("RetrieveCallResponse.Data.UserContext.UserState"));
		userContext.setWorkMode(_ctx.stringValue("RetrieveCallResponse.Data.UserContext.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RetrieveCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("RetrieveCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		retrieveCallResponse.setData(data);
	 
	 	return retrieveCallResponse;
	}
}