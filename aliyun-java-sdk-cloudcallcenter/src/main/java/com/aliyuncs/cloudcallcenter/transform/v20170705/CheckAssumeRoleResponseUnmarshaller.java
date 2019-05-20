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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.CheckAssumeRoleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckAssumeRoleResponseUnmarshaller {

	public static CheckAssumeRoleResponse unmarshall(CheckAssumeRoleResponse checkAssumeRoleResponse, UnmarshallerContext context) {
		
		checkAssumeRoleResponse.setRequestId(context.stringValue("CheckAssumeRoleResponse.RequestId"));
		checkAssumeRoleResponse.setSuccess(context.booleanValue("CheckAssumeRoleResponse.Success"));
		checkAssumeRoleResponse.setCode(context.stringValue("CheckAssumeRoleResponse.Code"));
		checkAssumeRoleResponse.setMessage(context.stringValue("CheckAssumeRoleResponse.Message"));
		checkAssumeRoleResponse.setHttpStatusCode(context.integerValue("CheckAssumeRoleResponse.HttpStatusCode"));
		checkAssumeRoleResponse.setHasRole(context.booleanValue("CheckAssumeRoleResponse.HasRole"));
	 
	 	return checkAssumeRoleResponse;
	}
}