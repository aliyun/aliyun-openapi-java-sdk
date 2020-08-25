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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinklogAccountlistResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinklogAccountlistResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinklogAccountlistResponseUnmarshaller {

	public static QueryLinkeLinklogAccountlistResponse unmarshall(QueryLinkeLinklogAccountlistResponse queryLinkeLinklogAccountlistResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinklogAccountlistResponse.setRequestId(_ctx.stringValue("QueryLinkeLinklogAccountlistResponse.RequestId"));
		queryLinkeLinklogAccountlistResponse.setResultCode(_ctx.stringValue("QueryLinkeLinklogAccountlistResponse.ResultCode"));
		queryLinkeLinklogAccountlistResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinklogAccountlistResponse.ResultMessage"));
		queryLinkeLinklogAccountlistResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinklogAccountlistResponse.ErrorMsg"));
		queryLinkeLinklogAccountlistResponse.setResponseContentRange(_ctx.stringValue("QueryLinkeLinklogAccountlistResponse.ResponseContentRange"));
		queryLinkeLinklogAccountlistResponse.setResponseContentType(_ctx.stringValue("QueryLinkeLinklogAccountlistResponse.ResponseContentType"));
		queryLinkeLinklogAccountlistResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinklogAccountlistResponse.ResponseStatusCode"));
		queryLinkeLinklogAccountlistResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinklogAccountlistResponse.Success"));

		Result result = new Result();
		result.setPagination(_ctx.stringValue("QueryLinkeLinklogAccountlistResponse.Result.Pagination"));

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinklogAccountlistResponse.Result.List.Length"); i++) {
			list.add(_ctx.stringValue("QueryLinkeLinklogAccountlistResponse.Result.List["+ i +"]"));
		}
		result.setList(list);
		queryLinkeLinklogAccountlistResponse.setResult(result);
	 
	 	return queryLinkeLinklogAccountlistResponse;
	}
}