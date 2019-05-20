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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryVnConversationsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryVnConversationsResponse.Conversation;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVnConversationsResponseUnmarshaller {

	public static QueryVnConversationsResponse unmarshall(QueryVnConversationsResponse queryVnConversationsResponse, UnmarshallerContext context) {
		
		queryVnConversationsResponse.setRequestId(context.stringValue("QueryVnConversationsResponse.RequestId"));
		queryVnConversationsResponse.setTotalCount(context.longValue("QueryVnConversationsResponse.TotalCount"));
		queryVnConversationsResponse.setPageNumber(context.integerValue("QueryVnConversationsResponse.PageNumber"));
		queryVnConversationsResponse.setPageSize(context.integerValue("QueryVnConversationsResponse.PageSize"));

		List<Conversation> conversations = new ArrayList<Conversation>();
		for (int i = 0; i < context.lengthValue("QueryVnConversationsResponse.Conversations.Length"); i++) {
			Conversation conversation = new Conversation();
			conversation.setCallingNumber(context.stringValue("QueryVnConversationsResponse.Conversations["+ i +"].CallingNumber"));
			conversation.setBeginTime(context.longValue("QueryVnConversationsResponse.Conversations["+ i +"].BeginTime"));
			conversation.setEndTime(context.longValue("QueryVnConversationsResponse.Conversations["+ i +"].EndTime"));
			conversation.setTransferredToAgent(context.booleanValue("QueryVnConversationsResponse.Conversations["+ i +"].TransferredToAgent"));
			conversation.setSkillGroupId(context.stringValue("QueryVnConversationsResponse.Conversations["+ i +"].SkillGroupId"));
			conversation.setUserUtteranceCount(context.integerValue("QueryVnConversationsResponse.Conversations["+ i +"].UserUtteranceCount"));
			conversation.setEffectiveAnswerCount(context.integerValue("QueryVnConversationsResponse.Conversations["+ i +"].EffectiveAnswerCount"));
			conversation.setConversationId(context.stringValue("QueryVnConversationsResponse.Conversations["+ i +"].ConversationId"));

			conversations.add(conversation);
		}
		queryVnConversationsResponse.setConversations(conversations);
	 
	 	return queryVnConversationsResponse;
	}
}