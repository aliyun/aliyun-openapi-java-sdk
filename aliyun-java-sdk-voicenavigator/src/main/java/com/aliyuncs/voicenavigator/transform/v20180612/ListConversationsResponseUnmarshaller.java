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
		listConversationsResponse.setPageNumber(_ctx.integerValue("ListConversationsResponse.PageNumber"));
		listConversationsResponse.setPageSize(_ctx.integerValue("ListConversationsResponse.PageSize"));

		List<Conversation> conversations = new ArrayList<Conversation>();
		for (int i = 0; i < _ctx.lengthValue("ListConversationsResponse.Conversations.Length"); i++) {
			Conversation conversation = new Conversation();
			conversation.setCallingNumber(_ctx.stringValue("ListConversationsResponse.Conversations["+ i +"].CallingNumber"));
			conversation.setBeginTime(_ctx.longValue("ListConversationsResponse.Conversations["+ i +"].BeginTime"));
			conversation.setEndTime(_ctx.longValue("ListConversationsResponse.Conversations["+ i +"].EndTime"));
			conversation.setTransferredToAgent(_ctx.booleanValue("ListConversationsResponse.Conversations["+ i +"].TransferredToAgent"));
			conversation.setSkillGroupId(_ctx.stringValue("ListConversationsResponse.Conversations["+ i +"].SkillGroupId"));
			conversation.setUserUtteranceCount(_ctx.integerValue("ListConversationsResponse.Conversations["+ i +"].UserUtteranceCount"));
			conversation.setEffectiveAnswerCount(_ctx.integerValue("ListConversationsResponse.Conversations["+ i +"].EffectiveAnswerCount"));
			conversation.setConversationId(_ctx.stringValue("ListConversationsResponse.Conversations["+ i +"].ConversationId"));

			conversations.add(conversation);
		}
		listConversationsResponse.setConversations(conversations);
	 
	 	return listConversationsResponse;
	}
}