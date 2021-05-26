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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.GetJobDetailResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.GetJobDetailResponse.JobDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobDetailResponseUnmarshaller {

	public static GetJobDetailResponse unmarshall(GetJobDetailResponse getJobDetailResponse, UnmarshallerContext _ctx) {
		
		getJobDetailResponse.setRequestId(_ctx.stringValue("GetJobDetailResponse.RequestId"));

		JobDetail jobDetail = new JobDetail();
		jobDetail.setJobId(_ctx.stringValue("GetJobDetailResponse.JobDetail.JobId"));
		jobDetail.setJobName(_ctx.stringValue("GetJobDetailResponse.JobDetail.JobName"));
		jobDetail.setStatus(_ctx.stringValue("GetJobDetailResponse.JobDetail.Status"));
		jobDetail.setDetail(_ctx.stringValue("GetJobDetailResponse.JobDetail.Detail"));
		jobDetail.setSparkUI(_ctx.stringValue("GetJobDetailResponse.JobDetail.SparkUI"));
		jobDetail.setCreateTime(_ctx.stringValue("GetJobDetailResponse.JobDetail.CreateTime"));
		jobDetail.setUpdateTime(_ctx.stringValue("GetJobDetailResponse.JobDetail.UpdateTime"));
		jobDetail.setSubmitTime(_ctx.stringValue("GetJobDetailResponse.JobDetail.SubmitTime"));
		jobDetail.setCreateTimeValue(_ctx.stringValue("GetJobDetailResponse.JobDetail.CreateTimeValue"));
		jobDetail.setUpdateTimeValue(_ctx.stringValue("GetJobDetailResponse.JobDetail.UpdateTimeValue"));
		jobDetail.setSubmitTimeValue(_ctx.stringValue("GetJobDetailResponse.JobDetail.SubmitTimeValue"));
		jobDetail.setVcName(_ctx.stringValue("GetJobDetailResponse.JobDetail.VcName"));
		jobDetail.setDriverResourceSpec(_ctx.stringValue("GetJobDetailResponse.JobDetail.DriverResourceSpec"));
		jobDetail.setExecutorResourceSpec(_ctx.stringValue("GetJobDetailResponse.JobDetail.ExecutorResourceSpec"));
		jobDetail.setExecutorInstances(_ctx.stringValue("GetJobDetailResponse.JobDetail.ExecutorInstances"));
		jobDetail.setLastJobAttemptId(_ctx.stringValue("GetJobDetailResponse.JobDetail.LastJobAttemptId"));
		getJobDetailResponse.setJobDetail(jobDetail);
	 
	 	return getJobDetailResponse;
	}
}