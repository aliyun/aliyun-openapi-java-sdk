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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.GetJobInstanceListResponse;
import com.aliyuncs.schedulerx2.model.v20190430.GetJobInstanceListResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.GetJobInstanceListResponse.Data.JobInstanceDetailsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobInstanceListResponseUnmarshaller {

	public static GetJobInstanceListResponse unmarshall(GetJobInstanceListResponse getJobInstanceListResponse, UnmarshallerContext _ctx) {
		
		getJobInstanceListResponse.setRequestId(_ctx.stringValue("GetJobInstanceListResponse.RequestId"));
		getJobInstanceListResponse.setCode(_ctx.integerValue("GetJobInstanceListResponse.Code"));
		getJobInstanceListResponse.setMessage(_ctx.stringValue("GetJobInstanceListResponse.Message"));
		getJobInstanceListResponse.setSuccess(_ctx.booleanValue("GetJobInstanceListResponse.Success"));

		Data data = new Data();

		List<JobInstanceDetailsItem> jobInstanceDetails = new ArrayList<JobInstanceDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetJobInstanceListResponse.Data.JobInstanceDetails.Length"); i++) {
			JobInstanceDetailsItem jobInstanceDetailsItem = new JobInstanceDetailsItem();
			jobInstanceDetailsItem.setInstanceId(_ctx.longValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].InstanceId"));
			jobInstanceDetailsItem.setJobId(_ctx.longValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].JobId"));
			jobInstanceDetailsItem.setStatus(_ctx.integerValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].Status"));
			jobInstanceDetailsItem.setStartTime(_ctx.stringValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].StartTime"));
			jobInstanceDetailsItem.setEndTime(_ctx.stringValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].EndTime"));
			jobInstanceDetailsItem.setScheduleTime(_ctx.stringValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].ScheduleTime"));
			jobInstanceDetailsItem.setDataTime(_ctx.stringValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].DataTime"));
			jobInstanceDetailsItem.setExecutor(_ctx.stringValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].Executor"));
			jobInstanceDetailsItem.setWorkAddr(_ctx.stringValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].WorkAddr"));
			jobInstanceDetailsItem.setResult(_ctx.stringValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].Result"));
			jobInstanceDetailsItem.setProgress(_ctx.stringValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].Progress"));
			jobInstanceDetailsItem.setTimeType(_ctx.integerValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].TimeType"));
			jobInstanceDetailsItem.setTriggerType(_ctx.integerValue("GetJobInstanceListResponse.Data.JobInstanceDetails["+ i +"].TriggerType"));

			jobInstanceDetails.add(jobInstanceDetailsItem);
		}
		data.setJobInstanceDetails(jobInstanceDetails);
		getJobInstanceListResponse.setData(data);
	 
	 	return getJobInstanceListResponse;
	}
}