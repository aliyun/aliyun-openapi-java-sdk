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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeBahamutIterationclearoiterationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeBahamutIterationclearoiterationResponseUnmarshaller {

	public static RemoveLinkeBahamutIterationclearoiterationResponse unmarshall(RemoveLinkeBahamutIterationclearoiterationResponse removeLinkeBahamutIterationclearoiterationResponse, UnmarshallerContext _ctx) {
		
		removeLinkeBahamutIterationclearoiterationResponse.setRequestId(_ctx.stringValue("RemoveLinkeBahamutIterationclearoiterationResponse.RequestId"));
		removeLinkeBahamutIterationclearoiterationResponse.setResultCode(_ctx.stringValue("RemoveLinkeBahamutIterationclearoiterationResponse.ResultCode"));
		removeLinkeBahamutIterationclearoiterationResponse.setResultMessage(_ctx.stringValue("RemoveLinkeBahamutIterationclearoiterationResponse.ResultMessage"));
		removeLinkeBahamutIterationclearoiterationResponse.setErrorMessage(_ctx.stringValue("RemoveLinkeBahamutIterationclearoiterationResponse.ErrorMessage"));
		removeLinkeBahamutIterationclearoiterationResponse.setErrorMsgParamsMap(_ctx.stringValue("RemoveLinkeBahamutIterationclearoiterationResponse.ErrorMsgParamsMap"));
		removeLinkeBahamutIterationclearoiterationResponse.setMessage(_ctx.stringValue("RemoveLinkeBahamutIterationclearoiterationResponse.Message"));
		removeLinkeBahamutIterationclearoiterationResponse.setResponseStatusCode(_ctx.longValue("RemoveLinkeBahamutIterationclearoiterationResponse.ResponseStatusCode"));
		removeLinkeBahamutIterationclearoiterationResponse.setResult(_ctx.booleanValue("RemoveLinkeBahamutIterationclearoiterationResponse.Result"));
		removeLinkeBahamutIterationclearoiterationResponse.setSuccess(_ctx.booleanValue("RemoveLinkeBahamutIterationclearoiterationResponse.Success"));
	 
	 	return removeLinkeBahamutIterationclearoiterationResponse;
	}
}