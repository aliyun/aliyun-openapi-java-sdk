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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutStagebranchinfoResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutStagebranchinfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutStagebranchinfoResponseUnmarshaller {

	public static GetLinkeBahamutStagebranchinfoResponse unmarshall(GetLinkeBahamutStagebranchinfoResponse getLinkeBahamutStagebranchinfoResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutStagebranchinfoResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutStagebranchinfoResponse.RequestId"));
		getLinkeBahamutStagebranchinfoResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutStagebranchinfoResponse.ResultCode"));
		getLinkeBahamutStagebranchinfoResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutStagebranchinfoResponse.ResultMessage"));
		getLinkeBahamutStagebranchinfoResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutStagebranchinfoResponse.ErrorMessage"));
		getLinkeBahamutStagebranchinfoResponse.setMessage(_ctx.stringValue("GetLinkeBahamutStagebranchinfoResponse.Message"));
		getLinkeBahamutStagebranchinfoResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutStagebranchinfoResponse.Success"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("GetLinkeBahamutStagebranchinfoResponse.Result.AppName"));
		result.setArchDomainName(_ctx.stringValue("GetLinkeBahamutStagebranchinfoResponse.Result.ArchDomainName"));
		result.setBranch(_ctx.stringValue("GetLinkeBahamutStagebranchinfoResponse.Result.Branch"));
		result.setGrayRelease(_ctx.booleanValue("GetLinkeBahamutStagebranchinfoResponse.Result.GrayRelease"));
		result.setStage(_ctx.stringValue("GetLinkeBahamutStagebranchinfoResponse.Result.Stage"));
		getLinkeBahamutStagebranchinfoResponse.setResult(result);
	 
	 	return getLinkeBahamutStagebranchinfoResponse;
	}
}