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

package com.aliyuncs.baas.transform.v20180731;

import com.aliyuncs.baas.model.v20180731.DestroyOrganizationResponse;
import com.aliyuncs.baas.model.v20180731.DestroyOrganizationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DestroyOrganizationResponseUnmarshaller {

	public static DestroyOrganizationResponse unmarshall(DestroyOrganizationResponse destroyOrganizationResponse, UnmarshallerContext context) {
		
		destroyOrganizationResponse.setRequestId(context.stringValue("DestroyOrganizationResponse.RequestId"));
		destroyOrganizationResponse.setSuccess(context.booleanValue("DestroyOrganizationResponse.Success"));
		destroyOrganizationResponse.setErrorCode(context.integerValue("DestroyOrganizationResponse.ErrorCode"));
		destroyOrganizationResponse.setDynamicCode(context.stringValue("DestroyOrganizationResponse.DynamicCode"));
		destroyOrganizationResponse.setDynamicMessage(context.stringValue("DestroyOrganizationResponse.DynamicMessage"));

		Result result = new Result();
		result.setOrganizationId(context.stringValue("DestroyOrganizationResponse.Result.OrganizationId"));
		result.setName(context.stringValue("DestroyOrganizationResponse.Result.Name"));
		destroyOrganizationResponse.setResult(result);
	 
	 	return destroyOrganizationResponse;
	}
}