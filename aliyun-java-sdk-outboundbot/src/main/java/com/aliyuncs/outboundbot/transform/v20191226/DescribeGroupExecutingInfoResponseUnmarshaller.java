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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DescribeGroupExecutingInfoResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeGroupExecutingInfoResponse.ExecutingInfo;
import com.aliyuncs.outboundbot.model.v20191226.DescribeGroupExecutingInfoResponse.ExecutingInfo.JobsProgress;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupExecutingInfoResponseUnmarshaller {

	public static DescribeGroupExecutingInfoResponse unmarshall(DescribeGroupExecutingInfoResponse describeGroupExecutingInfoResponse, UnmarshallerContext _ctx) {
		
		describeGroupExecutingInfoResponse.setRequestId(_ctx.stringValue("DescribeGroupExecutingInfoResponse.RequestId"));
		describeGroupExecutingInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeGroupExecutingInfoResponse.HttpStatusCode"));
		describeGroupExecutingInfoResponse.setGroupId(_ctx.stringValue("DescribeGroupExecutingInfoResponse.GroupId"));
		describeGroupExecutingInfoResponse.setSuccess(_ctx.booleanValue("DescribeGroupExecutingInfoResponse.Success"));
		describeGroupExecutingInfoResponse.setCode(_ctx.stringValue("DescribeGroupExecutingInfoResponse.Code"));
		describeGroupExecutingInfoResponse.setMessage(_ctx.stringValue("DescribeGroupExecutingInfoResponse.Message"));
		describeGroupExecutingInfoResponse.setInstanceId(_ctx.stringValue("DescribeGroupExecutingInfoResponse.InstanceId"));

		ExecutingInfo executingInfo = new ExecutingInfo();
		executingInfo.setEndTime(_ctx.longValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.EndTime"));
		executingInfo.setStartTime(_ctx.longValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.StartTime"));
		executingInfo.setHangUpByClientNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.HangUpByClientNum"));
		executingInfo.setCreatorName(_ctx.stringValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.CreatorName"));
		executingInfo.setTransferByNoAnswer(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.TransferByNoAnswer"));
		executingInfo.setFinishedNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.FinishedNum"));
		executingInfo.setTransferByIntentNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.TransferByIntentNum"));
		executingInfo.setCallNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.CallNum"));
		executingInfo.setCallFailedNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.CallFailedNum"));

		JobsProgress jobsProgress = new JobsProgress();
		jobsProgress.setSchedulingNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.JobsProgress.SchedulingNum"));
		jobsProgress.setTotalCompletedNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.JobsProgress.TotalCompletedNum"));
		jobsProgress.setFailedNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.JobsProgress.FailedNum"));
		jobsProgress.setPausedNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.JobsProgress.PausedNum"));
		jobsProgress.setCancelledNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.JobsProgress.CancelledNum"));
		jobsProgress.setTotalJobs(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.JobsProgress.TotalJobs"));
		jobsProgress.setTotalNotAnsweredNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.JobsProgress.TotalNotAnsweredNum"));
		jobsProgress.setExecutingNum(_ctx.integerValue("DescribeGroupExecutingInfoResponse.ExecutingInfo.JobsProgress.ExecutingNum"));
		executingInfo.setJobsProgress(jobsProgress);
		describeGroupExecutingInfoResponse.setExecutingInfo(executingInfo);
	 
	 	return describeGroupExecutingInfoResponse;
	}
}