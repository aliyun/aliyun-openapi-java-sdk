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

	public static GetAccountInfoResponse unmarshall(GetAccountInfoResponse getAccountInfoResponse, UnmarshallerContext context) {
		
		getAccountInfoResponse.setRequestId(context.stringValue("GetAccountInfoResponse.RequestId"));

		AccountInfo accountInfo = new AccountInfo();
		accountInfo.setAccountId(context.stringValue("GetAccountInfoResponse.AccountInfo.AccountId"));
		accountInfo.setMonthFreeCount(context.integerValue("GetAccountInfoResponse.AccountInfo.MonthFreeCount"));
		accountInfo.setMonthHttpsResolveCount(context.integerValue("GetAccountInfoResponse.AccountInfo.MonthHttpsResolveCount"));
		accountInfo.setMonthResolveCount(context.integerValue("GetAccountInfoResponse.AccountInfo.MonthResolveCount"));
		accountInfo.setPackageCount(context.integerValue("GetAccountInfoResponse.AccountInfo.PackageCount"));
		accountInfo.setUserStatus(context.integerValue("GetAccountInfoResponse.AccountInfo.UserStatus"));
		accountInfo.setSignSecret(context.stringValue("GetAccountInfoResponse.AccountInfo.SignSecret"));
		accountInfo.setUnsignedEnabled(context.booleanValue("GetAccountInfoResponse.AccountInfo.UnsignedEnabled"));
		accountInfo.setSignedCount(context.longValue("GetAccountInfoResponse.AccountInfo.SignedCount"));
		accountInfo.setUnsignedCount(context.longValue("GetAccountInfoResponse.AccountInfo.UnsignedCount"));
		getAccountInfoResponse.setAccountInfo(accountInfo);
	 
	 	return getAccountInfoResponse;
	}
}