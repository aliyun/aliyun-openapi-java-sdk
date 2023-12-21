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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.GetPasswordExpirationConfigurationResponse;
import com.aliyuncs.eiam.model.v20211201.GetPasswordExpirationConfigurationResponse.PasswordExpirationConfiguration;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPasswordExpirationConfigurationResponseUnmarshaller {

	public static GetPasswordExpirationConfigurationResponse unmarshall(GetPasswordExpirationConfigurationResponse getPasswordExpirationConfigurationResponse, UnmarshallerContext _ctx) {
		
		getPasswordExpirationConfigurationResponse.setRequestId(_ctx.stringValue("GetPasswordExpirationConfigurationResponse.RequestId"));

		PasswordExpirationConfiguration passwordExpirationConfiguration = new PasswordExpirationConfiguration();
		passwordExpirationConfiguration.setPasswordExpirationStatus(_ctx.stringValue("GetPasswordExpirationConfigurationResponse.PasswordExpirationConfiguration.PasswordExpirationStatus"));
		passwordExpirationConfiguration.setPasswordValidMaxDay(_ctx.integerValue("GetPasswordExpirationConfigurationResponse.PasswordExpirationConfiguration.PasswordValidMaxDay"));
		passwordExpirationConfiguration.setPasswordExpirationAction(_ctx.stringValue("GetPasswordExpirationConfigurationResponse.PasswordExpirationConfiguration.PasswordExpirationAction"));
		passwordExpirationConfiguration.setPasswordExpirationNotificationStatus(_ctx.stringValue("GetPasswordExpirationConfigurationResponse.PasswordExpirationConfiguration.PasswordExpirationNotificationStatus"));
		passwordExpirationConfiguration.setPasswordExpirationNotificationDuration(_ctx.integerValue("GetPasswordExpirationConfigurationResponse.PasswordExpirationConfiguration.PasswordExpirationNotificationDuration"));
		passwordExpirationConfiguration.setPasswordForcedUpdateDuration(_ctx.integerValue("GetPasswordExpirationConfigurationResponse.PasswordExpirationConfiguration.PasswordForcedUpdateDuration"));

		List<String> passwordExpirationNotificationChannels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPasswordExpirationConfigurationResponse.PasswordExpirationConfiguration.PasswordExpirationNotificationChannels.Length"); i++) {
			passwordExpirationNotificationChannels.add(_ctx.stringValue("GetPasswordExpirationConfigurationResponse.PasswordExpirationConfiguration.PasswordExpirationNotificationChannels["+ i +"]"));
		}
		passwordExpirationConfiguration.setPasswordExpirationNotificationChannels(passwordExpirationNotificationChannels);
		getPasswordExpirationConfigurationResponse.setPasswordExpirationConfiguration(passwordExpirationConfiguration);
	 
	 	return getPasswordExpirationConfigurationResponse;
	}
}