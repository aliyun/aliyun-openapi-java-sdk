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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnConversationsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListVnConversationsResponse.Conversation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVnConversationsResponseUnmarshaller {

	public static ListVnConversationsResponse unmarshall(ListVnConversationsResponse listVnConversationsResponse, UnmarshallerContext context) {
		
		listVnConversationsResponse.setRequestId(context.stringValue("ListVnConversationsResponse.RequestId"));
		listVnConversationsResponse.setTotalCount(context.longValue("ListVnConversationsResponse.TotalCount"));
		listVnConversationsResponse.setPageNumber(context.integerValue("ListVnConversationsResponse.PageNumber"));
		listVnConversationsResponse.setPageSize(context.integerValue("ListVnConversationsResponse.PageSize"));

		List<Conversation> conversations = new ArrayList<Conversation>();
		for (int i = 0; i < context.lengthValue("ListVnConversationsResponse.Conversations.Length"); i++) {
			Conversation conversation = new Conversation();
			conversation.setCallingNumber(context.stringValue("ListVnConversationsResponse.Conversations["+ i +"].CallingNumber"));
			conversation.setBeginTime(context.longValue("ListVnConversationsResponse.Conversations["+ i +"].BeginTime"));
			conversation.setEndTime(context.longValue("ListVnConversationsResponse.Conversations["+ i +"].EndTime"));
			conversation.setTransferredToAgent(context.booleanValue("ListVnConversationsResponse.Conversations["+ i +"].TransferredToAgent"));
			conversation.setSkillGroupId(context.stringValue("ListVnConversationsResponse.Conversations["+ i +"].SkillGroupId"));
			conversation.setUserUtteranceCount(context.integerValue("ListVnConversationsResponse.Conversations["+ i +"].UserUtteranceCount"));
			conversation.setEffectiveAnswerCount(context.integerValue("ListVnConversationsResponse.Conversations["+ i +"].EffectiveAnswerCount"));
			conversation.setConversationId(context.stringValue("ListVnConversationsResponse.Conversations["+ i +"].ConversationId"));

			conversations.add(conversation);
		}
		listVnConversationsResponse.setConversations(conversations);
	 
	 	return listVnConversationsResponse;
	}
}