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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.GetTaskListResponse;
import com.aliyuncs.ccc.model.v20170705.GetTaskListResponse.Task;
import com.aliyuncs.ccc.model.v20170705.GetTaskListResponse.Task.Contact;
import com.aliyuncs.ccc.model.v20170705.GetTaskListResponse.Task.ConversationDetail;
import com.aliyuncs.ccc.model.v20170705.GetTaskListResponse.Task.ConversationDetail.SummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskListResponseUnmarshaller {

	public static GetTaskListResponse unmarshall(GetTaskListResponse getTaskListResponse, UnmarshallerContext _ctx) {
		
		getTaskListResponse.setRequestId(_ctx.stringValue("GetTaskListResponse.RequestId"));
		getTaskListResponse.setSuccess(_ctx.booleanValue("GetTaskListResponse.Success"));
		getTaskListResponse.setCode(_ctx.stringValue("GetTaskListResponse.Code"));
		getTaskListResponse.setMessage(_ctx.stringValue("GetTaskListResponse.Message"));
		getTaskListResponse.setHttpStatusCode(_ctx.integerValue("GetTaskListResponse.HttpStatusCode"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskListResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].TaskId"));
			task.setJobId(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].JobId"));
			task.setScenarioId(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].ScenarioId"));
			task.setChatbotId(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].ChatbotId"));
			task.setPlanedTime(_ctx.longValue("GetTaskListResponse.Tasks["+ i +"].PlanedTime"));
			task.setActualTime(_ctx.longValue("GetTaskListResponse.Tasks["+ i +"].ActualTime"));
			task.setCallingNumber(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].CallingNumber"));
			task.setCalledNumber(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].CalledNumber"));
			task.setCallId(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].CallId"));
			task.setStatus(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Status"));
			task.setBrief(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Brief"));
			task.setDuration(_ctx.integerValue("GetTaskListResponse.Tasks["+ i +"].Duration"));

			Contact contact = new Contact();
			contact.setContactId(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Contact.ContactId"));
			contact.setContactName(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Contact.ContactName"));
			contact.setHonorific(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Contact.Honorific"));
			contact.setRole(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Contact.Role"));
			contact.setPhoneNumber(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Contact.PhoneNumber"));
			contact.setState(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Contact.State"));
			contact.setReferenceId(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Contact.ReferenceId"));
			contact.setJobId(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Contact.JobId"));
			task.setContact(contact);

			List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskListResponse.Tasks["+ i +"].Conversation.Length"); j++) {
				ConversationDetail conversationDetail = new ConversationDetail();
				conversationDetail.setTimestamp(_ctx.longValue("GetTaskListResponse.Tasks["+ i +"].Conversation["+ j +"].Timestamp"));
				conversationDetail.setSpeaker(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Conversation["+ j +"].Speaker"));
				conversationDetail.setScript(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Conversation["+ j +"].Script"));

				List<SummaryItem> summary = new ArrayList<SummaryItem>();
				for (int k = 0; k < _ctx.lengthValue("GetTaskListResponse.Tasks["+ i +"].Conversation["+ j +"].Summary.Length"); k++) {
					SummaryItem summaryItem = new SummaryItem();
					summaryItem.setCategory(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Category"));
					summaryItem.setSummaryName(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].SummaryName"));
					summaryItem.setContent(_ctx.stringValue("GetTaskListResponse.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Content"));

					summary.add(summaryItem);
				}
				conversationDetail.setSummary(summary);

				conversation.add(conversationDetail);
			}
			task.setConversation(conversation);

			tasks.add(task);
		}
		getTaskListResponse.setTasks(tasks);
	 
	 	return getTaskListResponse;
	}
}