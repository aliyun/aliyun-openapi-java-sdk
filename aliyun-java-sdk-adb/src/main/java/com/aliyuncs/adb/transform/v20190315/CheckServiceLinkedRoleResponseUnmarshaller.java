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

package com.aliyuncs.adb.transform.v20190315;

import com.aliyuncs.adb.model.v20190315.CheckServiceLinkedRoleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckServiceLinkedRoleResponseUnmarshaller {

	public static CheckServiceLinkedRoleResponse unmarshall(CheckServiceLinkedRoleResponse checkServiceLinkedRoleResponse, UnmarshallerContext _ctx) {
		
		checkServiceLinkedRoleResponse.setRequestId(_ctx.stringValue("CheckServiceLinkedRoleResponse.RequestId"));
		checkServiceLinkedRoleResponse.setHasServiceLinkedRole(_ctx.booleanValue("CheckServiceLinkedRoleResponse.HasServiceLinkedRole"));
	 
	 	return checkServiceLinkedRoleResponse;
	}
}