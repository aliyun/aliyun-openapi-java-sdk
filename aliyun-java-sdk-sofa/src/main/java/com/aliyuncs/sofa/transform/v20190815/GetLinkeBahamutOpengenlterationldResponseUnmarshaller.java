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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengenlterationldResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutOpengenlterationldResponseUnmarshaller {

	public static GetLinkeBahamutOpengenlterationldResponse unmarshall(GetLinkeBahamutOpengenlterationldResponse getLinkeBahamutOpengenlterationldResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutOpengenlterationldResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutOpengenlterationldResponse.RequestId"));
		getLinkeBahamutOpengenlterationldResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutOpengenlterationldResponse.ResultCode"));
		getLinkeBahamutOpengenlterationldResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutOpengenlterationldResponse.ResultMessage"));
		getLinkeBahamutOpengenlterationldResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutOpengenlterationldResponse.ErrorMessage"));
		getLinkeBahamutOpengenlterationldResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutOpengenlterationldResponse.ErrorMsgParamsMap"));
		getLinkeBahamutOpengenlterationldResponse.setMessage(_ctx.stringValue("GetLinkeBahamutOpengenlterationldResponse.Message"));
		getLinkeBahamutOpengenlterationldResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutOpengenlterationldResponse.ResponseStatusCode"));
		getLinkeBahamutOpengenlterationldResponse.setResult(_ctx.stringValue("GetLinkeBahamutOpengenlterationldResponse.Result"));
		getLinkeBahamutOpengenlterationldResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutOpengenlterationldResponse.Success"));
	 
	 	return getLinkeBahamutOpengenlterationldResponse;
	}
}