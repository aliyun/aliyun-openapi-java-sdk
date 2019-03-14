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

package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.GetSecurityPreferenceResponse;
import com.aliyuncs.ram.model.v20150501.GetSecurityPreferenceResponse.SecurityPreference;
import com.aliyuncs.ram.model.v20150501.GetSecurityPreferenceResponse.SecurityPreference.AccessKeyPreference;
import com.aliyuncs.ram.model.v20150501.GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference;
import com.aliyuncs.ram.model.v20150501.GetSecurityPreferenceResponse.SecurityPreference.MFAPreference;
import com.aliyuncs.ram.model.v20150501.GetSecurityPreferenceResponse.SecurityPreference.PublicKeyPreference;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecurityPreferenceResponseUnmarshaller {

	public static GetSecurityPreferenceResponse unmarshall(GetSecurityPreferenceResponse getSecurityPreferenceResponse, UnmarshallerContext context) {
		
		getSecurityPreferenceResponse.setRequestId(context.stringValue("GetSecurityPreferenceResponse.RequestId"));

		SecurityPreference securityPreference = new SecurityPreference();

		LoginProfilePreference loginProfilePreference = new LoginProfilePreference();
		loginProfilePreference.setEnableSaveMFATicket(context.booleanValue("GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.EnableSaveMFATicket"));
		loginProfilePreference.setAllowUserToChangePassword(context.booleanValue("GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.AllowUserToChangePassword"));
		loginProfilePreference.setLoginSessionDuration(context.integerValue("GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.LoginSessionDuration"));
		loginProfilePreference.setLoginNetworkMasks(context.stringValue("GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.LoginNetworkMasks"));
		securityPreference.setLoginProfilePreference(loginProfilePreference);

		AccessKeyPreference accessKeyPreference = new AccessKeyPreference();
		accessKeyPreference.setAllowUserToManageAccessKeys(context.booleanValue("GetSecurityPreferenceResponse.SecurityPreference.AccessKeyPreference.AllowUserToManageAccessKeys"));
		securityPreference.setAccessKeyPreference(accessKeyPreference);

		PublicKeyPreference publicKeyPreference = new PublicKeyPreference();
		publicKeyPreference.setAllowUserToManagePublicKeys(context.booleanValue("GetSecurityPreferenceResponse.SecurityPreference.PublicKeyPreference.AllowUserToManagePublicKeys"));
		securityPreference.setPublicKeyPreference(publicKeyPreference);

		MFAPreference mFAPreference = new MFAPreference();
		mFAPreference.setAllowUserToManageMFADevices(context.booleanValue("GetSecurityPreferenceResponse.SecurityPreference.MFAPreference.AllowUserToManageMFADevices"));
		securityPreference.setMFAPreference(mFAPreference);
		getSecurityPreferenceResponse.setSecurityPreference(securityPreference);
	 
	 	return getSecurityPreferenceResponse;
	}
}