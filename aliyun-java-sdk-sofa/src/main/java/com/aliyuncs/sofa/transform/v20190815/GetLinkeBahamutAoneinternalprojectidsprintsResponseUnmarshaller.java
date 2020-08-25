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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternalprojectidsprintsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternalprojectidsprintsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneinternalprojectidsprintsResponseUnmarshaller {

	public static GetLinkeBahamutAoneinternalprojectidsprintsResponse unmarshall(GetLinkeBahamutAoneinternalprojectidsprintsResponse getLinkeBahamutAoneinternalprojectidsprintsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneinternalprojectidsprintsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.RequestId"));
		getLinkeBahamutAoneinternalprojectidsprintsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.ResultCode"));
		getLinkeBahamutAoneinternalprojectidsprintsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.ResultMessage"));
		getLinkeBahamutAoneinternalprojectidsprintsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.ErrorMessage"));
		getLinkeBahamutAoneinternalprojectidsprintsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneinternalprojectidsprintsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.Message"));
		getLinkeBahamutAoneinternalprojectidsprintsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.ResponseStatusCode"));
		getLinkeBahamutAoneinternalprojectidsprintsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.Result["+ i +"].Name"));
			resultItem.setStatus(_ctx.longValue("GetLinkeBahamutAoneinternalprojectidsprintsResponse.Result["+ i +"].Status"));

			result.add(resultItem);
		}
		getLinkeBahamutAoneinternalprojectidsprintsResponse.setResult(result);
	 
	 	return getLinkeBahamutAoneinternalprojectidsprintsResponse;
	}
}