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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.GetJobDataUploadParamsResponse;
import com.aliyuncs.ccc.model.v20170705.GetJobDataUploadParamsResponse.UploadParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobDataUploadParamsResponseUnmarshaller {

	public static GetJobDataUploadParamsResponse unmarshall(GetJobDataUploadParamsResponse getJobDataUploadParamsResponse, UnmarshallerContext _ctx) {
		
		getJobDataUploadParamsResponse.setRequestId(_ctx.stringValue("GetJobDataUploadParamsResponse.RequestId"));
		getJobDataUploadParamsResponse.setSuccess(_ctx.booleanValue("GetJobDataUploadParamsResponse.Success"));
		getJobDataUploadParamsResponse.setCode(_ctx.stringValue("GetJobDataUploadParamsResponse.Code"));
		getJobDataUploadParamsResponse.setMessage(_ctx.stringValue("GetJobDataUploadParamsResponse.Message"));
		getJobDataUploadParamsResponse.setHttpStatusCode(_ctx.integerValue("GetJobDataUploadParamsResponse.HttpStatusCode"));

		UploadParams uploadParams = new UploadParams();
		uploadParams.setAccessId(_ctx.stringValue("GetJobDataUploadParamsResponse.UploadParams.AccessId"));
		uploadParams.setPolicy(_ctx.stringValue("GetJobDataUploadParamsResponse.UploadParams.Policy"));
		uploadParams.setSignature(_ctx.stringValue("GetJobDataUploadParamsResponse.UploadParams.Signature"));
		uploadParams.setFolder(_ctx.stringValue("GetJobDataUploadParamsResponse.UploadParams.Folder"));
		uploadParams.setHost(_ctx.stringValue("GetJobDataUploadParamsResponse.UploadParams.Host"));
		uploadParams.setExpire(_ctx.integerValue("GetJobDataUploadParamsResponse.UploadParams.Expire"));
		getJobDataUploadParamsResponse.setUploadParams(uploadParams);
	 
	 	return getJobDataUploadParamsResponse;
	}
}