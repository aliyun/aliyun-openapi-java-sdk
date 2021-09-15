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
		data.setModuleName(_ctx.stringValue("GetModuleResponse.Data.ModuleName"));
		data.setModifiedTime(_ctx.stringValue("GetModuleResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("GetModuleResponse.Data.ModuleId"));
		data.setDescription(_ctx.stringValue("GetModuleResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("GetModuleResponse.Data.CreateTime"));
		data.setTargetAppSource(_ctx.stringValue("GetModuleResponse.Data.TargetAppSource"));
		getModuleResponse.setData(data);
	 
	 	return getModuleResponse;
	}
}