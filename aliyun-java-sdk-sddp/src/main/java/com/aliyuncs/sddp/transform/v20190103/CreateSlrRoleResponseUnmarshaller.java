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

package com.aliyuncs.sddp.transform.v20190103;

import com.aliyuncs.sddp.model.v20190103.CreateSlrRoleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSlrRoleResponseUnmarshaller {

	public static CreateSlrRoleResponse unmarshall(CreateSlrRoleResponse createSlrRoleResponse, UnmarshallerContext _ctx) {
		
		createSlrRoleResponse.setRequestId(_ctx.stringValue("CreateSlrRoleResponse.RequestId"));
		createSlrRoleResponse.setHasPermission(_ctx.booleanValue("CreateSlrRoleResponse.HasPermission"));
	 
	 	return createSlrRoleResponse;
	}
}