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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.UploadLinkeLinkaTaskcoverageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadLinkeLinkaTaskcoverageResponseUnmarshaller {

	public static UploadLinkeLinkaTaskcoverageResponse unmarshall(UploadLinkeLinkaTaskcoverageResponse uploadLinkeLinkaTaskcoverageResponse, UnmarshallerContext _ctx) {
		
		uploadLinkeLinkaTaskcoverageResponse.setRequestId(_ctx.stringValue("UploadLinkeLinkaTaskcoverageResponse.RequestId"));
		uploadLinkeLinkaTaskcoverageResponse.setResultCode(_ctx.stringValue("UploadLinkeLinkaTaskcoverageResponse.ResultCode"));
		uploadLinkeLinkaTaskcoverageResponse.setResultMessage(_ctx.stringValue("UploadLinkeLinkaTaskcoverageResponse.ResultMessage"));
		uploadLinkeLinkaTaskcoverageResponse.setErrorCode(_ctx.stringValue("UploadLinkeLinkaTaskcoverageResponse.ErrorCode"));
		uploadLinkeLinkaTaskcoverageResponse.setErrorMsg(_ctx.stringValue("UploadLinkeLinkaTaskcoverageResponse.ErrorMsg"));
		uploadLinkeLinkaTaskcoverageResponse.setResponseStatusCode(_ctx.longValue("UploadLinkeLinkaTaskcoverageResponse.ResponseStatusCode"));
		uploadLinkeLinkaTaskcoverageResponse.setSuccess(_ctx.booleanValue("UploadLinkeLinkaTaskcoverageResponse.Success"));
	 
	 	return uploadLinkeLinkaTaskcoverageResponse;
	}
}