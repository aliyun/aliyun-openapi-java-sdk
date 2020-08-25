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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutCommonuserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutCommonuserResponseUnmarshaller {

	public static CreateLinkeBahamutCommonuserResponse unmarshall(CreateLinkeBahamutCommonuserResponse createLinkeBahamutCommonuserResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutCommonuserResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutCommonuserResponse.RequestId"));
		createLinkeBahamutCommonuserResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutCommonuserResponse.ResultCode"));
		createLinkeBahamutCommonuserResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutCommonuserResponse.ResultMessage"));
		createLinkeBahamutCommonuserResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutCommonuserResponse.ErrorMessage"));
		createLinkeBahamutCommonuserResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutCommonuserResponse.ErrorMsgParamsMap"));
		createLinkeBahamutCommonuserResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutCommonuserResponse.Message"));
		createLinkeBahamutCommonuserResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutCommonuserResponse.ResponseStatusCode"));
		createLinkeBahamutCommonuserResponse.setResult(_ctx.booleanValue("CreateLinkeBahamutCommonuserResponse.Result"));
		createLinkeBahamutCommonuserResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutCommonuserResponse.Success"));
	 
	 	return createLinkeBahamutCommonuserResponse;
	}
}