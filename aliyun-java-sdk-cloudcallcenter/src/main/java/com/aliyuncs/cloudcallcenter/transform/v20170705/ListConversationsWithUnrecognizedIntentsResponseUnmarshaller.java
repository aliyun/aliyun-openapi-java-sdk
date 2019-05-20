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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListConversationsWithUnrecognizedIntentsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListConversationsWithUnrecognizedIntentsResponse.Task;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListConversationsWithUnrecognizedIntentsResponse.Task.Contact;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListConversationsWithUnrecognizedIntentsResponse.Task.ConversationDetail;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListConversationsWithUnrecognizedIntentsResponse.Task.ConversationDetail.SummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConversationsWithUnrecognizedIntentsResponseUnmarshaller {

	public static ListConversationsWithUnrecognizedIntentsResponse unmarshall(ListConversationsWithUnrecognizedIntentsResponse listConversationsWithUnrecognizedIntentsResponse, UnmarshallerContext context) {
		
		listConversationsWithUnrecognizedIntentsResponse.setRequestId(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.RequestId"));
		listConversationsWithUnrecognizedIntentsResponse.setSuccess(context.booleanValue("ListConversationsWithUnrecognizedIntentsResponse.Success"));
		listConversationsWithUnrecognizedIntentsResponse.setCode(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Code"));
		listConversationsWithUnrecognizedIntentsResponse.setMessage(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Message"));
		listConversationsWithUnrecognizedIntentsResponse.setHttpStatusCode(context.integerValue("ListConversationsWithUnrecognizedIntentsResponse.HttpStatusCode"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].TaskId"));
			task.setJobId(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].JobId"));

			Contact contact = new Contact();
			contact.setContactId(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Contact.ContactId"));
			contact.setContactName(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Contact.ContactName"));
			contact.setHonorific(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Contact.Honorific"));
			contact.setRole(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Contact.Role"));
			contact.setPhoneNumber(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Contact.PhoneNumber"));
			contact.setState(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Contact.State"));
			contact.setReferenceId(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Contact.ReferenceId"));
			contact.setJobId(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Contact.JobId"));
			task.setContact(contact);

			List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
			for (int j = 0; j < context.lengthValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Conversation.Length"); j++) {
				ConversationDetail conversationDetail = new ConversationDetail();
				conversationDetail.setTimestamp(context.longValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Conversation["+ j +"].Timestamp"));
				conversationDetail.setSpeaker(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Conversation["+ j +"].Speaker"));
				conversationDetail.setScript(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Conversation["+ j +"].Script"));

				List<SummaryItem> summary = new ArrayList<SummaryItem>();
				for (int k = 0; k < context.lengthValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Conversation["+ j +"].Summary.Length"); k++) {
					SummaryItem summaryItem = new SummaryItem();
					summaryItem.setCategory(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Category"));
					summaryItem.setSummaryName(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].SummaryName"));
					summaryItem.setContent(context.stringValue("ListConversationsWithUnrecognizedIntentsResponse.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Content"));

					summary.add(summaryItem);
				}
				conversationDetail.setSummary(summary);

				conversation.add(conversationDetail);
			}
			task.setConversation(conversation);

			tasks.add(task);
		}
		listConversationsWithUnrecognizedIntentsResponse.setTasks(tasks);
	 
	 	return listConversationsWithUnrecognizedIntentsResponse;
	}
}