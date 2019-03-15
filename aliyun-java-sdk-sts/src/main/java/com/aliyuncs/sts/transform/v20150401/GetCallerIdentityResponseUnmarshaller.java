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

package com.aliyuncs.sts.transform.v20150401;

import com.aliyuncs.sts.model.v20150401.GetCallerIdentityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCallerIdentityResponseUnmarshaller {

	public static GetCallerIdentityResponse unmarshall(GetCallerIdentityResponse getCallerIdentityResponse, UnmarshallerContext context) {
		
		getCallerIdentityResponse.setRequestId(context.stringValue("GetCallerIdentityResponse.RequestId"));
		getCallerIdentityResponse.setAccountId(context.stringValue("GetCallerIdentityResponse.AccountId"));
		getCallerIdentityResponse.setUserId(context.stringValue("GetCallerIdentityResponse.UserId"));
		getCallerIdentityResponse.setRoleId(context.stringValue("GetCallerIdentityResponse.RoleId"));
		getCallerIdentityResponse.setArn(context.stringValue("GetCallerIdentityResponse.Arn"));
		getCallerIdentityResponse.setIdentityType(context.stringValue("GetCallerIdentityResponse.IdentityType"));
		getCallerIdentityResponse.setPrincipalId(context.stringValue("GetCallerIdentityResponse.PrincipalId"));
	 
	 	return getCallerIdentityResponse;
	}
}