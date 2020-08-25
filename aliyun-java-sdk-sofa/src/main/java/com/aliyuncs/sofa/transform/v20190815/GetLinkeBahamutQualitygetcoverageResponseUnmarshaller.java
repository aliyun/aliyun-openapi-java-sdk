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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutQualitygetcoverageResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutQualitygetcoverageResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutQualitygetcoverageResponseUnmarshaller {

	public static GetLinkeBahamutQualitygetcoverageResponse unmarshall(GetLinkeBahamutQualitygetcoverageResponse getLinkeBahamutQualitygetcoverageResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutQualitygetcoverageResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutQualitygetcoverageResponse.RequestId"));
		getLinkeBahamutQualitygetcoverageResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutQualitygetcoverageResponse.ResultCode"));
		getLinkeBahamutQualitygetcoverageResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutQualitygetcoverageResponse.ResultMessage"));
		getLinkeBahamutQualitygetcoverageResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutQualitygetcoverageResponse.ErrorMessage"));
		getLinkeBahamutQualitygetcoverageResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutQualitygetcoverageResponse.ErrorMsgParamsMap"));
		getLinkeBahamutQualitygetcoverageResponse.setMessage(_ctx.stringValue("GetLinkeBahamutQualitygetcoverageResponse.Message"));
		getLinkeBahamutQualitygetcoverageResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutQualitygetcoverageResponse.ResponseStatusCode"));
		getLinkeBahamutQualitygetcoverageResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutQualitygetcoverageResponse.Success"));

		Result result = new Result();
		result.setResult(_ctx.stringValue("GetLinkeBahamutQualitygetcoverageResponse.Result.Result"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutQualitygetcoverageResponse.Result.Status"));
		getLinkeBahamutQualitygetcoverageResponse.setResult(result);
	 
	 	return getLinkeBahamutQualitygetcoverageResponse;
	}
}