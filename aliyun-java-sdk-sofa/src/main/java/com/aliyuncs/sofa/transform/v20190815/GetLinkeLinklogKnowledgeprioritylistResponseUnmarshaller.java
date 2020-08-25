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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogKnowledgeprioritylistResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogKnowledgeprioritylistResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogKnowledgeprioritylistResponseUnmarshaller {

	public static GetLinkeLinklogKnowledgeprioritylistResponse unmarshall(GetLinkeLinklogKnowledgeprioritylistResponse getLinkeLinklogKnowledgeprioritylistResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogKnowledgeprioritylistResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogKnowledgeprioritylistResponse.RequestId"));
		getLinkeLinklogKnowledgeprioritylistResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogKnowledgeprioritylistResponse.ResultCode"));
		getLinkeLinklogKnowledgeprioritylistResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogKnowledgeprioritylistResponse.ResultMessage"));
		getLinkeLinklogKnowledgeprioritylistResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinklogKnowledgeprioritylistResponse.ErrorMsg"));
		getLinkeLinklogKnowledgeprioritylistResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogKnowledgeprioritylistResponse.ResponseContentRange"));
		getLinkeLinklogKnowledgeprioritylistResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogKnowledgeprioritylistResponse.ResponseContentType"));
		getLinkeLinklogKnowledgeprioritylistResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.ResponseStatusCode"));
		getLinkeLinklogKnowledgeprioritylistResponse.setSuccess(_ctx.booleanValue("GetLinkeLinklogKnowledgeprioritylistResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBegin(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].Begin"));
			resultItem.setBeginMills(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].BeginMills"));
			resultItem.setCurrentPage(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].CurrentPage"));
			resultItem.setEnd(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].End"));
			resultItem.setEndMills(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].EndMills"));
			resultItem.setGmtCreate(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].GmtModified"));
			resultItem.setId(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].Id"));
			resultItem.setPageSize(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].PageSize"));
			resultItem.setRemark(_ctx.stringValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].Remark"));
			resultItem.setSorter(_ctx.stringValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].Sorter"));
			resultItem.setStoreId(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].StoreId"));
			resultItem.setType(_ctx.stringValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].Type"));
			resultItem.setVal(_ctx.longValue("GetLinkeLinklogKnowledgeprioritylistResponse.Result["+ i +"].Val"));

			result.add(resultItem);
		}
		getLinkeLinklogKnowledgeprioritylistResponse.setResult(result);
	 
	 	return getLinkeLinklogKnowledgeprioritylistResponse;
	}
}