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

package com.aliyuncs.ims.transform.v20190815;

import com.aliyuncs.ims.model.v20190815.GetAccountSecurityPracticeReportResponse;
import com.aliyuncs.ims.model.v20190815.GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo;
import com.aliyuncs.ims.model.v20190815.GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo.AccountSecurityPracticeUserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountSecurityPracticeReportResponseUnmarshaller {

	public static GetAccountSecurityPracticeReportResponse unmarshall(GetAccountSecurityPracticeReportResponse getAccountSecurityPracticeReportResponse, UnmarshallerContext _ctx) {
		
		getAccountSecurityPracticeReportResponse.setRequestId(_ctx.stringValue("GetAccountSecurityPracticeReportResponse.RequestId"));

		AccountSecurityPracticeInfo accountSecurityPracticeInfo = new AccountSecurityPracticeInfo();
		accountSecurityPracticeInfo.setScore(_ctx.integerValue("GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo.Score"));

		AccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo = new AccountSecurityPracticeUserInfo();
		accountSecurityPracticeUserInfo.setUnusedAkNum(_ctx.integerValue("GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo.AccountSecurityPracticeUserInfo.UnusedAkNum"));
		accountSecurityPracticeUserInfo.setSubUserWithUnusedAccessKey(_ctx.integerValue("GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo.AccountSecurityPracticeUserInfo.SubUserWithUnusedAccessKey"));
		accountSecurityPracticeUserInfo.setRootWithAccessKey(_ctx.integerValue("GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo.AccountSecurityPracticeUserInfo.RootWithAccessKey"));
		accountSecurityPracticeUserInfo.setSubUser(_ctx.integerValue("GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo.AccountSecurityPracticeUserInfo.SubUser"));
		accountSecurityPracticeUserInfo.setBindMfa(_ctx.booleanValue("GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo.AccountSecurityPracticeUserInfo.BindMfa"));
		accountSecurityPracticeUserInfo.setOldAkNum(_ctx.integerValue("GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo.AccountSecurityPracticeUserInfo.OldAkNum"));
		accountSecurityPracticeUserInfo.setSubUserPwdLevel(_ctx.stringValue("GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo.AccountSecurityPracticeUserInfo.SubUserPwdLevel"));
		accountSecurityPracticeUserInfo.setSubUserWithOldAccessKey(_ctx.integerValue("GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo.AccountSecurityPracticeUserInfo.SubUserWithOldAccessKey"));
		accountSecurityPracticeUserInfo.setSubUserBindMfa(_ctx.integerValue("GetAccountSecurityPracticeReportResponse.AccountSecurityPracticeInfo.AccountSecurityPracticeUserInfo.SubUserBindMfa"));
		accountSecurityPracticeInfo.setAccountSecurityPracticeUserInfo(accountSecurityPracticeUserInfo);
		getAccountSecurityPracticeReportResponse.setAccountSecurityPracticeInfo(accountSecurityPracticeInfo);
	 
	 	return getAccountSecurityPracticeReportResponse;
	}
}