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

import com.aliyuncs.ccc.model.v20170705.GetJobTemplateDownloadParamsResponse;
import com.aliyuncs.ccc.model.v20170705.GetJobTemplateDownloadParamsResponse.DownloadParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobTemplateDownloadParamsResponseUnmarshaller {

	public static GetJobTemplateDownloadParamsResponse unmarshall(GetJobTemplateDownloadParamsResponse getJobTemplateDownloadParamsResponse, UnmarshallerContext _ctx) {
		
		getJobTemplateDownloadParamsResponse.setRequestId(_ctx.stringValue("GetJobTemplateDownloadParamsResponse.RequestId"));
		getJobTemplateDownloadParamsResponse.setSuccess(_ctx.booleanValue("GetJobTemplateDownloadParamsResponse.Success"));
		getJobTemplateDownloadParamsResponse.setCode(_ctx.stringValue("GetJobTemplateDownloadParamsResponse.Code"));
		getJobTemplateDownloadParamsResponse.setMessage(_ctx.stringValue("GetJobTemplateDownloadParamsResponse.Message"));
		getJobTemplateDownloadParamsResponse.setHttpStatusCode(_ctx.integerValue("GetJobTemplateDownloadParamsResponse.HttpStatusCode"));

		DownloadParams downloadParams = new DownloadParams();
		downloadParams.setSignatureUrl(_ctx.stringValue("GetJobTemplateDownloadParamsResponse.DownloadParams.SignatureUrl"));
		getJobTemplateDownloadParamsResponse.setDownloadParams(downloadParams);
	 
	 	return getJobTemplateDownloadParamsResponse;
	}
}