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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutSearchcountResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutSearchcountResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutSearchcountResponseUnmarshaller {

	public static GetLinkeBahamutSearchcountResponse unmarshall(GetLinkeBahamutSearchcountResponse getLinkeBahamutSearchcountResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutSearchcountResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutSearchcountResponse.RequestId"));
		getLinkeBahamutSearchcountResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutSearchcountResponse.ResultCode"));
		getLinkeBahamutSearchcountResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutSearchcountResponse.ResultMessage"));
		getLinkeBahamutSearchcountResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutSearchcountResponse.ErrorMessage"));
		getLinkeBahamutSearchcountResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutSearchcountResponse.ErrorMsgParamsMap"));
		getLinkeBahamutSearchcountResponse.setMessage(_ctx.stringValue("GetLinkeBahamutSearchcountResponse.Message"));
		getLinkeBahamutSearchcountResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutSearchcountResponse.ResponseStatusCode"));
		getLinkeBahamutSearchcountResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutSearchcountResponse.Success"));

		Result result = new Result();
		result.setApps(_ctx.longValue("GetLinkeBahamutSearchcountResponse.Result.Apps"));
		result.setIterations(_ctx.longValue("GetLinkeBahamutSearchcountResponse.Result.Iterations"));
		result.setIterationUnits(_ctx.longValue("GetLinkeBahamutSearchcountResponse.Result.IterationUnits"));
		result.setReleases(_ctx.longValue("GetLinkeBahamutSearchcountResponse.Result.Releases"));
		getLinkeBahamutSearchcountResponse.setResult(result);
	 
	 	return getLinkeBahamutSearchcountResponse;
	}
}