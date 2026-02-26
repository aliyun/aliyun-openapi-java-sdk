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

import com.aliyuncs.miniapplcdp.model.v20200113.GetModuleResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetModuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetModuleResponseUnmarshaller {

	public static GetModuleResponse unmarshall(GetModuleResponse getModuleResponse, UnmarshallerContext _ctx) {
		
		getModuleResponse.setRequestId(_ctx.stringValue("GetModuleResponse.RequestId"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("GetModuleResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("GetModuleResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("GetModuleResponse.Data.ModifiedTime"));
		data.setIcon(_ctx.stringValue("GetModuleResponse.Data.Icon"));
		data.setLatestPublishedCommit(_ctx.stringValue("GetModuleResponse.Data.LatestPublishedCommit"));
		data.setLatestPublishedVersion(_ctx.stringValue("GetModuleResponse.Data.LatestPublishedVersion"));
		data.setMinimumPlatformVersion(_ctx.stringValue("GetModuleResponse.Data.MinimumPlatformVersion"));
		data.setModuleId(_ctx.stringValue("GetModuleResponse.Data.ModuleId"));
		data.setModuleName(_ctx.stringValue("GetModuleResponse.Data.ModuleName"));
		data.setOwnerAppId(_ctx.stringValue("GetModuleResponse.Data.OwnerAppId"));
		data.setOwnerUserId(_ctx.stringValue("GetModuleResponse.Data.OwnerUserId"));
		data.setPlatform(_ctx.stringValue("GetModuleResponse.Data.Platform"));
		data.setPlatformVersion(_ctx.stringValue("GetModuleResponse.Data.PlatformVersion"));
		getModuleResponse.setData(data);
	 
	 	return getModuleResponse;
	}
}