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

import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.Contact;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.KeyValuePair;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.SummaryItem;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.Task;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.Task.Contact3;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.Task.ConversationDetail;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.Task.ConversationDetail.SummaryItem2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobResponseUnmarshaller {

	public static DescribeJobResponse unmarshall(DescribeJobResponse describeJobResponse, UnmarshallerContext _ctx) {
		
		describeJobResponse.setRequestId(_ctx.stringValue("DescribeJobResponse.RequestId"));
		describeJobResponse.setCode(_ctx.stringValue("DescribeJobResponse.Code"));
		describeJobResponse.setHttpStatusCode(_ctx.integerValue("DescribeJobResponse.HttpStatusCode"));
		describeJobResponse.setMessage(_ctx.stringValue("DescribeJobResponse.Message"));
		describeJobResponse.setSuccess(_ctx.booleanValue("DescribeJobResponse.Success"));

		Job job = new Job();
		job.setFailureReason(_ctx.stringValue("DescribeJobResponse.Job.FailureReason"));
		job.setJobGroupId(_ctx.stringValue("DescribeJobResponse.Job.JobGroupId"));
		job.setJobId(_ctx.stringValue("DescribeJobResponse.Job.JobId"));
		job.setPriority(_ctx.integerValue("DescribeJobResponse.Job.Priority"));
		job.setReferenceId(_ctx.stringValue("DescribeJobResponse.Job.ReferenceId"));
		job.setScenarioId(_ctx.stringValue("DescribeJobResponse.Job.ScenarioId"));
		job.setStatus(_ctx.stringValue("DescribeJobResponse.Job.Status"));
		job.setStrategyId(_ctx.stringValue("DescribeJobResponse.Job.StrategyId"));
		job.setSystemPriority(_ctx.integerValue("DescribeJobResponse.Job.SystemPriority"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Job.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("DescribeJobResponse.Job.CallingNumbers["+ i +"]"));
		}
		job.setCallingNumbers(callingNumbers);

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Job.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].ContactId"));
			contact.setContactName(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].ContactName"));
			contact.setHonorific(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].Honorific"));
			contact.setJobId(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].JobId"));
			contact.setPhoneNumber(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].PhoneNumber"));
			contact.setReferenceId(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].ReferenceId"));
			contact.setRole(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].Role"));
			contact.setState(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].State"));

			contacts.add(contact);
		}
		job.setContacts(contacts);

		List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Job.Extras.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(_ctx.stringValue("DescribeJobResponse.Job.Extras["+ i +"].Key"));
			keyValuePair.setValue(_ctx.stringValue("DescribeJobResponse.Job.Extras["+ i +"].Value"));

			extras.add(keyValuePair);
		}
		job.setExtras(extras);

		List<SummaryItem> summary = new ArrayList<SummaryItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Job.Summary.Length"); i++) {
			SummaryItem summaryItem = new SummaryItem();
			summaryItem.setCategory(_ctx.stringValue("DescribeJobResponse.Job.Summary["+ i +"].Category"));
			summaryItem.setContent(_ctx.stringValue("DescribeJobResponse.Job.Summary["+ i +"].Content"));
			summaryItem.setSummaryName(_ctx.stringValue("DescribeJobResponse.Job.Summary["+ i +"].SummaryName"));

			summary.add(summaryItem);
		}
		job.setSummary(summary);

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Job.Tasks.Length"); i++) {
			Task task = new Task();
			task.setActualTime(_ctx.longValue("DescribeJobResponse.Job.Tasks["+ i +"].ActualTime"));
			task.setBrief(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Brief"));
			task.setCallId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].CallId"));
			task.setCalledNumber(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].CalledNumber"));
			task.setCallingNumber(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].CallingNumber"));
			task.setChatbotId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].ChatbotId"));
			task.setDuration(_ctx.integerValue("DescribeJobResponse.Job.Tasks["+ i +"].Duration"));
			task.setJobId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].JobId"));
			task.setPlanedTime(_ctx.longValue("DescribeJobResponse.Job.Tasks["+ i +"].PlanedTime"));
			task.setScenarioId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].ScenarioId"));
			task.setStatus(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Status"));
			task.setTaskId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].TaskId"));

			Contact3 contact3 = new Contact3();
			contact3.setContactId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.ContactId"));
			contact3.setContactName(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.ContactName"));
			contact3.setHonorific(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.Honorific"));
			contact3.setJobId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.JobId"));
			contact3.setPhoneNumber(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.PhoneNumber"));
			contact3.setReferenceId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.ReferenceId"));
			contact3.setRole(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.Role"));
			contact3.setState(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.State"));
			task.setContact3(contact3);

			List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation.Length"); j++) {
				ConversationDetail conversationDetail = new ConversationDetail();
				conversationDetail.setScript(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Script"));
				conversationDetail.setSpeaker(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Speaker"));
				conversationDetail.setTimestamp(_ctx.longValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Timestamp"));

				List<SummaryItem2> summary1 = new ArrayList<SummaryItem2>();
				for (int k = 0; k < _ctx.lengthValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary.Length"); k++) {
					SummaryItem2 summaryItem2 = new SummaryItem2();
					summaryItem2.setCategory(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Category"));
					summaryItem2.setContent(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Content"));
					summaryItem2.setSummaryName(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].SummaryName"));

					summary1.add(summaryItem2);
				}
				conversationDetail.setSummary1(summary1);

				conversation.add(conversationDetail);
			}
			task.setConversation(conversation);

			tasks.add(task);
		}
		job.setTasks(tasks);
		describeJobResponse.setJob(job);
	 
	 	return describeJobResponse;
	}
}