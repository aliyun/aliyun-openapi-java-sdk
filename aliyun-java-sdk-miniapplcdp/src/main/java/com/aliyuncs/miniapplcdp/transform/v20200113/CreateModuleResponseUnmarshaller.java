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

import com.aliyuncs.miniapplcdp.model.v20200113.CreateModuleResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateModuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateModuleResponseUnmarshaller {

	public static CreateModuleResponse unmarshall(CreateModuleResponse createModuleResponse, UnmarshallerContext _ctx) {
		
		createModuleResponse.setRequestId(_ctx.stringValue("CreateModuleResponse.RequestId"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("CreateModuleResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("CreateModuleResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("CreateModuleResponse.Data.ModifiedTime"));
		data.setIcon(_ctx.stringValue("CreateModuleResponse.Data.Icon"));
		data.setLatestPublishedCommit(_ctx.stringValue("CreateModuleResponse.Data.LatestPublishedCommit"));
		data.setLatestPublishedVersion(_ctx.stringValue("CreateModuleResponse.Data.LatestPublishedVersion"));
		data.setMinimumPlatformVersion(_ctx.stringValue("CreateModuleResponse.Data.MinimumPlatformVersion"));
		data.setModuleId(_ctx.stringValue("CreateModuleResponse.Data.ModuleId"));
		data.setModuleName(_ctx.stringValue("CreateModuleResponse.Data.ModuleName"));
		data.setOwnerAppId(_ctx.stringValue("CreateModuleResponse.Data.OwnerAppId"));
		data.setOwnerUserId(_ctx.stringValue("CreateModuleResponse.Data.OwnerUserId"));
		data.setPlatform(_ctx.stringValue("CreateModuleResponse.Data.Platform"));
		data.setModuleType(_ctx.stringValue("CreateModuleResponse.Data.ModuleType"));
		data.setPlatformVersion(_ctx.stringValue("CreateModuleResponse.Data.PlatformVersion"));
		createModuleResponse.setData(data);
	 
	 	return createModuleResponse;
	}
}