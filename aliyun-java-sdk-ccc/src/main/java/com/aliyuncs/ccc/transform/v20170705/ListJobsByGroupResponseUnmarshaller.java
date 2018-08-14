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

import com.aliyuncs.ccc.model.v20170705.ListJobsByGroupResponse;
import com.aliyuncs.ccc.model.v20170705.ListJobsByGroupResponse.Jobs;
import com.aliyuncs.ccc.model.v20170705.ListJobsByGroupResponse.Jobs.Job;
import com.aliyuncs.ccc.model.v20170705.ListJobsByGroupResponse.Jobs.Job.Contact;
import com.aliyuncs.ccc.model.v20170705.ListJobsByGroupResponse.Jobs.Job.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.ListJobsByGroupResponse.Jobs.Job.SummaryItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsByGroupResponseUnmarshaller {

	public static ListJobsByGroupResponse unmarshall(ListJobsByGroupResponse listJobsByGroupResponse, UnmarshallerContext context) {
		
		listJobsByGroupResponse.setRequestId(context.stringValue("ListJobsByGroupResponse.RequestId"));
		listJobsByGroupResponse.setSuccess(context.booleanValue("ListJobsByGroupResponse.Success"));
		listJobsByGroupResponse.setCode(context.stringValue("ListJobsByGroupResponse.Code"));
		listJobsByGroupResponse.setMessage(context.stringValue("ListJobsByGroupResponse.Message"));
		listJobsByGroupResponse.setHttpStatusCode(context.integerValue("ListJobsByGroupResponse.HttpStatusCode"));

		Jobs jobs = new Jobs();
		jobs.setTotalCount(context.integerValue("ListJobsByGroupResponse.Jobs.TotalCount"));
		jobs.setPageNumber(context.integerValue("ListJobsByGroupResponse.Jobs.PageNumber"));
		jobs.setPageSize(context.integerValue("ListJobsByGroupResponse.Jobs.PageSize"));

		List<Job> list = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("ListJobsByGroupResponse.Jobs.List.Length"); i++) {
			Job job = new Job();
			job.setJobId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].JobId"));
			job.setGroupId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].GroupId"));
			job.setScenarioId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].ScenarioId"));
			job.setStrategyId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].StrategyId"));
			job.setPriority(context.integerValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Priority"));
			job.setSystemPriority(context.integerValue("ListJobsByGroupResponse.Jobs.List["+ i +"].SystemPriority"));
			job.setStatus(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Status"));
			job.setReferenceId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].ReferenceId"));
			job.setFailureReason(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].FailureReason"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListJobsByGroupResponse.Jobs.List["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].CallingNumbers["+ j +"]"));
			}
			job.setCallingNumbers(callingNumbers);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < context.lengthValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setHonorific(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Contacts["+ j +"].Honorific"));
				contact.setRole(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Contacts["+ j +"].Role"));
				contact.setPhoneNumber(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Contacts["+ j +"].State"));
				contact.setReferenceId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Contacts["+ j +"].ReferenceId"));
				contact.setJobId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Contacts["+ j +"].JobId"));

				contacts.add(contact);
			}
			job.setContacts(contacts);

			List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
			for (int j = 0; j < context.lengthValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Extras.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Extras["+ j +"].Key"));
				keyValuePair.setValue(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Extras["+ j +"].Value"));

				extras.add(keyValuePair);
			}
			job.setExtras(extras);

			List<SummaryItem> summary = new ArrayList<SummaryItem>();
			for (int j = 0; j < context.lengthValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Summary.Length"); j++) {
				SummaryItem summaryItem = new SummaryItem();
				summaryItem.setSummaryId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryId"));
				summaryItem.setGroupId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Summary["+ j +"].GroupId"));
				summaryItem.setJobId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Summary["+ j +"].JobId"));
				summaryItem.setTaskId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Summary["+ j +"].TaskId"));
				summaryItem.setConversationDetailId(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Summary["+ j +"].ConversationDetailId"));
				summaryItem.setCategory(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Summary["+ j +"].Category"));
				summaryItem.setSummaryName(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryName"));
				summaryItem.setContent(context.stringValue("ListJobsByGroupResponse.Jobs.List["+ i +"].Summary["+ j +"].Content"));

				summary.add(summaryItem);
			}
			job.setSummary(summary);

			list.add(job);
		}
		jobs.setList(list);
		listJobsByGroupResponse.setJobs(jobs);
	 
	 	return listJobsByGroupResponse;
	}
}