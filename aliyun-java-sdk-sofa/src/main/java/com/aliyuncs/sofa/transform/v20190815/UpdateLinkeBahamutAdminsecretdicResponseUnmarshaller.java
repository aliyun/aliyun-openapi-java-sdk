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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminsecretdicResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAdminsecretdicResponseUnmarshaller {

	public static UpdateLinkeBahamutAdminsecretdicResponse unmarshall(UpdateLinkeBahamutAdminsecretdicResponse updateLinkeBahamutAdminsecretdicResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAdminsecretdicResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAdminsecretdicResponse.RequestId"));
		updateLinkeBahamutAdminsecretdicResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAdminsecretdicResponse.ResultCode"));
		updateLinkeBahamutAdminsecretdicResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAdminsecretdicResponse.ResultMessage"));
		updateLinkeBahamutAdminsecretdicResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAdminsecretdicResponse.ErrorMessage"));
		updateLinkeBahamutAdminsecretdicResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAdminsecretdicResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAdminsecretdicResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAdminsecretdicResponse.Message"));
		updateLinkeBahamutAdminsecretdicResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAdminsecretdicResponse.ResponseStatusCode"));
		updateLinkeBahamutAdminsecretdicResponse.setResult(_ctx.booleanValue("UpdateLinkeBahamutAdminsecretdicResponse.Result"));
		updateLinkeBahamutAdminsecretdicResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAdminsecretdicResponse.Success"));
	 
	 	return updateLinkeBahamutAdminsecretdicResponse;
	}
}