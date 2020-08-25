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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutHealthResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutHealthResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutHealthResponseUnmarshaller {

	public static CheckLinkeBahamutHealthResponse unmarshall(CheckLinkeBahamutHealthResponse checkLinkeBahamutHealthResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutHealthResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutHealthResponse.RequestId"));
		checkLinkeBahamutHealthResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutHealthResponse.ResultCode"));
		checkLinkeBahamutHealthResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutHealthResponse.ResultMessage"));
		checkLinkeBahamutHealthResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutHealthResponse.ErrorMessage"));
		checkLinkeBahamutHealthResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutHealthResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutHealthResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutHealthResponse.Message"));
		checkLinkeBahamutHealthResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutHealthResponse.ResponseStatusCode"));
		checkLinkeBahamutHealthResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutHealthResponse.Success"));

		Result result = new Result();
		result.setDetailUrl(_ctx.stringValue("CheckLinkeBahamutHealthResponse.Result.DetailUrl"));
		result.setMandatory(_ctx.booleanValue("CheckLinkeBahamutHealthResponse.Result.Mandatory"));
		result.setMessage(_ctx.stringValue("CheckLinkeBahamutHealthResponse.Result.Message"));
		result.setPass(_ctx.booleanValue("CheckLinkeBahamutHealthResponse.Result.Pass"));
		checkLinkeBahamutHealthResponse.setResult(result);
	 
	 	return checkLinkeBahamutHealthResponse;
	}
}