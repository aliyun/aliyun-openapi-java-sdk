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

import com.aliyuncs.ccc.model.v20170705.GetPredictiveJobResponse;
import com.aliyuncs.ccc.model.v20170705.GetPredictiveJobResponse.Job;
import com.aliyuncs.ccc.model.v20170705.GetPredictiveJobResponse.Job.Contact;
import com.aliyuncs.ccc.model.v20170705.GetPredictiveJobResponse.Job.Task;
import com.aliyuncs.ccc.model.v20170705.GetPredictiveJobResponse.Job.Task.Contact1;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPredictiveJobResponseUnmarshaller {

	public static GetPredictiveJobResponse unmarshall(GetPredictiveJobResponse getPredictiveJobResponse, UnmarshallerContext _ctx) {
		
		getPredictiveJobResponse.setRequestId(_ctx.stringValue("GetPredictiveJobResponse.RequestId"));
		getPredictiveJobResponse.setSuccess(_ctx.booleanValue("GetPredictiveJobResponse.Success"));
		getPredictiveJobResponse.setCode(_ctx.stringValue("GetPredictiveJobResponse.Code"));
		getPredictiveJobResponse.setMessage(_ctx.stringValue("GetPredictiveJobResponse.Message"));
		getPredictiveJobResponse.setHttpStatusCode(_ctx.integerValue("GetPredictiveJobResponse.HttpStatusCode"));

		Job job = new Job();
		job.setJobId(_ctx.stringValue("GetPredictiveJobResponse.Job.JobId"));
		job.setJobGroupId(_ctx.stringValue("GetPredictiveJobResponse.Job.JobGroupId"));
		job.setScenarioId(_ctx.stringValue("GetPredictiveJobResponse.Job.ScenarioId"));
		job.setStrategyId(_ctx.stringValue("GetPredictiveJobResponse.Job.StrategyId"));
		job.setPriority(_ctx.integerValue("GetPredictiveJobResponse.Job.Priority"));
		job.setSystemPriority(_ctx.integerValue("GetPredictiveJobResponse.Job.SystemPriority"));
		job.setStatus(_ctx.stringValue("GetPredictiveJobResponse.Job.Status"));
		job.setReferenceId(_ctx.stringValue("GetPredictiveJobResponse.Job.ReferenceId"));
		job.setFailureReason(_ctx.stringValue("GetPredictiveJobResponse.Job.FailureReason"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPredictiveJobResponse.Job.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("GetPredictiveJobResponse.Job.CallingNumbers["+ i +"]"));
		}
		job.setCallingNumbers(callingNumbers);

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("GetPredictiveJobResponse.Job.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(_ctx.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].ContactId"));
			contact.setContactName(_ctx.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].ContactName"));
			contact.setHonorific(_ctx.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].Honorific"));
			contact.setRole(_ctx.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].Role"));
			contact.setPhoneNumber(_ctx.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].PhoneNumber"));
			contact.setState(_ctx.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].State"));
			contact.setReferenceId(_ctx.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].ReferenceId"));
			contact.setJobId(_ctx.stringValue("GetPredictiveJobResponse.Job.Contacts["+ i +"].JobId"));

			contacts.add(contact);
		}
		job.setContacts(contacts);

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("GetPredictiveJobResponse.Job.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].TaskId"));
			task.setJobId(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].JobId"));
			task.setScenarioId(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].ScenarioId"));
			task.setChatbotId(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].ChatbotId"));
			task.setPlanedTime(_ctx.longValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].PlanedTime"));
			task.setActualTime(_ctx.longValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].ActualTime"));
			task.setCallingNumber(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].CallingNumber"));
			task.setCalledNumber(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].CalledNumber"));
			task.setCallId(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].CallId"));
			task.setStatus(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Status"));
			task.setBrief(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Brief"));
			task.setDuration(_ctx.integerValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Duration"));

			Contact1 contact1 = new Contact1();
			contact1.setContactId(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.ContactId"));
			contact1.setContactName(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.ContactName"));
			contact1.setHonorific(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.Honorific"));
			contact1.setRole(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.Role"));
			contact1.setPhoneNumber(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.PhoneNumber"));
			contact1.setState(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.State"));
			contact1.setReferenceId(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.ReferenceId"));
			contact1.setJobId(_ctx.stringValue("GetPredictiveJobResponse.Job.Tasks["+ i +"].Contact.JobId"));
			task.setContact1(contact1);

			tasks.add(task);
		}
		job.setTasks(tasks);
		getPredictiveJobResponse.setJob(job);
	 
	 	return getPredictiveJobResponse;
	}
}