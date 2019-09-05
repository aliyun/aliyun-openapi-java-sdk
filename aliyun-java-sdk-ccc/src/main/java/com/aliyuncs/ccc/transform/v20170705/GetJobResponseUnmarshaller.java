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

import com.aliyuncs.ccc.model.v20170705.GetJobResponse;
import com.aliyuncs.ccc.model.v20170705.GetJobResponse.Job;
import com.aliyuncs.ccc.model.v20170705.GetJobResponse.Job.Contact;
import com.aliyuncs.ccc.model.v20170705.GetJobResponse.Job.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.GetJobResponse.Job.SummaryItem3;
import com.aliyuncs.ccc.model.v20170705.GetJobResponse.Job.Task;
import com.aliyuncs.ccc.model.v20170705.GetJobResponse.Job.Task.Contact2;
import com.aliyuncs.ccc.model.v20170705.GetJobResponse.Job.Task.ConversationDetail;
import com.aliyuncs.ccc.model.v20170705.GetJobResponse.Job.Task.ConversationDetail.SummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobResponseUnmarshaller {

	public static GetJobResponse unmarshall(GetJobResponse getJobResponse, UnmarshallerContext _ctx) {
		
		getJobResponse.setRequestId(_ctx.stringValue("GetJobResponse.RequestId"));
		getJobResponse.setSuccess(_ctx.booleanValue("GetJobResponse.Success"));
		getJobResponse.setCode(_ctx.stringValue("GetJobResponse.Code"));
		getJobResponse.setMessage(_ctx.stringValue("GetJobResponse.Message"));
		getJobResponse.setHttpStatusCode(_ctx.integerValue("GetJobResponse.HttpStatusCode"));

		Job job = new Job();
		job.setJobId(_ctx.stringValue("GetJobResponse.Job.JobId"));
		job.setGroupId(_ctx.stringValue("GetJobResponse.Job.GroupId"));
		job.setScenarioId(_ctx.stringValue("GetJobResponse.Job.ScenarioId"));
		job.setStrategyId(_ctx.stringValue("GetJobResponse.Job.StrategyId"));
		job.setPriority(_ctx.integerValue("GetJobResponse.Job.Priority"));
		job.setSystemPriority(_ctx.integerValue("GetJobResponse.Job.SystemPriority"));
		job.setStatus(_ctx.stringValue("GetJobResponse.Job.Status"));
		job.setReferenceId(_ctx.stringValue("GetJobResponse.Job.ReferenceId"));
		job.setFailureReason(_ctx.stringValue("GetJobResponse.Job.FailureReason"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetJobResponse.Job.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("GetJobResponse.Job.CallingNumbers["+ i +"]"));
		}
		job.setCallingNumbers(callingNumbers);

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("GetJobResponse.Job.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(_ctx.stringValue("GetJobResponse.Job.Contacts["+ i +"].ContactId"));
			contact.setContactName(_ctx.stringValue("GetJobResponse.Job.Contacts["+ i +"].ContactName"));
			contact.setHonorific(_ctx.stringValue("GetJobResponse.Job.Contacts["+ i +"].Honorific"));
			contact.setRole(_ctx.stringValue("GetJobResponse.Job.Contacts["+ i +"].Role"));
			contact.setPhoneNumber(_ctx.stringValue("GetJobResponse.Job.Contacts["+ i +"].PhoneNumber"));
			contact.setState(_ctx.stringValue("GetJobResponse.Job.Contacts["+ i +"].State"));
			contact.setReferenceId(_ctx.stringValue("GetJobResponse.Job.Contacts["+ i +"].ReferenceId"));

			contacts.add(contact);
		}
		job.setContacts(contacts);

		List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("GetJobResponse.Job.Extras.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(_ctx.stringValue("GetJobResponse.Job.Extras["+ i +"].Key"));
			keyValuePair.setValue(_ctx.stringValue("GetJobResponse.Job.Extras["+ i +"].Value"));

			extras.add(keyValuePair);
		}
		job.setExtras(extras);

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("GetJobResponse.Job.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].TaskId"));
			task.setJobId(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].JobId"));
			task.setScenarioId(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].ScenarioId"));
			task.setChatbotId(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].ChatbotId"));
			task.setPlanedTime(_ctx.longValue("GetJobResponse.Job.Tasks["+ i +"].PlanedTime"));
			task.setActualTime(_ctx.longValue("GetJobResponse.Job.Tasks["+ i +"].ActualTime"));
			task.setCallingNumber(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].CallingNumber"));
			task.setCalledNumber(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].CalledNumber"));
			task.setCallId(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].CallId"));
			task.setStatus(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Status"));
			task.setBrief(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Brief"));
			task.setDuration(_ctx.integerValue("GetJobResponse.Job.Tasks["+ i +"].Duration"));

			Contact2 contact2 = new Contact2();
			contact2.setContactId(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.ContactId"));
			contact2.setContactName(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.ContactName"));
			contact2.setHonorific(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.Honorific"));
			contact2.setRole(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.Role"));
			contact2.setPhoneNumber(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.PhoneNumber"));
			contact2.setState(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.State"));
			contact2.setReferenceId(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.ReferenceId"));
			task.setContact2(contact2);

			List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
			for (int j = 0; j < _ctx.lengthValue("GetJobResponse.Job.Tasks["+ i +"].Conversation.Length"); j++) {
				ConversationDetail conversationDetail = new ConversationDetail();
				conversationDetail.setTimestamp(_ctx.longValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Timestamp"));
				conversationDetail.setSpeaker(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Speaker"));
				conversationDetail.setScript(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Script"));

				List<SummaryItem> summary1 = new ArrayList<SummaryItem>();
				for (int k = 0; k < _ctx.lengthValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary.Length"); k++) {
					SummaryItem summaryItem = new SummaryItem();
					summaryItem.setCategory(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Category"));
					summaryItem.setSummaryName(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].SummaryName"));
					summaryItem.setContent(_ctx.stringValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Content"));

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
		for (int i = 0; i < _ctx.lengthValue("GetJobResponse.Job.Summary.Length"); i++) {
			SummaryItem3 summaryItem3 = new SummaryItem3();
			summaryItem3.setCategory(_ctx.stringValue("GetJobResponse.Job.Summary["+ i +"].Category"));
			summaryItem3.setSummaryName(_ctx.stringValue("GetJobResponse.Job.Summary["+ i +"].SummaryName"));
			summaryItem3.setContent(_ctx.stringValue("GetJobResponse.Job.Summary["+ i +"].Content"));

			summary.add(summaryItem3);
		}
		job.setSummary(summary);
		getJobResponse.setJob(job);
	 
	 	return getJobResponse;
	}
}