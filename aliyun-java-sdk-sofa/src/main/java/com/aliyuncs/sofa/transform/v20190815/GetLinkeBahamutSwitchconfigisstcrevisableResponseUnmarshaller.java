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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutSwitchconfigisstcrevisableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutSwitchconfigisstcrevisableResponseUnmarshaller {

	public static GetLinkeBahamutSwitchconfigisstcrevisableResponse unmarshall(GetLinkeBahamutSwitchconfigisstcrevisableResponse getLinkeBahamutSwitchconfigisstcrevisableResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutSwitchconfigisstcrevisableResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutSwitchconfigisstcrevisableResponse.RequestId"));
		getLinkeBahamutSwitchconfigisstcrevisableResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutSwitchconfigisstcrevisableResponse.ResultCode"));
		getLinkeBahamutSwitchconfigisstcrevisableResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutSwitchconfigisstcrevisableResponse.ResultMessage"));
		getLinkeBahamutSwitchconfigisstcrevisableResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutSwitchconfigisstcrevisableResponse.ErrorMessage"));
		getLinkeBahamutSwitchconfigisstcrevisableResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutSwitchconfigisstcrevisableResponse.ErrorMsgParamsMap"));
		getLinkeBahamutSwitchconfigisstcrevisableResponse.setMessage(_ctx.stringValue("GetLinkeBahamutSwitchconfigisstcrevisableResponse.Message"));
		getLinkeBahamutSwitchconfigisstcrevisableResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutSwitchconfigisstcrevisableResponse.ResponseStatusCode"));
		getLinkeBahamutSwitchconfigisstcrevisableResponse.setResult(_ctx.stringValue("GetLinkeBahamutSwitchconfigisstcrevisableResponse.Result"));
		getLinkeBahamutSwitchconfigisstcrevisableResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutSwitchconfigisstcrevisableResponse.Success"));
	 
	 	return getLinkeBahamutSwitchconfigisstcrevisableResponse;
	}
}