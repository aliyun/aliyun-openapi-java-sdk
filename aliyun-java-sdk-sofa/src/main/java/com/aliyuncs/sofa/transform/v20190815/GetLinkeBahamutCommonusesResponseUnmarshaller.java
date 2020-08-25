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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCommonusesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCommonusesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutCommonusesResponseUnmarshaller {

	public static GetLinkeBahamutCommonusesResponse unmarshall(GetLinkeBahamutCommonusesResponse getLinkeBahamutCommonusesResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutCommonusesResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutCommonusesResponse.RequestId"));
		getLinkeBahamutCommonusesResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutCommonusesResponse.ResultCode"));
		getLinkeBahamutCommonusesResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutCommonusesResponse.ResultMessage"));
		getLinkeBahamutCommonusesResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutCommonusesResponse.ErrorMessage"));
		getLinkeBahamutCommonusesResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutCommonusesResponse.ErrorMsgParamsMap"));
		getLinkeBahamutCommonusesResponse.setMessage(_ctx.stringValue("GetLinkeBahamutCommonusesResponse.Message"));
		getLinkeBahamutCommonusesResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutCommonusesResponse.ResponseStatusCode"));
		getLinkeBahamutCommonusesResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutCommonusesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutCommonusesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCat(_ctx.stringValue("GetLinkeBahamutCommonusesResponse.Result["+ i +"].Cat"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutCommonusesResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutCommonusesResponse.Result["+ i +"].Deleted"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutCommonusesResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutCommonusesResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutCommonusesResponse.Result["+ i +"].Name"));
			resultItem.setProductName(_ctx.stringValue("GetLinkeBahamutCommonusesResponse.Result["+ i +"].ProductName"));
			resultItem.setSort(_ctx.longValue("GetLinkeBahamutCommonusesResponse.Result["+ i +"].Sort"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutCommonusesResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		getLinkeBahamutCommonusesResponse.setResult(result);
	 
	 	return getLinkeBahamutCommonusesResponse;
	}
}