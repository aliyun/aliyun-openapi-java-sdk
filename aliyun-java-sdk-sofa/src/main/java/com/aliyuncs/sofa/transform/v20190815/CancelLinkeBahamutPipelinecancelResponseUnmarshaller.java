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

import com.aliyuncs.sofa.model.v20190815.CancelLinkeBahamutPipelinecancelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelLinkeBahamutPipelinecancelResponseUnmarshaller {

	public static CancelLinkeBahamutPipelinecancelResponse unmarshall(CancelLinkeBahamutPipelinecancelResponse cancelLinkeBahamutPipelinecancelResponse, UnmarshallerContext _ctx) {
		
		cancelLinkeBahamutPipelinecancelResponse.setRequestId(_ctx.stringValue("CancelLinkeBahamutPipelinecancelResponse.RequestId"));
		cancelLinkeBahamutPipelinecancelResponse.setResultCode(_ctx.stringValue("CancelLinkeBahamutPipelinecancelResponse.ResultCode"));
		cancelLinkeBahamutPipelinecancelResponse.setResultMessage(_ctx.stringValue("CancelLinkeBahamutPipelinecancelResponse.ResultMessage"));
		cancelLinkeBahamutPipelinecancelResponse.setErrorMessage(_ctx.stringValue("CancelLinkeBahamutPipelinecancelResponse.ErrorMessage"));
		cancelLinkeBahamutPipelinecancelResponse.setErrorMsgParamsMap(_ctx.stringValue("CancelLinkeBahamutPipelinecancelResponse.ErrorMsgParamsMap"));
		cancelLinkeBahamutPipelinecancelResponse.setMessage(_ctx.stringValue("CancelLinkeBahamutPipelinecancelResponse.Message"));
		cancelLinkeBahamutPipelinecancelResponse.setResponseStatusCode(_ctx.longValue("CancelLinkeBahamutPipelinecancelResponse.ResponseStatusCode"));
		cancelLinkeBahamutPipelinecancelResponse.setSuccess(_ctx.booleanValue("CancelLinkeBahamutPipelinecancelResponse.Success"));
	 
	 	return cancelLinkeBahamutPipelinecancelResponse;
	}
}