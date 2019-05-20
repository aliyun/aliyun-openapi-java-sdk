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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobDataOssUploadParamsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetJobDataOssUploadParamsResponse.UploadParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobDataOssUploadParamsResponseUnmarshaller {

	public static GetJobDataOssUploadParamsResponse unmarshall(GetJobDataOssUploadParamsResponse getJobDataOssUploadParamsResponse, UnmarshallerContext context) {
		
		getJobDataOssUploadParamsResponse.setRequestId(context.stringValue("GetJobDataOssUploadParamsResponse.RequestId"));
		getJobDataOssUploadParamsResponse.setSuccess(context.booleanValue("GetJobDataOssUploadParamsResponse.Success"));
		getJobDataOssUploadParamsResponse.setCode(context.stringValue("GetJobDataOssUploadParamsResponse.Code"));
		getJobDataOssUploadParamsResponse.setMessage(context.stringValue("GetJobDataOssUploadParamsResponse.Message"));
		getJobDataOssUploadParamsResponse.setHttpStatusCode(context.integerValue("GetJobDataOssUploadParamsResponse.HttpStatusCode"));

		UploadParams uploadParams = new UploadParams();
		uploadParams.setAccessId(context.stringValue("GetJobDataOssUploadParamsResponse.UploadParams.AccessId"));
		uploadParams.setPolicy(context.stringValue("GetJobDataOssUploadParamsResponse.UploadParams.Policy"));
		uploadParams.setSignature(context.stringValue("GetJobDataOssUploadParamsResponse.UploadParams.Signature"));
		uploadParams.setFolder(context.stringValue("GetJobDataOssUploadParamsResponse.UploadParams.Folder"));
		uploadParams.setHost(context.stringValue("GetJobDataOssUploadParamsResponse.UploadParams.Host"));
		uploadParams.setExpire(context.integerValue("GetJobDataOssUploadParamsResponse.UploadParams.Expire"));
		getJobDataOssUploadParamsResponse.setUploadParams(uploadParams);
	 
	 	return getJobDataOssUploadParamsResponse;
	}
}