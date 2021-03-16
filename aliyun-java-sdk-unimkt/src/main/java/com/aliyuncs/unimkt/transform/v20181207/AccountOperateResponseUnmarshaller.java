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

package com.aliyuncs.unimkt.transform.v20181207;

import com.aliyuncs.unimkt.model.v20181207.AccountOperateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AccountOperateResponseUnmarshaller {

	public static AccountOperateResponse unmarshall(AccountOperateResponse accountOperateResponse, UnmarshallerContext _ctx) {
		
		accountOperateResponse.setRequestId(_ctx.stringValue("AccountOperateResponse.RequestId"));
		accountOperateResponse.setStatus(_ctx.integerValue("AccountOperateResponse.Status"));
		accountOperateResponse.setMessage(_ctx.stringValue("AccountOperateResponse.Message"));
		accountOperateResponse.setData(_ctx.stringValue("AccountOperateResponse.Data"));
	 
	 	return accountOperateResponse;
	}
}