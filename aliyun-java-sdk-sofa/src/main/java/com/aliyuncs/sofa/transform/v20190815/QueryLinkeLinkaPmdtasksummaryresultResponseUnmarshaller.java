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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaPmdtasksummaryresultResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaPmdtasksummaryresultResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaPmdtasksummaryresultResponseUnmarshaller {

	public static QueryLinkeLinkaPmdtasksummaryresultResponse unmarshall(QueryLinkeLinkaPmdtasksummaryresultResponse queryLinkeLinkaPmdtasksummaryresultResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaPmdtasksummaryresultResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaPmdtasksummaryresultResponse.RequestId"));
		queryLinkeLinkaPmdtasksummaryresultResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaPmdtasksummaryresultResponse.ResultCode"));
		queryLinkeLinkaPmdtasksummaryresultResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaPmdtasksummaryresultResponse.ResultMessage"));
		queryLinkeLinkaPmdtasksummaryresultResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaPmdtasksummaryresultResponse.ErrorCode"));
		queryLinkeLinkaPmdtasksummaryresultResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaPmdtasksummaryresultResponse.ErrorMsg"));
		queryLinkeLinkaPmdtasksummaryresultResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaPmdtasksummaryresultResponse.ResponseStatusCode"));
		queryLinkeLinkaPmdtasksummaryresultResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaPmdtasksummaryresultResponse.Success"));

		Result result = new Result();
		result.setCosts(_ctx.longValue("QueryLinkeLinkaPmdtasksummaryresultResponse.Result.Costs"));
		result.setMessage(_ctx.stringValue("QueryLinkeLinkaPmdtasksummaryresultResponse.Result.Message"));
		result.setStatus(_ctx.stringValue("QueryLinkeLinkaPmdtasksummaryresultResponse.Result.Status"));
		result.setSummary(_ctx.stringValue("QueryLinkeLinkaPmdtasksummaryresultResponse.Result.Summary"));
		result.setTaskId(_ctx.stringValue("QueryLinkeLinkaPmdtasksummaryresultResponse.Result.TaskId"));
		queryLinkeLinkaPmdtasksummaryresultResponse.setResult(result);
	 
	 	return queryLinkeLinkaPmdtasksummaryresultResponse;
	}
}