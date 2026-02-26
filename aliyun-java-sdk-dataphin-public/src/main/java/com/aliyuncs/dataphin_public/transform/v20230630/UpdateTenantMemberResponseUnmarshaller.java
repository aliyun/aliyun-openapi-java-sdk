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

import com.aliyuncs.dataphin_public.model.v20230630.UpdateTenantMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTenantMemberResponseUnmarshaller {

	public static UpdateTenantMemberResponse unmarshall(UpdateTenantMemberResponse updateTenantMemberResponse, UnmarshallerContext _ctx) {
		
		updateTenantMemberResponse.setRequestId(_ctx.stringValue("UpdateTenantMemberResponse.RequestId"));
		updateTenantMemberResponse.setSuccess(_ctx.booleanValue("UpdateTenantMemberResponse.Success"));
		updateTenantMemberResponse.setHttpStatusCode(_ctx.integerValue("UpdateTenantMemberResponse.HttpStatusCode"));
		updateTenantMemberResponse.setCode(_ctx.stringValue("UpdateTenantMemberResponse.Code"));
		updateTenantMemberResponse.setMessage(_ctx.stringValue("UpdateTenantMemberResponse.Message"));
	 
	 	return updateTenantMemberResponse;
	}
}