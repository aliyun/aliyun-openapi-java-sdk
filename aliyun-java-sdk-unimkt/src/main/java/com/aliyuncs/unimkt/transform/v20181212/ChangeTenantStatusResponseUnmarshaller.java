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

import com.aliyuncs.unimkt.model.v20181212.ChangeTenantStatusResponse;
import com.aliyuncs.unimkt.model.v20181212.ChangeTenantStatusResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeTenantStatusResponseUnmarshaller {

	public static ChangeTenantStatusResponse unmarshall(ChangeTenantStatusResponse changeTenantStatusResponse, UnmarshallerContext _ctx) {
		
		changeTenantStatusResponse.setRequestId(_ctx.stringValue("ChangeTenantStatusResponse.RequestId"));
		changeTenantStatusResponse.setCode(_ctx.stringValue("ChangeTenantStatusResponse.Code"));
		changeTenantStatusResponse.setMessage(_ctx.stringValue("ChangeTenantStatusResponse.Message"));
		changeTenantStatusResponse.setSuccess(_ctx.booleanValue("ChangeTenantStatusResponse.Success"));

		Model model = new Model();
		model.setStatus(_ctx.stringValue("ChangeTenantStatusResponse.Model.Status"));
		model.setSettleInfo(_ctx.stringValue("ChangeTenantStatusResponse.Model.SettleInfo"));
		model.setTenantDescription(_ctx.stringValue("ChangeTenantStatusResponse.Model.TenantDescription"));
		model.setTenantName(_ctx.stringValue("ChangeTenantStatusResponse.Model.TenantName"));
		model.setCreateTime(_ctx.longValue("ChangeTenantStatusResponse.Model.CreateTime"));
		model.setBusiness(_ctx.stringValue("ChangeTenantStatusResponse.Model.Business"));
		model.setUserName(_ctx.stringValue("ChangeTenantStatusResponse.Model.UserName"));
		model.setExtInfo(_ctx.stringValue("ChangeTenantStatusResponse.Model.ExtInfo"));
		model.setTenantId(_ctx.stringValue("ChangeTenantStatusResponse.Model.TenantId"));
		model.setModifyTime(_ctx.longValue("ChangeTenantStatusResponse.Model.ModifyTime"));
		changeTenantStatusResponse.setModel(model);
	 
	 	return changeTenantStatusResponse;
	}
}