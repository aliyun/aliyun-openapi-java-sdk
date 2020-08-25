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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktTemplateResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktTemplateResponseUnmarshaller {

	public static UpdateLinkeLinktTemplateResponse unmarshall(UpdateLinkeLinktTemplateResponse updateLinkeLinktTemplateResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktTemplateResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.RequestId"));
		updateLinkeLinktTemplateResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.ResultCode"));
		updateLinkeLinktTemplateResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.ResultMessage"));
		updateLinkeLinktTemplateResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktTemplateResponse.ErrorCode"));
		updateLinkeLinktTemplateResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.ErrorMessage"));
		updateLinkeLinktTemplateResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktTemplateResponse.ResponseStatusCode"));
		updateLinkeLinktTemplateResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktTemplateResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Creator"));
		data.setDefaultContent(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.DefaultContent"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktTemplateResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Description"));
		data.setId(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Name"));
		data.setPriority(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.ProjectSign"));
		data.setStamp(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.Stamp"));
		data.setTemplateLabel(_ctx.stringValue("UpdateLinkeLinktTemplateResponse.Data.TemplateLabel"));
		data.setType(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("UpdateLinkeLinktTemplateResponse.Data.WorkflowId"));
		updateLinkeLinktTemplateResponse.setData(data);
	 
	 	return updateLinkeLinktTemplateResponse;
	}
}