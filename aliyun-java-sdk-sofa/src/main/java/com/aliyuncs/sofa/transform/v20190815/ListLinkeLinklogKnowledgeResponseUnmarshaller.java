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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinklogKnowledgeResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinklogKnowledgeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinklogKnowledgeResponseUnmarshaller {

	public static ListLinkeLinklogKnowledgeResponse unmarshall(ListLinkeLinklogKnowledgeResponse listLinkeLinklogKnowledgeResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinklogKnowledgeResponse.setRequestId(_ctx.stringValue("ListLinkeLinklogKnowledgeResponse.RequestId"));
		listLinkeLinklogKnowledgeResponse.setResultCode(_ctx.stringValue("ListLinkeLinklogKnowledgeResponse.ResultCode"));
		listLinkeLinklogKnowledgeResponse.setResultMessage(_ctx.stringValue("ListLinkeLinklogKnowledgeResponse.ResultMessage"));
		listLinkeLinklogKnowledgeResponse.setErrorMsg(_ctx.stringValue("ListLinkeLinklogKnowledgeResponse.ErrorMsg"));
		listLinkeLinklogKnowledgeResponse.setResponseContentRange(_ctx.stringValue("ListLinkeLinklogKnowledgeResponse.ResponseContentRange"));
		listLinkeLinklogKnowledgeResponse.setResponseContentType(_ctx.stringValue("ListLinkeLinklogKnowledgeResponse.ResponseContentType"));
		listLinkeLinklogKnowledgeResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinklogKnowledgeResponse.ResponseStatusCode"));
		listLinkeLinklogKnowledgeResponse.setSuccess(_ctx.booleanValue("ListLinkeLinklogKnowledgeResponse.Success"));

		Result result = new Result();
		result.setPagination(_ctx.stringValue("ListLinkeLinklogKnowledgeResponse.Result.Pagination"));

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinklogKnowledgeResponse.Result.List.Length"); i++) {
			list.add(_ctx.stringValue("ListLinkeLinklogKnowledgeResponse.Result.List["+ i +"]"));
		}
		result.setList(list);
		listLinkeLinklogKnowledgeResponse.setResult(result);
	 
	 	return listLinkeLinklogKnowledgeResponse;
	}
}