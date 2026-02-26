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

import com.aliyuncs.account_crm.model.v20160606.UpdateAgAccountAddressInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAgAccountAddressInfoResponseUnmarshaller {

	public static UpdateAgAccountAddressInfoResponse unmarshall(UpdateAgAccountAddressInfoResponse updateAgAccountAddressInfoResponse, UnmarshallerContext _ctx) {
		
		updateAgAccountAddressInfoResponse.setRequestId(_ctx.stringValue("UpdateAgAccountAddressInfoResponse.RequestId"));
		updateAgAccountAddressInfoResponse.setCode(_ctx.stringValue("UpdateAgAccountAddressInfoResponse.Code"));
		updateAgAccountAddressInfoResponse.setMessage(_ctx.stringValue("UpdateAgAccountAddressInfoResponse.Message"));
		updateAgAccountAddressInfoResponse.setSuccess(_ctx.booleanValue("UpdateAgAccountAddressInfoResponse.Success"));
	 
	 	return updateAgAccountAddressInfoResponse;
	}
}