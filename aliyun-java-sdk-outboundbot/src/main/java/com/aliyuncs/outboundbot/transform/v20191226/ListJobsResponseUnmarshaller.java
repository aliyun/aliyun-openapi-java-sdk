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

import com.aliyuncs.outboundbot.model.v20191226.ListJobsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListJobsResponse.Job;
import com.aliyuncs.outboundbot.model.v20191226.ListJobsResponse.Job.Contact;
import com.aliyuncs.outboundbot.model.v20191226.ListJobsResponse.Job.KeyValuePair;
import com.aliyuncs.outboundbot.model.v20191226.ListJobsResponse.Job.SummaryItem3;
import com.aliyuncs.outboundbot.model.v20191226.ListJobsResponse.Job.Task;
import com.aliyuncs.outboundbot.model.v20191226.ListJobsResponse.Job.Task.Contact2;
import com.aliyuncs.outboundbot.model.v20191226.ListJobsResponse.Job.Task.ConversationDetail;
import com.aliyuncs.outboundbot.model.v20191226.ListJobsResponse.Job.Task.ConversationDetail.SummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsResponseUnmarshaller {

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext _ctx) {
		
		listJobsResponse.setRequestId(_ctx.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setSuccess(_ctx.booleanValue("ListJobsResponse.Success"));
		listJobsResponse.setCode(_ctx.stringValue("ListJobsResponse.Code"));
		listJobsResponse.setMessage(_ctx.stringValue("ListJobsResponse.Message"));
		listJobsResponse.setHttpStatusCode(_ctx.integerValue("ListJobsResponse.HttpStatusCode"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListJobsResponse.Jobs.Length"); i++) {
			Job job = new Job();
			job.setJobId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].JobId"));
			job.setJobGroupId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].JobGroupId"));
			job.setScenarioId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].ScenarioId"));
			job.setStrategyId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].StrategyId"));
			job.setPriority(_ctx.integerValue("ListJobsResponse.Jobs["+ i +"].Priority"));
			job.setSystemPriority(_ctx.integerValue("ListJobsResponse.Jobs["+ i +"].SystemPriority"));
			job.setStatus(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Status"));
			job.setReferenceId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].ReferenceId"));
			job.setFailureReason(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].FailureReason"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListJobsResponse.Jobs["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].CallingNumbers["+ j +"]"));
			}
			job.setCallingNumbers(callingNumbers);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < _ctx.lengthValue("ListJobsResponse.Jobs["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setHonorific(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Contacts["+ j +"].Honorific"));
				contact.setRole(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Contacts["+ j +"].Role"));
				contact.setPhoneNumber(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Contacts["+ j +"].State"));
				contact.setReferenceId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Contacts["+ j +"].ReferenceId"));
				contact.setJobId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Contacts["+ j +"].JobId"));

				contacts.add(contact);
			}
			job.setContacts(contacts);

			List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
			for (int j = 0; j < _ctx.lengthValue("ListJobsResponse.Jobs["+ i +"].Extras.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Extras["+ j +"].Key"));
				keyValuePair.setValue(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Extras["+ j +"].Value"));

				extras.add(keyValuePair);
			}
			job.setExtras(extras);

			List<Task> tasks = new ArrayList<Task>();
			for (int j = 0; j < _ctx.lengthValue("ListJobsResponse.Jobs["+ i +"].Tasks.Length"); j++) {
				Task task = new Task();
				task.setTaskId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].TaskId"));
				task.setJobId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].JobId"));
				task.setScenarioId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].ScenarioId"));
				task.setChatbotId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].ChatbotId"));
				task.setPlanedTime(_ctx.longValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].PlanedTime"));
				task.setActualTime(_ctx.longValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].ActualTime"));
				task.setCallingNumber(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].CallingNumber"));
				task.setCalledNumber(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].CalledNumber"));
				task.setCallId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].CallId"));
				task.setStatus(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Status"));
				task.setBrief(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Brief"));
				task.setDuration(_ctx.integerValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Duration"));

				Contact2 contact2 = new Contact2();
				contact2.setContactId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.ContactId"));
				contact2.setContactName(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.ContactName"));
				contact2.setHonorific(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.Honorific"));
				contact2.setRole(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.Role"));
				contact2.setPhoneNumber(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.PhoneNumber"));
				contact2.setState(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.State"));
				contact2.setReferenceId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.ReferenceId"));
				contact2.setJobId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.JobId"));
				task.setContact2(contact2);

				List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
				for (int k = 0; k < _ctx.lengthValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation.Length"); k++) {
					ConversationDetail conversationDetail = new ConversationDetail();
					conversationDetail.setTimestamp(_ctx.longValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Timestamp"));
					conversationDetail.setSpeaker(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Speaker"));
					conversationDetail.setScript(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Script"));

					List<SummaryItem> summary1 = new ArrayList<SummaryItem>();
					for (int l = 0; l < _ctx.lengthValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary.Length"); l++) {
						SummaryItem summaryItem = new SummaryItem();
						summaryItem.setCategory(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary["+ l +"].Category"));
						summaryItem.setSummaryName(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary["+ l +"].SummaryName"));
						summaryItem.setContent(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary["+ l +"].Content"));

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
			for (int j = 0; j < _ctx.lengthValue("ListJobsResponse.Jobs["+ i +"].Summary.Length"); j++) {
				SummaryItem3 summaryItem3 = new SummaryItem3();
				summaryItem3.setCategory(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Summary["+ j +"].Category"));
				summaryItem3.setSummaryName(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Summary["+ j +"].SummaryName"));
				summaryItem3.setContent(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Summary["+ j +"].Content"));

				summary.add(summaryItem3);
			}
			job.setSummary(summary);

			jobs.add(job);
		}
		listJobsResponse.setJobs(jobs);
	 
	 	return listJobsResponse;
	}
}