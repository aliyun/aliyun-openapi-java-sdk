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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaPmdtaskfilecontentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaPmdtaskfilecontentResponseUnmarshaller {

	public static QueryLinkeLinkaPmdtaskfilecontentResponse unmarshall(QueryLinkeLinkaPmdtaskfilecontentResponse queryLinkeLinkaPmdtaskfilecontentResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaPmdtaskfilecontentResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaPmdtaskfilecontentResponse.RequestId"));
		queryLinkeLinkaPmdtaskfilecontentResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaPmdtaskfilecontentResponse.ResultCode"));
		queryLinkeLinkaPmdtaskfilecontentResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaPmdtaskfilecontentResponse.ResultMessage"));
		queryLinkeLinkaPmdtaskfilecontentResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaPmdtaskfilecontentResponse.ErrorCode"));
		queryLinkeLinkaPmdtaskfilecontentResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaPmdtaskfilecontentResponse.ErrorMsg"));
		queryLinkeLinkaPmdtaskfilecontentResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaPmdtaskfilecontentResponse.ResponseStatusCode"));
		queryLinkeLinkaPmdtaskfilecontentResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaPmdtaskfilecontentResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaPmdtaskfilecontentResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("QueryLinkeLinkaPmdtaskfilecontentResponse.Result["+ i +"]"));
		}
		queryLinkeLinkaPmdtaskfilecontentResponse.setResult(result);
	 
	 	return queryLinkeLinkaPmdtaskfilecontentResponse;
	}
}