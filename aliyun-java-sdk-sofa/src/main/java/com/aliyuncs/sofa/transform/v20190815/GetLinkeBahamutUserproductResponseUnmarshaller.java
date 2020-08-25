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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUserproductResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUserproductResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutUserproductResponseUnmarshaller {

	public static GetLinkeBahamutUserproductResponse unmarshall(GetLinkeBahamutUserproductResponse getLinkeBahamutUserproductResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutUserproductResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutUserproductResponse.RequestId"));
		getLinkeBahamutUserproductResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutUserproductResponse.ResultCode"));
		getLinkeBahamutUserproductResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutUserproductResponse.ResultMessage"));
		getLinkeBahamutUserproductResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutUserproductResponse.ErrorMessage"));
		getLinkeBahamutUserproductResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutUserproductResponse.ErrorMsgParamsMap"));
		getLinkeBahamutUserproductResponse.setMessage(_ctx.stringValue("GetLinkeBahamutUserproductResponse.Message"));
		getLinkeBahamutUserproductResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutUserproductResponse.ResponseStatusCode"));
		getLinkeBahamutUserproductResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutUserproductResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutUserproductResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCat(_ctx.stringValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].Cat"));
			resultItem.setDisplayName(_ctx.stringValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].DisplayName"));
			resultItem.setFixed(_ctx.booleanValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].Fixed"));
			resultItem.setIcon(_ctx.stringValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].Icon"));
			resultItem.setIconTheme(_ctx.stringValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].IconTheme"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].Name"));
			resultItem.setOpenBlank(_ctx.booleanValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].OpenBlank"));
			resultItem.setShow(_ctx.booleanValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].Show"));
			resultItem.setSort(_ctx.longValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].Sort"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].Url"));

			List<String> menus = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].Menus.Length"); j++) {
				menus.add(_ctx.stringValue("GetLinkeBahamutUserproductResponse.Result["+ i +"].Menus["+ j +"]"));
			}
			resultItem.setMenus(menus);

			result.add(resultItem);
		}
		getLinkeBahamutUserproductResponse.setResult(result);
	 
	 	return getLinkeBahamutUserproductResponse;
	}
}