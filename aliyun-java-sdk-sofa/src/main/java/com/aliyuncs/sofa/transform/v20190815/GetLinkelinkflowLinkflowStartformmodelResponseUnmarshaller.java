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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowStartformmodelResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowStartformmodelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowStartformmodelResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowStartformmodelResponse unmarshall(GetLinkelinkflowLinkflowStartformmodelResponse getLinkelinkflowLinkflowStartformmodelResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowStartformmodelResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.RequestId"));
		getLinkelinkflowLinkflowStartformmodelResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.ResultCode"));
		getLinkelinkflowLinkflowStartformmodelResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.ResultMessage"));
		getLinkelinkflowLinkflowStartformmodelResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowStartformmodelResponse.Current"));
		getLinkelinkflowLinkflowStartformmodelResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.ErrorCode"));
		getLinkelinkflowLinkflowStartformmodelResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.ErrorMsg"));
		getLinkelinkflowLinkflowStartformmodelResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowStartformmodelResponse.PageSize"));
		getLinkelinkflowLinkflowStartformmodelResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowStartformmodelResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowStartformmodelResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowStartformmodelResponse.Success"));
		getLinkelinkflowLinkflowStartformmodelResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowStartformmodelResponse.Total"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.Description"));
		data.setFormInstanceId(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.FormInstanceId"));
		data.setFormModel(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.FormModel"));
		data.setId(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.Id"));
		data.setKey(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.Key"));
		data.setName(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.Name"));
		data.setProcessDefinitionId(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.ProcessDefinitionId"));
		data.setProcessInstanceId(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.ProcessInstanceId"));
		data.setScopeDefinitionId(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.ScopeDefinitionId"));
		data.setScopeId(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.ScopeId"));
		data.setScopeType(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.ScopeType"));
		data.setSelectedOutcome(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.SelectedOutcome"));
		data.setSubmittedBy(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.SubmittedBy"));
		data.setSubmittedDate(_ctx.longValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.SubmittedDate"));
		data.setTaskId(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.TaskId"));
		data.setTenantId(_ctx.stringValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.TenantId"));
		data.setVersion(_ctx.longValue("GetLinkelinkflowLinkflowStartformmodelResponse.Data.Version"));
		getLinkelinkflowLinkflowStartformmodelResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowStartformmodelResponse;
	}
}