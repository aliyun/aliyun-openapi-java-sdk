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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutUnitbranchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutUnitbranchResponseUnmarshaller {

	public static CheckLinkeBahamutUnitbranchResponse unmarshall(CheckLinkeBahamutUnitbranchResponse checkLinkeBahamutUnitbranchResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutUnitbranchResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutUnitbranchResponse.RequestId"));
		checkLinkeBahamutUnitbranchResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutUnitbranchResponse.ResultCode"));
		checkLinkeBahamutUnitbranchResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutUnitbranchResponse.ResultMessage"));
		checkLinkeBahamutUnitbranchResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutUnitbranchResponse.ErrorMessage"));
		checkLinkeBahamutUnitbranchResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutUnitbranchResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutUnitbranchResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutUnitbranchResponse.Message"));
		checkLinkeBahamutUnitbranchResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutUnitbranchResponse.ResponseStatusCode"));
		checkLinkeBahamutUnitbranchResponse.setResult(_ctx.stringValue("CheckLinkeBahamutUnitbranchResponse.Result"));
		checkLinkeBahamutUnitbranchResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutUnitbranchResponse.Success"));
	 
	 	return checkLinkeBahamutUnitbranchResponse;
	}
}