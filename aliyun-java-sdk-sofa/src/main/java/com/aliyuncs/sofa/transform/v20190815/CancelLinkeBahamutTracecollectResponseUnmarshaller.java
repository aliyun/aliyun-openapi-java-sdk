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

import com.aliyuncs.sofa.model.v20190815.CancelLinkeBahamutTracecollectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelLinkeBahamutTracecollectResponseUnmarshaller {

	public static CancelLinkeBahamutTracecollectResponse unmarshall(CancelLinkeBahamutTracecollectResponse cancelLinkeBahamutTracecollectResponse, UnmarshallerContext _ctx) {
		
		cancelLinkeBahamutTracecollectResponse.setRequestId(_ctx.stringValue("CancelLinkeBahamutTracecollectResponse.RequestId"));
		cancelLinkeBahamutTracecollectResponse.setResultCode(_ctx.stringValue("CancelLinkeBahamutTracecollectResponse.ResultCode"));
		cancelLinkeBahamutTracecollectResponse.setResultMessage(_ctx.stringValue("CancelLinkeBahamutTracecollectResponse.ResultMessage"));
		cancelLinkeBahamutTracecollectResponse.setErrorMessage(_ctx.stringValue("CancelLinkeBahamutTracecollectResponse.ErrorMessage"));
		cancelLinkeBahamutTracecollectResponse.setErrorMsgParamsMap(_ctx.stringValue("CancelLinkeBahamutTracecollectResponse.ErrorMsgParamsMap"));
		cancelLinkeBahamutTracecollectResponse.setMessage(_ctx.stringValue("CancelLinkeBahamutTracecollectResponse.Message"));
		cancelLinkeBahamutTracecollectResponse.setResponseStatusCode(_ctx.longValue("CancelLinkeBahamutTracecollectResponse.ResponseStatusCode"));
		cancelLinkeBahamutTracecollectResponse.setSuccess(_ctx.booleanValue("CancelLinkeBahamutTracecollectResponse.Success"));
	 
	 	return cancelLinkeBahamutTracecollectResponse;
	}
}