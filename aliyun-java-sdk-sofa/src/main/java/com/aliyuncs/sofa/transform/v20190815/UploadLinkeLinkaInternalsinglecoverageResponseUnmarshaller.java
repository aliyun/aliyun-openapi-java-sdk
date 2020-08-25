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

import com.aliyuncs.sofa.model.v20190815.UploadLinkeLinkaInternalsinglecoverageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadLinkeLinkaInternalsinglecoverageResponseUnmarshaller {

	public static UploadLinkeLinkaInternalsinglecoverageResponse unmarshall(UploadLinkeLinkaInternalsinglecoverageResponse uploadLinkeLinkaInternalsinglecoverageResponse, UnmarshallerContext _ctx) {
		
		uploadLinkeLinkaInternalsinglecoverageResponse.setRequestId(_ctx.stringValue("UploadLinkeLinkaInternalsinglecoverageResponse.RequestId"));
		uploadLinkeLinkaInternalsinglecoverageResponse.setResultCode(_ctx.stringValue("UploadLinkeLinkaInternalsinglecoverageResponse.ResultCode"));
		uploadLinkeLinkaInternalsinglecoverageResponse.setResultMessage(_ctx.stringValue("UploadLinkeLinkaInternalsinglecoverageResponse.ResultMessage"));
		uploadLinkeLinkaInternalsinglecoverageResponse.setErrorCode(_ctx.stringValue("UploadLinkeLinkaInternalsinglecoverageResponse.ErrorCode"));
		uploadLinkeLinkaInternalsinglecoverageResponse.setErrorMsg(_ctx.stringValue("UploadLinkeLinkaInternalsinglecoverageResponse.ErrorMsg"));
		uploadLinkeLinkaInternalsinglecoverageResponse.setResponseStatusCode(_ctx.longValue("UploadLinkeLinkaInternalsinglecoverageResponse.ResponseStatusCode"));
		uploadLinkeLinkaInternalsinglecoverageResponse.setResult(_ctx.stringValue("UploadLinkeLinkaInternalsinglecoverageResponse.Result"));
		uploadLinkeLinkaInternalsinglecoverageResponse.setSuccess(_ctx.booleanValue("UploadLinkeLinkaInternalsinglecoverageResponse.Success"));
	 
	 	return uploadLinkeLinkaInternalsinglecoverageResponse;
	}
}