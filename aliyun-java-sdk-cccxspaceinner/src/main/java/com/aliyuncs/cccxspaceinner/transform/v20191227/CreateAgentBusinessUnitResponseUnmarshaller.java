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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import com.aliyuncs.cccxspaceinner.model.v20191227.CreateAgentBusinessUnitResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.CreateAgentBusinessUnitResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAgentBusinessUnitResponseUnmarshaller {

	public static CreateAgentBusinessUnitResponse unmarshall(CreateAgentBusinessUnitResponse createAgentBusinessUnitResponse, UnmarshallerContext _ctx) {
		
		createAgentBusinessUnitResponse.setSuccess(_ctx.booleanValue("CreateAgentBusinessUnitResponse.Success"));
		createAgentBusinessUnitResponse.setCode(_ctx.stringValue("CreateAgentBusinessUnitResponse.Code"));
		createAgentBusinessUnitResponse.setMessage(_ctx.stringValue("CreateAgentBusinessUnitResponse.Message"));

		Data data = new Data();
		data.setBuId(_ctx.longValue("CreateAgentBusinessUnitResponse.Data.BuId"));
		data.setBuName(_ctx.stringValue("CreateAgentBusinessUnitResponse.Data.BuName"));
		data.setBuKey(_ctx.stringValue("CreateAgentBusinessUnitResponse.Data.BuKey"));
		data.setDepartmentId(_ctx.longValue("CreateAgentBusinessUnitResponse.Data.DepartmentId"));
		data.setAdminAgentId(_ctx.longValue("CreateAgentBusinessUnitResponse.Data.AdminAgentId"));
		createAgentBusinessUnitResponse.setData(data);
	 
	 	return createAgentBusinessUnitResponse;
	}
}