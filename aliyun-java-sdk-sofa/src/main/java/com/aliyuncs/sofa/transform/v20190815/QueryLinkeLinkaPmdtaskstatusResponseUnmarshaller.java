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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaPmdtaskstatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaPmdtaskstatusResponseUnmarshaller {

	public static QueryLinkeLinkaPmdtaskstatusResponse unmarshall(QueryLinkeLinkaPmdtaskstatusResponse queryLinkeLinkaPmdtaskstatusResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaPmdtaskstatusResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaPmdtaskstatusResponse.RequestId"));
		queryLinkeLinkaPmdtaskstatusResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaPmdtaskstatusResponse.ResultCode"));
		queryLinkeLinkaPmdtaskstatusResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaPmdtaskstatusResponse.ResultMessage"));
		queryLinkeLinkaPmdtaskstatusResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaPmdtaskstatusResponse.ErrorCode"));
		queryLinkeLinkaPmdtaskstatusResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaPmdtaskstatusResponse.ErrorMsg"));
		queryLinkeLinkaPmdtaskstatusResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaPmdtaskstatusResponse.ResponseStatusCode"));
		queryLinkeLinkaPmdtaskstatusResponse.setResult(_ctx.stringValue("QueryLinkeLinkaPmdtaskstatusResponse.Result"));
		queryLinkeLinkaPmdtaskstatusResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaPmdtaskstatusResponse.Success"));
	 
	 	return queryLinkeLinkaPmdtaskstatusResponse;
	}
}