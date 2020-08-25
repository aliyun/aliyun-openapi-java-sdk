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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktTemplateResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktTemplateResponseUnmarshaller {

	public static CreateLinkeLinktTemplateResponse unmarshall(CreateLinkeLinktTemplateResponse createLinkeLinktTemplateResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktTemplateResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktTemplateResponse.RequestId"));
		createLinkeLinktTemplateResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktTemplateResponse.ResultCode"));
		createLinkeLinktTemplateResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktTemplateResponse.ResultMessage"));
		createLinkeLinktTemplateResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktTemplateResponse.ErrorCode"));
		createLinkeLinktTemplateResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktTemplateResponse.ErrorMessage"));
		createLinkeLinktTemplateResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinktTemplateResponse.ResponseStatusCode"));
		createLinkeLinktTemplateResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktTemplateResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Creator"));
		data.setDefaultContent(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.DefaultContent"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktTemplateResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Description"));
		data.setId(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Name"));
		data.setPriority(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.ProjectSign"));
		data.setStamp(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.Stamp"));
		data.setTemplateLabel(_ctx.stringValue("CreateLinkeLinktTemplateResponse.Data.TemplateLabel"));
		data.setType(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("CreateLinkeLinktTemplateResponse.Data.WorkflowId"));
		createLinkeLinktTemplateResponse.setData(data);
	 
	 	return createLinkeLinktTemplateResponse;
	}
}