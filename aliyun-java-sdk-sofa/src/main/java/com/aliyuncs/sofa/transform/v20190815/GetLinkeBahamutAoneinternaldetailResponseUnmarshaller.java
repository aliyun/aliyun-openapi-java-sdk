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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternaldetailResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternaldetailResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneinternaldetailResponseUnmarshaller {

	public static GetLinkeBahamutAoneinternaldetailResponse unmarshall(GetLinkeBahamutAoneinternaldetailResponse getLinkeBahamutAoneinternaldetailResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneinternaldetailResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneinternaldetailResponse.RequestId"));
		getLinkeBahamutAoneinternaldetailResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneinternaldetailResponse.ResultCode"));
		getLinkeBahamutAoneinternaldetailResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaldetailResponse.ResultMessage"));
		getLinkeBahamutAoneinternaldetailResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaldetailResponse.ErrorMessage"));
		getLinkeBahamutAoneinternaldetailResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneinternaldetailResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneinternaldetailResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaldetailResponse.Message"));
		getLinkeBahamutAoneinternaldetailResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneinternaldetailResponse.ResponseStatusCode"));
		getLinkeBahamutAoneinternaldetailResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternaldetailResponse.Success"));

		Result result = new Result();
		result.setCodeChangeJsonObjects(_ctx.stringValue("GetLinkeBahamutAoneinternaldetailResponse.Result.CodeChangeJsonObjects"));
		result.setId(_ctx.stringValue("GetLinkeBahamutAoneinternaldetailResponse.Result.Id"));
		result.setName(_ctx.stringValue("GetLinkeBahamutAoneinternaldetailResponse.Result.Name"));
		result.setPortalUrl(_ctx.stringValue("GetLinkeBahamutAoneinternaldetailResponse.Result.PortalUrl"));
		result.setStatusName(_ctx.stringValue("GetLinkeBahamutAoneinternaldetailResponse.Result.StatusName"));
		getLinkeBahamutAoneinternaldetailResponse.setResult(result);
	 
	 	return getLinkeBahamutAoneinternaldetailResponse;
	}
}