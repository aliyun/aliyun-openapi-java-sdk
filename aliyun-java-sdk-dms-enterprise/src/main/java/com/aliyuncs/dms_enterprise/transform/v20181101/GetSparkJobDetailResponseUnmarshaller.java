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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetSparkJobDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetSparkJobDetailResponse.JobDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSparkJobDetailResponseUnmarshaller {

	public static GetSparkJobDetailResponse unmarshall(GetSparkJobDetailResponse getSparkJobDetailResponse, UnmarshallerContext _ctx) {
		
		getSparkJobDetailResponse.setRequestId(_ctx.stringValue("GetSparkJobDetailResponse.RequestId"));
		getSparkJobDetailResponse.setSuccess(_ctx.booleanValue("GetSparkJobDetailResponse.Success"));
		getSparkJobDetailResponse.setErrorMessage(_ctx.stringValue("GetSparkJobDetailResponse.ErrorMessage"));
		getSparkJobDetailResponse.setErrorCode(_ctx.stringValue("GetSparkJobDetailResponse.ErrorCode"));

		JobDetail jobDetail = new JobDetail();
		jobDetail.setJobId(_ctx.stringValue("GetSparkJobDetailResponse.JobDetail.JobId"));
		jobDetail.setName(_ctx.stringValue("GetSparkJobDetailResponse.JobDetail.Name"));
		jobDetail.setStatus(_ctx.stringValue("GetSparkJobDetailResponse.JobDetail.Status"));
		jobDetail.setMainClass(_ctx.stringValue("GetSparkJobDetailResponse.JobDetail.MainClass"));
		jobDetail.setMainFile(_ctx.stringValue("GetSparkJobDetailResponse.JobDetail.MainFile"));
		jobDetail.setArguments(_ctx.stringValue("GetSparkJobDetailResponse.JobDetail.Arguments"));
		jobDetail.setConfiguration(_ctx.stringValue("GetSparkJobDetailResponse.JobDetail.Configuration"));
		jobDetail.setSubmitTime(_ctx.stringValue("GetSparkJobDetailResponse.JobDetail.SubmitTime"));
		jobDetail.setBeginTime(_ctx.stringValue("GetSparkJobDetailResponse.JobDetail.BeginTime"));
		jobDetail.setEndTime(_ctx.stringValue("GetSparkJobDetailResponse.JobDetail.EndTime"));
		getSparkJobDetailResponse.setJobDetail(jobDetail);
	 
	 	return getSparkJobDetailResponse;
	}
}