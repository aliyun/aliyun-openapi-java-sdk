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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAdminproductsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAdminproductsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAdminproductsResponseUnmarshaller {

	public static GetLinkeBahamutAdminproductsResponse unmarshall(GetLinkeBahamutAdminproductsResponse getLinkeBahamutAdminproductsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAdminproductsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.RequestId"));
		getLinkeBahamutAdminproductsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.ResultCode"));
		getLinkeBahamutAdminproductsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.ResultMessage"));
		getLinkeBahamutAdminproductsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.ErrorMessage"));
		getLinkeBahamutAdminproductsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAdminproductsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.Message"));
		getLinkeBahamutAdminproductsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAdminproductsResponse.ResponseStatusCode"));
		getLinkeBahamutAdminproductsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAdminproductsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAdminproductsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCat(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Cat"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Deleted"));
			resultItem.setDisplayName(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].DisplayName"));
			resultItem.setFixed(_ctx.booleanValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Fixed"));
			resultItem.setIcon(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Icon"));
			resultItem.setIconTheme(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].IconTheme"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Name"));
			resultItem.setOpenBlank(_ctx.booleanValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].OpenBlank"));
			resultItem.setShow(_ctx.booleanValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Show"));
			resultItem.setSort(_ctx.longValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Sort"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Url"));

			List<String> menus = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Menus.Length"); j++) {
				menus.add(_ctx.stringValue("GetLinkeBahamutAdminproductsResponse.Result["+ i +"].Menus["+ j +"]"));
			}
			resultItem.setMenus(menus);

			result.add(resultItem);
		}
		getLinkeBahamutAdminproductsResponse.setResult(result);
	 
	 	return getLinkeBahamutAdminproductsResponse;
	}
}