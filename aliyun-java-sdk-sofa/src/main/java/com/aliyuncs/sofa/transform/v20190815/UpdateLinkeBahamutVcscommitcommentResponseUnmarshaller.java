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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutVcscommitcommentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutVcscommitcommentResponseUnmarshaller {

	public static UpdateLinkeBahamutVcscommitcommentResponse unmarshall(UpdateLinkeBahamutVcscommitcommentResponse updateLinkeBahamutVcscommitcommentResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutVcscommitcommentResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutVcscommitcommentResponse.RequestId"));
		updateLinkeBahamutVcscommitcommentResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutVcscommitcommentResponse.ResultCode"));
		updateLinkeBahamutVcscommitcommentResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutVcscommitcommentResponse.ResultMessage"));
		updateLinkeBahamutVcscommitcommentResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutVcscommitcommentResponse.ErrorMessage"));
		updateLinkeBahamutVcscommitcommentResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutVcscommitcommentResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutVcscommitcommentResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutVcscommitcommentResponse.Message"));
		updateLinkeBahamutVcscommitcommentResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutVcscommitcommentResponse.ResponseStatusCode"));
		updateLinkeBahamutVcscommitcommentResponse.setResult(_ctx.stringValue("UpdateLinkeBahamutVcscommitcommentResponse.Result"));
		updateLinkeBahamutVcscommitcommentResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutVcscommitcommentResponse.Success"));
	 
	 	return updateLinkeBahamutVcscommitcommentResponse;
	}
}