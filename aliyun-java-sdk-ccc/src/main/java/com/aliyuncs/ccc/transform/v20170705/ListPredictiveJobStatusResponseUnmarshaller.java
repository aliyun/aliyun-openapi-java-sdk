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
			job.setJobGroupId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].JobGroupId"));
			job.setScenarioId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].ScenarioId"));
			job.setStrategyId(context.stringValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].StrategyId"));
			job.setPriority(context.integerValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].Priority"));
			job.setSystemPriority(context.integerValue("ListPredictiveJobStatusResponse.Jobs.List["+ i +"].SystemPriority"));
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

			list.add(job);
		}
		jobs.setList(list);
		listPredictiveJobStatusResponse.setJobs(jobs);
	 
	 	return listPredictiveJobStatusResponse;
	}
}