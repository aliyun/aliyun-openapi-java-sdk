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

package com.aliyuncs.dfs.transform.v20180620;

import com.aliyuncs.dfs.model.v20180620.CreateUserGroupsMappingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserGroupsMappingResponseUnmarshaller {

	public static CreateUserGroupsMappingResponse unmarshall(CreateUserGroupsMappingResponse createUserGroupsMappingResponse, UnmarshallerContext _ctx) {
		
		createUserGroupsMappingResponse.setRequestId(_ctx.stringValue("CreateUserGroupsMappingResponse.RequestId"));
	 
	 	return createUserGroupsMappingResponse;
	}
}