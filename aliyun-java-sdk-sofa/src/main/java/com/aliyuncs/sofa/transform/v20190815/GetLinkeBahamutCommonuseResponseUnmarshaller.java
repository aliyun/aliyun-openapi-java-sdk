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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCommonuseResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCommonuseResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutCommonuseResponseUnmarshaller {

	public static GetLinkeBahamutCommonuseResponse unmarshall(GetLinkeBahamutCommonuseResponse getLinkeBahamutCommonuseResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutCommonuseResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutCommonuseResponse.RequestId"));
		getLinkeBahamutCommonuseResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutCommonuseResponse.ResultCode"));
		getLinkeBahamutCommonuseResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutCommonuseResponse.ResultMessage"));
		getLinkeBahamutCommonuseResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutCommonuseResponse.ErrorMessage"));
		getLinkeBahamutCommonuseResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutCommonuseResponse.ErrorMsgParamsMap"));
		getLinkeBahamutCommonuseResponse.setMessage(_ctx.stringValue("GetLinkeBahamutCommonuseResponse.Message"));
		getLinkeBahamutCommonuseResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutCommonuseResponse.ResponseStatusCode"));
		getLinkeBahamutCommonuseResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutCommonuseResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutCommonuseResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCat(_ctx.stringValue("GetLinkeBahamutCommonuseResponse.Result["+ i +"].Cat"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutCommonuseResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutCommonuseResponse.Result["+ i +"].Name"));
			resultItem.setProductName(_ctx.stringValue("GetLinkeBahamutCommonuseResponse.Result["+ i +"].ProductName"));
			resultItem.setSort(_ctx.longValue("GetLinkeBahamutCommonuseResponse.Result["+ i +"].Sort"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutCommonuseResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		getLinkeBahamutCommonuseResponse.setResult(result);
	 
	 	return getLinkeBahamutCommonuseResponse;
	}
}