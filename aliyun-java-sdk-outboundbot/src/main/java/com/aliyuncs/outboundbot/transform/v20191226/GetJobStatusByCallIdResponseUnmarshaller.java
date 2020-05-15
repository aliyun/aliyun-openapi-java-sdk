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

import com.aliyuncs.outboundbot.model.v20191226.GetJobStatusByCallIdResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetJobStatusByCallIdResponse.Job;
import com.aliyuncs.outboundbot.model.v20191226.GetJobStatusByCallIdResponse.Job.Contact;
import com.aliyuncs.outboundbot.model.v20191226.GetJobStatusByCallIdResponse.Job.KeyValuePair;
import com.aliyuncs.outboundbot.model.v20191226.GetJobStatusByCallIdResponse.Job.SummaryItem3;
import com.aliyuncs.outboundbot.model.v20191226.GetJobStatusByCallIdResponse.Job.Task;
import com.aliyuncs.outboundbot.model.v20191226.GetJobStatusByCallIdResponse.Job.Task.Contact2;
import com.aliyuncs.outboundbot.model.v20191226.GetJobStatusByCallIdResponse.Job.Task.ConversationDetail;
import com.aliyuncs.outboundbot.model.v20191226.GetJobStatusByCallIdResponse.Job.Task.ConversationDetail.SummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobStatusByCallIdResponseUnmarshaller {

	public static GetJobStatusByCallIdResponse unmarshall(GetJobStatusByCallIdResponse getJobStatusByCallIdResponse, UnmarshallerContext _ctx) {
		
		getJobStatusByCallIdResponse.setRequestId(_ctx.stringValue("GetJobStatusByCallIdResponse.RequestId"));
		getJobStatusByCallIdResponse.setSuccess(_ctx.booleanValue("GetJobStatusByCallIdResponse.Success"));
		getJobStatusByCallIdResponse.setCode(_ctx.stringValue("GetJobStatusByCallIdResponse.Code"));
		getJobStatusByCallIdResponse.setMessage(_ctx.stringValue("GetJobStatusByCallIdResponse.Message"));
		getJobStatusByCallIdResponse.setHttpStatusCode(_ctx.integerValue("GetJobStatusByCallIdResponse.HttpStatusCode"));

		Job job = new Job();
		job.setJobId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.JobId"));
		job.setJobGroupId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.JobGroupId"));
		job.setScenarioId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.ScenarioId"));
		job.setStrategyId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.StrategyId"));
		job.setPriority(_ctx.integerValue("GetJobStatusByCallIdResponse.Job.Priority"));
		job.setStatus(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Status"));
		job.setReferenceId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.ReferenceId"));
		job.setFailureReason(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.FailureReason"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetJobStatusByCallIdResponse.Job.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.CallingNumbers["+ i +"]"));
		}
		job.setCallingNumbers(callingNumbers);

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("GetJobStatusByCallIdResponse.Job.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].ContactId"));
			contact.setContactName(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].ContactName"));
			contact.setHonorific(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].Honorific"));
			contact.setRole(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].Role"));
			contact.setPhoneNumber(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].PhoneNumber"));
			contact.setState(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].State"));
			contact.setReferenceId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].ReferenceId"));
			contact.setJobId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].JobId"));

			contacts.add(contact);
		}
		job.setContacts(contacts);

		List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("GetJobStatusByCallIdResponse.Job.Extras.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Extras["+ i +"].Key"));
			keyValuePair.setValue(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Extras["+ i +"].Value"));

			extras.add(keyValuePair);
		}
		job.setExtras(extras);

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("GetJobStatusByCallIdResponse.Job.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].TaskId"));
			task.setJobId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].JobId"));
			task.setScenarioId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].ScenarioId"));
			task.setChatbotId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].ChatbotId"));
			task.setPlanedTime(_ctx.longValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].PlanedTime"));
			task.setActualTime(_ctx.longValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].ActualTime"));
			task.setEndTime(_ctx.longValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].EndTime"));
			task.setCallingNumber(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].CallingNumber"));
			task.setCalledNumber(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].CalledNumber"));
			task.setCallId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].CallId"));
			task.setStatus(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Status"));
			task.setBrief(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Brief"));
			task.setDuration(_ctx.integerValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Duration"));

			Contact2 contact2 = new Contact2();
			contact2.setContactId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.ContactId"));
			contact2.setContactName(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.ContactName"));
			contact2.setHonorific(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.Honorific"));
			contact2.setRole(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.Role"));
			contact2.setPhoneNumber(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.PhoneNumber"));
			contact2.setState(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.State"));
			contact2.setReferenceId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.ReferenceId"));
			contact2.setJobId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.JobId"));
			task.setContact2(contact2);

			List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
			for (int j = 0; j < _ctx.lengthValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation.Length"); j++) {
				ConversationDetail conversationDetail = new ConversationDetail();
				conversationDetail.setConversationId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].ConversationId"));
				conversationDetail.setTaskId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].TaskId"));
				conversationDetail.setTimestamp(_ctx.longValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Timestamp"));
				conversationDetail.setSpeaker(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Speaker"));
				conversationDetail.setScript(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Script"));

				List<SummaryItem> summary1 = new ArrayList<SummaryItem>();
				for (int k = 0; k < _ctx.lengthValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary.Length"); k++) {
					SummaryItem summaryItem = new SummaryItem();
					summaryItem.setSummaryId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].SummaryId"));
					summaryItem.setCategory(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Category"));
					summaryItem.setSummaryName(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].SummaryName"));
					summaryItem.setContent(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Content"));

					summary1.add(summaryItem);
				}
				conversationDetail.setSummary1(summary1);

				conversation.add(conversationDetail);
			}
			task.setConversation(conversation);

			tasks.add(task);
		}
		job.setTasks(tasks);

		List<SummaryItem3> summary = new ArrayList<SummaryItem3>();
		for (int i = 0; i < _ctx.lengthValue("GetJobStatusByCallIdResponse.Job.Summary.Length"); i++) {
			SummaryItem3 summaryItem3 = new SummaryItem3();
			summaryItem3.setSummaryId(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Summary["+ i +"].SummaryId"));
			summaryItem3.setCategory(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Summary["+ i +"].Category"));
			summaryItem3.setSummaryName(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Summary["+ i +"].SummaryName"));
			summaryItem3.setContent(_ctx.stringValue("GetJobStatusByCallIdResponse.Job.Summary["+ i +"].Content"));

			summary.add(summaryItem3);
		}
		job.setSummary(summary);
		getJobStatusByCallIdResponse.setJob(job);
	 
	 	return getJobStatusByCallIdResponse;
	}
}