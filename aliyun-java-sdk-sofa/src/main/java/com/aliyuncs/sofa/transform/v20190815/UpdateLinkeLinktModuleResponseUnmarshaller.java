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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktModuleResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktModuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktModuleResponseUnmarshaller {

	public static UpdateLinkeLinktModuleResponse unmarshall(UpdateLinkeLinktModuleResponse updateLinkeLinktModuleResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktModuleResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktModuleResponse.RequestId"));
		updateLinkeLinktModuleResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktModuleResponse.ResultCode"));
		updateLinkeLinktModuleResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktModuleResponse.ResultMessage"));
		updateLinkeLinktModuleResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktModuleResponse.ErrorCode"));
		updateLinkeLinktModuleResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktModuleResponse.ErrorMessage"));
		updateLinkeLinktModuleResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktModuleResponse.ResponseStatusCode"));
		updateLinkeLinktModuleResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktModuleResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Description"));
		data.setId(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.Id"));
		data.setModifier(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Modifier"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Name"));
		data.setOwners(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Owners"));
		data.setParentId(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.ParentId"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("UpdateLinkeLinktModuleResponse.Data.Region"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktModuleResponse.Data.UpdatedAt"));
		updateLinkeLinktModuleResponse.setData(data);
	 
	 	return updateLinkeLinktModuleResponse;
	}
}