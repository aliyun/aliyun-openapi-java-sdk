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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutArchdomainsResponseUnmarshaller {

	public static GetLinkeBahamutArchdomainsResponse unmarshall(GetLinkeBahamutArchdomainsResponse getLinkeBahamutArchdomainsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutArchdomainsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutArchdomainsResponse.RequestId"));
		getLinkeBahamutArchdomainsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutArchdomainsResponse.ResultCode"));
		getLinkeBahamutArchdomainsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutArchdomainsResponse.ResultMessage"));
		getLinkeBahamutArchdomainsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutArchdomainsResponse.ErrorMessage"));
		getLinkeBahamutArchdomainsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutArchdomainsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutArchdomainsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutArchdomainsResponse.Message"));
		getLinkeBahamutArchdomainsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutArchdomainsResponse.ResponseStatusCode"));
		getLinkeBahamutArchdomainsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutArchdomainsResponse.Success"));

		Result result = new Result();
		result.setAppNum(_ctx.stringValue("GetLinkeBahamutArchdomainsResponse.Result.AppNum"));
		result.setDescription(_ctx.stringValue("GetLinkeBahamutArchdomainsResponse.Result.Description"));
		result.setExternalId(_ctx.stringValue("GetLinkeBahamutArchdomainsResponse.Result.ExternalId"));
		result.setIterationNum(_ctx.stringValue("GetLinkeBahamutArchdomainsResponse.Result.IterationNum"));
		result.setName(_ctx.stringValue("GetLinkeBahamutArchdomainsResponse.Result.Name"));
		getLinkeBahamutArchdomainsResponse.setResult(result);
	 
	 	return getLinkeBahamutArchdomainsResponse;
	}
}