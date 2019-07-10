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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.GetUserGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserGroupResponseUnmarshaller {

	public static GetUserGroupResponse unmarshall(GetUserGroupResponse getUserGroupResponse, UnmarshallerContext _ctx) {
		
		getUserGroupResponse.setRequestId(_ctx.stringValue("GetUserGroupResponse.RequestId"));
		getUserGroupResponse.setSuccess(_ctx.booleanValue("GetUserGroupResponse.Success"));
		getUserGroupResponse.setCode(_ctx.stringValue("GetUserGroupResponse.Code"));
		getUserGroupResponse.setMessage(_ctx.stringValue("GetUserGroupResponse.Message"));
		getUserGroupResponse.setData(_ctx.stringValue("GetUserGroupResponse.Data"));
	 
	 	return getUserGroupResponse;
	}
}