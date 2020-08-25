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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaSinglecoveragetaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaSinglecoveragetaskResponseUnmarshaller {

	public static QueryLinkeLinkaSinglecoveragetaskResponse unmarshall(QueryLinkeLinkaSinglecoveragetaskResponse queryLinkeLinkaSinglecoveragetaskResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaSinglecoveragetaskResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaSinglecoveragetaskResponse.RequestId"));
		queryLinkeLinkaSinglecoveragetaskResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaSinglecoveragetaskResponse.ResultCode"));
		queryLinkeLinkaSinglecoveragetaskResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaSinglecoveragetaskResponse.ResultMessage"));
		queryLinkeLinkaSinglecoveragetaskResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaSinglecoveragetaskResponse.ErrorCode"));
		queryLinkeLinkaSinglecoveragetaskResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaSinglecoveragetaskResponse.ErrorMsg"));
		queryLinkeLinkaSinglecoveragetaskResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaSinglecoveragetaskResponse.ResponseStatusCode"));
		queryLinkeLinkaSinglecoveragetaskResponse.setResult(_ctx.stringValue("QueryLinkeLinkaSinglecoveragetaskResponse.Result"));
		queryLinkeLinkaSinglecoveragetaskResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaSinglecoveragetaskResponse.Success"));
	 
	 	return queryLinkeLinkaSinglecoveragetaskResponse;
	}
}