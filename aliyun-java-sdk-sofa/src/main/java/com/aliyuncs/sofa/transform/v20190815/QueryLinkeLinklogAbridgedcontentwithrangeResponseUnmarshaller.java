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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinklogAbridgedcontentwithrangeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinklogAbridgedcontentwithrangeResponseUnmarshaller {

	public static QueryLinkeLinklogAbridgedcontentwithrangeResponse unmarshall(QueryLinkeLinklogAbridgedcontentwithrangeResponse queryLinkeLinklogAbridgedcontentwithrangeResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinklogAbridgedcontentwithrangeResponse.setRequestId(_ctx.stringValue("QueryLinkeLinklogAbridgedcontentwithrangeResponse.RequestId"));
		queryLinkeLinklogAbridgedcontentwithrangeResponse.setResultCode(_ctx.stringValue("QueryLinkeLinklogAbridgedcontentwithrangeResponse.ResultCode"));
		queryLinkeLinklogAbridgedcontentwithrangeResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinklogAbridgedcontentwithrangeResponse.ResultMessage"));
		queryLinkeLinklogAbridgedcontentwithrangeResponse.setContent(_ctx.stringValue("QueryLinkeLinklogAbridgedcontentwithrangeResponse.Content"));
		queryLinkeLinklogAbridgedcontentwithrangeResponse.setContentRange(_ctx.stringValue("QueryLinkeLinklogAbridgedcontentwithrangeResponse.ContentRange"));
		queryLinkeLinklogAbridgedcontentwithrangeResponse.setResponseContentRange(_ctx.stringValue("QueryLinkeLinklogAbridgedcontentwithrangeResponse.ResponseContentRange"));
		queryLinkeLinklogAbridgedcontentwithrangeResponse.setResponseContentType(_ctx.stringValue("QueryLinkeLinklogAbridgedcontentwithrangeResponse.ResponseContentType"));
		queryLinkeLinklogAbridgedcontentwithrangeResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinklogAbridgedcontentwithrangeResponse.ResponseStatusCode"));
	 
	 	return queryLinkeLinklogAbridgedcontentwithrangeResponse;
	}
}