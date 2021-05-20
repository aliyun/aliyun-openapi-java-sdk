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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobStatusResponseUnmarshaller {

	public static ListJobStatusResponse unmarshall(ListJobStatusResponse listJobStatusResponse, UnmarshallerContext _ctx) {
		
		listJobStatusResponse.setRequestId(_ctx.stringValue("ListJobStatusResponse.RequestId"));
		listJobStatusResponse.setSuccess(_ctx.booleanValue("ListJobStatusResponse.Success"));
		listJobStatusResponse.setCode(_ctx.stringValue("ListJobStatusResponse.Code"));
		listJobStatusResponse.setMessage(_ctx.stringValue("ListJobStatusResponse.Message"));
		listJobStatusResponse.setHttpStatusCode(_ctx.integerValue("ListJobStatusResponse.HttpStatusCode"));

		Jobs jobs = new Jobs();
		jobs.setTotalCount(_ctx.integerValue("ListJobStatusResponse.Jobs.TotalCount"));
		jobs.setPageNumber(_ctx.integerValue("ListJobStatusResponse.Jobs.PageNumber"));
		jobs.setPageSize(_ctx.integerValue("ListJobStatusResponse.Jobs.PageSize"));

		List<Job> list = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListJobStatusResponse.Jobs.List.Length"); i++) {
			Job job = new Job();
			job.setJobId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].JobId"));
			job.setGroupId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].GroupId"));
			job.setScenarioId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].ScenarioId"));
			job.setStrategyId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].StrategyId"));
			job.setPriority(_ctx.integerValue("ListJobStatusResponse.Jobs.List["+ i +"].Priority"));
			job.setStatus(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Status"));
			job.setReferenceId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].ReferenceId"));
			job.setFailureReason(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].FailureReason"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListJobStatusResponse.Jobs.List["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].CallingNumbers["+ j +"]"));
			}
			job.setCallingNumbers(callingNumbers);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < _ctx.lengthValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setHonorific(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].Honorific"));
				contact.setRole(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].Role"));
				contact.setPhoneNumber(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].State"));
				contact.setReferenceId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ReferenceId"));
				contact.setJobId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].JobId"));

				contacts.add(contact);
			}
			job.setContacts(contacts);

			List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
			for (int j = 0; j < _ctx.lengthValue("ListJobStatusResponse.Jobs.List["+ i +"].Extras.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Extras["+ j +"].Key"));
				keyValuePair.setValue(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Extras["+ j +"].Value"));

				extras.add(keyValuePair);
			}
			job.setExtras(extras);

			List<Task> tasks = new ArrayList<Task>();
			for (int j = 0; j < _ctx.lengthValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks.Length"); j++) {
				Task task = new Task();
				task.setTaskId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].TaskId"));
				task.setJobId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].JobId"));
				task.setScenarioId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].ScenarioId"));
				task.setChatbotId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].ChatbotId"));
				task.setPlanedTime(_ctx.longValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].PlanedTime"));
				task.setActualTime(_ctx.longValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].ActualTime"));
				task.setCallingNumber(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].CallingNumber"));
				task.setCalledNumber(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].CalledNumber"));
				task.setCallId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].CallId"));
				task.setStatus(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Status"));
				task.setBrief(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Brief"));
				task.setDuration(_ctx.integerValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Duration"));

				Contact1 contact1 = new Contact1();
				contact1.setContactId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ContactId"));
				contact1.setContactName(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ContactName"));
				contact1.setHonorific(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.Honorific"));
				contact1.setRole(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.Role"));
				contact1.setPhoneNumber(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.PhoneNumber"));
				contact1.setState(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.State"));
				contact1.setReferenceId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ReferenceId"));
				contact1.setJobId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.JobId"));
				task.setContact1(contact1);

				tasks.add(task);
			}
			job.setTasks(tasks);

			List<SummaryItem> summary = new ArrayList<SummaryItem>();
			for (int j = 0; j < _ctx.lengthValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary.Length"); j++) {
				SummaryItem summaryItem = new SummaryItem();
				summaryItem.setSummaryId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryId"));
				summaryItem.setGroupId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].GroupId"));
				summaryItem.setJobId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].JobId"));
				summaryItem.setTaskId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].TaskId"));
				summaryItem.setConversationDetailId(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].ConversationDetailId"));
				summaryItem.setCategory(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].Category"));
				summaryItem.setSummaryName(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryName"));
				summaryItem.setContent(_ctx.stringValue("ListJobStatusResponse.Jobs.List["+ i +"].Summary["+ j +"].Content"));

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