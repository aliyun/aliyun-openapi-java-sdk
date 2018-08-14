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

import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobStatusResponse;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobStatusResponse.Jobs;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobStatusResponse.Jobs.Job;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobStatusResponse.Jobs.Job.Contact;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobStatusResponse.Jobs.Job.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobStatusResponse.Jobs.Job.SummaryItem;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobStatusResponse.Jobs.Job.Task;
import com.aliyuncs.ccc.model.v20170705.ListPredictiveJobStatusResponse.Jobs.Job.Task.Contact1;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPredictiveJobStatusResponseUnmarshaller {

	public static ListPredictiveJobStatusResponse unmarshall(ListPredictiveJobStatusResponse listPredictiveJobStatusResponse, UnmarshallerContext context) {
		
		listPredictiveJobStatusResponse.setRequestId(context.stringValue("ListPredictiveJobStatusResponse.RequestId"));
		listPredictiveJobStatusResponse.setSuccess(context.booleanValue("ListPredictiveJobStatusResponse.Success"));
		listPredictiveJobStatusResponse.setCode(context.stringValue("ListPredictiveJobStatusResponse.Code"));
		listPredictiveJobStatusResponse.setMessage(context.stringValue("ListPredictiveJobStatusResponse.Message"));
		listPredictiveJobStatusResponse.setHttpStatusCode(context.integerValue("ListPredictiveJobStatusResponse.HttpStatusCode"));

		Jobs jobs = new Jobs();
		jobs.setTotalCount(context.integerValue("ListPredictiveJobStatusResponse.Jobs.TotalCount"));
		jobs.setPageNumber(context.integerValue("ListPredictiveJobStatusResponse.Jobs.PageNumber"));
		jobs.setPageSize(context.integerValue("ListPredictiveJobStatusResponse.Jobs.PageSize"));

		List<Job> list = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("ListPredictiveJobStatusResponse.Jobs.List.Length"); i++) {
			Job job = new Job();
			job.setJobId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].JobId"));
			job.setGroupId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].GroupId"));
			job.setScenarioId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].ScenarioId"));
			job.setStrategyId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].StrategyId"));
			job.setPriority(context.integerValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Priority"));
			job.setStatus(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Status"));
			job.setReferenceId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].ReferenceId"));
			job.setFailureReason(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].FailureReason"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].CallingNumbers["+ j +"]"));
			}
			job.setCallingNumbers(callingNumbers);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < context.lengthValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setHonorific(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].Honorific"));
				contact.setRole(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].Role"));
				contact.setPhoneNumber(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].State"));
				contact.setReferenceId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ReferenceId"));
				contact.setJobId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].JobId"));

				contacts.add(contact);
			}
			job.setContacts(contacts);

			List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
			for (int j = 0; j < context.lengthValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Extras.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Extras["+ j +"].Key"));
				keyValuePair.setValue(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Extras["+ j +"].Value"));

				extras.add(keyValuePair);
			}
			job.setExtras(extras);

			List<Task> tasks = new ArrayList<Task>();
			for (int j = 0; j < context.lengthValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks.Length"); j++) {
				Task task = new Task();
				task.setTaskId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].TaskId"));
				task.setJobId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].JobId"));
				task.setScenarioId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].ScenarioId"));
				task.setChatbotId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].ChatbotId"));
				task.setPlanedTime(context.longValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].PlanedTime"));
				task.setActualTime(context.longValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].ActualTime"));
				task.setCallingNumber(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].CallingNumber"));
				task.setCalledNumber(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].CalledNumber"));
				task.setCallId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].CallId"));
				task.setStatus(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Status"));
				task.setBrief(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Brief"));
				task.setDuration(context.integerValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Duration"));

				Contact1 contact1 = new Contact1();
				contact1.setContactId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ContactId"));
				contact1.setContactName(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ContactName"));
				contact1.setHonorific(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.Honorific"));
				contact1.setRole(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.Role"));
				contact1.setPhoneNumber(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.PhoneNumber"));
				contact1.setState(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.State"));
				contact1.setReferenceId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ReferenceId"));
				contact1.setJobId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.JobId"));
				task.setContact1(contact1);

				tasks.add(task);
			}
			job.setTasks(tasks);

			List<SummaryItem> summary = new ArrayList<SummaryItem>();
			for (int j = 0; j < context.lengthValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Summary.Length"); j++) {
				SummaryItem summaryItem = new SummaryItem();
				summaryItem.setSummaryId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryId"));
				summaryItem.setGroupId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].GroupId"));
				summaryItem.setJobId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].JobId"));
				summaryItem.setTaskId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].TaskId"));
				summaryItem.setConversationDetailId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].ConversationDetailId"));
				summaryItem.setCategory(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].Category"));
				summaryItem.setSummaryName(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryName"));
				summaryItem.setContent(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].Content"));

				summary.add(summaryItem);
			}
			job.setSummary(summary);

			list.add(job);
		}
		jobs.setList(list);
		listPredictiveJobStatusResponse.setJobs(jobs);
	 
	 	return listPredictiveJobStatusResponse;
	}
}