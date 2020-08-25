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

import com.aliyuncs.sofa.model.v20190815.CloseLinkeBahamutVcsmergerequestsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloseLinkeBahamutVcsmergerequestsResponseUnmarshaller {

	public static CloseLinkeBahamutVcsmergerequestsResponse unmarshall(CloseLinkeBahamutVcsmergerequestsResponse closeLinkeBahamutVcsmergerequestsResponse, UnmarshallerContext _ctx) {
		
		closeLinkeBahamutVcsmergerequestsResponse.setRequestId(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestsResponse.RequestId"));
		closeLinkeBahamutVcsmergerequestsResponse.setResultCode(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestsResponse.ResultCode"));
		closeLinkeBahamutVcsmergerequestsResponse.setResultMessage(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestsResponse.ResultMessage"));
		closeLinkeBahamutVcsmergerequestsResponse.setErrorMessage(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestsResponse.ErrorMessage"));
		closeLinkeBahamutVcsmergerequestsResponse.setErrorMsgParamsMap(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestsResponse.ErrorMsgParamsMap"));
		closeLinkeBahamutVcsmergerequestsResponse.setMessage(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestsResponse.Message"));
		closeLinkeBahamutVcsmergerequestsResponse.setResponseStatusCode(_ctx.longValue("CloseLinkeBahamutVcsmergerequestsResponse.ResponseStatusCode"));
		closeLinkeBahamutVcsmergerequestsResponse.setResult(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestsResponse.Result"));
		closeLinkeBahamutVcsmergerequestsResponse.setSuccess(_ctx.booleanValue("CloseLinkeBahamutVcsmergerequestsResponse.Success"));
	 
	 	return closeLinkeBahamutVcsmergerequestsResponse;
	}
}