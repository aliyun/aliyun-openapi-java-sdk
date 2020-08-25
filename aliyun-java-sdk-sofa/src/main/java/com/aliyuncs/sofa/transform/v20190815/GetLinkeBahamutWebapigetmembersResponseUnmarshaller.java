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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetmembersResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetmembersResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutWebapigetmembersResponseUnmarshaller {

	public static GetLinkeBahamutWebapigetmembersResponse unmarshall(GetLinkeBahamutWebapigetmembersResponse getLinkeBahamutWebapigetmembersResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutWebapigetmembersResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutWebapigetmembersResponse.RequestId"));
		getLinkeBahamutWebapigetmembersResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutWebapigetmembersResponse.ResultCode"));
		getLinkeBahamutWebapigetmembersResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutWebapigetmembersResponse.ResultMessage"));
		getLinkeBahamutWebapigetmembersResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutWebapigetmembersResponse.ErrorMessage"));
		getLinkeBahamutWebapigetmembersResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutWebapigetmembersResponse.ErrorMsgParamsMap"));
		getLinkeBahamutWebapigetmembersResponse.setMessage(_ctx.stringValue("GetLinkeBahamutWebapigetmembersResponse.Message"));
		getLinkeBahamutWebapigetmembersResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutWebapigetmembersResponse.ResponseStatusCode"));
		getLinkeBahamutWebapigetmembersResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutWebapigetmembersResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutWebapigetmembersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessLevel(_ctx.longValue("GetLinkeBahamutWebapigetmembersResponse.Result["+ i +"].AccessLevel"));
			resultItem.setEmail(_ctx.stringValue("GetLinkeBahamutWebapigetmembersResponse.Result["+ i +"].Email"));
			resultItem.setExternUid(_ctx.stringValue("GetLinkeBahamutWebapigetmembersResponse.Result["+ i +"].ExternUid"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutWebapigetmembersResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutWebapigetmembersResponse.Result["+ i +"].Name"));
			resultItem.setUsername(_ctx.stringValue("GetLinkeBahamutWebapigetmembersResponse.Result["+ i +"].Username"));

			result.add(resultItem);
		}
		getLinkeBahamutWebapigetmembersResponse.setResult(result);
	 
	 	return getLinkeBahamutWebapigetmembersResponse;
	}
}