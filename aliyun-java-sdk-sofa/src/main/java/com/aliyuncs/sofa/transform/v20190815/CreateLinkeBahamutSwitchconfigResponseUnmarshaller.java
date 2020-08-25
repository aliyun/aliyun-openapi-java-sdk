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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutSwitchconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutSwitchconfigResponseUnmarshaller {

	public static CreateLinkeBahamutSwitchconfigResponse unmarshall(CreateLinkeBahamutSwitchconfigResponse createLinkeBahamutSwitchconfigResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutSwitchconfigResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutSwitchconfigResponse.RequestId"));
		createLinkeBahamutSwitchconfigResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutSwitchconfigResponse.ResultCode"));
		createLinkeBahamutSwitchconfigResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutSwitchconfigResponse.ResultMessage"));
		createLinkeBahamutSwitchconfigResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutSwitchconfigResponse.ErrorMessage"));
		createLinkeBahamutSwitchconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutSwitchconfigResponse.ErrorMsgParamsMap"));
		createLinkeBahamutSwitchconfigResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutSwitchconfigResponse.Message"));
		createLinkeBahamutSwitchconfigResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutSwitchconfigResponse.ResponseStatusCode"));
		createLinkeBahamutSwitchconfigResponse.setResult(_ctx.stringValue("CreateLinkeBahamutSwitchconfigResponse.Result"));
		createLinkeBahamutSwitchconfigResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutSwitchconfigResponse.Success"));
	 
	 	return createLinkeBahamutSwitchconfigResponse;
	}
}