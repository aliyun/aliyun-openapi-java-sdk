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

import com.aliyuncs.dataphin_public.model.v20230630.SyncDepartmentUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncDepartmentUserResponseUnmarshaller {

	public static SyncDepartmentUserResponse unmarshall(SyncDepartmentUserResponse syncDepartmentUserResponse, UnmarshallerContext _ctx) {
		
		syncDepartmentUserResponse.setRequestId(_ctx.stringValue("SyncDepartmentUserResponse.RequestId"));
		syncDepartmentUserResponse.setSuccess(_ctx.booleanValue("SyncDepartmentUserResponse.Success"));
		syncDepartmentUserResponse.setHttpStatusCode(_ctx.integerValue("SyncDepartmentUserResponse.HttpStatusCode"));
		syncDepartmentUserResponse.setCode(_ctx.stringValue("SyncDepartmentUserResponse.Code"));
		syncDepartmentUserResponse.setMessage(_ctx.stringValue("SyncDepartmentUserResponse.Message"));
		syncDepartmentUserResponse.setData(_ctx.booleanValue("SyncDepartmentUserResponse.Data"));
	 
	 	return syncDepartmentUserResponse;
	}
}