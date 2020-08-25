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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutTaskResponseUnmarshaller {

	public static UpdateLinkeBahamutTaskResponse unmarshall(UpdateLinkeBahamutTaskResponse updateLinkeBahamutTaskResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutTaskResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutTaskResponse.RequestId"));
		updateLinkeBahamutTaskResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutTaskResponse.ResultCode"));
		updateLinkeBahamutTaskResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutTaskResponse.ResultMessage"));
		updateLinkeBahamutTaskResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutTaskResponse.ErrorMessage"));
		updateLinkeBahamutTaskResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutTaskResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutTaskResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutTaskResponse.Message"));
		updateLinkeBahamutTaskResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutTaskResponse.ResponseStatusCode"));
		updateLinkeBahamutTaskResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutTaskResponse.Success"));
	 
	 	return updateLinkeBahamutTaskResponse;
	}
}