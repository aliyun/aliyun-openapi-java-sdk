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

import com.aliyuncs.dataphin_public.model.v20230630.BatchAddTenantMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchAddTenantMemberResponseUnmarshaller {

	public static BatchAddTenantMemberResponse unmarshall(BatchAddTenantMemberResponse batchAddTenantMemberResponse, UnmarshallerContext _ctx) {
		
		batchAddTenantMemberResponse.setRequestId(_ctx.stringValue("BatchAddTenantMemberResponse.RequestId"));
		batchAddTenantMemberResponse.setSuccess(_ctx.booleanValue("BatchAddTenantMemberResponse.Success"));
		batchAddTenantMemberResponse.setHttpStatusCode(_ctx.integerValue("BatchAddTenantMemberResponse.HttpStatusCode"));
		batchAddTenantMemberResponse.setCode(_ctx.stringValue("BatchAddTenantMemberResponse.Code"));
		batchAddTenantMemberResponse.setMessage(_ctx.stringValue("BatchAddTenantMemberResponse.Message"));
		batchAddTenantMemberResponse.setData(_ctx.booleanValue("BatchAddTenantMemberResponse.Data"));
	 
	 	return batchAddTenantMemberResponse;
	}
}