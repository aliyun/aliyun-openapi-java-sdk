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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ims.model.v20190815.GetSecurityPreferenceResponse;
import com.aliyuncs.ims.model.v20190815.GetSecurityPreferenceResponse.SecurityPreference;
import com.aliyuncs.ims.model.v20190815.GetSecurityPreferenceResponse.SecurityPreference.AccessKeyPreference;
import com.aliyuncs.ims.model.v20190815.GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference;
import com.aliyuncs.ims.model.v20190815.GetSecurityPreferenceResponse.SecurityPreference.MFAPreference;
import com.aliyuncs.ims.model.v20190815.GetSecurityPreferenceResponse.SecurityPreference.PersonalInfoPreference;
import com.aliyuncs.ims.model.v20190815.GetSecurityPreferenceResponse.SecurityPreference.VerificationPreference;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecurityPreferenceResponseUnmarshaller {

	public static GetSecurityPreferenceResponse unmarshall(GetSecurityPreferenceResponse getSecurityPreferenceResponse, UnmarshallerContext _ctx) {
		
		getSecurityPreferenceResponse.setRequestId(_ctx.stringValue("GetSecurityPreferenceResponse.RequestId"));

		SecurityPreference securityPreference = new SecurityPreference();

		AccessKeyPreference accessKeyPreference = new AccessKeyPreference();
		accessKeyPreference.setAllowUserToManageAccessKeys(_ctx.booleanValue("GetSecurityPreferenceResponse.SecurityPreference.AccessKeyPreference.AllowUserToManageAccessKeys"));
		securityPreference.setAccessKeyPreference(accessKeyPreference);

		LoginProfilePreference loginProfilePreference = new LoginProfilePreference();
		loginProfilePreference.setEnableSaveMFATicket(_ctx.booleanValue("GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.EnableSaveMFATicket"));
		loginProfilePreference.setLoginSessionDuration(_ctx.integerValue("GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.LoginSessionDuration"));
		loginProfilePreference.setLoginNetworkMasks(_ctx.stringValue("GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.LoginNetworkMasks"));
		loginProfilePreference.setAllowUserToChangePassword(_ctx.booleanValue("GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.AllowUserToChangePassword"));
		loginProfilePreference.setEnforceMFAForLogin(_ctx.booleanValue("GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.EnforceMFAForLogin"));
		loginProfilePreference.setOperationForRiskLogin(_ctx.stringValue("GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.OperationForRiskLogin"));
		loginProfilePreference.setMFAOperationForLogin(_ctx.stringValue("GetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.MFAOperationForLogin"));
		securityPreference.setLoginProfilePreference(loginProfilePreference);

		MFAPreference mFAPreference = new MFAPreference();
		mFAPreference.setAllowUserToManageMFADevices(_ctx.booleanValue("GetSecurityPreferenceResponse.SecurityPreference.MFAPreference.AllowUserToManageMFADevices"));
		securityPreference.setMFAPreference(mFAPreference);

		VerificationPreference verificationPreference = new VerificationPreference();

		List<String> verificationTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSecurityPreferenceResponse.SecurityPreference.VerificationPreference.VerificationTypes.Length"); i++) {
			verificationTypes.add(_ctx.stringValue("GetSecurityPreferenceResponse.SecurityPreference.VerificationPreference.VerificationTypes["+ i +"]"));
		}
		verificationPreference.setVerificationTypes(verificationTypes);
		securityPreference.setVerificationPreference(verificationPreference);

		PersonalInfoPreference personalInfoPreference = new PersonalInfoPreference();
		personalInfoPreference.setAllowUserToManagePersonalDingTalk(_ctx.booleanValue("GetSecurityPreferenceResponse.SecurityPreference.PersonalInfoPreference.AllowUserToManagePersonalDingTalk"));
		securityPreference.setPersonalInfoPreference(personalInfoPreference);
		getSecurityPreferenceResponse.setSecurityPreference(securityPreference);
	 
	 	return getSecurityPreferenceResponse;
	}
}