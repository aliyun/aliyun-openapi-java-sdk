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

import com.aliyuncs.unimkt.model.v20181212.ModifyTenantInfoResponse;
import com.aliyuncs.unimkt.model.v20181212.ModifyTenantInfoResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTenantInfoResponseUnmarshaller {

	public static ModifyTenantInfoResponse unmarshall(ModifyTenantInfoResponse modifyTenantInfoResponse, UnmarshallerContext _ctx) {
		
		modifyTenantInfoResponse.setRequestId(_ctx.stringValue("ModifyTenantInfoResponse.RequestId"));
		modifyTenantInfoResponse.setCode(_ctx.stringValue("ModifyTenantInfoResponse.Code"));
		modifyTenantInfoResponse.setMessage(_ctx.stringValue("ModifyTenantInfoResponse.Message"));
		modifyTenantInfoResponse.setSuccess(_ctx.booleanValue("ModifyTenantInfoResponse.Success"));

		Model model = new Model();
		model.setStatus(_ctx.stringValue("ModifyTenantInfoResponse.Model.Status"));
		model.setSettleInfo(_ctx.stringValue("ModifyTenantInfoResponse.Model.SettleInfo"));
		model.setVersion(_ctx.longValue("ModifyTenantInfoResponse.Model.Version"));
		model.setTenantDescription(_ctx.stringValue("ModifyTenantInfoResponse.Model.TenantDescription"));
		model.setTenantName(_ctx.stringValue("ModifyTenantInfoResponse.Model.TenantName"));
		model.setCreateTime(_ctx.longValue("ModifyTenantInfoResponse.Model.CreateTime"));
		model.setBusiness(_ctx.stringValue("ModifyTenantInfoResponse.Model.Business"));
		model.setUserName(_ctx.stringValue("ModifyTenantInfoResponse.Model.UserName"));
		model.setExtInfo(_ctx.stringValue("ModifyTenantInfoResponse.Model.ExtInfo"));
		model.setTenantId(_ctx.stringValue("ModifyTenantInfoResponse.Model.TenantId"));
		model.setModifyTime(_ctx.longValue("ModifyTenantInfoResponse.Model.ModifyTime"));
		modifyTenantInfoResponse.setModel(model);
	 
	 	return modifyTenantInfoResponse;
	}
}