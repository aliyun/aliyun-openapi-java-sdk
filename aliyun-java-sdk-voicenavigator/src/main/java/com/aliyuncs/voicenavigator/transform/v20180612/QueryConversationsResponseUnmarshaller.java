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

import com.aliyuncs.voicenavigator.model.v20180612.QueryConversationsResponse;
import com.aliyuncs.voicenavigator.model.v20180612.QueryConversationsResponse.Conversation;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryConversationsResponseUnmarshaller {

	public static QueryConversationsResponse unmarshall(QueryConversationsResponse queryConversationsResponse, UnmarshallerContext _ctx) {
		
		queryConversationsResponse.setRequestId(_ctx.stringValue("QueryConversationsResponse.RequestId"));
		queryConversationsResponse.setTotalCount(_ctx.longValue("QueryConversationsResponse.TotalCount"));
		queryConversationsResponse.setPageNumber(_ctx.integerValue("QueryConversationsResponse.PageNumber"));
		queryConversationsResponse.setPageSize(_ctx.integerValue("QueryConversationsResponse.PageSize"));

		List<Conversation> conversations = new ArrayList<Conversation>();
		for (int i = 0; i < _ctx.lengthValue("QueryConversationsResponse.Conversations.Length"); i++) {
			Conversation conversation = new Conversation();
			conversation.setCallingNumber(_ctx.stringValue("QueryConversationsResponse.Conversations["+ i +"].CallingNumber"));
			conversation.setBeginTime(_ctx.longValue("QueryConversationsResponse.Conversations["+ i +"].BeginTime"));
			conversation.setEndTime(_ctx.longValue("QueryConversationsResponse.Conversations["+ i +"].EndTime"));
			conversation.setTransferredToAgent(_ctx.booleanValue("QueryConversationsResponse.Conversations["+ i +"].TransferredToAgent"));
			conversation.setSkillGroupId(_ctx.stringValue("QueryConversationsResponse.Conversations["+ i +"].SkillGroupId"));
			conversation.setUserUtteranceCount(_ctx.integerValue("QueryConversationsResponse.Conversations["+ i +"].UserUtteranceCount"));
			conversation.setEffectiveAnswerCount(_ctx.integerValue("QueryConversationsResponse.Conversations["+ i +"].EffectiveAnswerCount"));
			conversation.setConversationId(_ctx.stringValue("QueryConversationsResponse.Conversations["+ i +"].ConversationId"));

			conversations.add(conversation);
		}
		queryConversationsResponse.setConversations(conversations);
	 
	 	return queryConversationsResponse;
	}
}