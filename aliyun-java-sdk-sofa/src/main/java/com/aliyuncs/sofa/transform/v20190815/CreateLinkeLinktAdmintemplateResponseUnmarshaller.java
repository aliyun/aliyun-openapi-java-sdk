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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktAdmintemplateResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktAdmintemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktAdmintemplateResponseUnmarshaller {

	public static CreateLinkeLinktAdmintemplateResponse unmarshall(CreateLinkeLinktAdmintemplateResponse createLinkeLinktAdmintemplateResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktAdmintemplateResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.RequestId"));
		createLinkeLinktAdmintemplateResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.ResultCode"));
		createLinkeLinktAdmintemplateResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.ResultMessage"));
		createLinkeLinktAdmintemplateResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.ErrorCode"));
		createLinkeLinktAdmintemplateResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.ErrorMessage"));
		createLinkeLinktAdmintemplateResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.ResponseStatusCode"));
		createLinkeLinktAdmintemplateResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktAdmintemplateResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Creator"));
		data.setDefaultContent(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.DefaultContent"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktAdmintemplateResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Description"));
		data.setId(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Name"));
		data.setPriority(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.ProjectSign"));
		data.setStamp(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.Stamp"));
		data.setTemplateLabel(_ctx.stringValue("CreateLinkeLinktAdmintemplateResponse.Data.TemplateLabel"));
		data.setType(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("CreateLinkeLinktAdmintemplateResponse.Data.WorkflowId"));
		createLinkeLinktAdmintemplateResponse.setData(data);
	 
	 	return createLinkeLinktAdmintemplateResponse;
	}
}