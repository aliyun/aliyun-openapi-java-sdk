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

import com.aliyuncs.account_crm.model.v20160606.ChangeAgAccountNationalityCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeAgAccountNationalityCodeResponseUnmarshaller {

	public static ChangeAgAccountNationalityCodeResponse unmarshall(ChangeAgAccountNationalityCodeResponse changeAgAccountNationalityCodeResponse, UnmarshallerContext _ctx) {
		
		changeAgAccountNationalityCodeResponse.setRequestId(_ctx.stringValue("ChangeAgAccountNationalityCodeResponse.RequestId"));
		changeAgAccountNationalityCodeResponse.setCode(_ctx.stringValue("ChangeAgAccountNationalityCodeResponse.Code"));
		changeAgAccountNationalityCodeResponse.setMessage(_ctx.stringValue("ChangeAgAccountNationalityCodeResponse.Message"));
		changeAgAccountNationalityCodeResponse.setSuccess(_ctx.booleanValue("ChangeAgAccountNationalityCodeResponse.Success"));
	 
	 	return changeAgAccountNationalityCodeResponse;
	}
}