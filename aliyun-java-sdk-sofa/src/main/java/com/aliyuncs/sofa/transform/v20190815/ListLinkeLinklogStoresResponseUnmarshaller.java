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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinklogStoresResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinklogStoresResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinklogStoresResponseUnmarshaller {

	public static ListLinkeLinklogStoresResponse unmarshall(ListLinkeLinklogStoresResponse listLinkeLinklogStoresResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinklogStoresResponse.setRequestId(_ctx.stringValue("ListLinkeLinklogStoresResponse.RequestId"));
		listLinkeLinklogStoresResponse.setResultCode(_ctx.stringValue("ListLinkeLinklogStoresResponse.ResultCode"));
		listLinkeLinklogStoresResponse.setResultMessage(_ctx.stringValue("ListLinkeLinklogStoresResponse.ResultMessage"));
		listLinkeLinklogStoresResponse.setErrorMsg(_ctx.stringValue("ListLinkeLinklogStoresResponse.ErrorMsg"));
		listLinkeLinklogStoresResponse.setResponseContentRange(_ctx.stringValue("ListLinkeLinklogStoresResponse.ResponseContentRange"));
		listLinkeLinklogStoresResponse.setResponseContentType(_ctx.stringValue("ListLinkeLinklogStoresResponse.ResponseContentType"));
		listLinkeLinklogStoresResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinklogStoresResponse.ResponseStatusCode"));
		listLinkeLinklogStoresResponse.setSuccess(_ctx.booleanValue("ListLinkeLinklogStoresResponse.Success"));

		Result result = new Result();
		result.setPagination(_ctx.stringValue("ListLinkeLinklogStoresResponse.Result.Pagination"));

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinklogStoresResponse.Result.List.Length"); i++) {
			list.add(_ctx.stringValue("ListLinkeLinklogStoresResponse.Result.List["+ i +"]"));
		}
		result.setList(list);
		listLinkeLinklogStoresResponse.setResult(result);
	 
	 	return listLinkeLinklogStoresResponse;
	}
}