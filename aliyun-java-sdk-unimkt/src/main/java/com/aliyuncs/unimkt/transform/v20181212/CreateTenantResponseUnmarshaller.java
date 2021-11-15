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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.CreateTenantResponse;
import com.aliyuncs.unimkt.model.v20181212.CreateTenantResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTenantResponseUnmarshaller {

	public static CreateTenantResponse unmarshall(CreateTenantResponse createTenantResponse, UnmarshallerContext _ctx) {
		
		createTenantResponse.setRequestId(_ctx.stringValue("CreateTenantResponse.RequestId"));
		createTenantResponse.setCode(_ctx.stringValue("CreateTenantResponse.Code"));
		createTenantResponse.setSuccess(_ctx.booleanValue("CreateTenantResponse.Success"));
		createTenantResponse.setMessage(_ctx.stringValue("CreateTenantResponse.Message"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("CreateTenantResponse.Model.CreateTime"));
		model.setModifyTime(_ctx.longValue("CreateTenantResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("CreateTenantResponse.Model.TenantId"));
		model.setTenantName(_ctx.stringValue("CreateTenantResponse.Model.TenantName"));
		model.setBusiness(_ctx.stringValue("CreateTenantResponse.Model.Business"));
		model.setTenantDescription(_ctx.stringValue("CreateTenantResponse.Model.TenantDescription"));
		model.setUserName(_ctx.stringValue("CreateTenantResponse.Model.UserName"));
		model.setSettleInfo(_ctx.stringValue("CreateTenantResponse.Model.SettleInfo"));
		model.setExtInfo(_ctx.stringValue("CreateTenantResponse.Model.ExtInfo"));
		model.setStatus(_ctx.stringValue("CreateTenantResponse.Model.Status"));
		createTenantResponse.setModel(model);
	 
	 	return createTenantResponse;
	}
}