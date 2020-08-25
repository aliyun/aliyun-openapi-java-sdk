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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutOpenupdateaddmetaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutOpenupdateaddmetaResponseUnmarshaller {

	public static UpdateLinkeBahamutOpenupdateaddmetaResponse unmarshall(UpdateLinkeBahamutOpenupdateaddmetaResponse updateLinkeBahamutOpenupdateaddmetaResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutOpenupdateaddmetaResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutOpenupdateaddmetaResponse.RequestId"));
		updateLinkeBahamutOpenupdateaddmetaResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutOpenupdateaddmetaResponse.ResultCode"));
		updateLinkeBahamutOpenupdateaddmetaResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutOpenupdateaddmetaResponse.ResultMessage"));
		updateLinkeBahamutOpenupdateaddmetaResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutOpenupdateaddmetaResponse.ErrorMessage"));
		updateLinkeBahamutOpenupdateaddmetaResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutOpenupdateaddmetaResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutOpenupdateaddmetaResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutOpenupdateaddmetaResponse.Message"));
		updateLinkeBahamutOpenupdateaddmetaResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutOpenupdateaddmetaResponse.ResponseStatusCode"));
		updateLinkeBahamutOpenupdateaddmetaResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutOpenupdateaddmetaResponse.Success"));
	 
	 	return updateLinkeBahamutOpenupdateaddmetaResponse;
	}
}