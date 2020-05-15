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

import com.aliyuncs.outboundbot.model.v20191226.GetJobByPhoneNumberResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetJobByPhoneNumberResponse.Job;
import com.aliyuncs.outboundbot.model.v20191226.GetJobByPhoneNumberResponse.Job.Contact;
import com.aliyuncs.outboundbot.model.v20191226.GetJobByPhoneNumberResponse.Job.KeyValuePair;
import com.aliyuncs.outboundbot.model.v20191226.GetJobByPhoneNumberResponse.Job.SummaryItem3;
import com.aliyuncs.outboundbot.model.v20191226.GetJobByPhoneNumberResponse.Job.Task;
import com.aliyuncs.outboundbot.model.v20191226.GetJobByPhoneNumberResponse.Job.Task.Contact2;
import com.aliyuncs.outboundbot.model.v20191226.GetJobByPhoneNumberResponse.Job.Task.ConversationDetail;
import com.aliyuncs.outboundbot.model.v20191226.GetJobByPhoneNumberResponse.Job.Task.ConversationDetail.SummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobByPhoneNumberResponseUnmarshaller {

	public static GetJobByPhoneNumberResponse unmarshall(GetJobByPhoneNumberResponse getJobByPhoneNumberResponse, UnmarshallerContext _ctx) {
		
		getJobByPhoneNumberResponse.setRequestId(_ctx.stringValue("GetJobByPhoneNumberResponse.RequestId"));
		getJobByPhoneNumberResponse.setSuccess(_ctx.booleanValue("GetJobByPhoneNumberResponse.Success"));
		getJobByPhoneNumberResponse.setCode(_ctx.stringValue("GetJobByPhoneNumberResponse.Code"));
		getJobByPhoneNumberResponse.setMessage(_ctx.stringValue("GetJobByPhoneNumberResponse.Message"));
		getJobByPhoneNumberResponse.setHttpStatusCode(_ctx.integerValue("GetJobByPhoneNumberResponse.HttpStatusCode"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("GetJobByPhoneNumberResponse.Jobs.Length"); i++) {
			Job job = new Job();
			job.setJobId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].JobId"));
			job.setGroupId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].GroupId"));
			job.setScenarioId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].ScenarioId"));
			job.setStrategyId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].StrategyId"));
			job.setPriority(_ctx.integerValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Priority"));
			job.setSystemPriority(_ctx.integerValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].SystemPriority"));
			job.setStatus(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Status"));
			job.setReferenceId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].ReferenceId"));
			job.setFailureReason(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].FailureReason"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].CallingNumbers["+ j +"]"));
			}
			job.setCallingNumbers(callingNumbers);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < _ctx.lengthValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setHonorific(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Contacts["+ j +"].Honorific"));
				contact.setRole(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Contacts["+ j +"].Role"));
				contact.setPhoneNumber(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Contacts["+ j +"].State"));
				contact.setReferenceId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Contacts["+ j +"].ReferenceId"));
				contact.setJobId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Contacts["+ j +"].JobId"));

				contacts.add(contact);
			}
			job.setContacts(contacts);

			List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
			for (int j = 0; j < _ctx.lengthValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Extras.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Extras["+ j +"].Key"));
				keyValuePair.setValue(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Extras["+ j +"].Value"));

				extras.add(keyValuePair);
			}
			job.setExtras(extras);

			List<Task> tasks = new ArrayList<Task>();
			for (int j = 0; j < _ctx.lengthValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks.Length"); j++) {
				Task task = new Task();
				task.setTaskId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].TaskId"));
				task.setJobId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].JobId"));
				task.setScenarioId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].ScenarioId"));
				task.setChatbotId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].ChatbotId"));
				task.setPlanedTime(_ctx.longValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].PlanedTime"));
				task.setActualTime(_ctx.longValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].ActualTime"));
				task.setCallingNumber(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].CallingNumber"));
				task.setCalledNumber(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].CalledNumber"));
				task.setCallId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].CallId"));
				task.setStatus(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Status"));
				task.setBrief(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Brief"));
				task.setDuration(_ctx.integerValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Duration"));

				Contact2 contact2 = new Contact2();
				contact2.setContactId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.ContactId"));
				contact2.setContactName(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.ContactName"));
				contact2.setHonorific(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.Honorific"));
				contact2.setRole(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.Role"));
				contact2.setPhoneNumber(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.PhoneNumber"));
				contact2.setState(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.State"));
				contact2.setReferenceId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.ReferenceId"));
				contact2.setJobId(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.JobId"));
				task.setContact2(contact2);

				List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
				for (int k = 0; k < _ctx.lengthValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation.Length"); k++) {
					ConversationDetail conversationDetail = new ConversationDetail();
					conversationDetail.setTimestamp(_ctx.longValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Timestamp"));
					conversationDetail.setSpeaker(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Speaker"));
					conversationDetail.setScript(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Script"));

					List<SummaryItem> summary1 = new ArrayList<SummaryItem>();
					for (int l = 0; l < _ctx.lengthValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary.Length"); l++) {
						SummaryItem summaryItem = new SummaryItem();
						summaryItem.setCategory(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary["+ l +"].Category"));
						summaryItem.setSummaryName(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary["+ l +"].SummaryName"));
						summaryItem.setContent(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary["+ l +"].Content"));

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
			for (int j = 0; j < _ctx.lengthValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Summary.Length"); j++) {
				SummaryItem3 summaryItem3 = new SummaryItem3();
				summaryItem3.setCategory(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Summary["+ j +"].Category"));
				summaryItem3.setSummaryName(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Summary["+ j +"].SummaryName"));
				summaryItem3.setContent(_ctx.stringValue("GetJobByPhoneNumberResponse.Jobs["+ i +"].Summary["+ j +"].Content"));

				summary.add(summaryItem3);
			}
			job.setSummary(summary);

			jobs.add(job);
		}
		getJobByPhoneNumberResponse.setJobs(jobs);
	 
	 	return getJobByPhoneNumberResponse;
	}
}