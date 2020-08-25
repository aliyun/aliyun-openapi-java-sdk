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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutReleaseidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutReleaseidResponseUnmarshaller {

	public static CheckLinkeBahamutReleaseidResponse unmarshall(CheckLinkeBahamutReleaseidResponse checkLinkeBahamutReleaseidResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutReleaseidResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutReleaseidResponse.RequestId"));
		checkLinkeBahamutReleaseidResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutReleaseidResponse.ResultCode"));
		checkLinkeBahamutReleaseidResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutReleaseidResponse.ResultMessage"));
		checkLinkeBahamutReleaseidResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutReleaseidResponse.ErrorMessage"));
		checkLinkeBahamutReleaseidResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutReleaseidResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutReleaseidResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutReleaseidResponse.Message"));
		checkLinkeBahamutReleaseidResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutReleaseidResponse.ResponseStatusCode"));
		checkLinkeBahamutReleaseidResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutReleaseidResponse.Success"));
	 
	 	return checkLinkeBahamutReleaseidResponse;
	}
}