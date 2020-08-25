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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutPointResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutPointResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutPointResponseUnmarshaller {

	public static CheckLinkeBahamutPointResponse unmarshall(CheckLinkeBahamutPointResponse checkLinkeBahamutPointResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutPointResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutPointResponse.RequestId"));
		checkLinkeBahamutPointResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutPointResponse.ResultCode"));
		checkLinkeBahamutPointResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutPointResponse.ResultMessage"));
		checkLinkeBahamutPointResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutPointResponse.ErrorMessage"));
		checkLinkeBahamutPointResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutPointResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutPointResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutPointResponse.Message"));
		checkLinkeBahamutPointResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutPointResponse.ResponseStatusCode"));
		checkLinkeBahamutPointResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutPointResponse.Success"));

		Result result = new Result();
		result.setDetailUrl(_ctx.stringValue("CheckLinkeBahamutPointResponse.Result.DetailUrl"));
		result.setMandatory(_ctx.booleanValue("CheckLinkeBahamutPointResponse.Result.Mandatory"));
		result.setMessage(_ctx.stringValue("CheckLinkeBahamutPointResponse.Result.Message"));
		result.setPass(_ctx.booleanValue("CheckLinkeBahamutPointResponse.Result.Pass"));
		checkLinkeBahamutPointResponse.setResult(result);
	 
	 	return checkLinkeBahamutPointResponse;
	}
}