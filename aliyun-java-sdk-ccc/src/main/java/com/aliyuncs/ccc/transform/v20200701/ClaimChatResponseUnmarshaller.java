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

import com.aliyuncs.ccc.model.v20200701.ClaimChatResponse;
import com.aliyuncs.ccc.model.v20200701.ClaimChatResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ClaimChatResponse.Data.ChatContext;
import com.aliyuncs.ccc.model.v20200701.ClaimChatResponse.Data.UserContext;
import com.aliyuncs.transform.UnmarshallerContext;


public class ClaimChatResponseUnmarshaller {

	public static ClaimChatResponse unmarshall(ClaimChatResponse claimChatResponse, UnmarshallerContext _ctx) {
		
		claimChatResponse.setRequestId(_ctx.stringValue("ClaimChatResponse.RequestId"));
		claimChatResponse.setCode(_ctx.stringValue("ClaimChatResponse.Code"));
		claimChatResponse.setHttpStatusCode(_ctx.integerValue("ClaimChatResponse.HttpStatusCode"));
		claimChatResponse.setMessage(_ctx.stringValue("ClaimChatResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ClaimChatResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ClaimChatResponse.Params["+ i +"]"));
		}
		claimChatResponse.setParams(params);

		Data data = new Data();
		data.setContextId(_ctx.longValue("ClaimChatResponse.Data.ContextId"));

		UserContext userContext = new UserContext();
		userContext.setHeartbeat(_ctx.longValue("ClaimChatResponse.Data.UserContext.Heartbeat"));
		userContext.setExtension(_ctx.stringValue("ClaimChatResponse.Data.UserContext.Extension"));
		userContext.setWorkMode(_ctx.stringValue("ClaimChatResponse.Data.UserContext.WorkMode"));
		userContext.setDeviceId(_ctx.stringValue("ClaimChatResponse.Data.UserContext.DeviceId"));
		userContext.setUserId(_ctx.stringValue("ClaimChatResponse.Data.UserContext.UserId"));
		userContext.setReserved(_ctx.longValue("ClaimChatResponse.Data.UserContext.Reserved"));
		userContext.setBreakCode(_ctx.stringValue("ClaimChatResponse.Data.UserContext.BreakCode"));
		userContext.setInstanceId(_ctx.stringValue("ClaimChatResponse.Data.UserContext.InstanceId"));
		userContext.setOutboundScenario(_ctx.booleanValue("ClaimChatResponse.Data.UserContext.OutboundScenario"));
		userContext.setDeviceState(_ctx.stringValue("ClaimChatResponse.Data.UserContext.DeviceState"));
		userContext.setMobile(_ctx.stringValue("ClaimChatResponse.Data.UserContext.Mobile"));
		userContext.setJobId(_ctx.stringValue("ClaimChatResponse.Data.UserContext.JobId"));
		userContext.setUserState(_ctx.stringValue("ClaimChatResponse.Data.UserContext.UserState"));

		List<String> signedSkillGroupIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ClaimChatResponse.Data.UserContext.SignedSkillGroupIdList.Length"); i++) {
			signedSkillGroupIdList.add(_ctx.stringValue("ClaimChatResponse.Data.UserContext.SignedSkillGroupIdList["+ i +"]"));
		}
		userContext.setSignedSkillGroupIdList(signedSkillGroupIdList);
		data.setUserContext(userContext);

		List<ChatContext> chatContexts = new ArrayList<ChatContext>();
		for (int i = 0; i < _ctx.lengthValue("ClaimChatResponse.Data.ChatContexts.Length"); i++) {
			ChatContext chatContext = new ChatContext();
			chatContext.setInstanceId(_ctx.stringValue("ClaimChatResponse.Data.ChatContexts["+ i +"].InstanceId"));
			chatContext.setJobId(_ctx.stringValue("ClaimChatResponse.Data.ChatContexts["+ i +"].JobId"));
			chatContext.setChatType(_ctx.stringValue("ClaimChatResponse.Data.ChatContexts["+ i +"].ChatType"));
			chatContext.setCallVariables(_ctx.stringValue("ClaimChatResponse.Data.ChatContexts["+ i +"].CallVariables"));
			chatContext.setAccessChannelId(_ctx.stringValue("ClaimChatResponse.Data.ChatContexts["+ i +"].AccessChannelId"));
			chatContext.setAccessChannelType(_ctx.stringValue("ClaimChatResponse.Data.ChatContexts["+ i +"].AccessChannelType"));
			chatContext.setAccessChannelName(_ctx.stringValue("ClaimChatResponse.Data.ChatContexts["+ i +"].AccessChannelName"));
			chatContext.setBeingAssigned(_ctx.booleanValue("ClaimChatResponse.Data.ChatContexts["+ i +"].BeingAssigned"));

			chatContexts.add(chatContext);
		}
		data.setChatContexts(chatContexts);
		claimChatResponse.setData(data);
	 
	 	return claimChatResponse;
	}
}