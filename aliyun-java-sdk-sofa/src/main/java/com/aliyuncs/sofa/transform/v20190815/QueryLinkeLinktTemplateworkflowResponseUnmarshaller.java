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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktTemplateworkflowResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktTemplateworkflowResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktTemplateworkflowResponseUnmarshaller {

	public static QueryLinkeLinktTemplateworkflowResponse unmarshall(QueryLinkeLinktTemplateworkflowResponse queryLinkeLinktTemplateworkflowResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktTemplateworkflowResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktTemplateworkflowResponse.RequestId"));
		queryLinkeLinktTemplateworkflowResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktTemplateworkflowResponse.ResultCode"));
		queryLinkeLinktTemplateworkflowResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktTemplateworkflowResponse.ResultMessage"));
		queryLinkeLinktTemplateworkflowResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktTemplateworkflowResponse.ErrorCode"));
		queryLinkeLinktTemplateworkflowResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktTemplateworkflowResponse.ErrorMessage"));
		queryLinkeLinktTemplateworkflowResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktTemplateworkflowResponse.ResponseStatusCode"));
		queryLinkeLinktTemplateworkflowResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktTemplateworkflowResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("QueryLinkeLinktTemplateworkflowResponse.Data.CreatedAt"));
		data.setDefaultStatus(_ctx.stringValue("QueryLinkeLinktTemplateworkflowResponse.Data.DefaultStatus"));
		data.setDeleted(_ctx.booleanValue("QueryLinkeLinktTemplateworkflowResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("QueryLinkeLinktTemplateworkflowResponse.Data.Description"));
		data.setId(_ctx.longValue("QueryLinkeLinktTemplateworkflowResponse.Data.Id"));
		data.setName(_ctx.stringValue("QueryLinkeLinktTemplateworkflowResponse.Data.Name"));
		data.setRegion(_ctx.stringValue("QueryLinkeLinktTemplateworkflowResponse.Data.Region"));
		data.setStatusesMap(_ctx.stringValue("QueryLinkeLinktTemplateworkflowResponse.Data.StatusesMap"));
		data.setUpdatedAt(_ctx.longValue("QueryLinkeLinktTemplateworkflowResponse.Data.UpdatedAt"));

		List<String> statuses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktTemplateworkflowResponse.Data.Statuses.Length"); i++) {
			statuses.add(_ctx.stringValue("QueryLinkeLinktTemplateworkflowResponse.Data.Statuses["+ i +"]"));
		}
		data.setStatuses(statuses);

		List<String> workflowStatuses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktTemplateworkflowResponse.Data.WorkflowStatuses.Length"); i++) {
			workflowStatuses.add(_ctx.stringValue("QueryLinkeLinktTemplateworkflowResponse.Data.WorkflowStatuses["+ i +"]"));
		}
		data.setWorkflowStatuses(workflowStatuses);
		queryLinkeLinktTemplateworkflowResponse.setData(data);
	 
	 	return queryLinkeLinktTemplateworkflowResponse;
	}
}