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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPredictiveJobStatusResponseUnmarshaller {

	public static ListPredictiveJobStatusResponse unmarshall(ListPredictiveJobStatusResponse listPredictiveJobStatusResponse, UnmarshallerContext _ctx) {
		
		listPredictiveJobStatusResponse.setRequestId(_ctx.stringValue("ListPredictiveJobStatusResponse.RequestId"));
		listPredictiveJobStatusResponse.setSuccess(_ctx.booleanValue("ListPredictiveJobStatusResponse.Success"));
		listPredictiveJobStatusResponse.setCode(_ctx.stringValue("ListPredictiveJobStatusResponse.Code"));
		listPredictiveJobStatusResponse.setMessage(_ctx.stringValue("ListPredictiveJobStatusResponse.Message"));
		listPredictiveJobStatusResponse.setHttpStatusCode(_ctx.integerValue("ListPredictiveJobStatusResponse.HttpStatusCode"));

		Jobs jobs = new Jobs();
		jobs.setTotalCount(_ctx.integerValue("ListPredictiveJobStatusResponse.Jobs.TotalCount"));
		jobs.setPageNumber(_ctx.integerValue("ListPredictiveJobStatusResponse.Jobs.PageNumber"));
		jobs.setPageSize(_ctx.integerValue("ListPredictiveJobStatusResponse.Jobs.PageSize"));

		List<Job> list = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListPredictiveJobStatusResponse.Jobs.List.Length"); i++) {
			Job job = new Job();
			job.setJobId(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].JobId"));
			job.setJobGroupId(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].JobGroupId"));
			job.setScenarioId(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].ScenarioId"));
			job.setStrategyId(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].StrategyId"));
			job.setPriority(_ctx.integerValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Priority"));
			job.setSystemPriority(_ctx.integerValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].SystemPriority"));
			job.setStatus(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Status"));
			job.setReferenceId(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].ReferenceId"));
			job.setFailureReason(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].FailureReason"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].CallingNumbers["+ j +"]"));
			}
			job.setCallingNumbers(callingNumbers);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < _ctx.lengthValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setHonorific(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].Honorific"));
				contact.setRole(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].Role"));
				contact.setPhoneNumber(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].State"));
				contact.setReferenceId(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].ReferenceId"));
				contact.setJobId(_ctx.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Contacts["+ j +"].JobId"));

				contacts.add(contact);
			}
			job.setContacts(contacts);

			list.add(job);
		}
		jobs.setList(list);
		listPredictiveJobStatusResponse.setJobs(jobs);
	 
	 	return listPredictiveJobStatusResponse;
	}
}