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

import com.aliyuncs.dms_enterprise.model.v20181101.GetUserUploadFileJobResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetUserUploadFileJobResponse.UploadFileJobDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.GetUserUploadFileJobResponse.UploadFileJobDetail.UploadOSSParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserUploadFileJobResponseUnmarshaller {

	public static GetUserUploadFileJobResponse unmarshall(GetUserUploadFileJobResponse getUserUploadFileJobResponse, UnmarshallerContext _ctx) {
		
		getUserUploadFileJobResponse.setRequestId(_ctx.stringValue("GetUserUploadFileJobResponse.RequestId"));
		getUserUploadFileJobResponse.setSuccess(_ctx.booleanValue("GetUserUploadFileJobResponse.Success"));
		getUserUploadFileJobResponse.setErrorMessage(_ctx.stringValue("GetUserUploadFileJobResponse.ErrorMessage"));
		getUserUploadFileJobResponse.setErrorCode(_ctx.stringValue("GetUserUploadFileJobResponse.ErrorCode"));

		UploadFileJobDetail uploadFileJobDetail = new UploadFileJobDetail();
		uploadFileJobDetail.setJobKey(_ctx.stringValue("GetUserUploadFileJobResponse.UploadFileJobDetail.JobKey"));
		uploadFileJobDetail.setFileName(_ctx.stringValue("GetUserUploadFileJobResponse.UploadFileJobDetail.FileName"));
		uploadFileJobDetail.setFileSize(_ctx.longValue("GetUserUploadFileJobResponse.UploadFileJobDetail.FileSize"));
		uploadFileJobDetail.setFileSource(_ctx.stringValue("GetUserUploadFileJobResponse.UploadFileJobDetail.FileSource"));
		uploadFileJobDetail.setUploadType(_ctx.stringValue("GetUserUploadFileJobResponse.UploadFileJobDetail.UploadType"));
		uploadFileJobDetail.setUploadURL(_ctx.stringValue("GetUserUploadFileJobResponse.UploadFileJobDetail.UploadURL"));
		uploadFileJobDetail.setUploadedSize(_ctx.longValue("GetUserUploadFileJobResponse.UploadFileJobDetail.UploadedSize"));
		uploadFileJobDetail.setJobStatus(_ctx.stringValue("GetUserUploadFileJobResponse.UploadFileJobDetail.JobStatus"));
		uploadFileJobDetail.setJobStatusDesc(_ctx.stringValue("GetUserUploadFileJobResponse.UploadFileJobDetail.JobStatusDesc"));
		uploadFileJobDetail.setAttachmentKey(_ctx.stringValue("GetUserUploadFileJobResponse.UploadFileJobDetail.AttachmentKey"));

		UploadOSSParam uploadOSSParam = new UploadOSSParam();
		uploadOSSParam.setEndpoint(_ctx.stringValue("GetUserUploadFileJobResponse.UploadFileJobDetail.UploadOSSParam.Endpoint"));
		uploadOSSParam.setBucketName(_ctx.stringValue("GetUserUploadFileJobResponse.UploadFileJobDetail.UploadOSSParam.BucketName"));
		uploadOSSParam.setObjectName(_ctx.stringValue("GetUserUploadFileJobResponse.UploadFileJobDetail.UploadOSSParam.ObjectName"));
		uploadFileJobDetail.setUploadOSSParam(uploadOSSParam);
		getUserUploadFileJobResponse.setUploadFileJobDetail(uploadFileJobDetail);
	 
	 	return getUserUploadFileJobResponse;
	}
}