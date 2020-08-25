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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutAppdatastctenantidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutAppdatastctenantidResponseUnmarshaller {

	public static CheckLinkeBahamutAppdatastctenantidResponse unmarshall(CheckLinkeBahamutAppdatastctenantidResponse checkLinkeBahamutAppdatastctenantidResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutAppdatastctenantidResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutAppdatastctenantidResponse.RequestId"));
		checkLinkeBahamutAppdatastctenantidResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutAppdatastctenantidResponse.ResultCode"));
		checkLinkeBahamutAppdatastctenantidResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutAppdatastctenantidResponse.ResultMessage"));
		checkLinkeBahamutAppdatastctenantidResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutAppdatastctenantidResponse.ErrorMessage"));
		checkLinkeBahamutAppdatastctenantidResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutAppdatastctenantidResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutAppdatastctenantidResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutAppdatastctenantidResponse.Message"));
		checkLinkeBahamutAppdatastctenantidResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutAppdatastctenantidResponse.ResponseStatusCode"));
		checkLinkeBahamutAppdatastctenantidResponse.setResult(_ctx.stringValue("CheckLinkeBahamutAppdatastctenantidResponse.Result"));
		checkLinkeBahamutAppdatastctenantidResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutAppdatastctenantidResponse.Success"));
	 
	 	return checkLinkeBahamutAppdatastctenantidResponse;
	}
}