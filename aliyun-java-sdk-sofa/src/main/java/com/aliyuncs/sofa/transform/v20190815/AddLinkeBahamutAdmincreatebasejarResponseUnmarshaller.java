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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdmincreatebasejarResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAdmincreatebasejarResponseUnmarshaller {

	public static AddLinkeBahamutAdmincreatebasejarResponse unmarshall(AddLinkeBahamutAdmincreatebasejarResponse addLinkeBahamutAdmincreatebasejarResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAdmincreatebasejarResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAdmincreatebasejarResponse.RequestId"));
		addLinkeBahamutAdmincreatebasejarResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAdmincreatebasejarResponse.ResultCode"));
		addLinkeBahamutAdmincreatebasejarResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAdmincreatebasejarResponse.ResultMessage"));
		addLinkeBahamutAdmincreatebasejarResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAdmincreatebasejarResponse.ErrorMessage"));
		addLinkeBahamutAdmincreatebasejarResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAdmincreatebasejarResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAdmincreatebasejarResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAdmincreatebasejarResponse.Message"));
		addLinkeBahamutAdmincreatebasejarResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAdmincreatebasejarResponse.ResponseStatusCode"));
		addLinkeBahamutAdmincreatebasejarResponse.setResult(_ctx.booleanValue("AddLinkeBahamutAdmincreatebasejarResponse.Result"));
		addLinkeBahamutAdmincreatebasejarResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAdmincreatebasejarResponse.Success"));
	 
	 	return addLinkeBahamutAdmincreatebasejarResponse;
	}
}