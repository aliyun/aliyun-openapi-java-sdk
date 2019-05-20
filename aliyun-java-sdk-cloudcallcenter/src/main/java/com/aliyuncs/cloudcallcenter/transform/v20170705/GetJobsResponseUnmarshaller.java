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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobsResponse.Job;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobsResponse.Job.Contact;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobsResponse.Job.KeyValuePair;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobsResponse.Job.SummaryItem3;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobsResponse.Job.Task;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobsResponse.Job.Task.Contact2;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobsResponse.Job.Task.ConversationDetail;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobsResponse.Job.Task.ConversationDetail.SummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobsResponseUnmarshaller {

	public static GetJobsResponse unmarshall(GetJobsResponse getJobsResponse, UnmarshallerContext context) {
		
		getJobsResponse.setRequestId(context.stringValue("GetJobsResponse.RequestId"));
		getJobsResponse.setSuccess(context.booleanValue("GetJobsResponse.Success"));
		getJobsResponse.setCode(context.stringValue("GetJobsResponse.Code"));
		getJobsResponse.setMessage(context.stringValue("GetJobsResponse.Message"));
		getJobsResponse.setHttpStatusCode(context.integerValue("GetJobsResponse.HttpStatusCode"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("GetJobsResponse.Jobs.Length"); i++) {
			Job job = new Job();
			job.setJobId(context.stringValue("GetJobsResponse.Jobs["+ i +"].JobId"));
			job.setGroupId(context.stringValue("GetJobsResponse.Jobs["+ i +"].GroupId"));
			job.setScenarioId(context.stringValue("GetJobsResponse.Jobs["+ i +"].ScenarioId"));
			job.setStrategyId(context.stringValue("GetJobsResponse.Jobs["+ i +"].StrategyId"));
			job.setPriority(context.integerValue("GetJobsResponse.Jobs["+ i +"].Priority"));
			job.setSystemPriority(context.integerValue("GetJobsResponse.Jobs["+ i +"].SystemPriority"));
			job.setStatus(context.stringValue("GetJobsResponse.Jobs["+ i +"].Status"));
			job.setReferenceId(context.stringValue("GetJobsResponse.Jobs["+ i +"].ReferenceId"));
			job.setFailureReason(context.stringValue("GetJobsResponse.Jobs["+ i +"].FailureReason"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetJobsResponse.Jobs["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(context.stringValue("GetJobsResponse.Jobs["+ i +"].CallingNumbers["+ j +"]"));
			}
			job.setCallingNumbers(callingNumbers);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < context.lengthValue("GetJobsResponse.Jobs["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(context.stringValue("GetJobsResponse.Jobs["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(context.stringValue("GetJobsResponse.Jobs["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setHonorific(context.stringValue("GetJobsResponse.Jobs["+ i +"].Contacts["+ j +"].Honorific"));
				contact.setRole(context.stringValue("GetJobsResponse.Jobs["+ i +"].Contacts["+ j +"].Role"));
				contact.setPhoneNumber(context.stringValue("GetJobsResponse.Jobs["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(context.stringValue("GetJobsResponse.Jobs["+ i +"].Contacts["+ j +"].State"));
				contact.setReferenceId(context.stringValue("GetJobsResponse.Jobs["+ i +"].Contacts["+ j +"].ReferenceId"));
				contact.setJobId(context.stringValue("GetJobsResponse.Jobs["+ i +"].Contacts["+ j +"].JobId"));

				contacts.add(contact);
			}
			job.setContacts(contacts);

			List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
			for (int j = 0; j < context.lengthValue("GetJobsResponse.Jobs["+ i +"].Extras.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(context.stringValue("GetJobsResponse.Jobs["+ i +"].Extras["+ j +"].Key"));
				keyValuePair.setValue(context.stringValue("GetJobsResponse.Jobs["+ i +"].Extras["+ j +"].Value"));

				extras.add(keyValuePair);
			}
			job.setExtras(extras);

			List<Task> tasks = new ArrayList<Task>();
			for (int j = 0; j < context.lengthValue("GetJobsResponse.Jobs["+ i +"].Tasks.Length"); j++) {
				Task task = new Task();
				task.setTaskId(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].TaskId"));
				task.setJobId(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].JobId"));
				task.setScenarioId(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].ScenarioId"));
				task.setChatbotId(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].ChatbotId"));
				task.setPlanedTime(context.longValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].PlanedTime"));
				task.setActualTime(context.longValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].ActualTime"));
				task.setCallingNumber(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].CallingNumber"));
				task.setCalledNumber(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].CalledNumber"));
				task.setCallId(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].CallId"));
				task.setStatus(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Status"));
				task.setBrief(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Brief"));
				task.setDuration(context.integerValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Duration"));

				Contact2 contact2 = new Contact2();
				contact2.setContactId(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.ContactId"));
				contact2.setContactName(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.ContactName"));
				contact2.setHonorific(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.Honorific"));
				contact2.setRole(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.Role"));
				contact2.setPhoneNumber(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.PhoneNumber"));
				contact2.setState(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.State"));
				contact2.setReferenceId(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.ReferenceId"));
				contact2.setJobId(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Contact.JobId"));
				task.setContact2(contact2);

				List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
				for (int k = 0; k < context.lengthValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation.Length"); k++) {
					ConversationDetail conversationDetail = new ConversationDetail();
					conversationDetail.setTimestamp(context.longValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Timestamp"));
					conversationDetail.setSpeaker(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Speaker"));
					conversationDetail.setScript(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Script"));

					List<SummaryItem> summary1 = new ArrayList<SummaryItem>();
					for (int l = 0; l < context.lengthValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary.Length"); l++) {
						SummaryItem summaryItem = new SummaryItem();
						summaryItem.setCategory(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary["+ l +"].Category"));
						summaryItem.setSummaryName(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary["+ l +"].SummaryName"));
						summaryItem.setContent(context.stringValue("GetJobsResponse.Jobs["+ i +"].Tasks["+ j +"].Conversation["+ k +"].Summary["+ l +"].Content"));

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
			for (int j = 0; j < context.lengthValue("GetJobsResponse.Jobs["+ i +"].Summary.Length"); j++) {
				SummaryItem3 summaryItem3 = new SummaryItem3();
				summaryItem3.setCategory(context.stringValue("GetJobsResponse.Jobs["+ i +"].Summary["+ j +"].Category"));
				summaryItem3.setSummaryName(context.stringValue("GetJobsResponse.Jobs["+ i +"].Summary["+ j +"].SummaryName"));
				summaryItem3.setContent(context.stringValue("GetJobsResponse.Jobs["+ i +"].Summary["+ j +"].Content"));

				summary.add(summaryItem3);
			}
			job.setSummary(summary);

			jobs.add(job);
		}
		getJobsResponse.setJobs(jobs);
	 
	 	return getJobsResponse;
	}
}