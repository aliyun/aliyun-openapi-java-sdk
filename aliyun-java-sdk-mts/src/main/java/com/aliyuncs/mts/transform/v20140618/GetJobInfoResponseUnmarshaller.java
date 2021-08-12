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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.GetJobInfoResponse;
import com.aliyuncs.mts.model.v20140618.GetJobInfoResponse.MtsTransferJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobInfoResponseUnmarshaller {

	public static GetJobInfoResponse unmarshall(GetJobInfoResponse getJobInfoResponse, UnmarshallerContext _ctx) {
		
		getJobInfoResponse.setRequestId(_ctx.stringValue("GetJobInfoResponse.RequestId"));

		MtsTransferJob mtsTransferJob = new MtsTransferJob();
		mtsTransferJob.setJobId(_ctx.stringValue("GetJobInfoResponse.MtsTransferJob.JobId"));
		mtsTransferJob.setJobType(_ctx.stringValue("GetJobInfoResponse.MtsTransferJob.JobType"));
		mtsTransferJob.setCreateTime(_ctx.stringValue("GetJobInfoResponse.MtsTransferJob.CreateTime"));
		mtsTransferJob.setModifiedTime(_ctx.stringValue("GetJobInfoResponse.MtsTransferJob.ModifiedTime"));
		mtsTransferJob.setFinishedTime(_ctx.stringValue("GetJobInfoResponse.MtsTransferJob.FinishedTime"));
		mtsTransferJob.setState(_ctx.stringValue("GetJobInfoResponse.MtsTransferJob.State"));
		mtsTransferJob.setErrorCode(_ctx.stringValue("GetJobInfoResponse.MtsTransferJob.ErrorCode"));
		mtsTransferJob.setErrorMessage(_ctx.stringValue("GetJobInfoResponse.MtsTransferJob.ErrorMessage"));
		mtsTransferJob.setUserData(_ctx.stringValue("GetJobInfoResponse.MtsTransferJob.UserData"));
		mtsTransferJob.setExtend(_ctx.stringValue("GetJobInfoResponse.MtsTransferJob.Extend"));
		mtsTransferJob.setRequestJson(_ctx.stringValue("GetJobInfoResponse.MtsTransferJob.RequestJson"));
		getJobInfoResponse.setMtsTransferJob(mtsTransferJob);
	 
	 	return getJobInfoResponse;
	}
}