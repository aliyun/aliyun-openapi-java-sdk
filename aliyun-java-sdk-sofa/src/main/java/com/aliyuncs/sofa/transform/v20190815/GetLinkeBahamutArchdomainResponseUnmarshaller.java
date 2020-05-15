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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutArchdomainResponseUnmarshaller {

	public static GetLinkeBahamutArchdomainResponse unmarshall(GetLinkeBahamutArchdomainResponse getLinkeBahamutArchdomainResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutArchdomainResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.RequestId"));
		getLinkeBahamutArchdomainResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.ResultCode"));
		getLinkeBahamutArchdomainResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.ResultMessage"));
		getLinkeBahamutArchdomainResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.ErrorMessage"));
		getLinkeBahamutArchdomainResponse.setMessage(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Message"));
		getLinkeBahamutArchdomainResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutArchdomainResponse.Success"));

		Result result = new Result();
		result.setAppNum(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Result.AppNum"));
		result.setDescription(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Result.Description"));
		result.setExternalId(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Result.ExternalId"));
		result.setIterationNum(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Result.IterationNum"));
		result.setName(_ctx.stringValue("GetLinkeBahamutArchdomainResponse.Result.Name"));
		getLinkeBahamutArchdomainResponse.setResult(result);
	 
	 	return getLinkeBahamutArchdomainResponse;
	}
}