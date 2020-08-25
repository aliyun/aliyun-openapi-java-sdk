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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutUserproductResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutUserproductResponseUnmarshaller {

	public static UpdateLinkeBahamutUserproductResponse unmarshall(UpdateLinkeBahamutUserproductResponse updateLinkeBahamutUserproductResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutUserproductResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutUserproductResponse.RequestId"));
		updateLinkeBahamutUserproductResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutUserproductResponse.ResultCode"));
		updateLinkeBahamutUserproductResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutUserproductResponse.ResultMessage"));
		updateLinkeBahamutUserproductResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutUserproductResponse.ErrorMessage"));
		updateLinkeBahamutUserproductResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutUserproductResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutUserproductResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutUserproductResponse.Message"));
		updateLinkeBahamutUserproductResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutUserproductResponse.ResponseStatusCode"));
		updateLinkeBahamutUserproductResponse.setResult(_ctx.booleanValue("UpdateLinkeBahamutUserproductResponse.Result"));
		updateLinkeBahamutUserproductResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutUserproductResponse.Success"));
	 
	 	return updateLinkeBahamutUserproductResponse;
	}
}