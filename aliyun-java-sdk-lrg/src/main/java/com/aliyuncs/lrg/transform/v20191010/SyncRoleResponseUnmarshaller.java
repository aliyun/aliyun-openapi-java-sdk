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

package com.aliyuncs.lrg.transform.v20191010;

import com.aliyuncs.lrg.model.v20191010.SyncRoleResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncRoleResponseUnmarshaller {

	public static SyncRoleResponse unmarshall(SyncRoleResponse syncRoleResponse, UnmarshallerContext _ctx) {
		
		syncRoleResponse.setCode(_ctx.integerValue("SyncRoleResponse.code"));
		syncRoleResponse.setData(_ctx.mapValue("SyncRoleResponse.data"));
		syncRoleResponse.setMessage(_ctx.stringValue("SyncRoleResponse.message"));
		syncRoleResponse.setSuccess(_ctx.booleanValue("SyncRoleResponse.success"));
	 
	 	return syncRoleResponse;
	}
}