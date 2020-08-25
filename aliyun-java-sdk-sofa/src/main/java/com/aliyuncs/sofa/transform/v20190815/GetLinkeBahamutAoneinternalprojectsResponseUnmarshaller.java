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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternalprojectsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternalprojectsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneinternalprojectsResponseUnmarshaller {

	public static GetLinkeBahamutAoneinternalprojectsResponse unmarshall(GetLinkeBahamutAoneinternalprojectsResponse getLinkeBahamutAoneinternalprojectsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneinternalprojectsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.RequestId"));
		getLinkeBahamutAoneinternalprojectsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.ResultCode"));
		getLinkeBahamutAoneinternalprojectsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.ResultMessage"));
		getLinkeBahamutAoneinternalprojectsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.ErrorMessage"));
		getLinkeBahamutAoneinternalprojectsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneinternalprojectsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.Message"));
		getLinkeBahamutAoneinternalprojectsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneinternalprojectsResponse.ResponseStatusCode"));
		getLinkeBahamutAoneinternalprojectsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternalprojectsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAoneinternalprojectsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].Creator"));
			resultItem.setFullName(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].FullName"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].Id"));
			resultItem.setIdPath(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].IdPath"));
			resultItem.setLink(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].Link"));
			resultItem.setMode(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].Mode"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].Name"));
			resultItem.setParentId(_ctx.longValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].ParentId"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].Status"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].Type"));

			List<String> admins = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].Admins.Length"); j++) {
				admins.add(_ctx.stringValue("GetLinkeBahamutAoneinternalprojectsResponse.Result["+ i +"].Admins["+ j +"]"));
			}
			resultItem.setAdmins(admins);

			result.add(resultItem);
		}
		getLinkeBahamutAoneinternalprojectsResponse.setResult(result);
	 
	 	return getLinkeBahamutAoneinternalprojectsResponse;
	}
}