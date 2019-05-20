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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListPredictiveJobsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPredictiveJobsResponse.Jobs;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPredictiveJobsResponse.Jobs.Job;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPredictiveJobsResponse.Jobs.Job.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPredictiveJobsResponseUnmarshaller {

	public static ListPredictiveJobsResponse unmarshall(ListPredictiveJobsResponse listPredictiveJobsResponse, UnmarshallerContext context) {
		
		listPredictiveJobsResponse.setRequestId(context.stringValue("ListPredictiveJobsResponse.RequestId"));
		listPredictiveJobsResponse.setSuccess(context.booleanValue("ListPredictiveJobsResponse.Success"));
		listPredictiveJobsResponse.setCode(context.stringValue("ListPredictiveJobsResponse.Code"));
		listPredictiveJobsResponse.setMessage(context.stringValue("ListPredictiveJobsResponse.Message"));
		listPredictiveJobsResponse.setHttpStatusCode(context.integerValue("ListPredictiveJobsResponse.HttpStatusCode"));

		Jobs jobs = new Jobs();
		jobs.setTotalCount(context.integerValue("ListPredictiveJobsResponse.Jobs.TotalCount"));
		jobs.setPageNumber(context.integerValue("ListPredictiveJobsResponse.Jobs.PageNumber"));
		jobs.setPageSize(context.integerValue("ListPredictiveJobsResponse.Jobs.PageSize"));

		List<Job> list = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("ListPredictiveJobsResponse.Jobs.List.Length"); i++) {
			Job job = new Job();
			job.setJobId(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].JobId"));
			job.setJobGroupId(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].JobGroupId"));
			job.setStrategyId(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].StrategyId"));
			job.setStatus(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].Status"));
			job.setFailureReason(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].FailureReason"));
			job.setCalledTimes(context.integerValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].CalledTimes"));

			List<String> callingNumbers = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].CallingNumbers.Length"); j++) {
				callingNumbers.add(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].CallingNumbers["+ j +"]"));
			}
			job.setCallingNumbers(callingNumbers);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < context.lengthValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setHonorific(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].Honorific"));
				contact.setPhoneNumber(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setReferenceId(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].ReferenceId"));
				contact.setJobId(context.stringValue("ListPredictiveJobsResponse.Jobs.List["+ i +"].Contacts["+ j +"].JobId"));

				contacts.add(contact);
			}
			job.setContacts(contacts);

			list.add(job);
		}
		jobs.setList(list);
		listPredictiveJobsResponse.setJobs(jobs);
	 
	 	return listPredictiveJobsResponse;
	}
}