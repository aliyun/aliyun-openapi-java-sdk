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

import com.aliyuncs.dataphin_public.model.v20230630.DeleteRowPermissionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRowPermissionResponseUnmarshaller {

	public static DeleteRowPermissionResponse unmarshall(DeleteRowPermissionResponse deleteRowPermissionResponse, UnmarshallerContext _ctx) {
		
		deleteRowPermissionResponse.setRequestId(_ctx.stringValue("DeleteRowPermissionResponse.RequestId"));
		deleteRowPermissionResponse.setSuccess(_ctx.booleanValue("DeleteRowPermissionResponse.Success"));
		deleteRowPermissionResponse.setHttpStatusCode(_ctx.integerValue("DeleteRowPermissionResponse.HttpStatusCode"));
		deleteRowPermissionResponse.setCode(_ctx.stringValue("DeleteRowPermissionResponse.Code"));
		deleteRowPermissionResponse.setMessage(_ctx.stringValue("DeleteRowPermissionResponse.Message"));
		deleteRowPermissionResponse.setData(_ctx.booleanValue("DeleteRowPermissionResponse.Data"));
	 
	 	return deleteRowPermissionResponse;
	}
}