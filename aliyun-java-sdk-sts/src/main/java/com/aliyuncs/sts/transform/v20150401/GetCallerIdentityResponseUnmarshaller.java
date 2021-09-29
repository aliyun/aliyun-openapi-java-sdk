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

	public static GetCallerIdentityResponse unmarshall(GetCallerIdentityResponse getCallerIdentityResponse, UnmarshallerContext _ctx) {
		
		getCallerIdentityResponse.setRequestId(_ctx.stringValue("GetCallerIdentityResponse.RequestId"));
		getCallerIdentityResponse.setIdentityType(_ctx.stringValue("GetCallerIdentityResponse.IdentityType"));
		getCallerIdentityResponse.setAccountId(_ctx.stringValue("GetCallerIdentityResponse.AccountId"));
		getCallerIdentityResponse.setPrincipalId(_ctx.stringValue("GetCallerIdentityResponse.PrincipalId"));
		getCallerIdentityResponse.setUserId(_ctx.stringValue("GetCallerIdentityResponse.UserId"));
		getCallerIdentityResponse.setArn(_ctx.stringValue("GetCallerIdentityResponse.Arn"));
		getCallerIdentityResponse.setRoleId(_ctx.stringValue("GetCallerIdentityResponse.RoleId"));
	 
	 	return getCallerIdentityResponse;
	}
}