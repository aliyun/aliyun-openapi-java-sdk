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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktKanbancolumninfoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktKanbancolumninfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktKanbancolumninfoResponseUnmarshaller {

	public static QueryLinkeLinktKanbancolumninfoResponse unmarshall(QueryLinkeLinktKanbancolumninfoResponse queryLinkeLinktKanbancolumninfoResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktKanbancolumninfoResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktKanbancolumninfoResponse.RequestId"));
		queryLinkeLinktKanbancolumninfoResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktKanbancolumninfoResponse.ResultCode"));
		queryLinkeLinktKanbancolumninfoResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktKanbancolumninfoResponse.ResultMessage"));
		queryLinkeLinktKanbancolumninfoResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktKanbancolumninfoResponse.ErrorCode"));
		queryLinkeLinktKanbancolumninfoResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktKanbancolumninfoResponse.ErrorMessage"));
		queryLinkeLinktKanbancolumninfoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktKanbancolumninfoResponse.ResponseStatusCode"));
		queryLinkeLinktKanbancolumninfoResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktKanbancolumninfoResponse.Success"));

		Data data = new Data();
		data.setTemplateWorkflowMap(_ctx.stringValue("QueryLinkeLinktKanbancolumninfoResponse.Data.TemplateWorkflowMap"));

		List<String> statusList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktKanbancolumninfoResponse.Data.StatusList.Length"); i++) {
			statusList.add(_ctx.stringValue("QueryLinkeLinktKanbancolumninfoResponse.Data.StatusList["+ i +"]"));
		}
		data.setStatusList(statusList);
		queryLinkeLinktKanbancolumninfoResponse.setData(data);
	 
	 	return queryLinkeLinktKanbancolumninfoResponse;
	}
}