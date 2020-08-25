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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminsecretdicResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAdminsecretdicResponseUnmarshaller {

	public static AddLinkeBahamutAdminsecretdicResponse unmarshall(AddLinkeBahamutAdminsecretdicResponse addLinkeBahamutAdminsecretdicResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAdminsecretdicResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAdminsecretdicResponse.RequestId"));
		addLinkeBahamutAdminsecretdicResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAdminsecretdicResponse.ResultCode"));
		addLinkeBahamutAdminsecretdicResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAdminsecretdicResponse.ResultMessage"));
		addLinkeBahamutAdminsecretdicResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAdminsecretdicResponse.ErrorMessage"));
		addLinkeBahamutAdminsecretdicResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAdminsecretdicResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAdminsecretdicResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAdminsecretdicResponse.Message"));
		addLinkeBahamutAdminsecretdicResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAdminsecretdicResponse.ResponseStatusCode"));
		addLinkeBahamutAdminsecretdicResponse.setResult(_ctx.booleanValue("AddLinkeBahamutAdminsecretdicResponse.Result"));
		addLinkeBahamutAdminsecretdicResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAdminsecretdicResponse.Success"));
	 
	 	return addLinkeBahamutAdminsecretdicResponse;
	}
}