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

package com.aliyuncs.httpdns.transform.v20160201;

import com.aliyuncs.httpdns.model.v20160201.GetAccountInfoResponse;
import com.aliyuncs.httpdns.model.v20160201.GetAccountInfoResponse.AccountInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountInfoResponseUnmarshaller {

	public static GetAccountInfoResponse unmarshall(GetAccountInfoResponse getAccountInfoResponse, UnmarshallerContext _ctx) {
		
		getAccountInfoResponse.setRequestId(_ctx.stringValue("GetAccountInfoResponse.RequestId"));

		AccountInfo accountInfo = new AccountInfo();
		accountInfo.setAccountId(_ctx.stringValue("GetAccountInfoResponse.AccountInfo.AccountId"));
		accountInfo.setMonthFreeCount(_ctx.integerValue("GetAccountInfoResponse.AccountInfo.MonthFreeCount"));
		accountInfo.setMonthHttpsResolveCount(_ctx.integerValue("GetAccountInfoResponse.AccountInfo.MonthHttpsResolveCount"));
		accountInfo.setMonthResolveCount(_ctx.integerValue("GetAccountInfoResponse.AccountInfo.MonthResolveCount"));
		accountInfo.setPackageCount(_ctx.integerValue("GetAccountInfoResponse.AccountInfo.PackageCount"));
		accountInfo.setUserStatus(_ctx.integerValue("GetAccountInfoResponse.AccountInfo.UserStatus"));
		accountInfo.setSignSecret(_ctx.stringValue("GetAccountInfoResponse.AccountInfo.SignSecret"));
		accountInfo.setUnsignedEnabled(_ctx.booleanValue("GetAccountInfoResponse.AccountInfo.UnsignedEnabled"));
		accountInfo.setSignedCount(_ctx.longValue("GetAccountInfoResponse.AccountInfo.SignedCount"));
		accountInfo.setUnsignedCount(_ctx.longValue("GetAccountInfoResponse.AccountInfo.UnsignedCount"));
		getAccountInfoResponse.setAccountInfo(accountInfo);
	 
	 	return getAccountInfoResponse;
	}
}