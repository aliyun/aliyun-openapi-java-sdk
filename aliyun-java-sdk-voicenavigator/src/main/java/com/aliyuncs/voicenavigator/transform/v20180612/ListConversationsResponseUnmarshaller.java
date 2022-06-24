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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.ListConversationsResponse;
import com.aliyuncs.voicenavigator.model.v20180612.ListConversationsResponse.Conversation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConversationsResponseUnmarshaller {

	public static ListConversationsResponse unmarshall(ListConversationsResponse listConversationsResponse, UnmarshallerContext _ctx) {
		
		listConversationsResponse.setRequestId(_ctx.stringValue("ListConversationsResponse.RequestId"));
		listConversationsResponse.setTotalCount(_ctx.longValue("ListConversationsResponse.TotalCount"));
		listConversationsResponse.setPageSize(_ctx.integerValue("ListConversationsResponse.PageSize"));
		listConversationsResponse.setPageNumber(_ctx.integerValue("ListConversationsResponse.PageNumber"));

		List<Conversation> conversations = new ArrayList<Conversation>();
		for (int i = 0; i < _ctx.lengthValue("ListConversationsResponse.Conversations.Length"); i++) {
			Conversation conversation = new Conversation();
			conversation.setEndTime(_ctx.longValue("ListConversationsResponse.Conversations["+ i +"].EndTime"));
			conversation.setHasToAgent(_ctx.booleanValue("ListConversationsResponse.Conversations["+ i +"].HasToAgent"));
			conversation.setStartTime(_ctx.longValue("ListConversationsResponse.Conversations["+ i +"].StartTime"));
			conversation.setSkillGroup(_ctx.stringValue("ListConversationsResponse.Conversations["+ i +"].SkillGroup"));
			conversation.setConversationId(_ctx.stringValue("ListConversationsResponse.Conversations["+ i +"].ConversationId"));
			conversation.setCallingNumber(_ctx.stringValue("ListConversationsResponse.Conversations["+ i +"].CallingNumber"));
			conversation.setEndReason(_ctx.integerValue("ListConversationsResponse.Conversations["+ i +"].EndReason"));
			conversation.setRounds(_ctx.integerValue("ListConversationsResponse.Conversations["+ i +"].Rounds"));
			conversation.setHasLastPlaybackCompleted(_ctx.booleanValue("ListConversationsResponse.Conversations["+ i +"].HasLastPlaybackCompleted"));
			conversation.setSandBox(_ctx.booleanValue("ListConversationsResponse.Conversations["+ i +"].SandBox"));
			conversation.setCalledNumber(_ctx.stringValue("ListConversationsResponse.Conversations["+ i +"].CalledNumber"));

			conversations.add(conversation);
		}
		listConversationsResponse.setConversations(conversations);
	 
	 	return listConversationsResponse;
	}
}