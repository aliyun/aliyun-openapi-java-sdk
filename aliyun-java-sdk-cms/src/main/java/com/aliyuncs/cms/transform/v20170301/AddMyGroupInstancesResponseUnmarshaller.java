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

import com.aliyuncs.cms.model.v20170301.AddMyGroupInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMyGroupInstancesResponseUnmarshaller {

	public static AddMyGroupInstancesResponse unmarshall(AddMyGroupInstancesResponse addMyGroupInstancesResponse, UnmarshallerContext context) {
		
		addMyGroupInstancesResponse.setRequestId(context.stringValue("AddMyGroupInstancesResponse.RequestId"));
		addMyGroupInstancesResponse.setSuccess(context.booleanValue("AddMyGroupInstancesResponse.Success"));
		addMyGroupInstancesResponse.setErrorCode(context.integerValue("AddMyGroupInstancesResponse.ErrorCode"));
		addMyGroupInstancesResponse.setErrorMessage(context.stringValue("AddMyGroupInstancesResponse.ErrorMessage"));
	 
	 	return addMyGroupInstancesResponse;
	}
}