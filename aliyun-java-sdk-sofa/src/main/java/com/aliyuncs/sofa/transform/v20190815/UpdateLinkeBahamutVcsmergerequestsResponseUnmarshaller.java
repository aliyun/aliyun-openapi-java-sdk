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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutVcsmergerequestsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutVcsmergerequestsResponseUnmarshaller {

	public static UpdateLinkeBahamutVcsmergerequestsResponse unmarshall(UpdateLinkeBahamutVcsmergerequestsResponse updateLinkeBahamutVcsmergerequestsResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutVcsmergerequestsResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestsResponse.RequestId"));
		updateLinkeBahamutVcsmergerequestsResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestsResponse.ResultCode"));
		updateLinkeBahamutVcsmergerequestsResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestsResponse.ResultMessage"));
		updateLinkeBahamutVcsmergerequestsResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestsResponse.ErrorMessage"));
		updateLinkeBahamutVcsmergerequestsResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestsResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutVcsmergerequestsResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestsResponse.Message"));
		updateLinkeBahamutVcsmergerequestsResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutVcsmergerequestsResponse.ResponseStatusCode"));
		updateLinkeBahamutVcsmergerequestsResponse.setResult(_ctx.stringValue("UpdateLinkeBahamutVcsmergerequestsResponse.Result"));
		updateLinkeBahamutVcsmergerequestsResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutVcsmergerequestsResponse.Success"));
	 
	 	return updateLinkeBahamutVcsmergerequestsResponse;
	}
}