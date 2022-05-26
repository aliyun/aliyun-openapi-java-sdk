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

import com.aliyuncs.account_crm.model.v20160606.QueryAccountRealNameInfoResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountRealNameInfoResponse.ProfileInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountRealNameInfoResponseUnmarshaller {

	public static QueryAccountRealNameInfoResponse unmarshall(QueryAccountRealNameInfoResponse queryAccountRealNameInfoResponse, UnmarshallerContext _ctx) {
		
		queryAccountRealNameInfoResponse.setRequestId(_ctx.stringValue("QueryAccountRealNameInfoResponse.RequestId"));

		ProfileInfo profileInfo = new ProfileInfo();
		profileInfo.setProcessingEnterpriseCertify(_ctx.booleanValue("QueryAccountRealNameInfoResponse.ProfileInfo.ProcessingEnterpriseCertify"));
		profileInfo.setIsBankIDAuth(_ctx.stringValue("QueryAccountRealNameInfoResponse.ProfileInfo.IsBankIDAuth"));
		profileInfo.setAuthBeiAnCid(_ctx.stringValue("QueryAccountRealNameInfoResponse.ProfileInfo.AuthBeiAnCid"));
		profileInfo.setAuthDomain(_ctx.stringValue("QueryAccountRealNameInfoResponse.ProfileInfo.AuthDomain"));
		profileInfo.setCertifiedTime(_ctx.stringValue("QueryAccountRealNameInfoResponse.ProfileInfo.CertifiedTime"));
		profileInfo.setCertifiedFrom(_ctx.stringValue("QueryAccountRealNameInfoResponse.ProfileInfo.CertifiedFrom"));
		profileInfo.setAuthAlipay(_ctx.stringValue("QueryAccountRealNameInfoResponse.ProfileInfo.AuthAlipay"));
		profileInfo.setAccountCertifyType(_ctx.stringValue("QueryAccountRealNameInfoResponse.ProfileInfo.AccountCertifyType"));
		profileInfo.setLicenseNumber(_ctx.stringValue("QueryAccountRealNameInfoResponse.ProfileInfo.LicenseNumber"));
		profileInfo.setLicenseType(_ctx.stringValue("QueryAccountRealNameInfoResponse.ProfileInfo.LicenseType"));
		profileInfo.setName(_ctx.stringValue("QueryAccountRealNameInfoResponse.ProfileInfo.Name"));
		profileInfo.setIsCertified(_ctx.stringValue("QueryAccountRealNameInfoResponse.ProfileInfo.IsCertified"));
		queryAccountRealNameInfoResponse.setProfileInfo(profileInfo);
	 
	 	return queryAccountRealNameInfoResponse;
	}
}