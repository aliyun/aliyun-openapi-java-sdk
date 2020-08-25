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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutCustomapprovaltaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutCustomapprovaltaskResponseUnmarshaller {

	public static CreateLinkeBahamutCustomapprovaltaskResponse unmarshall(CreateLinkeBahamutCustomapprovaltaskResponse createLinkeBahamutCustomapprovaltaskResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutCustomapprovaltaskResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutCustomapprovaltaskResponse.RequestId"));
		createLinkeBahamutCustomapprovaltaskResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutCustomapprovaltaskResponse.ResultCode"));
		createLinkeBahamutCustomapprovaltaskResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutCustomapprovaltaskResponse.ResultMessage"));
		createLinkeBahamutCustomapprovaltaskResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutCustomapprovaltaskResponse.ErrorMessage"));
		createLinkeBahamutCustomapprovaltaskResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutCustomapprovaltaskResponse.ErrorMsgParamsMap"));
		createLinkeBahamutCustomapprovaltaskResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutCustomapprovaltaskResponse.Message"));
		createLinkeBahamutCustomapprovaltaskResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutCustomapprovaltaskResponse.ResponseStatusCode"));
		createLinkeBahamutCustomapprovaltaskResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutCustomapprovaltaskResponse.Success"));
	 
	 	return createLinkeBahamutCustomapprovaltaskResponse;
	}
}