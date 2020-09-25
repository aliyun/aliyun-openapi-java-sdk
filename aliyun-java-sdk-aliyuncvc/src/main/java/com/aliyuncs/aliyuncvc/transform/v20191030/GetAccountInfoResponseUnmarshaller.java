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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import com.aliyuncs.aliyuncvc.model.v20191030.GetAccountInfoResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.GetAccountInfoResponse.AccountInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountInfoResponseUnmarshaller {

	public static GetAccountInfoResponse unmarshall(GetAccountInfoResponse getAccountInfoResponse, UnmarshallerContext _ctx) {
		
		getAccountInfoResponse.setRequestId(_ctx.stringValue("GetAccountInfoResponse.RequestId"));
		getAccountInfoResponse.setErrorCode(_ctx.integerValue("GetAccountInfoResponse.ErrorCode"));
		getAccountInfoResponse.setMessage(_ctx.stringValue("GetAccountInfoResponse.Message"));
		getAccountInfoResponse.setSuccess(_ctx.booleanValue("GetAccountInfoResponse.Success"));

		AccountInfo accountInfo = new AccountInfo();
		accountInfo.setAccountConcurrentMax(_ctx.integerValue("GetAccountInfoResponse.AccountInfo.AccountConcurrentMax"));
		accountInfo.setAccountApplicationMax(_ctx.integerValue("GetAccountInfoResponse.AccountInfo.AccountApplicationMax"));
		accountInfo.setAccountApplicationNumber(_ctx.integerValue("GetAccountInfoResponse.AccountInfo.AccountApplicationNumber"));
		getAccountInfoResponse.setAccountInfo(accountInfo);
	 
	 	return getAccountInfoResponse;
	}
}