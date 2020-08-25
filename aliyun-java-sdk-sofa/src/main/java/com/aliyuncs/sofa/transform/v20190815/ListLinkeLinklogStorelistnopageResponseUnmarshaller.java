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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinklogStorelistnopageResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinklogStorelistnopageResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinklogStorelistnopageResponseUnmarshaller {

	public static ListLinkeLinklogStorelistnopageResponse unmarshall(ListLinkeLinklogStorelistnopageResponse listLinkeLinklogStorelistnopageResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinklogStorelistnopageResponse.setRequestId(_ctx.stringValue("ListLinkeLinklogStorelistnopageResponse.RequestId"));
		listLinkeLinklogStorelistnopageResponse.setResultCode(_ctx.stringValue("ListLinkeLinklogStorelistnopageResponse.ResultCode"));
		listLinkeLinklogStorelistnopageResponse.setResultMessage(_ctx.stringValue("ListLinkeLinklogStorelistnopageResponse.ResultMessage"));
		listLinkeLinklogStorelistnopageResponse.setErrorMsg(_ctx.stringValue("ListLinkeLinklogStorelistnopageResponse.ErrorMsg"));
		listLinkeLinklogStorelistnopageResponse.setResponseContentRange(_ctx.stringValue("ListLinkeLinklogStorelistnopageResponse.ResponseContentRange"));
		listLinkeLinklogStorelistnopageResponse.setResponseContentType(_ctx.stringValue("ListLinkeLinklogStorelistnopageResponse.ResponseContentType"));
		listLinkeLinklogStorelistnopageResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinklogStorelistnopageResponse.ResponseStatusCode"));
		listLinkeLinklogStorelistnopageResponse.setSuccess(_ctx.booleanValue("ListLinkeLinklogStorelistnopageResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinklogStorelistnopageResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBegin(_ctx.longValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].Begin"));
			resultItem.setBeginMills(_ctx.longValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].BeginMills"));
			resultItem.setCurrentPage(_ctx.longValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].CurrentPage"));
			resultItem.setEnd(_ctx.longValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].End"));
			resultItem.setEndMills(_ctx.longValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].EndMills"));
			resultItem.setEnvPattern(_ctx.stringValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].EnvPattern"));
			resultItem.setGmtCreate(_ctx.longValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(_ctx.longValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].GmtModified"));
			resultItem.setId(_ctx.longValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].Name"));
			resultItem.setOwnerId(_ctx.stringValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].OwnerId"));
			resultItem.setPageSize(_ctx.longValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].PageSize"));
			resultItem.setSorter(_ctx.stringValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].Sorter"));
			resultItem.setStepPattern(_ctx.stringValue("ListLinkeLinklogStorelistnopageResponse.Result["+ i +"].StepPattern"));

			result.add(resultItem);
		}
		listLinkeLinklogStorelistnopageResponse.setResult(result);
	 
	 	return listLinkeLinklogStorelistnopageResponse;
	}
}