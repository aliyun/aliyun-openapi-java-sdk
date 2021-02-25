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

import com.aliyuncs.unimkt.model.v20181212.CheckTenantBizResponse;
import com.aliyuncs.unimkt.model.v20181212.CheckTenantBizResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckTenantBizResponseUnmarshaller {

	public static CheckTenantBizResponse unmarshall(CheckTenantBizResponse checkTenantBizResponse, UnmarshallerContext _ctx) {
		
		checkTenantBizResponse.setRequestId(_ctx.stringValue("CheckTenantBizResponse.RequestId"));
		checkTenantBizResponse.setCode(_ctx.stringValue("CheckTenantBizResponse.Code"));
		checkTenantBizResponse.setSuccess(_ctx.booleanValue("CheckTenantBizResponse.Success"));
		checkTenantBizResponse.setMessage(_ctx.stringValue("CheckTenantBizResponse.Message"));

		Model model = new Model();
		model.setCanAccessMedia(_ctx.booleanValue("CheckTenantBizResponse.Model.CanAccessMedia"));
		model.setCanAccessAdSlot(_ctx.booleanValue("CheckTenantBizResponse.Model.CanAccessAdSlot"));
		checkTenantBizResponse.setModel(model);
	 
	 	return checkTenantBizResponse;
	}
}