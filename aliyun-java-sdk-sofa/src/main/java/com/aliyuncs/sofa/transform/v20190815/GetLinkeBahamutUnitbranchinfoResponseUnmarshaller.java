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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUnitbranchinfoResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUnitbranchinfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutUnitbranchinfoResponseUnmarshaller {

	public static GetLinkeBahamutUnitbranchinfoResponse unmarshall(GetLinkeBahamutUnitbranchinfoResponse getLinkeBahamutUnitbranchinfoResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutUnitbranchinfoResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutUnitbranchinfoResponse.RequestId"));
		getLinkeBahamutUnitbranchinfoResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutUnitbranchinfoResponse.ResultCode"));
		getLinkeBahamutUnitbranchinfoResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutUnitbranchinfoResponse.ResultMessage"));
		getLinkeBahamutUnitbranchinfoResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutUnitbranchinfoResponse.ErrorMessage"));
		getLinkeBahamutUnitbranchinfoResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutUnitbranchinfoResponse.ErrorMsgParamsMap"));
		getLinkeBahamutUnitbranchinfoResponse.setMessage(_ctx.stringValue("GetLinkeBahamutUnitbranchinfoResponse.Message"));
		getLinkeBahamutUnitbranchinfoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutUnitbranchinfoResponse.ResponseStatusCode"));
		getLinkeBahamutUnitbranchinfoResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutUnitbranchinfoResponse.Success"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("GetLinkeBahamutUnitbranchinfoResponse.Result.AppName"));
		result.setArchDomainName(_ctx.stringValue("GetLinkeBahamutUnitbranchinfoResponse.Result.ArchDomainName"));
		result.setBranch(_ctx.stringValue("GetLinkeBahamutUnitbranchinfoResponse.Result.Branch"));
		result.setGrayRelease(_ctx.booleanValue("GetLinkeBahamutUnitbranchinfoResponse.Result.GrayRelease"));
		result.setStage(_ctx.stringValue("GetLinkeBahamutUnitbranchinfoResponse.Result.Stage"));
		getLinkeBahamutUnitbranchinfoResponse.setResult(result);
	 
	 	return getLinkeBahamutUnitbranchinfoResponse;
	}
}