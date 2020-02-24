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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListConversationsWithUnrecognizedIntentsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntent;
import com.aliyuncs.outboundbot.model.v20191226.ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntent.Contact;
import com.aliyuncs.outboundbot.model.v20191226.ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntent.ConversationDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConversationsWithUnrecognizedIntentsResponseUnmarshaller {

	public static ListConversationsWithUnrecognizedIntentsResponse unmarshall(ListConversationsWithUnrecognizedIntentsResponse listConversationsWithUnrecognizedIntentsResponse, UnmarshallerContext _ctx) {
		
		listConversationsWithUnrecognizedIntentsResponse.setRequestId(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.RequestId"));
		listConversationsWithUnrecognizedIntentsResponse.setSuccess(_ctx.booleanValue("ListConversationsWithUnrecognizedIntentsResponse.Success"));
		listConversationsWithUnrecognizedIntentsResponse.setCode(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Code"));
		listConversationsWithUnrecognizedIntentsResponse.setMessage(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Message"));
		listConversationsWithUnrecognizedIntentsResponse.setHttpStatusCode(_ctx.integerValue("ListConversationsWithUnrecognizedIntentsResponse.HttpStatusCode"));

		List<ConversationsWithUnrecognizedIntent> conversationsWithUnrecognizedIntents = new ArrayList<ConversationsWithUnrecognizedIntent>();
		for (int i = 0; i < _ctx.lengthValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents.Length"); i++) {
			ConversationsWithUnrecognizedIntent conversationsWithUnrecognizedIntent = new ConversationsWithUnrecognizedIntent();
			conversationsWithUnrecognizedIntent.setConversationsWithUnrecognizedIntentId(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].ConversationsWithUnrecognizedIntentId"));
			conversationsWithUnrecognizedIntent.setJobId(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].JobId"));

			Contact contact = new Contact();
			contact.setContactId(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Contact.ContactId"));
			contact.setContactName(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Contact.ContactName"));
			contact.setHonorific(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Contact.Honorific"));
			contact.setRole(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Contact.Role"));
			contact.setPhoneNumber(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Contact.PhoneNumber"));
			contact.setState(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Contact.State"));
			contact.setReferenceId(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Contact.ReferenceId"));
			contact.setJobId(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Contact.JobId"));
			conversationsWithUnrecognizedIntent.setContact(contact);

			List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Conversation.Length"); j++) {
				ConversationDetail conversationDetail = new ConversationDetail();
				conversationDetail.setId(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Conversation["+ j +"].Id"));
				conversationDetail.setTimestamp(_ctx.longValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Conversation["+ j +"].Timestamp"));
				conversationDetail.setSpeaker(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Conversation["+ j +"].Speaker"));
				conversationDetail.setScript(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Conversation["+ j +"].Script"));
				conversationDetail.setNodeId(_ctx.stringValue("ListConversationsWithUnrecognizedIntentsResponse.ConversationsWithUnrecognizedIntents["+ i +"].Conversation["+ j +"].NodeId"));

				conversation.add(conversationDetail);
			}
			conversationsWithUnrecognizedIntent.setConversation(conversation);

			conversationsWithUnrecognizedIntents.add(conversationsWithUnrecognizedIntent);
		}
		listConversationsWithUnrecognizedIntentsResponse.setConversationsWithUnrecognizedIntents(conversationsWithUnrecognizedIntents);
	 
	 	return listConversationsWithUnrecognizedIntentsResponse;
	}
}