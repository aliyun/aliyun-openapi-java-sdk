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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetPredictiveJobResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetPredictiveJobResponse.Job;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetPredictiveJobResponse.Job.Contact;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetPredictiveJobResponse.Job.Task;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetPredictiveJobResponse.Job.Task.Contact1;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPredictiveJobResponseUnmarshaller {

	public static GetPredictiveJobResponse unmarshall(GetPredictiveJobResponse getPredictiveJobResponse, UnmarshallerContext context) {
		
		getPredictiveJobResponse.setRequestId(context.stringValue("GetPredictiveJobResponse.RequestId"));
		getPredictiveJobResponse.setSuccess(context.booleanValue("GetPredictiveJobResponse.Success"));
		getPredictiveJobResponse.setCode(context.stringValue("GetPredictiveJobResponse.Code"));
		getPredictiveJobResponse.setMessage(context.stringValue("GetPredictiveJobResponse.Message"));
		getPredictiveJobResponse.setHttpStatusCode(context.integerValue("GetPredictiveJobResponse.HttpStatusCode"));

		Job job = new Job();
		job.setJobId(context.stringValue("GetPredictiveJobResponse.Job.JobId"));
		job.setJobGroupId(context.stringValue("GetPredictiveJobResponse.Job.JobGroupId"));
		job.setScenarioId(context.stringValue("GetPredictiveJobResponse.Job.ScenarioId"));
		job.setStrategyId(context.stringValue("GetPredictiveJobResponse.Job.StrategyId"));
		job.setPriority(context.integerValue("GetPredictiveJobResponse.Job.Priority"));
		job.setSystemPriority(context.integerValue("GetPredictiveJobResponse.Job.SystemPriority"));
		job.setStatus(context.stringValue("GetPredictiveJobResponse.Job.Status"));
		job.setReferenceId(context.stringValue("GetPredictiveJobResponse.Job.ReferenceId"));
		job.setFailureReason(context.stringValue("GetPredictiveJobResponse.Job.FailureReason"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetPredictiveJobResponse.Job.CallingNumbers.Length"); i++) {
			callingNumbers.add(context.stringValue("GetPredictiveJobResponse.Job.CallingNumbers["+ i +"]"));
		}
		job.setCallingNumbers(callingNumbers);

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < context.lengthValue("GetPredictiveJobResponse.Job.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(context.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].ContactId"));
			contact.setContactName(context.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].ContactName"));
			contact.setHonorific(context.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].Honorific"));
			contact.setRole(context.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].Role"));
			contact.setPhoneNumber(context.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].PhoneNumber"));
			contact.setState(context.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].State"));
			contact.setReferenceId(context.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].ReferenceId"));
			contact.setJobId(context.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].JobId"));

			contacts.add(contact);
		}
		job.setContacts(contacts);

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("GetPredictiveJobResponse.Job.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].TaskId"));
			task.setJobId(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].JobId"));
			task.setScenarioId(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].ScenarioId"));
			task.setChatbotId(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].ChatbotId"));
			task.setPlanedTime(context.longValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].PlanedTime"));
			task.setActualTime(context.longValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].ActualTime"));
			task.setCallingNumber(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].CallingNumber"));
			task.setCalledNumber(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].CalledNumber"));
			task.setCallId(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].CallId"));
			task.setStatus(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Status"));
			task.setBrief(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Brief"));
			task.setDuration(context.integerValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Duration"));

			Contact1 contact1 = new Contact1();
			contact1.setContactId(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.ContactId"));
			contact1.setContactName(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.ContactName"));
			contact1.setHonorific(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.Honorific"));
			contact1.setRole(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.Role"));
			contact1.setPhoneNumber(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.PhoneNumber"));
			contact1.setState(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.State"));
			contact1.setReferenceId(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.ReferenceId"));
			contact1.setJobId(context.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.JobId"));
			task.setContact1(contact1);

			tasks.add(task);
		}
		job.setTasks(tasks);
		getPredictiveJobResponse.setJob(job);
	 
	 	return getPredictiveJobResponse;
	}
}