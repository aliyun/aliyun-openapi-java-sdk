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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutStagetaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutStagetaskResponseUnmarshaller {

	public static CreateLinkeBahamutStagetaskResponse unmarshall(CreateLinkeBahamutStagetaskResponse createLinkeBahamutStagetaskResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutStagetaskResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutStagetaskResponse.RequestId"));
		createLinkeBahamutStagetaskResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutStagetaskResponse.ResultCode"));
		createLinkeBahamutStagetaskResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutStagetaskResponse.ResultMessage"));
		createLinkeBahamutStagetaskResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutStagetaskResponse.ErrorMessage"));
		createLinkeBahamutStagetaskResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutStagetaskResponse.ErrorMsgParamsMap"));
		createLinkeBahamutStagetaskResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutStagetaskResponse.Message"));
		createLinkeBahamutStagetaskResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutStagetaskResponse.ResponseStatusCode"));
		createLinkeBahamutStagetaskResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutStagetaskResponse.Success"));
	 
	 	return createLinkeBahamutStagetaskResponse;
	}
}