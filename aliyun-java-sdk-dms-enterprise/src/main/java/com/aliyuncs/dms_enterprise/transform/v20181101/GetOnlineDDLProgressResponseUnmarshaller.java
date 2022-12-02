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

import com.aliyuncs.dms_enterprise.model.v20181101.GetOnlineDDLProgressResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetOnlineDDLProgressResponse.OnlineDDLTaskDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOnlineDDLProgressResponseUnmarshaller {

	public static GetOnlineDDLProgressResponse unmarshall(GetOnlineDDLProgressResponse getOnlineDDLProgressResponse, UnmarshallerContext _ctx) {
		
		getOnlineDDLProgressResponse.setRequestId(_ctx.stringValue("GetOnlineDDLProgressResponse.RequestId"));
		getOnlineDDLProgressResponse.setSuccess(_ctx.booleanValue("GetOnlineDDLProgressResponse.Success"));
		getOnlineDDLProgressResponse.setErrorMessage(_ctx.stringValue("GetOnlineDDLProgressResponse.ErrorMessage"));
		getOnlineDDLProgressResponse.setErrorCode(_ctx.stringValue("GetOnlineDDLProgressResponse.ErrorCode"));

		OnlineDDLTaskDetail onlineDDLTaskDetail = new OnlineDDLTaskDetail();
		onlineDDLTaskDetail.setJobStatus(_ctx.stringValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.JobStatus"));
		onlineDDLTaskDetail.setStatusDesc(_ctx.stringValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.StatusDesc"));
		onlineDDLTaskDetail.setDelaySeconds(_ctx.longValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.DelaySeconds"));
		onlineDDLTaskDetail.setCopyTotal(_ctx.longValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.CopyTotal"));
		onlineDDLTaskDetail.setCopyCount(_ctx.longValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.CopyCount"));
		onlineDDLTaskDetail.setProgressRatio(_ctx.stringValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.ProgressRatio"));
		onlineDDLTaskDetail.setCutoverLockTimeSeconds(_ctx.longValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.CutoverLockTimeSeconds"));
		onlineDDLTaskDetail.setCutoverFailRetryTimes(_ctx.longValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.CutoverFailRetryTimes"));
		onlineDDLTaskDetail.setCleanStrategy(_ctx.stringValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.CleanStrategy"));
		onlineDDLTaskDetail.setCopyChunkSize(_ctx.longValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.CopyChunkSize"));
		onlineDDLTaskDetail.setCopyChunkMode(_ctx.stringValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.CopyChunkMode"));
		onlineDDLTaskDetail.setCutoverWindowStartTime(_ctx.stringValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.CutoverWindowStartTime"));
		onlineDDLTaskDetail.setCutoverWindowEndTime(_ctx.stringValue("GetOnlineDDLProgressResponse.OnlineDDLTaskDetail.CutoverWindowEndTime"));
		getOnlineDDLProgressResponse.setOnlineDDLTaskDetail(onlineDDLTaskDetail);
	 
	 	return getOnlineDDLProgressResponse;
	}
}