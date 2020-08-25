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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktTemplatecopyResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktTemplatecopyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktTemplatecopyResponseUnmarshaller {

	public static ExecLinkeLinktTemplatecopyResponse unmarshall(ExecLinkeLinktTemplatecopyResponse execLinkeLinktTemplatecopyResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktTemplatecopyResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.RequestId"));
		execLinkeLinktTemplatecopyResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.ResultCode"));
		execLinkeLinktTemplatecopyResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.ResultMessage"));
		execLinkeLinktTemplatecopyResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.ErrorCode"));
		execLinkeLinktTemplatecopyResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.ErrorMessage"));
		execLinkeLinktTemplatecopyResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.ResponseStatusCode"));
		execLinkeLinktTemplatecopyResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktTemplatecopyResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Creator"));
		data.setDefaultContent(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.DefaultContent"));
		data.setDeleted(_ctx.booleanValue("ExecLinkeLinktTemplatecopyResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Description"));
		data.setId(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.Id"));
		data.setName(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Name"));
		data.setPriority(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.ProjectSign"));
		data.setStamp(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.Stamp"));
		data.setTemplateLabel(_ctx.stringValue("ExecLinkeLinktTemplatecopyResponse.Data.TemplateLabel"));
		data.setType(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.Type"));
		data.setUpdatedAt(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("ExecLinkeLinktTemplatecopyResponse.Data.WorkflowId"));
		execLinkeLinktTemplatecopyResponse.setData(data);
	 
	 	return execLinkeLinktTemplatecopyResponse;
	}
}