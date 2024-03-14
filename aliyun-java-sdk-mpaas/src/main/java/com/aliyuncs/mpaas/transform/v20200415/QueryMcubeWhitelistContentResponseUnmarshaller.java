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

package com.aliyuncs.mpaas.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200415.QueryMcubeWhitelistContentResponse;
import com.aliyuncs.mpaas.model.v20200415.QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult;
import com.aliyuncs.mpaas.model.v20200415.QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult.WhitelistContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMcubeWhitelistContentResponseUnmarshaller {

	public static QueryMcubeWhitelistContentResponse unmarshall(QueryMcubeWhitelistContentResponse queryMcubeWhitelistContentResponse, UnmarshallerContext _ctx) {
		
		queryMcubeWhitelistContentResponse.setRequestId(_ctx.stringValue("QueryMcubeWhitelistContentResponse.RequestId"));
		queryMcubeWhitelistContentResponse.setResultMessage(_ctx.stringValue("QueryMcubeWhitelistContentResponse.ResultMessage"));
		queryMcubeWhitelistContentResponse.setResultCode(_ctx.stringValue("QueryMcubeWhitelistContentResponse.ResultCode"));

		QueryWhitelistContentResult queryWhitelistContentResult = new QueryWhitelistContentResult();
		queryWhitelistContentResult.setSuccess(_ctx.booleanValue("QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult.Success"));
		queryWhitelistContentResult.setResultMsg(_ctx.stringValue("QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult.ResultMsg"));

		WhitelistContent whitelistContent = new WhitelistContent();
		whitelistContent.setWorkspaceId(_ctx.stringValue("QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult.WhitelistContent.WorkspaceId"));
		whitelistContent.setAppId(_ctx.stringValue("QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult.WhitelistContent.AppId"));
		whitelistContent.setWhitelistId(_ctx.longValue("QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult.WhitelistContent.WhitelistId"));
		whitelistContent.setWhitelistName(_ctx.stringValue("QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult.WhitelistContent.WhitelistName"));
		whitelistContent.setHasMore(_ctx.booleanValue("QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult.WhitelistContent.HasMore"));
		whitelistContent.setWhitelistType(_ctx.stringValue("QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult.WhitelistContent.WhitelistType"));

		List<String> responseData = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult.WhitelistContent.ResponseData.Length"); i++) {
			responseData.add(_ctx.stringValue("QueryMcubeWhitelistContentResponse.QueryWhitelistContentResult.WhitelistContent.ResponseData["+ i +"]"));
		}
		whitelistContent.setResponseData(responseData);
		queryWhitelistContentResult.setWhitelistContent(whitelistContent);
		queryMcubeWhitelistContentResponse.setQueryWhitelistContentResult(queryWhitelistContentResult);
	 
	 	return queryMcubeWhitelistContentResponse;
	}
}