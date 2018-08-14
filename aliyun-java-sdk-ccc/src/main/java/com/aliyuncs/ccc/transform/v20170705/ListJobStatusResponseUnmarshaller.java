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

import com.aliyuncs.ccc.model.v20170705.ListJobStatusResponse;
import com.aliyuncs.ccc.model.v20170705.ListJobStatusResponse.Jobs;
import com.aliyuncs.ccc.model.v20170705.ListJobStatusResponse.Jobs.Job;
import com.aliyuncs.ccc.model.v20170705.ListJobStatusResponse.Jobs.Job.Contact;
import com.aliyuncs.ccc.model.v20170705.ListJobStatusResponse.Jobs.Job.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.ListJobStatusResponse.Jobs.Job.SummaryItem;
import com.aliyuncs.ccc.model.v20170705.ListJobStatusResponse.Jobs.Job.Task;
import com.aliyuncs.ccc.model.v20170705.ListJobStatusResponse.Jobs.Job.Task.Contact1;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobStatusResponseUnmarshaller {

	public static ListJobStatusResponse unmarshall(ListJobStatusResponse listJobStatusResponse, UnmarshallerContext context) {
		
		listJobStatusResponse.setRequestId(context.stringValue("ListJobStatusResponse.RequestId"));
		listJobStatusResponse.setSuccess(context.booleanValue("ListJobStatusResponse.Success"));
		listJobStatusResponse.setCode(context.stringValue("ListJobStatusResponse.Code"));
		listJobStatusResponse.setMessage(context.stringValue("ListJobStatusResponse.Message"));
		listJobStatusResponse.setHttpStatusCode(context.integerValue("ListJobStatusResponse.HttpStatusCode"));

		Jobs jobs = new Jobs();
		jobs.setTotalCount(context.integerValue("ListJobStatusResponse.Jobs.TotalCount"));
		jobs.setPageNumber(context.integerValue("ListJobStatusResponse.Jobs.PageNumber"));
		jobs.setPageSize(context.integerValue("ListJobStatusResponse.Jobs.PageSize"));

		List<Job> list = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("ListJobStatusResponse.Jobs.List.Length"); i++) {
			Job job = new Job();
			job.setJobId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].JobId"));
			job.setGroupId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].GroupId"));
			job.setScenarioId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].ScenarioId"));
			job.setStrategyId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].StrategyId"));
			job.setPriority(context.integerValue("ListJobStatusResponse.Jobs.List["+ i +"].Priority"));
			job.setStatus(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Status"));
			job.setReferenceId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].ReferenceId"));
			job.setFailureReason(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].FailureReason"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListJobStatusResponse.Jobs.List["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].CallingNumbers["+ j +"]"));
			}
			job.setCallingNumbers(callingNumbers);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < context.lengthValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setHonorific(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].Honorific"));
				contact.setRole(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].Role"));
				contact.setPhoneNumber(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].State"));
				contact.setReferenceId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ReferenceId"));
				contact.setJobId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].JobId"));

				contacts.add(contact);
			}
			job.setContacts(contacts);

			List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
			for (int j = 0; j < context.lengthValue("ListJobStatusResponse.Jobs.List["+ i +"].Extras.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Extras["+ j +"].Key"));
				keyValuePair.setValue(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Extras["+ j +"].Value"));

				extras.add(keyValuePair);
			}
			job.setExtras(extras);

			List<Task> tasks = new ArrayList<Task>();
			for (int j = 0; j < context.lengthValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks.Length"); j++) {
				Task task = new Task();
				task.setTaskId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].TaskId"));
				task.setJobId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].JobId"));
				task.setScenarioId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].ScenarioId"));
				task.setChatbotId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].ChatbotId"));
				task.setPlanedTime(context.longValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].PlanedTime"));
				task.setActualTime(context.longValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].ActualTime"));
				task.setCallingNumber(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].CallingNumber"));
				task.setCalledNumber(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].CalledNumber"));
				task.setCallId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].CallId"));
				task.setStatus(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Status"));
				task.setBrief(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Brief"));
				task.setDuration(context.integerValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Duration"));

				Contact1 contact1 = new Contact1();
				contact1.setContactId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ContactId"));
				contact1.setContactName(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ContactName"));
				contact1.setHonorific(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.Honorific"));
				contact1.setRole(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.Role"));
				contact1.setPhoneNumber(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.PhoneNumber"));
				contact1.setState(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.State"));
				contact1.setReferenceId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ReferenceId"));
				contact1.setJobId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.JobId"));
				task.setContact1(contact1);

				tasks.add(task);
			}
			job.setTasks(tasks);

			List<SummaryItem> summary = new ArrayList<SummaryItem>();
			for (int j = 0; j < context.lengthValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary.Length"); j++) {
				SummaryItem summaryItem = new SummaryItem();
				summaryItem.setSummaryId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryId"));
				summaryItem.setGroupId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].GroupId"));
				summaryItem.setJobId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].JobId"));
				summaryItem.setTaskId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].TaskId"));
				summaryItem.setConversationDetailId(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].ConversationDetailId"));
				summaryItem.setCategory(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].Category"));
				summaryItem.setSummaryName(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryName"));
				summaryItem.setContent(context.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].Content"));

				summary.add(summaryItem);
			}
			job.setSummary(summary);

			list.add(job);
		}
		jobs.setList(list);
		listJobStatusResponse.setJobs(jobs);
	 
	 	return listJobStatusResponse;
	}
}