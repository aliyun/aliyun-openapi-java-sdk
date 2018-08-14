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

import com.aliyuncs.ccc.model.v20170705.GetJobStatusByCallIdResponse;
import com.aliyuncs.ccc.model.v20170705.GetJobStatusByCallIdResponse.Job;
import com.aliyuncs.ccc.model.v20170705.GetJobStatusByCallIdResponse.Job.Contact;
import com.aliyuncs.ccc.model.v20170705.GetJobStatusByCallIdResponse.Job.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.GetJobStatusByCallIdResponse.Job.SummaryItem3;
import com.aliyuncs.ccc.model.v20170705.GetJobStatusByCallIdResponse.Job.Task;
import com.aliyuncs.ccc.model.v20170705.GetJobStatusByCallIdResponse.Job.Task.Contact2;
import com.aliyuncs.ccc.model.v20170705.GetJobStatusByCallIdResponse.Job.Task.ConversationDetail;
import com.aliyuncs.ccc.model.v20170705.GetJobStatusByCallIdResponse.Job.Task.ConversationDetail.SummaryItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobStatusByCallIdResponseUnmarshaller {

	public static GetJobStatusByCallIdResponse unmarshall(GetJobStatusByCallIdResponse getJobStatusByCallIdResponse, UnmarshallerContext context) {
		
		getJobStatusByCallIdResponse.setRequestId(context.stringValue("GetJobStatusByCallIdResponse.RequestId"));
		getJobStatusByCallIdResponse.setSuccess(context.booleanValue("GetJobStatusByCallIdResponse.Success"));
		getJobStatusByCallIdResponse.setCode(context.stringValue("GetJobStatusByCallIdResponse.Code"));
		getJobStatusByCallIdResponse.setMessage(context.stringValue("GetJobStatusByCallIdResponse.Message"));
		getJobStatusByCallIdResponse.setHttpStatusCode(context.integerValue("GetJobStatusByCallIdResponse.HttpStatusCode"));

		Job job = new Job();
		job.setJobId(context.stringValue("GetJobStatusByCallIdResponse.Job.JobId"));
		job.setGroupId(context.stringValue("GetJobStatusByCallIdResponse.Job.GroupId"));
		job.setScenarioId(context.stringValue("GetJobStatusByCallIdResponse.Job.ScenarioId"));
		job.setStrategyId(context.stringValue("GetJobStatusByCallIdResponse.Job.StrategyId"));
		job.setPriority(context.integerValue("GetJobStatusByCallIdResponse.Job.Priority"));
		job.setStatus(context.stringValue("GetJobStatusByCallIdResponse.Job.Status"));
		job.setReferenceId(context.stringValue("GetJobStatusByCallIdResponse.Job.ReferenceId"));
		job.setFailureReason(context.stringValue("GetJobStatusByCallIdResponse.Job.FailureReason"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetJobStatusByCallIdResponse.Job.CallingNumbers.Length"); i++) {
			callingNumbers.add(context.stringValue("GetJobStatusByCallIdResponse.Job.CallingNumbers["+ i +"]"));
		}
		job.setCallingNumbers(callingNumbers);

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < context.lengthValue("GetJobStatusByCallIdResponse.Job.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(context.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].ContactId"));
			contact.setContactName(context.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].ContactName"));
			contact.setHonorific(context.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].Honorific"));
			contact.setRole(context.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].Role"));
			contact.setPhoneNumber(context.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].PhoneNumber"));
			contact.setState(context.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].State"));
			contact.setReferenceId(context.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].ReferenceId"));
			contact.setJobId(context.stringValue("GetJobStatusByCallIdResponse.Job.Contacts["+ i +"].JobId"));

			contacts.add(contact);
		}
		job.setContacts(contacts);

		List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("GetJobStatusByCallIdResponse.Job.Extras.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("GetJobStatusByCallIdResponse.Job.Extras["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("GetJobStatusByCallIdResponse.Job.Extras["+ i +"].Value"));

			extras.add(keyValuePair);
		}
		job.setExtras(extras);

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("GetJobStatusByCallIdResponse.Job.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].TaskId"));
			task.setJobId(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].JobId"));
			task.setScenarioId(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].ScenarioId"));
			task.setChatbotId(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].ChatbotId"));
			task.setPlanedTime(context.longValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].PlanedTime"));
			task.setActualTime(context.longValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].ActualTime"));
			task.setCallingNumber(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].CallingNumber"));
			task.setCalledNumber(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].CalledNumber"));
			task.setCallId(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].CallId"));
			task.setStatus(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Status"));
			task.setBrief(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Brief"));
			task.setDuration(context.integerValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Duration"));

			Contact2 contact2 = new Contact2();
			contact2.setContactId(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.ContactId"));
			contact2.setContactName(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.ContactName"));
			contact2.setHonorific(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.Honorific"));
			contact2.setRole(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.Role"));
			contact2.setPhoneNumber(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.PhoneNumber"));
			contact2.setState(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.State"));
			contact2.setReferenceId(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.ReferenceId"));
			contact2.setJobId(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Contact.JobId"));
			task.setContact2(contact2);

			List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
			for (int j = 0; j < context.lengthValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation.Length"); j++) {
				ConversationDetail conversationDetail = new ConversationDetail();
				conversationDetail.setConversationDetailId(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].ConversationDetailId"));
				conversationDetail.setTaskId(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].TaskId"));
				conversationDetail.setTimestamp(context.longValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Timestamp"));
				conversationDetail.setSpeaker(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Speaker"));
				conversationDetail.setScript(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Script"));

				List<SummaryItem> summary1 = new ArrayList<SummaryItem>();
				for (int k = 0; k < context.lengthValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary.Length"); k++) {
					SummaryItem summaryItem = new SummaryItem();
					summaryItem.setSummaryId(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].SummaryId"));
					summaryItem.setCategory(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Category"));
					summaryItem.setSummaryName(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].SummaryName"));
					summaryItem.setContent(context.stringValue("GetJobStatusByCallIdResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Content"));

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
		for (int i = 0; i < context.lengthValue("GetJobStatusByCallIdResponse.Job.Summary.Length"); i++) {
			SummaryItem3 summaryItem3 = new SummaryItem3();
			summaryItem3.setSummaryId(context.stringValue("GetJobStatusByCallIdResponse.Job.Summary["+ i +"].SummaryId"));
			summaryItem3.setCategory(context.stringValue("GetJobStatusByCallIdResponse.Job.Summary["+ i +"].Category"));
			summaryItem3.setSummaryName(context.stringValue("GetJobStatusByCallIdResponse.Job.Summary["+ i +"].SummaryName"));
			summaryItem3.setContent(context.stringValue("GetJobStatusByCallIdResponse.Job.Summary["+ i +"].Content"));

			summary.add(summaryItem3);
		}
		job.setSummary(summary);
		getJobStatusByCallIdResponse.setJob(job);
	 
	 	return getJobStatusByCallIdResponse;
	}
}