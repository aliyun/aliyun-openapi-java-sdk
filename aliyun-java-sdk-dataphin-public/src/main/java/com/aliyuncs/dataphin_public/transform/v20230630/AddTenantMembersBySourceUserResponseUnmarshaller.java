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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.AddTenantMembersBySourceUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTenantMembersBySourceUserResponseUnmarshaller {

	public static AddTenantMembersBySourceUserResponse unmarshall(AddTenantMembersBySourceUserResponse addTenantMembersBySourceUserResponse, UnmarshallerContext _ctx) {
		
		addTenantMembersBySourceUserResponse.setRequestId(_ctx.stringValue("AddTenantMembersBySourceUserResponse.RequestId"));
		addTenantMembersBySourceUserResponse.setSuccess(_ctx.booleanValue("AddTenantMembersBySourceUserResponse.Success"));
		addTenantMembersBySourceUserResponse.setHttpStatusCode(_ctx.integerValue("AddTenantMembersBySourceUserResponse.HttpStatusCode"));
		addTenantMembersBySourceUserResponse.setCode(_ctx.stringValue("AddTenantMembersBySourceUserResponse.Code"));
		addTenantMembersBySourceUserResponse.setMessage(_ctx.stringValue("AddTenantMembersBySourceUserResponse.Message"));
		addTenantMembersBySourceUserResponse.setData(_ctx.booleanValue("AddTenantMembersBySourceUserResponse.Data"));
	 
	 	return addTenantMembersBySourceUserResponse;
	}
}