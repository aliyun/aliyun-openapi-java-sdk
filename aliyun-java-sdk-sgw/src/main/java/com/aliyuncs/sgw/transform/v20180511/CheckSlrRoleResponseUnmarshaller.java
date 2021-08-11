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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.CheckSlrRoleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckSlrRoleResponseUnmarshaller {

	public static CheckSlrRoleResponse unmarshall(CheckSlrRoleResponse checkSlrRoleResponse, UnmarshallerContext _ctx) {
		
		checkSlrRoleResponse.setRequestId(_ctx.stringValue("CheckSlrRoleResponse.RequestId"));
		checkSlrRoleResponse.setSuccess(_ctx.booleanValue("CheckSlrRoleResponse.Success"));
		checkSlrRoleResponse.setCode(_ctx.stringValue("CheckSlrRoleResponse.Code"));
		checkSlrRoleResponse.setMessage(_ctx.stringValue("CheckSlrRoleResponse.Message"));
		checkSlrRoleResponse.setExist(_ctx.booleanValue("CheckSlrRoleResponse.Exist"));
		checkSlrRoleResponse.setRequireOldWayCheck(_ctx.booleanValue("CheckSlrRoleResponse.RequireOldWayCheck"));
	 
	 	return checkSlrRoleResponse;
	}
}