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

import com.aliyuncs.outboundbot.model.v20191226.QueryJobsResponse;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsResponse.Jobs;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsResponse.Jobs.Job;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsResponse.Jobs.Job.Contact;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsResponse.Jobs.Job.KeyValuePair;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsResponse.Jobs.Job.SummaryItem;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsResponse.Jobs.Job.Task;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsResponse.Jobs.Job.Task.Contact1;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryJobsResponseUnmarshaller {

	public static QueryJobsResponse unmarshall(QueryJobsResponse queryJobsResponse, UnmarshallerContext _ctx) {
		
		queryJobsResponse.setRequestId(_ctx.stringValue("QueryJobsResponse.RequestId"));
		queryJobsResponse.setHttpStatusCode(_ctx.integerValue("QueryJobsResponse.HttpStatusCode"));
		queryJobsResponse.setCode(_ctx.stringValue("QueryJobsResponse.Code"));
		queryJobsResponse.setMessage(_ctx.stringValue("QueryJobsResponse.Message"));
		queryJobsResponse.setSuccess(_ctx.booleanValue("QueryJobsResponse.Success"));

		Jobs jobs = new Jobs();
		jobs.setPageNumber(_ctx.integerValue("QueryJobsResponse.Jobs.PageNumber"));
		jobs.setPageSize(_ctx.integerValue("QueryJobsResponse.Jobs.PageSize"));
		jobs.setTotalCount(_ctx.integerValue("QueryJobsResponse.Jobs.TotalCount"));

		List<Job> list = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryJobsResponse.Jobs.List.Length"); i++) {
			Job job = new Job();
			job.setStatus(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Status"));
			job.setJobGroupId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].JobGroupId"));
			job.setScenarioId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].ScenarioId"));
			job.setStrategyId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].StrategyId"));
			job.setJobId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].JobId"));
			job.setPriority(_ctx.integerValue("QueryJobsResponse.Jobs.List["+ i +"].Priority"));
			job.setFailureReason(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].FailureReason"));
			job.setReferenceId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].ReferenceId"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryJobsResponse.Jobs.List["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].CallingNumbers["+ j +"]"));
			}
			job.setCallingNumbers(callingNumbers);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < _ctx.lengthValue("QueryJobsResponse.Jobs.List["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setPhoneNumber(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].State"));
				contact.setContactId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setHonorific(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].Honorific"));
				contact.setJobId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].JobId"));
				contact.setContactName(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setRole(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].Role"));
				contact.setReferenceId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].ReferenceId"));

				contacts.add(contact);
			}
			job.setContacts(contacts);

			List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
			for (int j = 0; j < _ctx.lengthValue("QueryJobsResponse.Jobs.List["+ i +"].Extras.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Extras["+ j +"].Key"));
				keyValuePair.setValue(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Extras["+ j +"].Value"));

				extras.add(keyValuePair);
			}
			job.setExtras(extras);

			List<SummaryItem> summary = new ArrayList<SummaryItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryJobsResponse.Jobs.List["+ i +"].Summary.Length"); j++) {
				SummaryItem summaryItem = new SummaryItem();
				summaryItem.setSummaryName(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryName"));
				summaryItem.setGroupId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Summary["+ j +"].GroupId"));
				summaryItem.setJobId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Summary["+ j +"].JobId"));
				summaryItem.setCategory(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Summary["+ j +"].Category"));
				summaryItem.setTaskId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Summary["+ j +"].TaskId"));
				summaryItem.setContent(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Summary["+ j +"].Content"));
				summaryItem.setConversationDetailId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Summary["+ j +"].ConversationDetailId"));
				summaryItem.setSummaryId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryId"));

				summary.add(summaryItem);
			}
			job.setSummary(summary);

			List<Task> tasks = new ArrayList<Task>();
			for (int j = 0; j < _ctx.lengthValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks.Length"); j++) {
				Task task = new Task();
				task.setStatus(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].Status"));
				task.setPlanedTime(_ctx.longValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].PlanedTime"));
				task.setChatbotId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].ChatbotId"));
				task.setActualTime(_ctx.longValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].ActualTime"));
				task.setCalledNumber(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].CalledNumber"));
				task.setScenarioId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].ScenarioId"));
				task.setJobId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].JobId"));
				task.setCallId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].CallId"));
				task.setCallingNumber(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].CallingNumber"));
				task.setBrief(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].Brief"));
				task.setDuration(_ctx.integerValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].Duration"));
				task.setTaskId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].TaskId"));

				Contact1 contact1 = new Contact1();
				contact1.setPhoneNumber(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.PhoneNumber"));
				contact1.setState(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.State"));
				contact1.setContactId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ContactId"));
				contact1.setHonorific(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.Honorific"));
				contact1.setJobId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.JobId"));
				contact1.setContactName(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ContactName"));
				contact1.setRole(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.Role"));
				contact1.setReferenceId(_ctx.stringValue("QueryJobsResponse.Jobs.List["+ i +"].Tasks["+ j +"].Contact.ReferenceId"));
				task.setContact1(contact1);

				tasks.add(task);
			}
			job.setTasks(tasks);

			list.add(job);
		}
		jobs.setList(list);
		queryJobsResponse.setJobs(jobs);
	 
	 	return queryJobsResponse;
	}
}