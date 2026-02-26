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

import com.aliyuncs.schedulerx2.model.v20190430.GetJobInstanceResponse;
import com.aliyuncs.schedulerx2.model.v20190430.GetJobInstanceResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.GetJobInstanceResponse.Data.JobInstanceDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobInstanceResponseUnmarshaller {

	public static GetJobInstanceResponse unmarshall(GetJobInstanceResponse getJobInstanceResponse, UnmarshallerContext _ctx) {
		
		getJobInstanceResponse.setRequestId(_ctx.stringValue("GetJobInstanceResponse.RequestId"));
		getJobInstanceResponse.setCode(_ctx.integerValue("GetJobInstanceResponse.Code"));
		getJobInstanceResponse.setMessage(_ctx.stringValue("GetJobInstanceResponse.Message"));
		getJobInstanceResponse.setSuccess(_ctx.booleanValue("GetJobInstanceResponse.Success"));

		Data data = new Data();

		JobInstanceDetail jobInstanceDetail = new JobInstanceDetail();
		jobInstanceDetail.setStatus(_ctx.integerValue("GetJobInstanceResponse.Data.JobInstanceDetail.Status"));
		jobInstanceDetail.setProgress(_ctx.stringValue("GetJobInstanceResponse.Data.JobInstanceDetail.Progress"));
		jobInstanceDetail.setResult(_ctx.stringValue("GetJobInstanceResponse.Data.JobInstanceDetail.Result"));
		jobInstanceDetail.setInstanceId(_ctx.longValue("GetJobInstanceResponse.Data.JobInstanceDetail.InstanceId"));
		jobInstanceDetail.setTimeType(_ctx.integerValue("GetJobInstanceResponse.Data.JobInstanceDetail.TimeType"));
		jobInstanceDetail.setTriggerType(_ctx.integerValue("GetJobInstanceResponse.Data.JobInstanceDetail.TriggerType"));
		jobInstanceDetail.setEndTime(_ctx.stringValue("GetJobInstanceResponse.Data.JobInstanceDetail.EndTime"));
		jobInstanceDetail.setStartTime(_ctx.stringValue("GetJobInstanceResponse.Data.JobInstanceDetail.StartTime"));
		jobInstanceDetail.setExecutor(_ctx.stringValue("GetJobInstanceResponse.Data.JobInstanceDetail.Executor"));
		jobInstanceDetail.setJobId(_ctx.longValue("GetJobInstanceResponse.Data.JobInstanceDetail.JobId"));
		jobInstanceDetail.setScheduleTime(_ctx.stringValue("GetJobInstanceResponse.Data.JobInstanceDetail.ScheduleTime"));
		jobInstanceDetail.setDataTime(_ctx.stringValue("GetJobInstanceResponse.Data.JobInstanceDetail.DataTime"));
		jobInstanceDetail.setWorkAddr(_ctx.stringValue("GetJobInstanceResponse.Data.JobInstanceDetail.WorkAddr"));
		jobInstanceDetail.setParameters(_ctx.stringValue("GetJobInstanceResponse.Data.JobInstanceDetail.Parameters"));
		jobInstanceDetail.setJobName(_ctx.stringValue("GetJobInstanceResponse.Data.JobInstanceDetail.JobName"));
		jobInstanceDetail.setTraceId(_ctx.stringValue("GetJobInstanceResponse.Data.JobInstanceDetail.TraceId"));
		data.setJobInstanceDetail(jobInstanceDetail);
		getJobInstanceResponse.setData(data);
	 
	 	return getJobInstanceResponse;
	}
}