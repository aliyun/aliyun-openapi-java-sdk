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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.ApplyIdentityRegistrationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyIdentityRegistrationResponseUnmarshaller {

	public static ApplyIdentityRegistrationResponse unmarshall(ApplyIdentityRegistrationResponse applyIdentityRegistrationResponse, UnmarshallerContext _ctx) {
		
		applyIdentityRegistrationResponse.setRequestId(_ctx.stringValue("ApplyIdentityRegistrationResponse.RequestId"));
		applyIdentityRegistrationResponse.setCode(_ctx.stringValue("ApplyIdentityRegistrationResponse.Code"));
		applyIdentityRegistrationResponse.setMessage(_ctx.stringValue("ApplyIdentityRegistrationResponse.Message"));
		applyIdentityRegistrationResponse.setData(_ctx.longValue("ApplyIdentityRegistrationResponse.Data"));
		applyIdentityRegistrationResponse.setSuccess(_ctx.booleanValue("ApplyIdentityRegistrationResponse.Success"));
	 
	 	return applyIdentityRegistrationResponse;
	}
}