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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateModuleResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateModuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateModuleResponseUnmarshaller {

	public static UpdateModuleResponse unmarshall(UpdateModuleResponse updateModuleResponse, UnmarshallerContext _ctx) {
		
		updateModuleResponse.setRequestId(_ctx.stringValue("UpdateModuleResponse.RequestId"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("UpdateModuleResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("UpdateModuleResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("UpdateModuleResponse.Data.ModifiedTime"));
		data.setIcon(_ctx.stringValue("UpdateModuleResponse.Data.Icon"));
		data.setLatestPublishedCommit(_ctx.stringValue("UpdateModuleResponse.Data.LatestPublishedCommit"));
		data.setLatestPublishedVersion(_ctx.stringValue("UpdateModuleResponse.Data.LatestPublishedVersion"));
		data.setMinimumPlatformVersion(_ctx.stringValue("UpdateModuleResponse.Data.MinimumPlatformVersion"));
		data.setModuleId(_ctx.stringValue("UpdateModuleResponse.Data.ModuleId"));
		data.setModuleName(_ctx.stringValue("UpdateModuleResponse.Data.ModuleName"));
		data.setOwnerUserId(_ctx.stringValue("UpdateModuleResponse.Data.OwnerUserId"));
		data.setPlatform(_ctx.stringValue("UpdateModuleResponse.Data.Platform"));
		updateModuleResponse.setData(data);
	 
	 	return updateModuleResponse;
	}
}