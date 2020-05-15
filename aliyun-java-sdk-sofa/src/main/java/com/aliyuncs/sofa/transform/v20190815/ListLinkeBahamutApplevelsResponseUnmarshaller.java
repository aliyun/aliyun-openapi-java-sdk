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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutApplevelsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutApplevelsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutApplevelsResponseUnmarshaller {

	public static ListLinkeBahamutApplevelsResponse unmarshall(ListLinkeBahamutApplevelsResponse listLinkeBahamutApplevelsResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutApplevelsResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutApplevelsResponse.RequestId"));
		listLinkeBahamutApplevelsResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutApplevelsResponse.ResultCode"));
		listLinkeBahamutApplevelsResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutApplevelsResponse.ResultMessage"));
		listLinkeBahamutApplevelsResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutApplevelsResponse.ErrorMessage"));
		listLinkeBahamutApplevelsResponse.setMessage(_ctx.stringValue("ListLinkeBahamutApplevelsResponse.Message"));
		listLinkeBahamutApplevelsResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutApplevelsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutApplevelsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutApplevelsResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("ListLinkeBahamutApplevelsResponse.Result["+ i +"].Name"));
			resultItem.setOwnerLoginName(_ctx.stringValue("ListLinkeBahamutApplevelsResponse.Result["+ i +"].OwnerLoginName"));

			result.add(resultItem);
		}
		listLinkeBahamutApplevelsResponse.setResult(result);
	 
	 	return listLinkeBahamutApplevelsResponse;
	}
}