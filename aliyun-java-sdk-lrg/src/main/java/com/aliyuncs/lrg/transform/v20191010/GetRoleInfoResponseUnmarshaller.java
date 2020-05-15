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

import com.aliyuncs.lrg.model.v20191010.GetRoleInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRoleInfoResponseUnmarshaller {

	public static GetRoleInfoResponse unmarshall(GetRoleInfoResponse getRoleInfoResponse, UnmarshallerContext _ctx) {
		
		getRoleInfoResponse.setCode(_ctx.integerValue("GetRoleInfoResponse.code"));
		getRoleInfoResponse.setSuccess(_ctx.booleanValue("GetRoleInfoResponse.success"));
		getRoleInfoResponse.setMessage(_ctx.stringValue("GetRoleInfoResponse.message"));
		getRoleInfoResponse.setData(_ctx.mapValue("GetRoleInfoResponse.data"));
	 
	 	return getRoleInfoResponse;
	}
}