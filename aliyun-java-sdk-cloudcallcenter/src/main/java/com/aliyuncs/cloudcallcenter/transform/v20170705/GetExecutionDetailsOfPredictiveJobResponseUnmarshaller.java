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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetExecutionDetailsOfPredictiveJobResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetExecutionDetailsOfPredictiveJobResponse.Job;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetExecutionDetailsOfPredictiveJobResponse.Job.Task;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetExecutionDetailsOfPredictiveJobResponse.Job.Task.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExecutionDetailsOfPredictiveJobResponseUnmarshaller {

	public static GetExecutionDetailsOfPredictiveJobResponse unmarshall(GetExecutionDetailsOfPredictiveJobResponse getExecutionDetailsOfPredictiveJobResponse, UnmarshallerContext context) {
		
		getExecutionDetailsOfPredictiveJobResponse.setRequestId(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.RequestId"));
		getExecutionDetailsOfPredictiveJobResponse.setSuccess(context.booleanValue("GetExecutionDetailsOfPredictiveJobResponse.Success"));
		getExecutionDetailsOfPredictiveJobResponse.setCode(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Code"));
		getExecutionDetailsOfPredictiveJobResponse.setMessage(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Message"));
		getExecutionDetailsOfPredictiveJobResponse.setHttpStatusCode(context.integerValue("GetExecutionDetailsOfPredictiveJobResponse.HttpStatusCode"));

		Job job = new Job();
		job.setJobId(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.JobId"));
		job.setJobGroupId(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.JobGroupId"));
		job.setStrategyId(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.StrategyId"));
		job.setStatus(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Status"));
		job.setFailureReason(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.FailureReason"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetExecutionDetailsOfPredictiveJobResponse.Job.CallingNumbers.Length"); i++) {
			callingNumbers.add(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.CallingNumbers["+ i +"]"));
		}
		job.setCallingNumbers(callingNumbers);

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].TaskId"));
			task.setJobId(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].JobId"));
			task.setPlanedTime(context.longValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].PlanedTime"));
			task.setActualTime(context.longValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].ActualTime"));
			task.setEndTime(context.longValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].EndTime"));
			task.setCallingNumber(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].CallingNumber"));
			task.setCalledNumber(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].CalledNumber"));
			task.setCallId(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].CallId"));
			task.setStatus(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].Status"));
			task.setDuration(context.integerValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].Duration"));

			Contact contact = new Contact();
			contact.setContactId(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].Contact.ContactId"));
			contact.setContactName(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].Contact.ContactName"));
			contact.setHonorific(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].Contact.Honorific"));
			contact.setPhoneNumber(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].Contact.PhoneNumber"));
			contact.setReferenceId(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].Contact.ReferenceId"));
			contact.setJobId(context.stringValue("GetExecutionDetailsOfPredictiveJobResponse.Job.Tasks["+ i +"].Contact.JobId"));
			task.setContact(contact);

			tasks.add(task);
		}
		job.setTasks(tasks);
		getExecutionDetailsOfPredictiveJobResponse.setJob(job);
	 
	 	return getExecutionDetailsOfPredictiveJobResponse;
	}
}