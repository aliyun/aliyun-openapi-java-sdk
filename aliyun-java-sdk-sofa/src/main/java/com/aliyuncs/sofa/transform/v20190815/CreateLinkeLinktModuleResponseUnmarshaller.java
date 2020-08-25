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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktModuleResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktModuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktModuleResponseUnmarshaller {

	public static CreateLinkeLinktModuleResponse unmarshall(CreateLinkeLinktModuleResponse createLinkeLinktModuleResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktModuleResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktModuleResponse.RequestId"));
		createLinkeLinktModuleResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktModuleResponse.ResultCode"));
		createLinkeLinktModuleResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktModuleResponse.ResultMessage"));
		createLinkeLinktModuleResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktModuleResponse.ErrorCode"));
		createLinkeLinktModuleResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktModuleResponse.ErrorMessage"));
		createLinkeLinktModuleResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinktModuleResponse.ResponseStatusCode"));
		createLinkeLinktModuleResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktModuleResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Description"));
		data.setId(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.Id"));
		data.setModifier(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Modifier"));
		data.setName(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Name"));
		data.setOwners(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Owners"));
		data.setParentId(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.ParentId"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("CreateLinkeLinktModuleResponse.Data.Region"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktModuleResponse.Data.UpdatedAt"));
		createLinkeLinktModuleResponse.setData(data);
	 
	 	return createLinkeLinktModuleResponse;
	}
}