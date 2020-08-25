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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGetexternalqualitygetexternalqualityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutGetexternalqualitygetexternalqualityResponseUnmarshaller {

	public static GetLinkeBahamutGetexternalqualitygetexternalqualityResponse unmarshall(GetLinkeBahamutGetexternalqualitygetexternalqualityResponse getLinkeBahamutGetexternalqualitygetexternalqualityResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutGetexternalqualitygetexternalqualityResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutGetexternalqualitygetexternalqualityResponse.RequestId"));
		getLinkeBahamutGetexternalqualitygetexternalqualityResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutGetexternalqualitygetexternalqualityResponse.ResultCode"));
		getLinkeBahamutGetexternalqualitygetexternalqualityResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutGetexternalqualitygetexternalqualityResponse.ResultMessage"));
		getLinkeBahamutGetexternalqualitygetexternalqualityResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutGetexternalqualitygetexternalqualityResponse.ErrorMessage"));
		getLinkeBahamutGetexternalqualitygetexternalqualityResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutGetexternalqualitygetexternalqualityResponse.ErrorMsgParamsMap"));
		getLinkeBahamutGetexternalqualitygetexternalqualityResponse.setMessage(_ctx.stringValue("GetLinkeBahamutGetexternalqualitygetexternalqualityResponse.Message"));
		getLinkeBahamutGetexternalqualitygetexternalqualityResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutGetexternalqualitygetexternalqualityResponse.ResponseStatusCode"));
		getLinkeBahamutGetexternalqualitygetexternalqualityResponse.setResult(_ctx.stringValue("GetLinkeBahamutGetexternalqualitygetexternalqualityResponse.Result"));
		getLinkeBahamutGetexternalqualitygetexternalqualityResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutGetexternalqualitygetexternalqualityResponse.Success"));
	 
	 	return getLinkeBahamutGetexternalqualitygetexternalqualityResponse;
	}
}