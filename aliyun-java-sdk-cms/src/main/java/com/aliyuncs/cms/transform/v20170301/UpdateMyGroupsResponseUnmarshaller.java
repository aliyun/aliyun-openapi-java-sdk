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
package com.aliyuncs.cms.transform.v20170301;

import com.aliyuncs.cms.model.v20170301.UpdateMyGroupsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMyGroupsResponseUnmarshaller {

	public static UpdateMyGroupsResponse unmarshall(UpdateMyGroupsResponse updateMyGroupsResponse, UnmarshallerContext context) {
		
		updateMyGroupsResponse.setRequestId(context.stringValue("UpdateMyGroupsResponse.RequestId"));
		updateMyGroupsResponse.setSuccess(context.booleanValue("UpdateMyGroupsResponse.Success"));
		updateMyGroupsResponse.setErrorCode(context.integerValue("UpdateMyGroupsResponse.ErrorCode"));
		updateMyGroupsResponse.setErrorMessage(context.stringValue("UpdateMyGroupsResponse.ErrorMessage"));
	 
	 	return updateMyGroupsResponse;
	}
}