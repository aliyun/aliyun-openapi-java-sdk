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

import com.aliyuncs.ccc.model.v20200701.RedialCallResponse;
import com.aliyuncs.ccc.model.v20200701.RedialCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.RedialCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.RedialCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.RedialCallResponse.Data.UserContext;
import com.aliyuncs.transform.UnmarshallerContext;


public class RedialCallResponseUnmarshaller {

	public static RedialCallResponse unmarshall(RedialCallResponse redialCallResponse, UnmarshallerContext _ctx) {
		
		redialCallResponse.setRequestId(_ctx.stringValue("RedialCallResponse.RequestId"));
		redialCallResponse.setCode(_ctx.stringValue("RedialCallResponse.Code"));
		redialCallResponse.setHttpStatusCode(_ctx.integerValue("RedialCallResponse.HttpStatusCode"));
		redialCallResponse.setMessage(_ctx.stringValue("RedialCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RedialCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("RedialCallResponse.Params["+ i +"]"));
		}
		redialCallResponse.setParams(params);

		Data data = new Data();
		data.setContextId(_ctx.longValue("RedialCallResponse.Data.ContextId"));

		CallContext callContext = new CallContext();
		callContext.setCallType(_ctx.stringValue("RedialCallResponse.Data.CallContext.CallType"));
		callContext.setInstanceId(_ctx.stringValue("RedialCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("RedialCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("RedialCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setReleaseInitiator(_ctx.stringValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setChannelState(_ctx.stringValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setUserId(_ctx.stringValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));
			channelContext.setChannelFlags(_ctx.stringValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelFlags"));
			channelContext.setTimestamp(_ctx.longValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setReleaseReason(_ctx.stringValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setCallType(_ctx.stringValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setJobId(_ctx.stringValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setChannelId(_ctx.stringValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setOriginator(_ctx.stringValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setUserExtension(_ctx.stringValue("RedialCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setExtension(_ctx.stringValue("RedialCallResponse.Data.UserContext.Extension"));
		userContext.setWorkMode(_ctx.stringValue("RedialCallResponse.Data.UserContext.WorkMode"));
		userContext.setDeviceId(_ctx.stringValue("RedialCallResponse.Data.UserContext.DeviceId"));
		userContext.setJobId(_ctx.stringValue("RedialCallResponse.Data.UserContext.JobId"));
		userContext.setUserId(_ctx.stringValue("RedialCallResponse.Data.UserContext.UserId"));
		userContext.setBreakCode(_ctx.stringValue("RedialCallResponse.Data.UserContext.BreakCode"));
		userContext.setInstanceId(_ctx.stringValue("RedialCallResponse.Data.UserContext.InstanceId"));
		userContext.setOutboundScenario(_ctx.booleanValue("RedialCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setUserState(_ctx.stringValue("RedialCallResponse.Data.UserContext.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RedialCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("RedialCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		redialCallResponse.setData(data);
	 
	 	return redialCallResponse;
	}
}