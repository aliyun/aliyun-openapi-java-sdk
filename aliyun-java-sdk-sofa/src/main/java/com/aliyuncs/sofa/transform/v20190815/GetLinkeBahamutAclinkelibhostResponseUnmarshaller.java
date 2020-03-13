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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAclinkelibhostResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAclinkelibhostResponseUnmarshaller {

	public static GetLinkeBahamutAclinkelibhostResponse unmarshall(GetLinkeBahamutAclinkelibhostResponse getLinkeBahamutAclinkelibhostResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAclinkelibhostResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAclinkelibhostResponse.RequestId"));
		getLinkeBahamutAclinkelibhostResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAclinkelibhostResponse.ResultCode"));
		getLinkeBahamutAclinkelibhostResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAclinkelibhostResponse.ResultMessage"));
		getLinkeBahamutAclinkelibhostResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAclinkelibhostResponse.ErrorMessage"));
		getLinkeBahamutAclinkelibhostResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAclinkelibhostResponse.Message"));
		getLinkeBahamutAclinkelibhostResponse.setResult(_ctx.stringValue("GetLinkeBahamutAclinkelibhostResponse.Result"));
		getLinkeBahamutAclinkelibhostResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAclinkelibhostResponse.Success"));
	 
	 	return getLinkeBahamutAclinkelibhostResponse;
	}
}