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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponseUnmarshaller {

	public static CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse unmarshall(CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse checkLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.RequestId"));
		checkLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.ResultCode"));
		checkLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.ResultMessage"));
		checkLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.ErrorMessage"));
		checkLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.Message"));
		checkLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.ResponseStatusCode"));
		checkLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.setResult(_ctx.stringValue("CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.Result"));
		checkLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse.Success"));
	 
	 	return checkLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse;
	}
}