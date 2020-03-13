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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAppstacksResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAppstacksResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutAppstacksResponseUnmarshaller {

	public static ListLinkeBahamutAppstacksResponse unmarshall(ListLinkeBahamutAppstacksResponse listLinkeBahamutAppstacksResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutAppstacksResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutAppstacksResponse.RequestId"));
		listLinkeBahamutAppstacksResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutAppstacksResponse.ResultCode"));
		listLinkeBahamutAppstacksResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutAppstacksResponse.ResultMessage"));
		listLinkeBahamutAppstacksResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutAppstacksResponse.ErrorMessage"));
		listLinkeBahamutAppstacksResponse.setMessage(_ctx.stringValue("ListLinkeBahamutAppstacksResponse.Message"));
		listLinkeBahamutAppstacksResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutAppstacksResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutAppstacksResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("ListLinkeBahamutAppstacksResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutAppstacksResponse.Result["+ i +"].Id"));
			resultItem.setIdentity(_ctx.stringValue("ListLinkeBahamutAppstacksResponse.Result["+ i +"].Identity"));
			resultItem.setName(_ctx.stringValue("ListLinkeBahamutAppstacksResponse.Result["+ i +"].Name"));
			resultItem.setScope(_ctx.stringValue("ListLinkeBahamutAppstacksResponse.Result["+ i +"].Scope"));
			resultItem.setStatus(_ctx.stringValue("ListLinkeBahamutAppstacksResponse.Result["+ i +"].Status"));

			result.add(resultItem);
		}
		listLinkeBahamutAppstacksResponse.setResult(result);
	 
	 	return listLinkeBahamutAppstacksResponse;
	}
}