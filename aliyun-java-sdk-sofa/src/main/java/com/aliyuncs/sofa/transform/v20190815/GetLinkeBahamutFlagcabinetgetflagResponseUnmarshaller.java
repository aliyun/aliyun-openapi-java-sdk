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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutFlagcabinetgetflagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutFlagcabinetgetflagResponseUnmarshaller {

	public static GetLinkeBahamutFlagcabinetgetflagResponse unmarshall(GetLinkeBahamutFlagcabinetgetflagResponse getLinkeBahamutFlagcabinetgetflagResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutFlagcabinetgetflagResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutFlagcabinetgetflagResponse.RequestId"));
		getLinkeBahamutFlagcabinetgetflagResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutFlagcabinetgetflagResponse.ResultCode"));
		getLinkeBahamutFlagcabinetgetflagResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutFlagcabinetgetflagResponse.ResultMessage"));
		getLinkeBahamutFlagcabinetgetflagResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutFlagcabinetgetflagResponse.ErrorMessage"));
		getLinkeBahamutFlagcabinetgetflagResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutFlagcabinetgetflagResponse.ErrorMsgParamsMap"));
		getLinkeBahamutFlagcabinetgetflagResponse.setMessage(_ctx.stringValue("GetLinkeBahamutFlagcabinetgetflagResponse.Message"));
		getLinkeBahamutFlagcabinetgetflagResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutFlagcabinetgetflagResponse.ResponseStatusCode"));
		getLinkeBahamutFlagcabinetgetflagResponse.setResult(_ctx.stringValue("GetLinkeBahamutFlagcabinetgetflagResponse.Result"));
		getLinkeBahamutFlagcabinetgetflagResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutFlagcabinetgetflagResponse.Success"));
	 
	 	return getLinkeBahamutFlagcabinetgetflagResponse;
	}
}