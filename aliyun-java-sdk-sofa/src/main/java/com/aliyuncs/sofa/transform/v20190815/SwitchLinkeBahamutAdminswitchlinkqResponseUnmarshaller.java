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

import com.aliyuncs.sofa.model.v20190815.SwitchLinkeBahamutAdminswitchlinkqResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SwitchLinkeBahamutAdminswitchlinkqResponseUnmarshaller {

	public static SwitchLinkeBahamutAdminswitchlinkqResponse unmarshall(SwitchLinkeBahamutAdminswitchlinkqResponse switchLinkeBahamutAdminswitchlinkqResponse, UnmarshallerContext _ctx) {
		
		switchLinkeBahamutAdminswitchlinkqResponse.setRequestId(_ctx.stringValue("SwitchLinkeBahamutAdminswitchlinkqResponse.RequestId"));
		switchLinkeBahamutAdminswitchlinkqResponse.setResultCode(_ctx.stringValue("SwitchLinkeBahamutAdminswitchlinkqResponse.ResultCode"));
		switchLinkeBahamutAdminswitchlinkqResponse.setResultMessage(_ctx.stringValue("SwitchLinkeBahamutAdminswitchlinkqResponse.ResultMessage"));
		switchLinkeBahamutAdminswitchlinkqResponse.setErrorMessage(_ctx.stringValue("SwitchLinkeBahamutAdminswitchlinkqResponse.ErrorMessage"));
		switchLinkeBahamutAdminswitchlinkqResponse.setErrorMsgParamsMap(_ctx.stringValue("SwitchLinkeBahamutAdminswitchlinkqResponse.ErrorMsgParamsMap"));
		switchLinkeBahamutAdminswitchlinkqResponse.setMessage(_ctx.stringValue("SwitchLinkeBahamutAdminswitchlinkqResponse.Message"));
		switchLinkeBahamutAdminswitchlinkqResponse.setResponseStatusCode(_ctx.longValue("SwitchLinkeBahamutAdminswitchlinkqResponse.ResponseStatusCode"));
		switchLinkeBahamutAdminswitchlinkqResponse.setResult(_ctx.stringValue("SwitchLinkeBahamutAdminswitchlinkqResponse.Result"));
		switchLinkeBahamutAdminswitchlinkqResponse.setSuccess(_ctx.booleanValue("SwitchLinkeBahamutAdminswitchlinkqResponse.Success"));
	 
	 	return switchLinkeBahamutAdminswitchlinkqResponse;
	}
}