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

import com.aliyuncs.account_crm.model.v20160606.UpdateAccountProfileInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAccountProfileInfoResponseUnmarshaller {

	public static UpdateAccountProfileInfoResponse unmarshall(UpdateAccountProfileInfoResponse updateAccountProfileInfoResponse, UnmarshallerContext _ctx) {
		
		updateAccountProfileInfoResponse.setRequestId(_ctx.stringValue("UpdateAccountProfileInfoResponse.RequestId"));
		updateAccountProfileInfoResponse.setCode(_ctx.stringValue("UpdateAccountProfileInfoResponse.Code"));
		updateAccountProfileInfoResponse.setMessage(_ctx.stringValue("UpdateAccountProfileInfoResponse.Message"));
		updateAccountProfileInfoResponse.setSuccess(_ctx.booleanValue("UpdateAccountProfileInfoResponse.Success"));
	 
	 	return updateAccountProfileInfoResponse;
	}
}