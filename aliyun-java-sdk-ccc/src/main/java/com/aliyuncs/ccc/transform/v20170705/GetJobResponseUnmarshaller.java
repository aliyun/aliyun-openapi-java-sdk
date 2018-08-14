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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobResponseUnmarshaller {

	public static GetJobResponse unmarshall(GetJobResponse getJobResponse, UnmarshallerContext context) {
		
		getJobResponse.setRequestId(context.stringValue("GetJobResponse.RequestId"));
		getJobResponse.setSuccess(context.booleanValue("GetJobResponse.Success"));
		getJobResponse.setCode(context.stringValue("GetJobResponse.Code"));
		getJobResponse.setMessage(context.stringValue("GetJobResponse.Message"));
		getJobResponse.setHttpStatusCode(context.integerValue("GetJobResponse.HttpStatusCode"));

		Job job = new Job();
		job.setJobId(context.stringValue("GetJobResponse.Job.JobId"));
		job.setGroupId(context.stringValue("GetJobResponse.Job.GroupId"));
		job.setScenarioId(context.stringValue("GetJobResponse.Job.ScenarioId"));
		job.setStrategyId(context.stringValue("GetJobResponse.Job.StrategyId"));
		job.setPriority(context.integerValue("GetJobResponse.Job.Priority"));
		job.setSystemPriority(context.integerValue("GetJobResponse.Job.SystemPriority"));
		job.setStatus(context.stringValue("GetJobResponse.Job.Status"));
		job.setReferenceId(context.stringValue("GetJobResponse.Job.ReferenceId"));
		job.setFailureReason(context.stringValue("GetJobResponse.Job.FailureReason"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetJobResponse.Job.CallingNumbers.Length"); i++) {
			callingNumbers.add(context.stringValue("GetJobResponse.Job.CallingNumbers["+ i +"]"));
		}
		job.setCallingNumbers(callingNumbers);

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < context.lengthValue("GetJobResponse.Job.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(context.stringValue("GetJobResponse.Job.Contacts["+ i +"].ContactId"));
			contact.setContactName(context.stringValue("GetJobResponse.Job.Contacts["+ i +"].ContactName"));
			contact.setHonorific(context.stringValue("GetJobResponse.Job.Contacts["+ i +"].Honorific"));
			contact.setRole(context.stringValue("GetJobResponse.Job.Contacts["+ i +"].Role"));
			contact.setPhoneNumber(context.stringValue("GetJobResponse.Job.Contacts["+ i +"].PhoneNumber"));
			contact.setState(context.stringValue("GetJobResponse.Job.Contacts["+ i +"].State"));
			contact.setReferenceId(context.stringValue("GetJobResponse.Job.Contacts["+ i +"].ReferenceId"));

			contacts.add(contact);
		}
		job.setContacts(contacts);

		List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("GetJobResponse.Job.Extras.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("GetJobResponse.Job.Extras["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("GetJobResponse.Job.Extras["+ i +"].Value"));

			extras.add(keyValuePair);
		}
		job.setExtras(extras);

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("GetJobResponse.Job.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].TaskId"));
			task.setJobId(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].JobId"));
			task.setScenarioId(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].ScenarioId"));
			task.setChatbotId(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].ChatbotId"));
			task.setPlanedTime(context.longValue("GetJobResponse.Job.Tasks["+ i +"].PlanedTime"));
			task.setActualTime(context.longValue("GetJobResponse.Job.Tasks["+ i +"].ActualTime"));
			task.setCallingNumber(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].CallingNumber"));
			task.setCalledNumber(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].CalledNumber"));
			task.setCallId(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].CallId"));
			task.setStatus(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Status"));
			task.setBrief(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Brief"));
			task.setDuration(context.integerValue("GetJobResponse.Job.Tasks["+ i +"].Duration"));

			Contact2 contact2 = new Contact2();
			contact2.setContactId(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.ContactId"));
			contact2.setContactName(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.ContactName"));
			contact2.setHonorific(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.Honorific"));
			contact2.setRole(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.Role"));
			contact2.setPhoneNumber(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.PhoneNumber"));
			contact2.setState(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.State"));
			contact2.setReferenceId(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Contact.ReferenceId"));
			task.setContact2(contact2);

			List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
			for (int j = 0; j < context.lengthValue("GetJobResponse.Job.Tasks["+ i +"].Conversation.Length"); j++) {
				ConversationDetail conversationDetail = new ConversationDetail();
				conversationDetail.setTimestamp(context.longValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Timestamp"));
				conversationDetail.setSpeaker(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Speaker"));
				conversationDetail.setScript(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Script"));

				List<SummaryItem> summary1 = new ArrayList<SummaryItem>();
				for (int k = 0; k < context.lengthValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary.Length"); k++) {
					SummaryItem summaryItem = new SummaryItem();
					summaryItem.setCategory(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Category"));
					summaryItem.setSummaryName(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].SummaryName"));
					summaryItem.setContent(context.stringValue("GetJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Content"));

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
		for (int i = 0; i < context.lengthValue("GetJobResponse.Job.Summary.Length"); i++) {
			SummaryItem3 summaryItem3 = new SummaryItem3();
			summaryItem3.setCategory(context.stringValue("GetJobResponse.Job.Summary["+ i +"].Category"));
			summaryItem3.setSummaryName(context.stringValue("GetJobResponse.Job.Summary["+ i +"].SummaryName"));
			summaryItem3.setContent(context.stringValue("GetJobResponse.Job.Summary["+ i +"].Content"));

			summary.add(summaryItem3);
		}
		job.setSummary(summary);
		getJobResponse.setJob(job);
	 
	 	return getJobResponse;
	}
}