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

import com.aliyuncs.ccc.model.v20170705.GetJobListResponse;
import com.aliyuncs.ccc.model.v20170705.GetJobListResponse.Jobs;
import com.aliyuncs.ccc.model.v20170705.GetJobListResponse.Jobs.Job;
import com.aliyuncs.ccc.model.v20170705.GetJobListResponse.Jobs.Job.Contact;
import com.aliyuncs.ccc.model.v20170705.GetJobListResponse.Jobs.Job.KeyValuePair;
import com.aliyuncs.ccc.model.v20170705.GetJobListResponse.Jobs.Job.SummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobListResponseUnmarshaller {

	public static GetJobListResponse unmarshall(GetJobListResponse getJobListResponse, UnmarshallerContext _ctx) {
		
		getJobListResponse.setRequestId(_ctx.stringValue("GetJobListResponse.RequestId"));
		getJobListResponse.setSuccess(_ctx.booleanValue("GetJobListResponse.Success"));
		getJobListResponse.setCode(_ctx.stringValue("GetJobListResponse.Code"));
		getJobListResponse.setMessage(_ctx.stringValue("GetJobListResponse.Message"));
		getJobListResponse.setHttpStatusCode(_ctx.integerValue("GetJobListResponse.HttpStatusCode"));

		Jobs jobs = new Jobs();
		jobs.setTotalCount(_ctx.integerValue("GetJobListResponse.Jobs.TotalCount"));
		jobs.setPageNumber(_ctx.integerValue("GetJobListResponse.Jobs.PageNumber"));
		jobs.setPageSize(_ctx.integerValue("GetJobListResponse.Jobs.PageSize"));

		List<Job> list = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("GetJobListResponse.Jobs.List.Length"); i++) {
			Job job = new Job();
			job.setJobId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].JobId"));
			job.setGroupId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].GroupId"));
			job.setScenarioId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].ScenarioId"));
			job.setStrategyId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].StrategyId"));
			job.setPriority(_ctx.integerValue("GetJobListResponse.Jobs.List["+ i +"].Priority"));
			job.setSystemPriority(_ctx.integerValue("GetJobListResponse.Jobs.List["+ i +"].SystemPriority"));
			job.setStatus(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Status"));
			job.setReferenceId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].ReferenceId"));
			job.setFailureReason(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].FailureReason"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetJobListResponse.Jobs.List["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].CallingNumbers["+ j +"]"));
			}
			job.setCallingNumbers(callingNumbers);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < _ctx.lengthValue("GetJobListResponse.Jobs.List["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setHonorific(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Contacts["+ j +"].Honorific"));
				contact.setRole(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Contacts["+ j +"].Role"));
				contact.setPhoneNumber(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Contacts["+ j +"].State"));
				contact.setReferenceId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Contacts["+ j +"].ReferenceId"));
				contact.setJobId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Contacts["+ j +"].JobId"));

				contacts.add(contact);
			}
			job.setContacts(contacts);

			List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
			for (int j = 0; j < _ctx.lengthValue("GetJobListResponse.Jobs.List["+ i +"].Extras.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Extras["+ j +"].Key"));
				keyValuePair.setValue(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Extras["+ j +"].Value"));

				extras.add(keyValuePair);
			}
			job.setExtras(extras);

			List<SummaryItem> summary = new ArrayList<SummaryItem>();
			for (int j = 0; j < _ctx.lengthValue("GetJobListResponse.Jobs.List["+ i +"].Summary.Length"); j++) {
				SummaryItem summaryItem = new SummaryItem();
				summaryItem.setSummaryId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryId"));
				summaryItem.setGroupId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Summary["+ j +"].GroupId"));
				summaryItem.setJobId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Summary["+ j +"].JobId"));
				summaryItem.setTaskId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Summary["+ j +"].TaskId"));
				summaryItem.setConversationDetailId(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Summary["+ j +"].ConversationDetailId"));
				summaryItem.setCategory(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Summary["+ j +"].Category"));
				summaryItem.setSummaryName(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Summary["+ j +"].SummaryName"));
				summaryItem.setContent(_ctx.stringValue("GetJobListResponse.Jobs.List["+ i +"].Summary["+ j +"].Content"));

				summary.add(summaryItem);
			}
			job.setSummary(summary);

			list.add(job);
		}
		jobs.setList(list);
		getJobListResponse.setJobs(jobs);
	 
	 	return getJobListResponse;
	}
}