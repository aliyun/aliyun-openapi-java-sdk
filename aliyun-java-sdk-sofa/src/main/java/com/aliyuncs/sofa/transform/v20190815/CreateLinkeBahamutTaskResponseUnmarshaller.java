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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutTaskResponseUnmarshaller {

	public static CreateLinkeBahamutTaskResponse unmarshall(CreateLinkeBahamutTaskResponse createLinkeBahamutTaskResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutTaskResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutTaskResponse.RequestId"));
		createLinkeBahamutTaskResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutTaskResponse.ResultCode"));
		createLinkeBahamutTaskResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutTaskResponse.ResultMessage"));
		createLinkeBahamutTaskResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutTaskResponse.ErrorMessage"));
		createLinkeBahamutTaskResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutTaskResponse.ErrorMsgParamsMap"));
		createLinkeBahamutTaskResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutTaskResponse.Message"));
		createLinkeBahamutTaskResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutTaskResponse.ResponseStatusCode"));
		createLinkeBahamutTaskResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutTaskResponse.Success"));
	 
	 	return createLinkeBahamutTaskResponse;
	}
}