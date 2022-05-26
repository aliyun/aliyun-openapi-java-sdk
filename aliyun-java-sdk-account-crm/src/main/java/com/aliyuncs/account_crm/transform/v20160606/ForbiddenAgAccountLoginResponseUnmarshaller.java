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

import com.aliyuncs.account_crm.model.v20160606.ForbiddenAgAccountLoginResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ForbiddenAgAccountLoginResponseUnmarshaller {

	public static ForbiddenAgAccountLoginResponse unmarshall(ForbiddenAgAccountLoginResponse forbiddenAgAccountLoginResponse, UnmarshallerContext _ctx) {
		
		forbiddenAgAccountLoginResponse.setRequestId(_ctx.stringValue("ForbiddenAgAccountLoginResponse.RequestId"));
		forbiddenAgAccountLoginResponse.setCode(_ctx.stringValue("ForbiddenAgAccountLoginResponse.Code"));
		forbiddenAgAccountLoginResponse.setMessage(_ctx.stringValue("ForbiddenAgAccountLoginResponse.Message"));
		forbiddenAgAccountLoginResponse.setData(_ctx.booleanValue("ForbiddenAgAccountLoginResponse.Data"));
		forbiddenAgAccountLoginResponse.setSuccess(_ctx.booleanValue("ForbiddenAgAccountLoginResponse.Success"));
	 
	 	return forbiddenAgAccountLoginResponse;
	}
}