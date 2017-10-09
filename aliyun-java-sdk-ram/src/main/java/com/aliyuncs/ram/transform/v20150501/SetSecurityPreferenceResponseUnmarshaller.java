/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.SetSecurityPreferenceResponse;
import com.aliyuncs.ram.model.v20150501.SetSecurityPreferenceResponse.SecurityPreference;
import com.aliyuncs.ram.model.v20150501.SetSecurityPreferenceResponse.SecurityPreference.AccessKeyPreference;
import com.aliyuncs.ram.model.v20150501.SetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference;
import com.aliyuncs.ram.model.v20150501.SetSecurityPreferenceResponse.SecurityPreference.MFAPreference;
import com.aliyuncs.ram.model.v20150501.SetSecurityPreferenceResponse.SecurityPreference.PublicKeyPreference;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetSecurityPreferenceResponseUnmarshaller {

	public static SetSecurityPreferenceResponse unmarshall(SetSecurityPreferenceResponse setSecurityPreferenceResponse, UnmarshallerContext context) {
		
		setSecurityPreferenceResponse.setRequestId(context.stringValue("SetSecurityPreferenceResponse.RequestId"));

		SecurityPreference securityPreference = new SecurityPreference();

		LoginProfilePreference loginProfilePreference = new LoginProfilePreference();
		loginProfilePreference.setEnableSaveMFATicket(context.booleanValue("SetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.EnableSaveMFATicket"));
		loginProfilePreference.setAllowUserToChangePassword(context.booleanValue("SetSecurityPreferenceResponse.SecurityPreference.LoginProfilePreference.AllowUserToChangePassword"));
		securityPreference.setLoginProfilePreference(loginProfilePreference);

		AccessKeyPreference accessKeyPreference = new AccessKeyPreference();
		accessKeyPreference.setAllowUserToManageAccessKeys(context.booleanValue("SetSecurityPreferenceResponse.SecurityPreference.AccessKeyPreference.AllowUserToManageAccessKeys"));
		securityPreference.setAccessKeyPreference(accessKeyPreference);

		PublicKeyPreference publicKeyPreference = new PublicKeyPreference();
		publicKeyPreference.setAllowUserToManagePublicKeys(context.booleanValue("SetSecurityPreferenceResponse.SecurityPreference.PublicKeyPreference.AllowUserToManagePublicKeys"));
		securityPreference.setPublicKeyPreference(publicKeyPreference);

		MFAPreference mFAPreference = new MFAPreference();
		mFAPreference.setAllowUserToManageMFADevices(context.booleanValue("SetSecurityPreferenceResponse.SecurityPreference.MFAPreference.AllowUserToManageMFADevices"));
		securityPreference.setMFAPreference(mFAPreference);
		setSecurityPreferenceResponse.setSecurityPreference(securityPreference);
	 
	 	return setSecurityPreferenceResponse;
	}
}