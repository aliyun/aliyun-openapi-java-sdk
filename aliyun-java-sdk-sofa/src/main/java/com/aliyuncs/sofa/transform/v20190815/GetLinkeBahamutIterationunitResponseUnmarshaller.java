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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationunitResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationunitResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationunitResponseUnmarshaller {

	public static GetLinkeBahamutIterationunitResponse unmarshall(GetLinkeBahamutIterationunitResponse getLinkeBahamutIterationunitResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationunitResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationunitResponse.RequestId"));
		getLinkeBahamutIterationunitResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationunitResponse.ResultCode"));
		getLinkeBahamutIterationunitResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationunitResponse.ResultMessage"));
		getLinkeBahamutIterationunitResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationunitResponse.ErrorMessage"));
		getLinkeBahamutIterationunitResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationunitResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationunitResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationunitResponse.Message"));
		getLinkeBahamutIterationunitResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationunitResponse.ResponseStatusCode"));
		getLinkeBahamutIterationunitResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationunitResponse.Success"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("GetLinkeBahamutIterationunitResponse.Result.AppName"));
		result.setArchDomainName(_ctx.stringValue("GetLinkeBahamutIterationunitResponse.Result.ArchDomainName"));
		result.setBranch(_ctx.stringValue("GetLinkeBahamutIterationunitResponse.Result.Branch"));
		result.setGrayRelease(_ctx.booleanValue("GetLinkeBahamutIterationunitResponse.Result.GrayRelease"));
		result.setStage(_ctx.stringValue("GetLinkeBahamutIterationunitResponse.Result.Stage"));
		getLinkeBahamutIterationunitResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationunitResponse;
	}
}