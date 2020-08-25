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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternalworkitemResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneinternalworkitemResponseUnmarshaller {

	public static GetLinkeBahamutAoneinternalworkitemResponse unmarshall(GetLinkeBahamutAoneinternalworkitemResponse getLinkeBahamutAoneinternalworkitemResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneinternalworkitemResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneinternalworkitemResponse.RequestId"));
		getLinkeBahamutAoneinternalworkitemResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneinternalworkitemResponse.ResultCode"));
		getLinkeBahamutAoneinternalworkitemResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalworkitemResponse.ResultMessage"));
		getLinkeBahamutAoneinternalworkitemResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalworkitemResponse.ErrorMessage"));
		getLinkeBahamutAoneinternalworkitemResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneinternalworkitemResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneinternalworkitemResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalworkitemResponse.Message"));
		getLinkeBahamutAoneinternalworkitemResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneinternalworkitemResponse.ResponseStatusCode"));
		getLinkeBahamutAoneinternalworkitemResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternalworkitemResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAoneinternalworkitemResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("GetLinkeBahamutAoneinternalworkitemResponse.Result["+ i +"]"));
		}
		getLinkeBahamutAoneinternalworkitemResponse.setResult(result);
	 
	 	return getLinkeBahamutAoneinternalworkitemResponse;
	}
}