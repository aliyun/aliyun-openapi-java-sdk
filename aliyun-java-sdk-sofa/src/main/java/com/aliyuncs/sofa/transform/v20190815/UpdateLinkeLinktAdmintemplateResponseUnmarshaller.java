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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktAdmintemplateResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktAdmintemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktAdmintemplateResponseUnmarshaller {

	public static UpdateLinkeLinktAdmintemplateResponse unmarshall(UpdateLinkeLinktAdmintemplateResponse updateLinkeLinktAdmintemplateResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktAdmintemplateResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.RequestId"));
		updateLinkeLinktAdmintemplateResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.ResultCode"));
		updateLinkeLinktAdmintemplateResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.ResultMessage"));
		updateLinkeLinktAdmintemplateResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.ErrorCode"));
		updateLinkeLinktAdmintemplateResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.ErrorMessage"));
		updateLinkeLinktAdmintemplateResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.ResponseStatusCode"));
		updateLinkeLinktAdmintemplateResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktAdmintemplateResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Creator"));
		data.setDefaultContent(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.DefaultContent"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktAdmintemplateResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Description"));
		data.setId(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Name"));
		data.setPriority(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.ProjectSign"));
		data.setStamp(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.Stamp"));
		data.setTemplateLabel(_ctx.stringValue("UpdateLinkeLinktAdmintemplateResponse.Data.TemplateLabel"));
		data.setType(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("UpdateLinkeLinktAdmintemplateResponse.Data.WorkflowId"));
		updateLinkeLinktAdmintemplateResponse.setData(data);
	 
	 	return updateLinkeLinktAdmintemplateResponse;
	}
}