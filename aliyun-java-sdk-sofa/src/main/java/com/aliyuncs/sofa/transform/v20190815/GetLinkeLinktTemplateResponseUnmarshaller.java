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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktTemplateResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktTemplateResponseUnmarshaller {

	public static GetLinkeLinktTemplateResponse unmarshall(GetLinkeLinktTemplateResponse getLinkeLinktTemplateResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktTemplateResponse.setRequestId(_ctx.stringValue("GetLinkeLinktTemplateResponse.RequestId"));
		getLinkeLinktTemplateResponse.setResultCode(_ctx.stringValue("GetLinkeLinktTemplateResponse.ResultCode"));
		getLinkeLinktTemplateResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktTemplateResponse.ResultMessage"));
		getLinkeLinktTemplateResponse.setErrorCode(_ctx.longValue("GetLinkeLinktTemplateResponse.ErrorCode"));
		getLinkeLinktTemplateResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktTemplateResponse.ErrorMessage"));
		getLinkeLinktTemplateResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinktTemplateResponse.ResponseStatusCode"));
		getLinkeLinktTemplateResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktTemplateResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("GetLinkeLinktTemplateResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("GetLinkeLinktTemplateResponse.Data.Creator"));
		data.setDefaultContent(_ctx.stringValue("GetLinkeLinktTemplateResponse.Data.DefaultContent"));
		data.setDeleted(_ctx.booleanValue("GetLinkeLinktTemplateResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("GetLinkeLinktTemplateResponse.Data.Description"));
		data.setId(_ctx.longValue("GetLinkeLinktTemplateResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetLinkeLinktTemplateResponse.Data.Name"));
		data.setPriority(_ctx.longValue("GetLinkeLinktTemplateResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("GetLinkeLinktTemplateResponse.Data.ProjectSign"));
		data.setStamp(_ctx.stringValue("GetLinkeLinktTemplateResponse.Data.Stamp"));
		data.setTemplateLabel(_ctx.stringValue("GetLinkeLinktTemplateResponse.Data.TemplateLabel"));
		data.setType(_ctx.longValue("GetLinkeLinktTemplateResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("GetLinkeLinktTemplateResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("GetLinkeLinktTemplateResponse.Data.WorkflowId"));
		getLinkeLinktTemplateResponse.setData(data);
	 
	 	return getLinkeLinktTemplateResponse;
	}
}