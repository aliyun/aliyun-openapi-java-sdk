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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowTaskformmodelResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowTaskformmodelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowTaskformmodelResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowTaskformmodelResponse unmarshall(GetLinkelinkflowLinkflowTaskformmodelResponse getLinkelinkflowLinkflowTaskformmodelResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowTaskformmodelResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.RequestId"));
		getLinkelinkflowLinkflowTaskformmodelResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.ResultCode"));
		getLinkelinkflowLinkflowTaskformmodelResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.ResultMessage"));
		getLinkelinkflowLinkflowTaskformmodelResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Current"));
		getLinkelinkflowLinkflowTaskformmodelResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.ErrorCode"));
		getLinkelinkflowLinkflowTaskformmodelResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.ErrorMsg"));
		getLinkelinkflowLinkflowTaskformmodelResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowTaskformmodelResponse.PageSize"));
		getLinkelinkflowLinkflowTaskformmodelResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowTaskformmodelResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowTaskformmodelResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Success"));
		getLinkelinkflowLinkflowTaskformmodelResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Total"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.Description"));
		data.setFormInstanceId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.FormInstanceId"));
		data.setFormModel(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.FormModel"));
		data.setId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.Id"));
		data.setKey(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.Key"));
		data.setName(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.Name"));
		data.setProcessDefinitionId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.ProcessDefinitionId"));
		data.setProcessInstanceId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.ProcessInstanceId"));
		data.setScopeDefinitionId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.ScopeDefinitionId"));
		data.setScopeId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.ScopeId"));
		data.setScopeType(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.ScopeType"));
		data.setSelectedOutcome(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.SelectedOutcome"));
		data.setSubmittedBy(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.SubmittedBy"));
		data.setSubmittedDate(_ctx.longValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.SubmittedDate"));
		data.setTaskId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.TaskId"));
		data.setTenantId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.TenantId"));
		data.setVersion(_ctx.longValue("GetLinkelinkflowLinkflowTaskformmodelResponse.Data.Version"));
		getLinkelinkflowLinkflowTaskformmodelResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowTaskformmodelResponse;
	}
}