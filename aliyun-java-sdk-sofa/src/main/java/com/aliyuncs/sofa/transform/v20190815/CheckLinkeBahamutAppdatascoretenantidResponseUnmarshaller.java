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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutAppdatascoretenantidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutAppdatascoretenantidResponseUnmarshaller {

	public static CheckLinkeBahamutAppdatascoretenantidResponse unmarshall(CheckLinkeBahamutAppdatascoretenantidResponse checkLinkeBahamutAppdatascoretenantidResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutAppdatascoretenantidResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutAppdatascoretenantidResponse.RequestId"));
		checkLinkeBahamutAppdatascoretenantidResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutAppdatascoretenantidResponse.ResultCode"));
		checkLinkeBahamutAppdatascoretenantidResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutAppdatascoretenantidResponse.ResultMessage"));
		checkLinkeBahamutAppdatascoretenantidResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutAppdatascoretenantidResponse.ErrorMessage"));
		checkLinkeBahamutAppdatascoretenantidResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutAppdatascoretenantidResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutAppdatascoretenantidResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutAppdatascoretenantidResponse.Message"));
		checkLinkeBahamutAppdatascoretenantidResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutAppdatascoretenantidResponse.ResponseStatusCode"));
		checkLinkeBahamutAppdatascoretenantidResponse.setResult(_ctx.stringValue("CheckLinkeBahamutAppdatascoretenantidResponse.Result"));
		checkLinkeBahamutAppdatascoretenantidResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutAppdatascoretenantidResponse.Success"));
	 
	 	return checkLinkeBahamutAppdatascoretenantidResponse;
	}
}