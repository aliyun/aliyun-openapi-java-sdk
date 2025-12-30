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

import com.aliyuncs.dataphin_public.model.v20230630.SyncDepartmentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncDepartmentResponseUnmarshaller {

	public static SyncDepartmentResponse unmarshall(SyncDepartmentResponse syncDepartmentResponse, UnmarshallerContext _ctx) {
		
		syncDepartmentResponse.setRequestId(_ctx.stringValue("SyncDepartmentResponse.RequestId"));
		syncDepartmentResponse.setSuccess(_ctx.booleanValue("SyncDepartmentResponse.Success"));
		syncDepartmentResponse.setHttpStatusCode(_ctx.integerValue("SyncDepartmentResponse.HttpStatusCode"));
		syncDepartmentResponse.setCode(_ctx.stringValue("SyncDepartmentResponse.Code"));
		syncDepartmentResponse.setMessage(_ctx.stringValue("SyncDepartmentResponse.Message"));
		syncDepartmentResponse.setData(_ctx.booleanValue("SyncDepartmentResponse.Data"));
	 
	 	return syncDepartmentResponse;
	}
}