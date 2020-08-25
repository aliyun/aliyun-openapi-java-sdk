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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponseUnmarshaller {

	public static CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponse unmarshall(CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponse createLinkeBahamutTaskscreatecodequalitycheckandapproveResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.RequestId"));
		createLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.ResultCode"));
		createLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.ResultMessage"));
		createLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.ErrorMessage"));
		createLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.ErrorMsgParamsMap"));
		createLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.Message"));
		createLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.ResponseStatusCode"));
		createLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutTaskscreatecodequalitycheckandapproveResponse.Success"));
	 
	 	return createLinkeBahamutTaskscreatecodequalitycheckandapproveResponse;
	}
}