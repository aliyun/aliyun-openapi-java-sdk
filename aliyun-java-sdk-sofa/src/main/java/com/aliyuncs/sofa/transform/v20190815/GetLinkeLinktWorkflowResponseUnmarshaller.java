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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktWorkflowResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktWorkflowResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktWorkflowResponseUnmarshaller {

	public static GetLinkeLinktWorkflowResponse unmarshall(GetLinkeLinktWorkflowResponse getLinkeLinktWorkflowResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktWorkflowResponse.setRequestId(_ctx.stringValue("GetLinkeLinktWorkflowResponse.RequestId"));
		getLinkeLinktWorkflowResponse.setResultCode(_ctx.stringValue("GetLinkeLinktWorkflowResponse.ResultCode"));
		getLinkeLinktWorkflowResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktWorkflowResponse.ResultMessage"));
		getLinkeLinktWorkflowResponse.setErrorCode(_ctx.longValue("GetLinkeLinktWorkflowResponse.ErrorCode"));
		getLinkeLinktWorkflowResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktWorkflowResponse.ErrorMessage"));
		getLinkeLinktWorkflowResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinktWorkflowResponse.ResponseStatusCode"));
		getLinkeLinktWorkflowResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktWorkflowResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("GetLinkeLinktWorkflowResponse.Data.CreatedAt"));
		data.setDefaultStatus(_ctx.stringValue("GetLinkeLinktWorkflowResponse.Data.DefaultStatus"));
		data.setDeleted(_ctx.booleanValue("GetLinkeLinktWorkflowResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("GetLinkeLinktWorkflowResponse.Data.Description"));
		data.setId(_ctx.longValue("GetLinkeLinktWorkflowResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetLinkeLinktWorkflowResponse.Data.Name"));
		data.setRegion(_ctx.stringValue("GetLinkeLinktWorkflowResponse.Data.Region"));
		data.setStatusesMap(_ctx.stringValue("GetLinkeLinktWorkflowResponse.Data.StatusesMap"));
		data.setUpdatedAt(_ctx.longValue("GetLinkeLinktWorkflowResponse.Data.UpdatedAt"));

		List<String> statuses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinktWorkflowResponse.Data.Statuses.Length"); i++) {
			statuses.add(_ctx.stringValue("GetLinkeLinktWorkflowResponse.Data.Statuses["+ i +"]"));
		}
		data.setStatuses(statuses);

		List<String> workflowStatuses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinktWorkflowResponse.Data.WorkflowStatuses.Length"); i++) {
			workflowStatuses.add(_ctx.stringValue("GetLinkeLinktWorkflowResponse.Data.WorkflowStatuses["+ i +"]"));
		}
		data.setWorkflowStatuses(workflowStatuses);
		getLinkeLinktWorkflowResponse.setData(data);
	 
	 	return getLinkeLinktWorkflowResponse;
	}
}