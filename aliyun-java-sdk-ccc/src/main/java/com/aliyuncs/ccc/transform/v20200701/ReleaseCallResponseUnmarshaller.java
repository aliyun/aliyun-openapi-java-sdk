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

import com.aliyuncs.ccc.model.v20200701.ReleaseCallResponse;
import com.aliyuncs.ccc.model.v20200701.ReleaseCallResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ReleaseCallResponse.Data.CallContext;
import com.aliyuncs.ccc.model.v20200701.ReleaseCallResponse.Data.CallContext.ChannelContext;
import com.aliyuncs.ccc.model.v20200701.ReleaseCallResponse.Data.UserContext;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseCallResponseUnmarshaller {

	public static ReleaseCallResponse unmarshall(ReleaseCallResponse releaseCallResponse, UnmarshallerContext _ctx) {
		
		releaseCallResponse.setRequestId(_ctx.stringValue("ReleaseCallResponse.RequestId"));
		releaseCallResponse.setCode(_ctx.stringValue("ReleaseCallResponse.Code"));
		releaseCallResponse.setHttpStatusCode(_ctx.integerValue("ReleaseCallResponse.HttpStatusCode"));
		releaseCallResponse.setMessage(_ctx.stringValue("ReleaseCallResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ReleaseCallResponse.Params["+ i +"]"));
		}
		releaseCallResponse.setParams(params);

		Data data = new Data();

		CallContext callContext = new CallContext();
		callContext.setInstanceId(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.InstanceId"));
		callContext.setJobId(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.JobId"));

		List<ChannelContext> channelContexts = new ArrayList<ChannelContext>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseCallResponse.Data.CallContext.ChannelContexts.Length"); i++) {
			ChannelContext channelContext = new ChannelContext();
			channelContext.setAssociatedData(_ctx.mapValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].AssociatedData"));
			channelContext.setCallType(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].CallType"));
			channelContext.setChannelId(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelId"));
			channelContext.setChannelState(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].ChannelState"));
			channelContext.setDestination(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].Destination"));
			channelContext.setJobId(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].JobId"));
			channelContext.setOriginator(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].Originator"));
			channelContext.setReleaseInitiator(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseInitiator"));
			channelContext.setReleaseReason(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].ReleaseReason"));
			channelContext.setTimestamp(_ctx.longValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].Timestamp"));
			channelContext.setUserExtension(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserExtension"));
			channelContext.setUserId(_ctx.stringValue("ReleaseCallResponse.Data.CallContext.ChannelContexts["+ i +"].UserId"));

			channelContexts.add(channelContext);
		}
		callContext.setChannelContexts(channelContexts);
		data.setCallContext(callContext);

		UserContext userContext = new UserContext();
		userContext.setBreakCode(_ctx.stringValue("ReleaseCallResponse.Data.UserContext.BreakCode"));
		userContext.setDeviceId(_ctx.stringValue("ReleaseCallResponse.Data.UserContext.DeviceId"));
		userContext.setExtension(_ctx.stringValue("ReleaseCallResponse.Data.UserContext.Extension"));
		userContext.setInstanceId(_ctx.stringValue("ReleaseCallResponse.Data.UserContext.InstanceId"));
		userContext.setJobId(_ctx.stringValue("ReleaseCallResponse.Data.UserContext.JobId"));
		userContext.setOutboundScenario(_ctx.booleanValue("ReleaseCallResponse.Data.UserContext.OutboundScenario"));
		userContext.setUserId(_ctx.stringValue("ReleaseCallResponse.Data.UserContext.UserId"));
		userContext.setUserState(_ctx.stringValue("ReleaseCallResponse.Data.UserContext.UserState"));
		userContext.setWorkMode(_ctx.stringValue("ReleaseCallResponse.Data.UserContext.WorkMode"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseCallResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("ReleaseCallResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);
		releaseCallResponse.setData(data);
	 
	 	return releaseCallResponse;
	}
}